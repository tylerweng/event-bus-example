package com.tylerweng.message;

import com.google.common.base.MoreObjects;
import com.tylerweng.event.EventType;

import javax.annotation.concurrent.Immutable;

/**
 * Some upstream message
 */
@Immutable
public class Message {
    private final String id;
    private final EventType type;

    public Message(String id, EventType type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public EventType getType() {
        return type;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("type", type)
                .toString();
    }
}
