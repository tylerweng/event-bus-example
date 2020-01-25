package com.tylerweng.event;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.annotation.concurrent.Immutable;

/**
 * Counterpart wrapper class to upstream {@link com.tylerweng.message.Message}
 * Guava event bus framework requires single argument methods acting on some class
 *
 * https://github.com/google/guava/wiki/EventBusExplained#for-listeners
 */
@Immutable
public abstract class AbstractEvent {
    private final String id;
    private final EventType type;

    public AbstractEvent(String id, EventType type) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEvent that = (AbstractEvent) o;
        return Objects.equal(id, that.id) &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, type);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("type", type)
                .toString();
    }
}
