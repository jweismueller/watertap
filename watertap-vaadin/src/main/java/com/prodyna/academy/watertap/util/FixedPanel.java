package com.prodyna.academy.watertap.util;

import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;

public class FixedPanel extends Panel {

	private static final long serialVersionUID = 1L;

	public FixedPanel(Component content) {
		super(content);
		setHeight("400px");
		setWidth("300px");
	}

}
