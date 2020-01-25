package com.tylerweng;

import com.tylerweng.event.EventType;
import com.tylerweng.message.Message;
import com.tylerweng.subscriber.Subscriber;

public class Sample {

    public static void main(String[] args) throws InterruptedException {
        final Subscriber subscriber = new Subscriber();
        final Message unknown = new Message("unknown", EventType.Unknown);
        final Message foo = new Message("foo", EventType.Foo);
        final Message bar = new Message("bar", EventType.Bar);
        subscriber.process(unknown);
        subscriber.process(foo);
        subscriber.process(bar);
        Thread.sleep(3000);
        System.exit(0);
    }
}
