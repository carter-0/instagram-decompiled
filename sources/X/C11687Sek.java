package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.Sek  reason: case insensitive filesystem */
public final class C11687Sek implements C13809Thc {
    public boolean A00;
    public final C11389SRd A01 = Pxe.A0P(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
    public final C11742Sfd A02 = new C11742Sfd();

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
        int read = tlA.read(sRd.A02, 0, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if ((r6 - r2) >= 8192) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        r12.EI7();
        r6 = r6 + 1;
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
            if (r1 == r0) goto L_0x008a
            r12.EI7()
            r12.AAu(r2)
            r6 = r2
        L_0x0020:
            r5 = 0
        L_0x0021:
            byte[] r0 = r4.A02
            r1 = 7
            r12.E2F(r0, r3, r1)
            r4.A0O(r3)
            int r7 = r4.A08()
            r0 = 44096(0xac40, float:6.1792E-41)
            if (r7 == r0) goto L_0x0047
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r7 == r0) goto L_0x0047
            r12.EI7()
            int r6 = r6 + 1
            int r1 = r6 - r2
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r0) goto L_0x009a
            r12.AAu(r6)
            goto L_0x0020
        L_0x0047:
            r0 = 1
            int r5 = r5 + 1
            r9 = 4
            if (r5 < r9) goto L_0x004e
            return r0
        L_0x004e:
            byte[] r8 = r4.A02
            int r0 = r8.length
            r10 = 7
            if (r0 < r1) goto L_0x009a
            r0 = 2
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 8
            r0 = 3
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L_0x0088
            byte r0 = r8[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 16
            r0 = 5
            int r1 = X.Pxf.A0D(r8, r0, r1)
            r0 = 6
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
        L_0x0077:
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r7 != r0) goto L_0x007e
            int r10 = r10 + 2
        L_0x007e:
            int r1 = r1 + r10
            r0 = -1
            if (r1 == r0) goto L_0x009a
            int r0 = r1 + -7
            r12.AAu(r0)
            goto L_0x0021
        L_0x0088:
            r10 = 4
            goto L_0x0077
        L_0x008a:
            r0 = 3
            r4.A0P(r0)
            int r1 = r4.A04()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r12.AAu(r1)
            goto L_0x0008
        L_0x009a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11687Sek.Evx(X.TlA):boolean");
    }
}
