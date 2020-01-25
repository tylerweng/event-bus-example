package com.tylerweng.event;

import javax.annotation.concurrent.Immutable;

@Immutable
public class BarEvent extends AbstractEvent {

    public BarEvent(String id) {
        super(id, EventType.Bar);
    }

}
