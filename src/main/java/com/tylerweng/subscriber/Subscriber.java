package com.tylerweng.subscriber;

import com.google.common.eventbus.AsyncEventBus;
import com.tylerweng.event.AbstractEvent;
import com.tylerweng.event.EventUtil;
import com.tylerweng.listener.ListenerRegistry;
import com.tylerweng.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;

/**
 * Listens for {@link com.tylerweng.message.Message}, converts to respective
 * {@link com.tylerweng.event.AbstractEvent}  and uses {@link AsyncEventBus}
 * to fan out to listeners
 */

@SuppressWarnings("UnstableApiUsage")
public class Subscriber {

    private static final Logger logger = LoggerFactory.getLogger(Subscriber.class);

    private final int THREAD_POOL_SIZE = 10;
    private final AsyncEventBus eventBus;

    public Subscriber() {
        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(THREAD_POOL_SIZE));
        registerListeners();
    }

    public void process(Message message) {
        logger.info("Subscriber received message: {}", message);
        final AbstractEvent event = EventUtil.event(message);
        eventBus.post(event);
    }

    private void registerListeners() {
        ListenerRegistry.LISTENERS.forEach(eventBus::register);
    }
}
