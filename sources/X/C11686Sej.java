package X;

/* renamed from: X.Sej  reason: case insensitive filesystem */
public final class C11686Sej implements C13809Thc {
    public boolean A00;
    public final C11389SRd A01 = Pxe.A0P(2786);
    public final C11741Sfc A02 = new C11741Sfc();

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void EKu(long j, long j2) {
        this.A00 = false;
        this.A02.EKt();
    }

    public final void CMU(YBZ ybz) {
        this.A02.ANC(ybz, new SR8(AnonymousClass972.MUTABLE_FLAG_MASK, 0, 1));
        ybz.ASU();
        C11710Sf7.A00(ybz, -9223372036854775807L);
    }

    public final int E67(C13910TlA tlA, C21363XYr xYr) {
        C11389SRd sRd = this.A01;
        int read = tlA.read(sRd.A02, 0, 2786);
        if (read == -1) {
            return -1;
        }
        sRd.A0O(0);
        sRd.A0N(read);
        if (!this.A00) {
            this.A02.A03 = 0;
            this.A00 = true;
        }
        this.A02.AJP(sRd);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r12.EI7();
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if ((r6 - r2) >= 8192) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Evx(X.C13910TlA r12) {
        /*
            r11 = this;
            r5 = 10
            X.SRd r4 = X.Pxe.A0P(r5)
            r3 = 0
            r2 = 0
        L_0x0008:
            byte[] r0 = r4.A02
            r12.E2F(r0, r3, r5)
            r4.A0O(r3)
            int r1 = r4.A06()
            r0 = 4801587(0x494433, float:6.728456E-39)
            if (r1 == r0) goto L_0x007d
            r12.EI7()
            r12.AAu(r2)
            r6 = r2
        L_0x0020:
            r5 = 0
        L_0x0021:
            byte[] r0 = r4.A02
            r9 = 6
            r12.E2F(r0, r3, r9)
            r4.A0O(r3)
            int r1 = r4.A08()
            r0 = 2935(0xb77, float:4.113E-42)
            if (r1 == r0) goto L_0x0041
            r12.EI7()
            int r6 = r6 + 1
            int r1 = r6 - r2
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r0) goto L_0x008d
            r12.AAu(r6)
            goto L_0x0020
        L_0x0041:
            r0 = 1
            int r5 = r5 + 1
            r10 = 4
            if (r5 < r10) goto L_0x0048
            return r0
        L_0x0048:
            byte[] r8 = r4.A02
            int r0 = r8.length
            if (r0 < r9) goto L_0x008d
            r0 = 5
            byte r0 = r8[r0]
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r7 = 3
            int r1 = r1 >> r7
            r0 = 10
            if (r1 <= r0) goto L_0x0071
            r0 = 2
            byte r0 = r8[r0]
            r0 = r0 & 7
            int r1 = r0 << 8
            byte r0 = r8[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 + 1
            int r1 = r0 * 2
        L_0x0068:
            r0 = -1
            if (r1 == r0) goto L_0x008d
            int r0 = r1 + -6
            r12.AAu(r0)
            goto L_0x0021
        L_0x0071:
            byte r0 = r8[r10]
            r1 = r0 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> r9
            r0 = r0 & 63
            int r1 = X.SD6.A00(r1, r0)
            goto L_0x0068
        L_0x007d:
            r0 = 3
            r4.A0P(r0)
            int r1 = r4.A04()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r12.AAu(r1)
            goto L_0x0008
        L_0x008d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11686Sej.Evx(X.TlA):boolean");
    }
}
