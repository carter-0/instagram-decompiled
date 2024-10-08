package com.google.common.collect;

import X.17k;
import X.SQD;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public final class HashMultimap extends HashMultimapGwtSerializationDependencies {
    public static final long serialVersionUID = 0;
    public transient int expectedValuesPerKey;

    public HashMultimap() {
        CompactHashMap compactHashMap = new CompactHashMap(12);
        17k.A0E(compactHashMap.isEmpty());
        this.A01 = compactHashMap;
        this.expectedValuesPerKey = 2;
        this.expectedValuesPerKey = 2;
    }

    public final /* bridge */ /* synthetic */ Collection A08() {
        return new CompactHashSet(this.expectedValuesPerKey);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int readInt = objectInputStream.readInt();
        A0A(new CompactHashMap(12));
        SQD.A01(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        SQD.A02(this, objectOutputStream);
    }
}
