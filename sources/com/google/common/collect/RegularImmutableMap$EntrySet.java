package com.google.common.collect;

import X.17k;
import X.C249803kO;
import java.util.AbstractMap;
import java.util.Map;

public class RegularImmutableMap$EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;
    public final transient ImmutableMap A03;

    public final boolean A0B() {
        return true;
    }

    public final ImmutableList A0C() {
        return new ImmutableList<Map.Entry<K, V>>() {
            public final boolean A0B() {
                return true;
            }

            /* renamed from: A0C */
            public final AbstractMap.SimpleImmutableEntry get(int i) {
                17k.A01(i, RegularImmutableMap$EntrySet.this.A01);
                RegularImmutableMap$EntrySet regularImmutableMap$EntrySet = RegularImmutableMap$EntrySet.this;
                int i2 = i * 2;
                Object obj = regularImmutableMap$EntrySet.A02[regularImmutableMap$EntrySet.A00 + i2];
                obj.getClass();
                RegularImmutableMap$EntrySet regularImmutableMap$EntrySet2 = RegularImmutableMap$EntrySet.this;
                Object obj2 = regularImmutableMap$EntrySet2.A02[i2 + (regularImmutableMap$EntrySet2.A00 ^ 1)];
                obj2.getClass();
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            public final int size() {
                return RegularImmutableMap$EntrySet.this.A01;
            }

            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.A03.get(key))) {
            return false;
        }
        return true;
    }

    public final int size() {
        return this.A01;
    }

    public RegularImmutableMap$EntrySet(ImmutableMap immutableMap, Object[] objArr, int i, int i2) {
        this.A03 = immutableMap;
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.RegularImmutableMap$EntrySet, com.google.common.collect.ImmutableCollection] */
    public final int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    public Object writeReplace() {
        return RegularImmutableMap$EntrySet.super.writeReplace();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.RegularImmutableMap$EntrySet, com.google.common.collect.ImmutableCollection] */
    public final C249803kO iterator() {
        return asList().iterator();
    }
}
