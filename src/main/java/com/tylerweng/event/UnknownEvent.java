package com.tylerweng.event;

import javax.annotation.concurrent.Immutable;

@Immutable
public class UnknownEvent extends AbstractEvent {

    public UnknownEvent(String id) {
        super(id, EventType.Unknown);
    }

}
