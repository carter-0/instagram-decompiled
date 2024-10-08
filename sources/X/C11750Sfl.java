package X;

import android.util.SparseArray;

/* renamed from: X.Sfl  reason: case insensitive filesystem */
public final class C11750Sfl implements YA4 {
    public final ST7 A00 = new ST7(new byte[4]);
    public final /* synthetic */ C22106XvW A01;

    public final void CMT(C21505XdL xdL, YBZ ybz, SR8 sr8) {
    }

    public C11750Sfl(C22106XvW xvW) {
        this.A01 = xvW;
    }

    public final void AJP(C11389SRd sRd) {
        if (sRd.A05() == 0 && (sRd.A05() & 128) != 0) {
            sRd.A0P(6);
            int A06 = Pxe.A06(sRd) / 4;
            for (int i = 0; i < A06; i++) {
                ST7 st7 = this.A00;
                sRd.A0R(st7.A03, 0, 4);
                st7.A09(0);
                int A062 = st7.A06(16);
                st7.A0A(3);
                if (A062 == 0) {
                    st7.A0A(13);
                } else {
                    int A063 = st7.A06(13);
                    C22106XvW xvW = this.A01;
                    SparseArray sparseArray = xvW.A08;
                    if (sparseArray.get(A063) == null) {
                        sparseArray.put(A063, new C22123Xvn(new C11751Sfm(xvW, A063)));
                        xvW.A02++;
                    }
                }
            }
            this.A01.A08.remove(0);
        }
    }
}
