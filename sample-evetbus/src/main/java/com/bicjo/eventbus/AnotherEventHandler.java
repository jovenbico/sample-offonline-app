package com.bicjo.eventbus;

public class AnotherEventHandler implements IEvent {

	@Override
	public void fireEvent(EventObj e) {
		System.out.println("fire another event: " + e.getId());
	}

}
