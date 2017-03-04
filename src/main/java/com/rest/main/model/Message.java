package com.rest.main.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	Long id;
	String messageDescription;
	String auttor;

	public Message() {

	}

	public Message(Long id, String messageDescription, String auttor) {
		super();
		this.id = id;
		this.messageDescription = messageDescription;
		this.auttor = auttor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageDescription() {
		return messageDescription;
	}

	public void setMessageDescription(String messageDescription) {
		this.messageDescription = messageDescription;
	}

	public String getAuttor() {
		return auttor;
	}

	public void setAuttor(String auttor) {
		this.auttor = auttor;
	}

}
