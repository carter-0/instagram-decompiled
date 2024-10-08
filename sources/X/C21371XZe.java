package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: X.XZe  reason: case insensitive filesystem */
public final class C21371XZe {
    public final SparseArray A00;
    public final C21495Xct A01;

    public C21371XZe(SparseArray sparseArray, C21495Xct xct) {
        this.A01 = xct;
        SparseBooleanArray sparseBooleanArray = xct.A00;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int A002 = xct.A00(i);
            Object obj = sparseArray.get(A002);
            obj.getClass();
            sparseArray2.append(A002, obj);
        }
        this.A00 = sparseArray2;
    }
}
