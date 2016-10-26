package com.bicjo.eventbus;

import org.junit.Test;

import com.google.common.eventbus.EventBus;

public class IEventTest {

	@Test
	public void fireEvent() {

		EventBus eventBus = new EventBus();

		eventBus.register(new EventHandler());
		eventBus.register(new AnotherEventHandler());

		eventBus.post(new EventObj(101));

	}

}
