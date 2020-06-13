package org.acme;

import io.smallrye.mutiny.Uni;

public class MessageService {
    private final String message;

    public MessageService(String message) {
        this.message = message;
    }

    public Uni<String> sayHello(String name) {
        return Uni.createFrom().item(name)
                .onItem().apply(n -> String.format("%s %s", message, name));
    }
}
