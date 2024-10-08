package X;

import android.util.SparseArray;

/* renamed from: X.Vu1  reason: case insensitive filesystem */
public final class C18549Vu1 {
    public C18749Vzk A00;
    public final SparseArray A01;

    public C18549Vu1(int i) {
        this.A01 = new SparseArray(i);
    }

    public final void A00(C18749Vzk vzk, int i, int i2) {
        int A02 = C13992Tns.A02(C18749Vzk.A00(vzk), i);
        SparseArray sparseArray = this.A01;
        C18549Vu1 vu1 = (C18549Vu1) sparseArray.get(A02);
        if (vu1 == null) {
            vu1 = new C18549Vu1(1);
            sparseArray.put(C13992Tns.A02(C18749Vzk.A00(vzk), i), vu1);
        }
        if (i2 > i) {
            vu1.A00(vzk, i + 1, i2);
        } else {
            vu1.A00 = vzk;
        }
    }

    public C18549Vu1() {
        this(1);
    }
}
