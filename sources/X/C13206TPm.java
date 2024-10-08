package X;

import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: X.TPm  reason: case insensitive filesystem */
public final class C13206TPm implements C13970TmY {
    public int A00 = 0;
    public final CRC32 A01 = new CRC32();
    public final Inflater A02;
    public final YCT A03;
    public final C13202TPi A04;

    public static void A00(String str, int i, int i2) {
        if (i2 != i) {
            throw JTO.A0u(String.format("%s: actual 0x%08x != expected 0x%08x", Pxg.A1a(str, i2, i)));
        }
    }

    private void A01(C13198TPe tPe, long j, long j2) {
        SRX srx = tPe.A01;
        while (j >= SRX.A00(srx)) {
            j -= SRX.A00(srx);
            srx = srx.A02;
        }
        while (j2 > 0) {
            int i = (int) (((long) srx.A01) + j);
            int min = (int) Math.min((long) (srx.A00 - i), j2);
            this.A01.update(srx.A06, i, min);
            j2 -= (long) min;
            srx = srx.A02;
            j = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e3, code lost:
        if (r0 == 2) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long E6C(X.C13198TPe r24, long r25) {
        /*
            r23 = this;
            r19 = 0
            r2 = r25
            int r0 = (r25 > r19 ? 1 : (r25 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x0127
            int r0 = (r25 > r19 ? 1 : (r25 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0126
            r4 = r23
            int r0 = r4.A00
            r8 = 1
            if (r0 != 0) goto L_0x00c9
            X.YCT r5 = r4.A03
            r6 = 10
            r5.EHi(r6)
            X.TPe r10 = r5.AEA()
            r0 = 3
            byte r16 = r10.A00(r0)
            int r0 = r16 >> 1
            r0 = r0 & 1
            r9 = 0
            r15 = 0
            if (r0 != r8) goto L_0x0036
            r15 = 1
            r21 = r6
            r18 = r10
            r17 = r4
            r17.A01(r18, r19, r21)
        L_0x0036:
            short r6 = r5.readShort()
            r1 = 8075(0x1f8b, float:1.1315E-41)
            java.lang.String r0 = "ID1ID2"
            A00(r0, r1, r6)
            r0 = 8
            r5.Evi(r0)
            int r0 = r16 >> 2
            r0 = r0 & 1
            if (r0 != r8) goto L_0x0072
            r0 = 2
            r5.EHi(r0)
            if (r15 == 0) goto L_0x005c
            r21 = r0
            r18 = r10
            r17 = r4
            r17.A01(r18, r19, r21)
        L_0x005c:
            short r0 = r10.E6l()
            long r0 = (long) r0
            r5.EHi(r0)
            if (r15 == 0) goto L_0x006f
            r21 = r0
            r18 = r10
            r17 = r4
            r17.A01(r18, r19, r21)
        L_0x006f:
            r5.Evi(r0)
        L_0x0072:
            int r0 = r16 >> 3
            r0 = r0 & 1
            r13 = -1
            r11 = 1
            if (r0 != r8) goto L_0x0093
            long r0 = r5.CMD(r9)
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0120
            if (r15 == 0) goto L_0x008f
            long r21 = r0 + r11
            r18 = r10
            r17 = r4
            r17.A01(r18, r19, r21)
        L_0x008f:
            long r0 = r0 + r11
            r5.Evi(r0)
        L_0x0093:
            int r0 = r16 >> 4
            r0 = r0 & 1
            if (r0 != r8) goto L_0x00b0
            long r0 = r5.CMD(r9)
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x011a
            if (r15 == 0) goto L_0x00ac
            long r21 = r0 + r11
            r18 = r10
            r17 = r4
            r17.A01(r18, r19, r21)
        L_0x00ac:
            long r0 = r0 + r11
            r5.Evi(r0)
        L_0x00b0:
            if (r15 == 0) goto L_0x00c6
            short r9 = r5.E6l()
            java.util.zip.CRC32 r7 = r4.A01
            long r5 = r7.getValue()
            int r0 = (int) r5
            short r1 = (short) r0
            java.lang.String r0 = "FHCRC"
            A00(r0, r9, r1)
            r7.reset()
        L_0x00c6:
            r4.A00 = r8
            r0 = 1
        L_0x00c9:
            r19 = -1
            r1 = 2
            if (r0 != r8) goto L_0x00e3
            r7 = r24
            long r5 = r7.A00
            X.TPi r0 = r4.A04
            long r12 = r0.E6C(r7, r2)
            int r0 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00e6
            r8 = r4
            r9 = r7
            r10 = r5
            r8.A01(r9, r10, r12)
            return r12
        L_0x00e3:
            if (r0 != r1) goto L_0x0126
            goto L_0x00e8
        L_0x00e6:
            r4.A00 = r1
        L_0x00e8:
            X.YCT r6 = r4.A03
            int r5 = r6.E6X()
            java.util.zip.CRC32 r0 = r4.A01
            long r2 = r0.getValue()
            int r1 = (int) r2
            java.lang.String r0 = "CRC"
            A00(r0, r5, r1)
            int r5 = r6.E6X()
            java.util.zip.Inflater r0 = r4.A02
            long r2 = r0.getBytesWritten()
            int r1 = (int) r2
            java.lang.String r0 = "ISIZE"
            A00(r0, r5, r1)
            r0 = 3
            r4.A00 = r0
            boolean r0 = r6.ATS()
            if (r0 != 0) goto L_0x0126
            java.lang.String r0 = "gzip finished without exhausting source"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x011a:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x0120:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x0126:
            return r19
        L_0x0127:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.IllegalArgumentException r0 = X.Pxg.A0b(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13206TPm.E6C(X.TPe, long):long");
    }

    public final C11291SJy Ezn() {
        return this.A03.Ezn();
    }

    public final void close() {
        this.A04.close();
    }

    public C13206TPm(C13970TmY tmY) {
        if (tmY != null) {
            Inflater inflater = new Inflater(true);
            this.A02 = inflater;
            C13197TPd tPd = new C13197TPd(tmY);
            this.A03 = tPd;
            this.A04 = new C13202TPi(inflater, tPd);
            return;
        }
        throw AnonymousClass7TE.A0w("source == null");
    }
}
