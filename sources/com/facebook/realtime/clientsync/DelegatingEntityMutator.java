package com.facebook.realtime.clientsync;

public abstract class DelegatingEntityMutator implements EntityMutator {
    public abstract Object mutate(Object obj, String str);
}
