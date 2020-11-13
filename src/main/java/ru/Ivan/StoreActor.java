package ru.Ivan;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StoreActor extends AbstractActor {
    private Map<Integer, ArrayList<Test>> store = new HashMap<Integer, ArrayList<Test>>();

    @Override
    public Receive createReceive() {
        return ReceiveBuilder().create()
                .match(StoreMessage.class, m -> {
                    if (store.containsKey(m.get))
                    store.put()
                })
    }



}
