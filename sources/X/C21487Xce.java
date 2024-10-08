package X;

import java.io.EOFException;

/* renamed from: X.Xce  reason: case insensitive filesystem */
public final class C21487Xce {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final int[] A05 = new int[255];
    public final C11389SRd A06 = Pxe.A0P(255);

    public final boolean A01(C13910TlA tlA, boolean z) {
        this.A03 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
        C11389SRd sRd = this.A06;
        sRd.A0M(27);
        try {
            if (!tlA.E2G(sRd.A02, 0, 27, z) || sRd.A0C() != 1332176723) {
                return false;
            }
            if (sRd.A05() == 0) {
                this.A03 = sRd.A05();
                this.A04 = sRd.A09();
                sRd.A0A();
                sRd.A0A();
                sRd.A0A();
                int A052 = sRd.A05();
                this.A02 = A052;
                this.A01 = A052 + 27;
                sRd.A0M(A052);
                if (!tlA.E2G(sRd.A02, 0, A052, z)) {
                    return false;
                }
                for (int i = 0; i < this.A02; i++) {
                    int[] iArr = this.A05;
                    int A053 = sRd.A05();
                    iArr[i] = A053;
                    this.A00 += A053;
                }
                return true;
            } else if (z) {
                return false;
            } else {
                e = new XQX("unsupported bit stream revision", (Throwable) null, 1, false);
                throw e;
            }
        } catch (EOFException e) {
            e = e;
            if (z) {
                return false;
            }
        }
    }

    public final boolean A00(C13910TlA tlA, long j) {
        C11366SPh.A01(AnonymousClass7TF.A1Q((tlA.Bdl() > tlA.BbM() ? 1 : (tlA.Bdl() == tlA.BbM() ? 0 : -1))));
        C11389SRd sRd = this.A06;
        sRd.A0M(4);
        while (true) {
            if (j != -1 && tlA.Bdl() + 4 >= j) {
                break;
            }
            try {
                if (!tlA.E2G(sRd.A02, 0, 4, true)) {
                    break;
                }
                sRd.A0O(0);
                if (sRd.A0C() == 1332176723) {
                    tlA.EI7();
                    return true;
                }
                tlA.Evk(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if ((j != -1 && tlA.Bdl() >= j) || tlA.Evh(1) == -1) {
                return false;
            }
            break;
        } while (tlA.Evh(1) == -1);
        return false;
    }
}
