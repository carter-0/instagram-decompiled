package X;

/* renamed from: X.Y4k  reason: case insensitive filesystem */
public final class C22453Y4k implements C22552Y9f {
    public final boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f6, code lost:
        if ("close".equalsIgnoreCase(r1) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r3.equals("HEAD") != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.Y1H CNe(X.C21469Xc1 r13) {
        /*
            r12 = this;
            X.Xcc r7 = r13.A05
            if (r7 == 0) goto L_0x0150
            X.Xbw r10 = r13.A04
            long r1 = java.lang.System.currentTimeMillis()
            X.YAz r8 = r7.A04     // Catch:{ IOException -> 0x014b }
            r8.FO2(r10)     // Catch:{ IOException -> 0x014b }
            java.lang.String r3 = r10.A00
            java.lang.String r0 = "GET"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "HEAD"
            boolean r3 = r3.equals(r0)
            r0 = 1
            if (r3 == 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r11 = 0
            r9 = 0
            if (r0 == 0) goto L_0x007e
            X.Xml r5 = r10.A04
            if (r5 == 0) goto L_0x007e
            java.lang.String r3 = "Expect"
            X.Xt4 r0 = r10.A02
            java.lang.String r3 = r0.A03(r3)
            java.lang.String r0 = "100-continue"
            boolean r0 = r0.equalsIgnoreCase(r3)
            r4 = 1
            if (r0 == 0) goto L_0x0057
            r8.AW5()     // Catch:{ IOException -> 0x014b }
            X.Xny r9 = r7.A00(r4)
            if (r9 == 0) goto L_0x0057
            X.Xp1 r3 = r7.A03
            r0 = 0
            r3.A02(r0, r7, r4, r11)
            X.Y7U r3 = r8.AJK()
            X.Y1K r0 = r3.A09
            if (r0 != 0) goto L_0x0084
            r3.A01()
            goto L_0x0084
        L_0x0057:
            r3 = 0
            X.Tma r3 = r8.AMs(r10, r3)
            X.Y4s r0 = new X.Y4s
            r0.<init>(r7, r3)
            X.TPc r4 = new X.TPc
            r4.<init>(r0)
            byte[] r3 = r5.A00
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0079
            X.TPe r0 = r4.A01
            r0.A0K(r3, r11)
            r4.A00()
            r4.close()
            goto L_0x0084
        L_0x0079:
            java.lang.IllegalStateException r1 = X.Pxh.A0a()
            throw r1
        L_0x007e:
            X.Xp1 r3 = r7.A03
            r0 = 1
            r3.A02(r9, r7, r0, r11)
        L_0x0084:
            r8.AVZ()     // Catch:{ IOException -> 0x014b }
            if (r9 != 0) goto L_0x008d
            X.Xny r9 = r7.A00(r11)
        L_0x008d:
            r9.A07 = r10
            X.Y7U r4 = r8.AJK()
            X.Xod r0 = r4.A07
            r9.A04 = r0
            r9.A02 = r1
            long r5 = java.lang.System.currentTimeMillis()
            r9.A01 = r5
            X.Y1H r9 = r9.A00()
            int r6 = r9.A00
            r0 = 100
            if (r6 != r0) goto L_0x00c1
            X.Xny r3 = r7.A00(r11)
            r3.A07 = r10
            X.Xod r0 = r4.A07
            r3.A04 = r0
            r3.A02 = r1
            long r0 = java.lang.System.currentTimeMillis()
            r3.A01 = r0
            X.Y1H r9 = r3.A00()
            int r6 = r9.A00
        L_0x00c1:
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x012d
            r0 = 101(0x65, float:1.42E-43)
            if (r6 != r0) goto L_0x012d
            X.Xny r5 = new X.Xny
            r5.<init>(r9)
            X.Y1D r0 = X.SUS.A06
        L_0x00d0:
            r5.A0B = r0
            X.Y1H r7 = r5.A00()
            X.Xbw r0 = r7.A07
            java.lang.String r3 = "Connection"
            X.Xt4 r0 = r0.A02
            java.lang.String r0 = r0.A03(r3)
            java.lang.String r2 = "close"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00f8
            r1 = 0
            X.Xt4 r0 = r7.A05
            java.lang.String r0 = r0.A03(r3)
            if (r0 == 0) goto L_0x00f2
            r1 = r0
        L_0x00f2:
            boolean r0 = r2.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00fb
        L_0x00f8:
            r4.A01()
        L_0x00fb:
            r0 = 204(0xcc, float:2.86E-43)
            if (r6 == r0) goto L_0x0103
            r0 = 205(0xcd, float:2.87E-43)
            if (r6 != r0) goto L_0x014a
        L_0x0103:
            X.Y1D r0 = r7.A0B
            long r2 = r0.A00()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x014a
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "HTTP "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " had non-zero Content-Length: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.net.ProtocolException r1 = new java.net.ProtocolException
            r1.<init>(r0)
            throw r1
        L_0x012d:
            X.Xny r5 = new X.Xny
            r5.<init>(r9)
            long r2 = r8.EHG(r9)     // Catch:{ IOException -> 0x014b }
            X.TmY r1 = r8.E1F(r9)     // Catch:{ IOException -> 0x014b }
            X.Y4w r0 = new X.Y4w     // Catch:{ IOException -> 0x014b }
            r0.<init>(r7, r1, r2)     // Catch:{ IOException -> 0x014b }
            X.TPd r1 = new X.TPd     // Catch:{ IOException -> 0x014b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x014b }
            X.Y7B r0 = new X.Y7B     // Catch:{ IOException -> 0x014b }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x014b }
            goto L_0x00d0
        L_0x014a:
            return r7
        L_0x014b:
            r1 = move-exception
            r7.A01(r1)
            throw r1
        L_0x0150:
            java.lang.IllegalStateException r1 = X.Pxe.A0i()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22453Y4k.CNe(X.Xc1):X.Y1H");
    }

    public C22453Y4k(boolean z) {
        this.A00 = z;
    }
}
