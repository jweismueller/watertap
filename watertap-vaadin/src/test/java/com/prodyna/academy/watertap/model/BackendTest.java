package com.prodyna.academy.watertap.model;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BackendTest {

	@Test
	public void test() throws Exception {
		Backend backend = new Backend();
		List<Contact> contacts = backend.getContacts();
		Assert.assertFalse("Contacts are empty.", contacts.isEmpty());
	}

}
