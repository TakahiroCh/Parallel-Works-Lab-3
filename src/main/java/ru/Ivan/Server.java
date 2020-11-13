package ru.Ivan;

import akka.NotUsed;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.javadsl.server.Route;
import akka.pattern.PatternsCS;
import akka.stream.ActorMaterializer;

import java.util.concurrent.CompletionStage;

import static akka.http.javadsl.server.Directives.*;

public class Server {
    private ActorRef storeActor;
    private final String STORE_ACTOR = "storeActor";

    private ActorRef testPerformerActor;
    private final String TEST_PERFORMER_ACTOR = "testPerformerActor";

    private ActorRef storeActor;
    private final String STORE_ACTOR = "storeActor";

    private Server(final ActorSystem system) {
        storeActor = system.actorOf(Props.create(StoreActor.class), STORE_ACTOR);

    }

    private Route createRoute(final ActorSystem system) {
        return route(
                get(() ->
                        parameter("packageId", (packageId) -> {
                            CompletionStage<Object> result = PatternsCS.ask(
                                    storeActor,
                                    new GetMessage(Integer.parseInt(packageId)),
                                    5000);
                            return completeOKWithFuture(result, Jackson.marshaller());
                        })),
                post(() ->
                        entity(Jackson.unmarshaller(TestPackageMessage.class), msg -> {
                            testPackageActor.tell(msg, ActorRef.noSender());
                            return complete("Test started!");
                        }))
        );
    }

    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("routes");
        final Http http = Http.get(system);
        final ActorMaterializer materializer = ActorMaterializer.create(system);
        Server instance = new Server(system);

        final FLow<HttpRequest, HttpResponse, NotUsed> routeFlow =
                instance.createRoute(system).flow(system, materializer);

    }
}
