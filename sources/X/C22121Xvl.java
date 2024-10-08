package X;

import java.io.EOFException;

/* renamed from: X.Xvl  reason: case insensitive filesystem */
public final class C22121Xvl implements YAM {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public int A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C21487Xce A0A;
    public final C21472Xc5 A0B;

    public final /* bridge */ /* synthetic */ C13511Tbc AMz() {
        if (this.A05 != 0) {
            return new C22109XvZ(this);
        }
        return null;
    }

    public final long E6B(C13910TlA tlA) {
        long j;
        long j2;
        long j3;
        int i = this.A06;
        C13910TlA tlA2 = tlA;
        if (i == 0) {
            long Bdl = tlA2.Bdl();
            this.A07 = Bdl;
            this.A06 = 1;
            long j4 = this.A08 - 65307;
            if (j4 > Bdl) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j5 = this.A02;
                long j6 = this.A00;
                if (j5 != j6) {
                    long Bdl2 = tlA2.Bdl();
                    C21487Xce xce = this.A0A;
                    if (!xce.A00(tlA2, j6)) {
                        j2 = this.A02;
                        if (j2 == Bdl2) {
                            throw JTO.A0u("No ogg page can be found.");
                        }
                    } else {
                        xce.A01(tlA2, false);
                        tlA2.EI7();
                        long j7 = this.A04;
                        long j8 = xce.A04;
                        long j9 = j7 - j8;
                        int i2 = xce.A01 + xce.A00;
                        if (0 > j9 || j9 >= 72000) {
                            if (j9 < 0) {
                                this.A00 = Bdl2;
                                this.A01 = j8;
                            } else {
                                this.A02 = tlA2.Bdl() + ((long) i2);
                                this.A03 = j8;
                            }
                            long j10 = this.A00;
                            j2 = this.A02;
                            long j11 = j10 - j2;
                            if (j11 < 100000) {
                                this.A00 = j2;
                            } else {
                                long j12 = (long) i2;
                                if (j9 <= 0) {
                                    j3 = 2;
                                } else {
                                    j3 = 1;
                                }
                                j2 = Math.max(j2, Math.min((tlA2.Bdl() - (j12 * j3)) + ((j9 * j11) / (this.A01 - this.A03)), j10 - 1));
                            }
                        }
                    }
                    if (j2 != -1) {
                        return j2;
                    }
                }
                this.A06 = 3;
            } else if (i != 3) {
                return -1;
            }
            while (true) {
                C21487Xce xce2 = this.A0A;
                xce2.A00(tlA2, -1);
                xce2.A01(tlA2, false);
                if (xce2.A04 > this.A04) {
                    tlA2.EI7();
                    this.A06 = 4;
                    return -(this.A03 + 2);
                }
                tlA2.Evk(xce2.A01 + xce2.A00);
                this.A02 = tlA2.Bdl();
                this.A03 = xce2.A04;
            }
        }
        C21487Xce xce3 = this.A0A;
        xce3.A03 = 0;
        xce3.A04 = 0;
        xce3.A02 = 0;
        xce3.A01 = 0;
        xce3.A00 = 0;
        if (xce3.A00(tlA2, -1)) {
            xce3.A01(tlA2, false);
            tlA2.Evk(xce3.A01 + xce3.A00);
            while (true) {
                j = xce3.A04;
                if ((xce3.A03 & 4) == 4 || !xce3.A00(tlA2, -1) || tlA2.Bdl() >= this.A08 || !xce3.A01(tlA2, true)) {
                    break;
                }
                try {
                    tlA2.Evk(xce3.A01 + xce3.A00);
                } catch (EOFException unused) {
                }
            }
            this.A05 = j;
            this.A06 = 4;
            return this.A07;
        }
        throw new EOFException();
    }

    public final void Exb(long j) {
        long j2 = this.A05;
        this.A04 = Math.max(0, Math.min(j, j2 - 1));
        this.A06 = 2;
        this.A02 = this.A09;
        this.A00 = this.A08;
        this.A03 = 0;
        this.A01 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r9 <= r7) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22121Xvl(X.C21472Xc5 r6, long r7, long r9, long r11, long r13, boolean r15) {
        /*
            r5 = this;
            r5.<init>()
            r2 = 0
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x000f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            X.C11366SPh.A01(r0)
            r5.A0B = r6
            r5.A09 = r7
            r5.A08 = r9
            long r9 = r9 - r7
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            if (r15 != 0) goto L_0x002a
            r5.A06 = r2
        L_0x0022:
            X.Xce r0 = new X.Xce
            r0.<init>()
            r5.A0A = r0
            return
        L_0x002a:
            r5.A05 = r13
            r0 = 4
            r5.A06 = r0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22121Xvl.<init>(X.Xc5, long, long, long, long, boolean):void");
    }
}
