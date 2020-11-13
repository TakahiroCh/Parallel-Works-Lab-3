package ru.Ivan;

import akka.actor.AbstractActor;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.japi.pf.ReceiveBuilder;

import java.util.ArrayList;

public class TestActor extends AbstractActor {
    private ActorSelection storeActor = ActorSystem.apply().actorSelection("/user/takahiro/storeActor");

    private ArrayList<Test> runTest(String ) {

    }

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(TestMessage.class, m -> {
                    storeActor.tell(new StoreMessage(m.getPackageId,
                            runTest()
                    ));
                }
    })
}
