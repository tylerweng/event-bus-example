package com.tylerweng.event;

import com.tylerweng.message.Message;

public final class EventUtil {

    public static AbstractEvent event(Message message) {
        final String id = message.getId();
        final EventType type = message.getType();
        switch (type) {
            case Foo:
                return new FooEvent(id);
            case Bar:
                return new BarEvent(id);
            case Unknown:
            default:
                return new UnknownEvent(id);
        }
    }
}
