package com.prodyna.academy.watertap;

import com.prodyna.academy.watertap.model.Contact;
import com.prodyna.academy.watertap.util.NotifiableBeanContainer;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class ContactEditorForm extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	private BeanFieldGroup<Contact> editorFields = new BeanFieldGroup<Contact>(Contact.class);

	private TextField firstname = new TextField("First name");

	private TextField lastname = new TextField("Last name");

	private Button saveButton = new Button("Save");

	private final NotifiableBeanContainer<String, Contact> datasource;

	public ContactEditorForm(NotifiableBeanContainer<String, Contact> container) {
		this.datasource = container;
		setSpacing(true);
		addComponent(new Label("<strong>Edit<strong>", ContentMode.HTML));
		addComponent(firstname);
		addComponent(lastname);
		firstname.setNullRepresentation("");
		lastname.setNullRepresentation("");
		editorFields.bindMemberFields(this);
		addComponent(saveButton);
		saveButton.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				try {
					editorFields.commit();
					String uuid = editorFields.getItemDataSource().getBean().getUuid();
					datasource.itemChange(uuid);
				} catch (CommitException e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void edit(Object id) {
		if (id == null) {
			editorFields.setItemDataSource(new Contact());
		} else {
			Contact contact = datasource.getItem(id).getBean();
			editorFields.setItemDataSource(contact);
		}
		editorFields.setEnabled(id != null);
		saveButton.setEnabled(id != null);
	}

}
