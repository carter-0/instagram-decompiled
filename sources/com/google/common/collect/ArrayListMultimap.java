package com.google.common.collect;

import X.17k;
import X.SQD;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class ArrayListMultimap extends ArrayListMultimapGwtSerializationDependencies {
    public static final long serialVersionUID = 0;
    public transient int expectedValuesPerKey = 3;

    public ArrayListMultimap() {
        CompactHashMap compactHashMap = new CompactHashMap(12);
        17k.A0E(compactHashMap.isEmpty());
        this.A01 = compactHashMap;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int readInt = objectInputStream.readInt();
        A0A(new CompactHashMap());
        SQD.A01(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        SQD.A02(this, objectOutputStream);
    }
}
