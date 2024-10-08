package X;

import android.util.SparseIntArray;

/* renamed from: X.UJj  reason: case insensitive filesystem */
public final class C15009UJj extends C19008WGj implements AnonymousClass15X, 1T3 {
    public final int[] A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15009UJj(AnonymousClass1Jg r6, C17405VUk vUk, X9i x9i) {
        super(r6, vUk, x9i);
        AnonymousClass7TG.A1U(r6, vUk, x9i);
        SparseIntArray sparseIntArray = vUk.A02;
        this.A00 = new int[sparseIntArray.size()];
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            this.A00[i] = sparseIntArray.keyAt(i);
        }
        this.A01.EBn(this);
    }
}
