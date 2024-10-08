package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    public transient int A00;
    public transient int A01;
    public final boolean accessOrder;
    public transient long[] links;

    public CompactLinkedHashMap(int i) {
        super(i);
        this.accessOrder = false;
    }

    private void A02(int i, int i2) {
        if (i == -2) {
            this.A00 = i2;
        } else {
            long[] jArr = this.links;
            jArr.getClass();
            long[] jArr2 = this.links;
            jArr2.getClass();
            jArr2[i] = (jArr[i] & -4294967296L) | (((long) (i2 + 1)) & 4294967295L);
        }
        if (i2 == -2) {
            this.A01 = i;
            return;
        }
        long[] jArr3 = this.links;
        jArr3.getClass();
        long[] jArr4 = this.links;
        jArr4.getClass();
        jArr4[i2] = (jArr3[i2] & 4294967295L) | (((long) (i + 1)) << 32);
    }

    public final int A04() {
        return this.A00;
    }

    public final int A05(int i) {
        long[] jArr = this.links;
        jArr.getClass();
        return ((int) jArr[i]) - 1;
    }

    public final LinkedHashMap A07(int i) {
        return new LinkedHashMap(i, 1.0f, this.accessOrder);
    }

    public final void A08(int i) {
        if (this.accessOrder) {
            long[] jArr = this.links;
            jArr.getClass();
            A02(((int) (jArr[i] >>> 32)) - 1, A05(i));
            A02(this.A01, i);
            A02(i, -2);
            this.A00 += 32;
        }
    }

    public final int A03() {
        int A03 = super.A03();
        this.links = new long[A03];
        return A03;
    }

    public final int A06(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    public final void A09(int i) {
        super.A09(i);
        this.A00 = -2;
        this.A01 = -2;
    }

    public final void A0A(int i) {
        super.A0A(i);
        long[] jArr = this.links;
        jArr.getClass();
        this.links = Arrays.copyOf(jArr, i);
    }

    public final void A0B(int i, int i2) {
        int size = size() - 1;
        super.A0B(i, i2);
        long[] jArr = this.links;
        jArr.getClass();
        A02(((int) (jArr[i] >>> 32)) - 1, A05(i));
        if (i < size) {
            long[] jArr2 = this.links;
            jArr2.getClass();
            A02(((int) (jArr2[size] >>> 32)) - 1, i);
            A02(i, A05(size));
        }
        long[] jArr3 = this.links;
        jArr3.getClass();
        jArr3[size] = 0;
    }

    public final void A0C(Object obj, int i, Object obj2, int i2, int i3) {
        super.A0C(obj, i, obj2, i2, i3);
        A02(this.A01, i);
        A02(i, -2);
    }

    public final void clear() {
        if (!needsAllocArrays()) {
            this.A00 = -2;
            this.A01 = -2;
            long[] jArr = this.links;
            if (jArr != null) {
                Arrays.fill(jArr, 0, size(), 0);
            }
            super.clear();
        }
    }

    public final Map convertToHashFloodingResistantImplementation() {
        Map convertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return convertToHashFloodingResistantImplementation;
    }

    public CompactLinkedHashMap() {
        this(3);
    }
}
