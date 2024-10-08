package X;

import android.util.SparseArray;

/* renamed from: X.Qfh  reason: case insensitive filesystem */
public final class C8037Qfh extends SRc {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public C8037Qfh(String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(i, true, z);
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = z3;
        this.A02 = str;
        SparseArray sparseArray = this.A04;
        Boolean valueOf = Boolean.valueOf(z2);
        sparseArray.put(i, valueOf);
        this.A05.A0B(valueOf);
    }
}
