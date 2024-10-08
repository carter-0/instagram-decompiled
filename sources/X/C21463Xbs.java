package X;

import java.io.EOFException;

/* renamed from: X.Xbs  reason: case insensitive filesystem */
public final class C21463Xbs {
    public int A00;
    public boolean A01;
    public final C11389SRd A02;
    public final C21487Xce A03 = new C21487Xce();

    public final boolean A00(C13910TlA tlA) {
        C21487Xce xce;
        int i;
        int i2;
        C11366SPh.A02(AnonymousClass7TF.A1V(tlA));
        if (this.A01) {
            this.A01 = false;
            this.A02.A0M(0);
        }
        while (!this.A01) {
            int i3 = this.A00;
            if (i3 < 0) {
                C21487Xce xce2 = this.A03;
                if (xce2.A00(tlA, -1) && xce2.A01(tlA, true)) {
                    int i4 = xce2.A01;
                    if ((xce2.A03 & 1) == 1 && this.A02.A00 == 0) {
                        int i5 = 0;
                        i3 = 0;
                        do {
                            int i6 = i3;
                            if (i3 >= xce2.A02) {
                                break;
                            }
                            i3++;
                            i2 = xce2.A05[i6];
                            i5 += i2;
                        } while (i2 == 255);
                        i4 += i5;
                    } else {
                        i3 = 0;
                    }
                    try {
                        tlA.Evk(i4);
                        this.A00 = i3;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int i7 = 0;
            int i8 = 0;
            do {
                int i9 = i8 + i3;
                xce = this.A03;
                if (i9 >= xce.A02) {
                    break;
                }
                int i10 = i8;
                i8++;
                i = xce.A05[i10 + i3];
                i7 += i;
            } while (i == 255);
            int i11 = i3 + i8;
            if (i7 > 0) {
                C11389SRd sRd = this.A02;
                sRd.A0L(sRd.A00 + i7);
                tlA.readFully(sRd.A02, sRd.A00, i7);
                sRd.A0N(sRd.A00 + i7);
                this.A01 = JTQ.A1O(xce.A05[i11 - 1], 255);
            }
            if (i11 == xce.A02) {
                i11 = -1;
            }
            this.A00 = i11;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.SRd, java.lang.Object] */
    public C21463Xbs() {
        ? obj = new Object();
        obj.A02 = new byte[65025];
        obj.A00 = 0;
        this.A02 = obj;
        this.A00 = -1;
    }
}
