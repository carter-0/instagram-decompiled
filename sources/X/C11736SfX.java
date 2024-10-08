package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.SfX  reason: case insensitive filesystem */
public final class C11736SfX implements C22557YAo {
    public int A00;
    public boolean A01;
    public int A02;
    public long A03 = -9223372036854775807L;
    public final List A04;
    public final C13900TjN[] A05;

    public final void ANC(YBZ ybz, SR8 sr8) {
        int i = 0;
        while (true) {
            C13900TjN[] tjNArr = this.A05;
            if (i < tjNArr.length) {
                C10349Rqm rqm = (C10349Rqm) this.A04.get(i);
                sr8.A03();
                SR8.A02(sr8);
                C13900TjN FHV = ybz.FHV(sr8.A00, 3);
                SOW A002 = SOW.A00();
                SR8.A02(sr8);
                A002.A0T = sr8.A01;
                A002.A01("application/dvbsubs");
                A002.A0X = Collections.singletonList(rqm.A01);
                A002.A0V = rqm.A00;
                C13900TjN.A00(A002, FHV);
                tjNArr[i] = FHV;
                i++;
            } else {
                return;
            }
        }
    }

    public final void EKt() {
        this.A01 = false;
        this.A03 = -9223372036854775807L;
    }

    public final void AJP(C11389SRd sRd) {
        boolean z = this.A01;
        if (z) {
            int i = this.A00;
            if (i == 2) {
                if (Pxe.A06(sRd) != 0) {
                    if (sRd.A05() != 32) {
                        this.A01 = false;
                        z = false;
                    }
                    this.A00 = 1;
                    i = 1;
                    if (!z) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (i == 1) {
                if (Pxe.A06(sRd) != 0) {
                    if (sRd.A05() != 0) {
                        this.A01 = false;
                        z = false;
                    }
                    this.A00 = 0;
                    if (!z) {
                        return;
                    }
                } else {
                    return;
                }
            }
            int i2 = sRd.A01;
            int i3 = sRd.A00 - i2;
            for (C13900TjN EJf : this.A05) {
                sRd.A0O(i2);
                EJf.EJf(sRd, i3);
            }
            this.A02 += i3;
        }
    }

    public final void E1X(boolean z) {
        if (this.A01) {
            C11366SPh.A02(AnonymousClass7TF.A1P((this.A03 > -9223372036854775807L ? 1 : (this.A03 == -9223372036854775807L ? 0 : -1))));
            for (C13900TjN EJm : this.A05) {
                EJm.EJm((S4h) null, 1, this.A02, 0, this.A03);
            }
            this.A01 = false;
        }
    }

    public final void E1Y(long j, int i) {
        if ((i & 4) != 0) {
            this.A01 = true;
            this.A03 = j;
            this.A02 = 0;
            this.A00 = 2;
        }
    }

    public C11736SfX(List list) {
        this.A04 = list;
        this.A05 = new C13900TjN[list.size()];
    }
}
