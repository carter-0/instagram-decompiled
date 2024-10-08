package com.google.common.collect;

import X.AnonymousClass00P;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class TreeMultimap extends AbstractSortedKeySortedSetMultimap {
    public static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream objectInputStream) {
        throw AnonymousClass00P.createAndThrow();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw AnonymousClass00P.createAndThrow();
    }
}
