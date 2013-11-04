package com.prodyna.academy.watertap.model;

import java.util.UUID;

/**
 * Contact.
 * 
 * @author Juergen Weismueller, PRODYNA AG
 */
public class Contact {

	private String uuid = UUID.randomUUID().toString();

	private String lastname;

	private String firstname;

	private Gender gender;

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getUuid() {
		return uuid;
	}

}
