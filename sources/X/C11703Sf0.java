package X;

import android.util.SparseArray;

/* renamed from: X.Sf0  reason: case insensitive filesystem */
public final class C11703Sf0 implements YBZ {
    public final SparseArray A00 = Pxe.A0L();
    public final YBZ A01;
    public final C13890TjD A02;

    public final C13900TjN FHV(int i, int i2) {
        if (i2 != 3) {
            return this.A01.FHV(i, i2);
        }
        SparseArray sparseArray = this.A00;
        C11718SfF sfF = (C11718SfF) sparseArray.get(i);
        if (sfF != null) {
            return sfF;
        }
        C11718SfF sfF2 = new C11718SfF(this.A01.FHV(i, i2), this.A02);
        sparseArray.put(i, sfF2);
        return sfF2;
    }

    public final void ASU() {
        this.A01.ASU();
    }

    public final void EKw(C13511Tbc tbc) {
        this.A01.EKw(tbc);
    }

    public C11703Sf0(YBZ ybz, C13890TjD tjD) {
        this.A01 = ybz;
        this.A02 = tjD;
    }
}
