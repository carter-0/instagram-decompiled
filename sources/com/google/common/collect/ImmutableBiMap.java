package com.google.common.collect;

import X.AnonymousClass00P;
import X.C13985Tnb;
import X.Pxe;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements C13985Tnb<K, V> {
    public static final long serialVersionUID = 912559;

    public class SerializedForm extends ImmutableMap$SerializedForm {
        public static final long serialVersionUID = 0;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final /* bridge */ /* synthetic */ ImmutableCollection createValues() {
        throw Pxe.A0e("should never be called");
    }

    public Object writeReplace() {
        throw AnonymousClass00P.createAndThrow();
    }
}
