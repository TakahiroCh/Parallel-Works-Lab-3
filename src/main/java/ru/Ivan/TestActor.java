package ru.Ivan;

import akka.actor.AbstractActor;
import akka.actor.ActorSelection;
import akka.japi.pf.ReceiveBuilder;

public class TestActor extends AbstractActor {
    private ActorSelection storeActor = getContext()

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(TestMessage.class, m -> {
                storeActor.tell()}
    })
}
