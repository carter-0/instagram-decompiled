package com.google.common.collect;

import X.C635813i;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

public class Multimaps$CustomListMultimap extends AbstractListMultimap {
    public static final long serialVersionUID = 0;
    public transient C635813i A00;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        this.A00 = (C635813i) readObject;
        Object readObject2 = objectInputStream.readObject();
        readObject2.getClass();
        A0A((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A00);
        objectOutputStream.writeObject(this.A01);
    }
}
