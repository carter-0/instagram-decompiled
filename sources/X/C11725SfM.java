package X;

/* renamed from: X.SfM  reason: case insensitive filesystem */
public final class C11725SfM implements C13763Tgb {
    public final int A00;
    public final int A01;
    public final C11389SRd A02;

    public final int B6R() {
        return this.A00;
    }

    public final int BpA() {
        return this.A01;
    }

    public final int E6b() {
        int i = this.A00;
        if (i == -1) {
            return this.A02.A07();
        }
        return i;
    }

    public C11725SfM(SJM sjm, QEK qek) {
        C11389SRd sRd = qek.A00;
        this.A02 = sRd;
        int A07 = Pxe.A07(sRd, 12);
        if ("audio/raw".equals(sjm.A0Y)) {
            int i = sjm.A0E;
            int i2 = sjm.A06;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 21) {
                            if (i != 22) {
                                if (i != 268435456) {
                                    if (i != 1342177280) {
                                        if (i != 1610612736) {
                                            throw Pxe.A0g();
                                        }
                                    }
                                }
                            }
                        }
                        i2 *= 3;
                    }
                    i2 *= 4;
                }
                if (A07 == 0 || A07 % i2 != 0) {
                    STH.A03("AtomParsers", 002.A02(i2, A07, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                    A07 = i2;
                }
                this.A00 = A07;
                this.A01 = sRd.A07();
            }
            i2 *= 2;
            STH.A03("AtomParsers", 002.A02(i2, A07, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
            A07 = i2;
        }
        if (A07 == 0) {
            A07 = -1;
        }
        this.A00 = A07;
        this.A01 = sRd.A07();
    }
}
