package ru.Ivan;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

public class TestActor extends AbstractActor {

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match()
}
