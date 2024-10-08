package com.google.common.collect;

import X.17u;
import X.C8679Qzn;
import com.google.common.collect.MapMakerInternalMap;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;

public abstract class MapMakerInternalMap$AbstractSerializationProxy<K, V> extends C8679Qzn<K, V> implements Serializable {
    public static final long serialVersionUID = 3;
    public transient ConcurrentMap A00;
    public final int concurrencyLevel;
    public final 17u keyEquivalence;
    public final MapMakerInternalMap.Strength keyStrength;
    public final 17u valueEquivalence;
    public final MapMakerInternalMap.Strength valueStrength;

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A00;
    }

    public MapMakerInternalMap$AbstractSerializationProxy(17u r1, 17u r2, MapMakerInternalMap.Strength strength, MapMakerInternalMap.Strength strength2, ConcurrentMap concurrentMap, int i) {
        this.keyStrength = strength;
        this.valueStrength = strength2;
        this.keyEquivalence = r1;
        this.valueEquivalence = r2;
        this.concurrencyLevel = i;
        this.A00 = concurrentMap;
    }
}
