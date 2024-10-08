package X;

import android.util.SparseArray;

/* renamed from: X.7sI  reason: invalid class name and case insensitive filesystem */
public final class C344707sI {
    public final SparseArray A00 = new SparseArray();

    public static void A00(C344567s4 r3, C346287uv r4, C344707sI r5, int i) {
        SparseArray sparseArray = r5.A00;
        Object obj = sparseArray.get(i);
        if (obj instanceof C344747sM) {
            r3.A04((C344747sM) obj);
        }
        if (r4 instanceof C344747sM) {
            r3.A03((C344747sM) r4);
        }
        if (r4 == null) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, r4);
        }
    }
}
