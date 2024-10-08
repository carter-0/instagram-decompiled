package com.google.common.collect;

import X.17j;
import X.17k;
import X.17u;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.DbW;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;

public final class MapMakerInternalMap$SerializationProxy<K, V> extends MapMakerInternalMap$AbstractSerializationProxy<K, V> {
    public static final long serialVersionUID = 3;

    private Object readResolve() {
        return this.A00;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        17j r5 = new 17j();
        r5.A03(readInt);
        r5.A04(this.keyStrength);
        r5.A05(this.valueStrength);
        17u r4 = this.keyEquivalence;
        17u r3 = r5.A02;
        17k.A0B(r3, "key equivalence was already set to %s", DbW.A1a(r3));
        r4.getClass();
        r5.A02 = r4;
        r5.A05 = true;
        r5.A02(this.concurrencyLevel);
        this.A00 = r5.A00();
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject != null) {
                this.A00.put(readObject, objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.A00.size());
        Iterator A0u = AnonymousClass7TF.A0u(this.A00);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            objectOutputStream.writeObject(A1J.getKey());
            objectOutputStream.writeObject(A1J.getValue());
        }
        objectOutputStream.writeObject((Object) null);
    }
}
