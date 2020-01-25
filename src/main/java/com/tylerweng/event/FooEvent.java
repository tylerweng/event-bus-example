package com.tylerweng.event;

import javax.annotation.concurrent.Immutable;

@Immutable
public class FooEvent extends AbstractEvent {

    public FooEvent(String id) {
        super(id, EventType.Foo);
    }

}
