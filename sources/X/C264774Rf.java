package X;

import android.util.SparseBooleanArray;

/* renamed from: X.4Rf  reason: invalid class name and case insensitive filesystem */
public final class C264774Rf {
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final void A02(C264794Rh r4) {
        int i = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = r4.A00;
            if (i < sparseBooleanArray.size()) {
                C256703wD.A00(i, sparseBooleanArray.size());
                A01(sparseBooleanArray.keyAt(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final C264794Rh A00() {
        C256703wD.A04(!this.A00);
        this.A00 = true;
        return new C264794Rh(this.A01);
    }

    public final void A01(int i) {
        C256703wD.A04(!this.A00);
        this.A01.append(i, true);
    }
}
