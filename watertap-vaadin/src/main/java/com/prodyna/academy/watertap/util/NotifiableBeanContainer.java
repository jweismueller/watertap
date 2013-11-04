package com.prodyna.academy.watertap.util;

import com.vaadin.data.util.BeanContainer;
import com.vaadin.data.util.MethodProperty;

/**
 * NotifyableBeanContainer.
 * <p>
 * https://vaadin.com/forum/#!/thread/408555
 * 
 * @author Juergen Weismueller, PRODYNA AG
 */
public class NotifiableBeanContainer<IDTYPE, BEANTYPE> extends BeanContainer<IDTYPE, BEANTYPE> {

	private static final long serialVersionUID = 1L;

	public NotifiableBeanContainer(Class<? super BEANTYPE> type) {
		super(type);
	}

	public void itemChange(Object itemId) {
		for (Object id : getItem(itemId).getItemPropertyIds()) {
			MethodProperty<?> itemProperty = (MethodProperty<?>) getItem(itemId).getItemProperty(id);
			itemProperty.fireValueChange();
		}
	}

}
