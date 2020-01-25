package com.tylerweng.listener;

import java.util.Set;

public final class ListenerRegistry {

    public static final Set<Object> LISTENERS = Set.of(
            new BarEventListener(),
            new FooEventListener0(),
            new FooEventListener1()
    );

}
