package com.bicjo.eventbus;

public class EventObj {

	private int id;
	private String fromEventHandler;

	public EventObj(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getFromEventHandler() {
		return fromEventHandler;
	}

	public void setFromEventHandler(String fromEventHandler) {
		this.fromEventHandler = fromEventHandler;
	}

}
