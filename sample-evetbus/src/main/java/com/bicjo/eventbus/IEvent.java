package com.bicjo.eventbus;

import com.google.common.eventbus.Subscribe;

public interface IEvent {

	@Subscribe
	void fireEvent(EventObj e);

}
