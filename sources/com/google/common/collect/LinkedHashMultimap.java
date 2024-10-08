package com.google.common.collect;

import X.C13787Th2;
import X.R1I;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

public final class LinkedHashMultimap extends LinkedHashMultimapGwtSerializationDependencies {
    public static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    public static final long serialVersionUID = 1;
    public transient ValueEntry A00;
    public transient int valueSetCapacity;

    public final class ValueEntry extends ImmutableEntry implements C13787Th2 {
        public ValueEntry nextInValueBucket;
        public ValueEntry predecessorInMultimap;
        public C13787Th2 predecessorInValueSet;
        public final int smearedValueHash;
        public ValueEntry successorInMultimap;
        public C13787Th2 successorInValueSet;

        public final C13787Th2 C2i() {
            C13787Th2 th2 = this.successorInValueSet;
            th2.getClass();
            return th2;
        }

        public final void EgO(C13787Th2 th2) {
            this.predecessorInValueSet = th2;
        }

        public final void EnU(C13787Th2 th2) {
            this.successorInValueSet = th2;
        }

        public ValueEntry(ValueEntry valueEntry, Object obj, Object obj2, int i) {
            super(obj, obj2);
            this.smearedValueHash = i;
            this.nextInValueBucket = valueEntry;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        ValueEntry valueEntry = new ValueEntry((ValueEntry) null, (Object) null, (Object) null, 0);
        this.A00 = valueEntry;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
        this.valueSetCapacity = 2;
        int readInt = objectInputStream.readInt();
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            compactLinkedHashMap.put(readObject, new R1I(this, readObject, this.valueSetCapacity));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            Object readObject3 = objectInputStream.readObject();
            Collection collection = (Collection) compactLinkedHashMap.get(readObject2);
            collection.getClass();
            collection.add(readObject3);
        }
        A0A(compactLinkedHashMap);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        for (Object writeObject : keySet()) {
            objectOutputStream.writeObject(writeObject);
        }
        objectOutputStream.writeInt(this.A00);
        for (Map.Entry entry : ASn()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final void clear() {
        super.clear();
        ValueEntry valueEntry = this.A00;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
    }
}
