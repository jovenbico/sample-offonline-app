package com.bicjo.eventbus;

public class EventHandler implements IEvent {

	@Override
	public void fireEvent(EventObj e) {
		System.out.println("fire event: " + e.getId());
	}

}
