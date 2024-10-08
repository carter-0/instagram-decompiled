package X;

import android.util.SparseArray;

/* renamed from: X.Sei  reason: case insensitive filesystem */
public final class C11685Sei implements C13809Thc {
    public C11703Sf0 A00;
    public final C13809Thc A01;
    public final C13890TjD A02;

    public final C13809Thc CBL() {
        return this.A01;
    }

    public final void CMU(YBZ ybz) {
        C11703Sf0 sf0 = new C11703Sf0(ybz, this.A02);
        this.A00 = sf0;
        this.A01.CMU(sf0);
    }

    public final int E67(C13910TlA tlA, C21363XYr xYr) {
        return this.A01.E67(tlA, xYr);
    }

    public final void EKu(long j, long j2) {
        C11703Sf0 sf0 = this.A00;
        if (sf0 != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = sf0.A00;
                if (i >= sparseArray.size()) {
                    break;
                }
                C13684Tf1 tf1 = ((C11718SfF) sparseArray.valueAt(i)).A01;
                if (tf1 != null) {
                    tf1.reset();
                }
                i++;
            }
        }
        this.A01.EKu(j, j2);
    }

    public final boolean Evx(C13910TlA tlA) {
        return this.A01.Evx(tlA);
    }

    public C11685Sei(C13809Thc thc, C13890TjD tjD) {
        this.A01 = thc;
        this.A02 = tjD;
    }
}
