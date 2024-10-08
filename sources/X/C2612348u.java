package X;

import java.io.IOException;

/* renamed from: X.48u  reason: invalid class name and case insensitive filesystem */
public final class C2612348u extends C2612448v {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C256683wB A03;
    public final C264884Rr A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r4 == 1) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2612348u(X.C256683wB r12, X.C264884Rr r13, java.lang.String r14, java.lang.String r15, java.lang.Throwable r16, int r17, int r18, int r19, int r20, long r21, boolean r23) {
        /*
            r11 = this;
            r5 = r11
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r21
            r5.<init>(r6, r7, r8, r9)
            r2 = 0
            r1 = 1
            r4 = r18
            r3 = r23
            if (r23 == 0) goto L_0x0016
            r0 = 0
            if (r4 != r1) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            X.C256703wD.A03(r0)
            if (r16 != 0) goto L_0x001f
            r0 = 3
            if (r4 != r0) goto L_0x0020
        L_0x001f:
            r2 = 1
        L_0x0020:
            X.C256703wD.A03(r2)
            r11.A02 = r4
            r11.A05 = r15
            r0 = r19
            r11.A01 = r0
            r11.A03 = r12
            r0 = r20
            r11.A00 = r0
            r11.A04 = r13
            r11.A06 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2612348u.<init>(X.3wB, X.4Rr, java.lang.String, java.lang.String, java.lang.Throwable, int, int, int, int, long, boolean):void");
    }

    public static C2612348u A00(IOException iOException, int i) {
        return new C2612348u((C256683wB) null, (String) null, iOException, 0, i, -1, 4, false);
    }

    public static C2612348u A01(RuntimeException runtimeException, int i) {
        return new C2612348u((C256683wB) null, (String) null, runtimeException, 2, i, -1, 4, false);
    }

    public final C2612348u A02(C264884Rr r14) {
        String message = getMessage();
        Throwable cause = getCause();
        int i = this.A00;
        int i2 = this.A02;
        return new C2612348u(this.A03, r14, message, this.A05, cause, i, i2, this.A01, this.A00, this.A01, this.A06);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2612348u(X.C256683wB r15, java.lang.String r16, java.lang.Throwable r17, int r18, int r19, int r20, int r21, boolean r22) {
        /*
            r14 = this;
            r3 = 0
            r2 = r15
            r5 = r16
            r6 = r17
            r8 = r18
            r9 = r20
            r10 = r21
            if (r17 == 0) goto L_0x0021
            java.lang.String r4 = r6.getMessage()
            if (r4 == 0) goto L_0x0021
        L_0x0014:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r1 = r14
            r7 = r19
            r13 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            return
        L_0x0021:
            if (r18 == 0) goto L_0x005e
            r0 = 1
            if (r8 == r0) goto L_0x0035
            java.lang.String r4 = "Unexpected runtime error"
        L_0x0028:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = ": "
            java.lang.String r4 = X.002.A0g(r4, r0, r3)
            goto L_0x0014
        L_0x0035:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = " error, index="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", format="
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ", format_supported="
            r1.append(r0)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.A0B(r10)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            goto L_0x0028
        L_0x005e:
            r0 = 2499(0x9c3, float:3.502E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2612348u.<init>(X.3wB, java.lang.String, java.lang.Throwable, int, int, int, int, boolean):void");
    }
}
