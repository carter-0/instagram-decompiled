package X;

import android.util.SparseIntArray;

/* renamed from: X.UJn  reason: case insensitive filesystem */
public abstract class C15010UJn extends C19008WGj {
    public final int[] A00;

    public C15010UJn(AnonymousClass1Jg r5, C17405VUk vUk, X9i x9i) {
        super(r5, vUk, x9i);
        SparseIntArray sparseIntArray = vUk.A02;
        sparseIntArray.getClass();
        this.A00 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                this.A01.EBn(this);
                return;
            }
        }
    }
}
