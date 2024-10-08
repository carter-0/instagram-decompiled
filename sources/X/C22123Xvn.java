package X;

/* renamed from: X.Xvn  reason: case insensitive filesystem */
public final class C22123Xvn implements YAN {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C11389SRd A04 = Pxe.A0P(32);
    public final YA4 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        if (r10.A02 == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a5, code lost:
        r5 = r6.A02;
        r4 = 0;
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        if (r4 >= r9) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
        r0 = androidx.media3.common.util.Util.A09[((r0 >>> 24) ^ (r5[r4] & 255)) & 255] ^ (r0 << 8);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        if (r0 != 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
        r9 = r9 - 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c2, code lost:
        r6.A0N(r9);
        r6.A0O(0);
        r10.A05.AJP(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJQ(X.C11389SRd r11, int r12) {
        /*
            r10 = this;
            r7 = 1
            r0 = r12 & 1
            r8 = 0
            if (r0 == 0) goto L_0x00cf
            r2 = 1
            int r0 = r11.A05()
            int r1 = r11.A01
            int r1 = r1 + r0
        L_0x000e:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x001b
            if (r2 == 0) goto L_0x0038
            r10.A03 = r8
            r11.A0O(r1)
        L_0x0019:
            r10.A00 = r8
        L_0x001b:
            int r1 = X.Pxe.A06(r11)
            if (r1 <= 0) goto L_0x0038
            int r2 = r10.A00
            r4 = 3
            if (r2 >= r4) goto L_0x008a
            if (r2 != 0) goto L_0x0039
            int r1 = r11.A05()
            int r0 = r11.A01
            int r0 = r0 - r7
            r11.A0O(r0)
            r0 = 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L_0x0039
        L_0x0036:
            r10.A03 = r7
        L_0x0038:
            return
        L_0x0039:
            int r1 = X.Pxe.A06(r11)
            int r2 = r10.A00
            int r0 = 3 - r2
            int r1 = java.lang.Math.min(r1, r0)
            X.SRd r3 = r10.A04
            byte[] r0 = r3.A02
            r11.A0R(r0, r2, r1)
            int r0 = r10.A00
            int r0 = r0 + r1
            r10.A00 = r0
            if (r0 != r4) goto L_0x001b
            r3.A0O(r8)
            r3.A0N(r4)
            r3.A0P(r7)
            int r2 = r3.A05()
            int r1 = r3.A05()
            r0 = r2 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r10.A02 = r0
            r0 = r2 & 15
            int r0 = r0 << 8
            r0 = r0 | r1
            int r2 = r0 + 3
            r10.A01 = r2
            byte[] r0 = r3.A02
            int r0 = r0.length
            if (r0 >= r2) goto L_0x001b
            r1 = 4098(0x1002, float:5.743E-42)
            int r0 = r0 * 2
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = java.lang.Math.min(r1, r0)
            r3.A0L(r0)
            goto L_0x001b
        L_0x008a:
            int r0 = r10.A01
            int r0 = r0 - r2
            int r1 = java.lang.Math.min(r1, r0)
            X.SRd r6 = r10.A04
            byte[] r0 = r6.A02
            r11.A0R(r0, r2, r1)
            int r0 = r10.A00
            int r0 = r0 + r1
            r10.A00 = r0
            int r9 = r10.A01
            if (r0 != r9) goto L_0x001b
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x00c2
            byte[] r5 = r6.A02
            r4 = 0
            r0 = -1
        L_0x00a9:
            if (r4 >= r9) goto L_0x00be
            int r3 = r0 << 8
            int[] r2 = androidx.media3.common.util.Util.A09
            int r1 = r0 >>> 24
            byte r0 = r5[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 ^ r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            r0 = r2[r0]
            r0 = r0 ^ r3
            int r4 = r4 + 1
            goto L_0x00a9
        L_0x00be:
            if (r0 != 0) goto L_0x0036
            int r9 = r9 + -4
        L_0x00c2:
            r6.A0N(r9)
            r6.A0O(r8)
            X.YA4 r0 = r10.A05
            r0.AJP(r6)
            goto L_0x0019
        L_0x00cf:
            r2 = 0
            r1 = -1
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22123Xvn.AJQ(X.SRd, int):void");
    }

    public final void EKt() {
        this.A03 = true;
    }

    public final void CMT(C21505XdL xdL, YBZ ybz, SR8 sr8) {
        this.A05.CMT(xdL, ybz, sr8);
        this.A03 = true;
    }

    public C22123Xvn(YA4 ya4) {
        this.A05 = ya4;
    }
}
