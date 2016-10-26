package com.bicjo.eventbus;

public class EventHandler implements IEvent {

	@Override
	public void fireEvent(EventObj e) {
		System.out.println("fire event: " + e.getId());

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

}
