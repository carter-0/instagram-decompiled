package X;

public final class WR2 implements AnonymousClass1FD {
    public static final WR2 A00 = new WR2();

    /* JADX WARNING: type inference failed for: r2v0, types: [X.UKe, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r7) {
        /*
            r6 = this;
            r5 = 0
            X.0qQ.A0B(r7, r5)
            java.lang.String r4 = ""
            r3 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = X.AnonymousClass7TG.A0j()
            X.UKe r2 = new X.UKe
            r2.<init>()
            r2.A06 = r4
            r2.A00 = r3
            r2.A04 = r5
            r2.A02 = r5
            r2.A07 = r5
            r2.A03 = r5
            r2.A01 = r1
            r2.A05 = r0
            X.16L r1 = r7.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0032
            java.lang.String r1 = "JSON string for KaraokeTranscriptionToken should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0032:
            X.16L r1 = r7.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00e9
            java.lang.String r1 = X.AnonymousClass7TE.A17(r7)
            if (r1 == 0) goto L_0x00e4
            int r0 = r1.hashCode()
            switch(r0) {
                case -1019779949: goto L_0x00d4;
                case -1012724312: goto L_0x00c4;
                case -557632268: goto L_0x00b5;
                case 3355: goto L_0x009c;
                case 109641799: goto L_0x008c;
                case 829251210: goto L_0x007c;
                case 1106770299: goto L_0x006d;
                case 1603019031: goto L_0x0054;
                default: goto L_0x0047;
            }
        L_0x0047:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "KaraokeTranscriptionTokenJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0050:
            r7.A0z()
            goto L_0x0032
        L_0x0054:
            java.lang.String r0 = "written"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            X.16L r1 = r7.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0050
            java.lang.String r0 = r7.A1P()
            if (r0 == 0) goto L_0x0050
            r2.A06 = r0
            goto L_0x0050
        L_0x006d:
            java.lang.String r0 = "start_time_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            int r0 = r7.A1D()
            r2.A04 = r0
            goto L_0x0050
        L_0x007c:
            java.lang.String r0 = "confidence"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            double r3 = r7.A0U()
            float r0 = (float) r3
            r2.A00 = r0
            goto L_0x0050
        L_0x008c:
            java.lang.String r0 = "speed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            double r3 = r7.A0U()
            float r0 = (float) r3
            r2.A01 = r0
            goto L_0x0050
        L_0x009c:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            X.16L r1 = r7.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0050
            java.lang.String r0 = r7.A1P()
            if (r0 == 0) goto L_0x0050
            r2.A05 = r0
            goto L_0x0050
        L_0x00b5:
            java.lang.String r0 = "end_time_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            int r0 = r7.A1D()
            r2.A02 = r0
            goto L_0x0050
        L_0x00c4:
            java.lang.String r0 = "profanity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            boolean r0 = r7.A0d()
            r2.A07 = r0
            goto L_0x0050
        L_0x00d4:
            java.lang.String r0 = "offset"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            int r0 = r7.A1D()
            r2.A03 = r0
            goto L_0x0050
        L_0x00e4:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x00e9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WR2.invoke(X.16F):java.lang.Object");
    }
}
