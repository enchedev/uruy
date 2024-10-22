package br.edu.ifpr.uruy.tags;

import java.util.UUID;

public abstract class Identifiable {

    private final UUID id = UUID.randomUUID();

    public UUID getId() { return id; }
}
