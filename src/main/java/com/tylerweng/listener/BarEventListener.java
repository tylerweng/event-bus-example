package com.tylerweng.listener;

import com.google.common.eventbus.Subscribe;
import com.tylerweng.event.BarEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("UnstableApiUsage")
public class BarEventListener {

    private static final Logger logger = LoggerFactory.getLogger(BarEventListener.class);

    @SuppressWarnings("unused")
    @Subscribe
    public void process(BarEvent event) {
        logger.info("BarEvent: {}", event);
        throw new RuntimeException("bar throws");
    }
}
