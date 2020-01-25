package com.tylerweng.listener;

import com.google.common.eventbus.Subscribe;
import com.tylerweng.event.FooEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("UnstableApiUsage")
public class FooEventListener0 {

    private static final Logger logger = LoggerFactory.getLogger(FooEventListener0.class);

    @SuppressWarnings("unused")
    @Subscribe
    public void process(FooEvent event) {
        logger.info("FooEventListener0 event: {}", event);
    }
}
