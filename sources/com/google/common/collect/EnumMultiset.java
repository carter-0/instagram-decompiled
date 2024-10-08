package com.google.common.collect;

import X.AnonymousClass00P;
import X.AnonymousClass3W5;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;

public abstract class EnumMultiset<E extends Enum<E>> extends AnonymousClass3W5<E> implements Serializable {
    public static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream objectInputStream) {
        throw AnonymousClass00P.createAndThrow();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw AnonymousClass00P.createAndThrow();
    }
}
