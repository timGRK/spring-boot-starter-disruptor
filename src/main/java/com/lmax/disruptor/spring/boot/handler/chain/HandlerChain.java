package com.lmax.disruptor.spring.boot.handler.chain;

import com.lmax.disruptor.spring.boot.event.DisruptorEvent;

public interface HandlerChain<T extends DisruptorEvent>{

	void onEvent(T event) throws Exception;
	
}
