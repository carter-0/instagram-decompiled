package com.google.common.collect;

import X.S25;

public final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    public static final RegularImmutableBiMap A04 = new RegularImmutableBiMap();
    public final transient RegularImmutableBiMap A00;
    public final transient int A01;
    public final transient int A02;
    public final transient Object A03;
    public final transient Object[] alternatingKeysAndValues;

    public final boolean isPartialView() {
        return false;
    }

    public final ImmutableSet createEntrySet() {
        return new RegularImmutableMap$EntrySet(this, this.alternatingKeysAndValues, this.A01, this.A02);
    }

    public final ImmutableSet createKeySet() {
        return new RegularImmutableMap$KeySet(new RegularImmutableMap$KeysOrValuesAsList(this.alternatingKeysAndValues, this.A01, this.A02), this);
    }

    public final Object get(Object obj) {
        Object A012 = RegularImmutableMap.A01(this.A03, obj, this.alternatingKeysAndValues, this.A02, this.A01);
        if (A012 == null) {
            return null;
        }
        return A012;
    }

    public final int size() {
        return this.A02;
    }

    public Object writeReplace() {
        return new ImmutableMap$SerializedForm(this);
    }

    public RegularImmutableBiMap(Object[] objArr, int i) {
        int i2;
        this.alternatingKeysAndValues = objArr;
        this.A02 = i;
        this.A01 = 0;
        if (i >= 2) {
            i2 = ImmutableSet.chooseTableSize(i);
        } else {
            i2 = 0;
        }
        Object A022 = RegularImmutableMap.A02(objArr, i, i2, 0);
        if (!(A022 instanceof Object[])) {
            this.A03 = A022;
            A022 = RegularImmutableMap.A02(objArr, i, i2, 1);
            if (!(A022 instanceof Object[])) {
                this.A00 = new RegularImmutableBiMap(this, A022, objArr, i);
                return;
            }
        }
        throw ((S25) ((Object[]) A022)[2]).A00();
    }

    public RegularImmutableBiMap(RegularImmutableBiMap regularImmutableBiMap, Object obj, Object[] objArr, int i) {
        this.A03 = obj;
        this.alternatingKeysAndValues = objArr;
        this.A01 = 1;
        this.A02 = i;
        this.A00 = regularImmutableBiMap;
    }

    public RegularImmutableBiMap() {
        this.A03 = null;
        this.alternatingKeysAndValues = new Object[0];
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = this;
    }
}
