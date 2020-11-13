package ru.Ivan;

import akka.actor.AbstractActor;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.japi.pf.ReceiveBuilder;

public class TestActor extends AbstractActor {
    private ActorSelection storeActor = ActorSystem(/takahiro)

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(TestMessage.class, m -> {
                storeActor.tell()}
    })
}
