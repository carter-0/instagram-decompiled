package com.google.common.collect;

import X.1Kw;
import X.Pxe;
import java.util.Arrays;
import java.util.Set;

public class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    public transient int[] A00;
    public transient int[] A01;
    public transient int A02;
    public transient int A03;

    private void A00(int i, int i2) {
        if (i == -2) {
            this.A02 = i2;
        } else {
            int[] iArr = this.A01;
            iArr.getClass();
            iArr[i] = i2 + 1;
        }
        if (i2 == -2) {
            this.A03 = i;
            return;
        }
        int[] iArr2 = this.A00;
        iArr2.getClass();
        iArr2[i2] = i + 1;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03(int i) {
        int[] iArr = this.A01;
        iArr.getClass();
        return iArr[i] - 1;
    }

    public final int A01() {
        int A012 = super.A01();
        this.A00 = new int[A012];
        this.A01 = new int[A012];
        return A012;
    }

    public final int A04(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    public final void A05(int i) {
        super.A05(i);
        this.A02 = -2;
        this.A03 = -2;
    }

    public final void A06(int i) {
        super.A06(i);
        int[] iArr = this.A00;
        iArr.getClass();
        this.A00 = Arrays.copyOf(iArr, i);
        int[] iArr2 = this.A01;
        iArr2.getClass();
        this.A01 = Arrays.copyOf(iArr2, i);
    }

    public final void A07(int i, int i2) {
        int A0A = Pxe.A0A(this);
        super.A07(i, i2);
        int[] iArr = this.A00;
        iArr.getClass();
        A00(iArr[i] - 1, A03(i));
        if (i < A0A) {
            int[] iArr2 = this.A00;
            iArr2.getClass();
            A00(iArr2[A0A] - 1, i);
            A00(i, A03(A0A));
        }
        int[] iArr3 = this.A00;
        iArr3.getClass();
        iArr3[A0A] = 0;
        int[] iArr4 = this.A01;
        iArr4.getClass();
        iArr4[A0A] = 0;
    }

    public final void A08(Object obj, int i, int i2, int i3) {
        super.A08(obj, i, i2, i3);
        A00(this.A03, i);
        A00(i, -2);
    }

    public final void clear() {
        if (!needsAllocArrays()) {
            this.A02 = -2;
            this.A03 = -2;
            int[] iArr = this.A00;
            if (!(iArr == null || this.A01 == null)) {
                Arrays.fill(iArr, 0, size(), 0);
                Arrays.fill(this.A01, 0, size(), 0);
            }
            super.clear();
        }
    }

    public final Set convertToHashFloodingResistantImplementation() {
        Set convertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.A00 = null;
        this.A01 = null;
        return convertToHashFloodingResistantImplementation;
    }

    public final Object[] toArray(Object[] objArr) {
        return 1Kw.A01(this, objArr);
    }

    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        int i = 0;
        for (Object obj : this) {
            objArr[i] = obj;
            i++;
        }
        return objArr;
    }
}
