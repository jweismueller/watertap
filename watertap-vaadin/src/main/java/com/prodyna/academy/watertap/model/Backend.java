package com.prodyna.academy.watertap.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Backend {

	private String[] ff = new String[] { "George", "Tina", "Tim" };
	private String[] ll = new String[] { "Churchill", "Smith", "Johnson" };

	public List<Contact> getContacts() {
		List<Contact> out = new ArrayList<Contact>();
		for (int i = 0; i < 10; i++) {
			Contact contact = createContact();
			out.add(contact);
		}
		return out;
	}

	private Contact createContact() {
		Contact c = new Contact();
		Random r = new Random();
		c.setFirstname(ff[r.nextInt(3)]);
		c.setLastname(ll[r.nextInt(3)]);
		c.setGender(Gender.values()[r.nextInt(2)]);
		return c;
	}

}
