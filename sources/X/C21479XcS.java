package X;

import android.util.SparseBooleanArray;

/* renamed from: X.XcS  reason: case insensitive filesystem */
public final class C21479XcS {
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final C21495Xct A00() {
        C11366SPh.A02(!this.A00);
        this.A00 = true;
        return new C21495Xct(this.A01);
    }

    public final void A01(int i) {
        C11366SPh.A02(!this.A00);
        this.A01.append(i, true);
    }
}
