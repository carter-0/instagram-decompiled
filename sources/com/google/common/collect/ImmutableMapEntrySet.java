package com.google.common.collect;

import X.Pxi;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

public abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    public class EntrySetSerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final ImmutableMap map;

        public Object readResolve() {
            return this.map.entrySet();
        }

        public EntrySetSerializedForm(ImmutableMap immutableMap) {
            this.map = immutableMap;
        }
    }

    public final boolean A0B() {
        return ImmutableSortedMap.this.isPartialView();
    }

    public final int hashCode() {
        return ImmutableSortedMap.this.hashCode();
    }

    public final int size() {
        return ImmutableSortedMap.this.size();
    }

    public Object writeReplace() {
        return new EntrySetSerializedForm(ImmutableSortedMap.this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = ImmutableSortedMap.this.get(entry.getKey());
        if (obj2 != null) {
            return Pxi.A1W(obj2, entry.getValue());
        }
        return false;
    }
}
