package com.prodyna.academy.watertap;

import com.prodyna.academy.watertap.model.Backend;
import com.prodyna.academy.watertap.model.Contact;
import com.prodyna.academy.watertap.util.FixedPanel;
import com.prodyna.academy.watertap.util.NotifiableBeanContainer;
import com.vaadin.annotations.Title;
import com.vaadin.cdi.CDIUI;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@CDIUI
@Title("Watertap")
@SuppressWarnings("serial")
public class WatertapUI extends UI {

	private NotifiableBeanContainer<String, Contact> datasource = new NotifiableBeanContainer<String, Contact>(
			Contact.class);

	private ContactEditorForm contactEditorForm = new ContactEditorForm(datasource);

	@Override
	protected void init(VaadinRequest request) {
		for (Contact contact : new Backend().getContacts()) {
			datasource.addItem(contact.getUuid(), contact);
		}
		VerticalLayout main = new VerticalLayout();
		HorizontalLayout h = new HorizontalLayout();
		main.addComponent(new Label("<h1>Watertap</h1>", ContentMode.HTML));
		main.addComponent(h);
		h.addComponent(new FixedPanel(createContactTable()));
		h.addComponent(new FixedPanel(contactEditorForm));
		setContent(main);
	}

	private Table createContactTable() {
		final Table table = new Table();
		table.setSelectable(true);
		table.setImmediate(true);
		table.setBuffered(false);
		table.setContainerDataSource(datasource);
		table.setVisibleColumns("firstname", "lastname", "gender");
		table.addValueChangeListener(new Property.ValueChangeListener() {
			public void valueChange(ValueChangeEvent event) {
				table.setComponentError(null);
				table.setValidationVisible(false);
				contactEditorForm.edit(event.getProperty().getValue());
			}
		});
		return table;
	}
}
