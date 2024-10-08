package X;

public final class WR3 implements AnonymousClass1FD {
    public static final WR3 A00 = new WR3();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.MbR r3 = new X.MbR
            r3.<init>()
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0019
            java.lang.String r1 = "JSON string for LyricsPhrase should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0019:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00a1
            java.lang.String r1 = X.AnonymousClass7TE.A17(r5)
            if (r1 == 0) goto L_0x009c
            int r0 = r1.hashCode()
            switch(r0) {
                case -988963143: goto L_0x0083;
                case -673702133: goto L_0x0074;
                case 108130827: goto L_0x004e;
                case 506856690: goto L_0x003b;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "LyricsPhraseJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0037:
            r5.A0z()
            goto L_0x0019
        L_0x003b:
            r0 = 1308(0x51c, float:1.833E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002e
            int r0 = r5.A1D()
            r3.A00 = r0
            goto L_0x0037
        L_0x004e:
            java.lang.String r0 = "word_offsets"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0071
        L_0x0063:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0071
            X.WRf r0 = X.C19246WRf.A00
            X.C13988Tno.A1I(r5, r0, r2)
            goto L_0x0063
        L_0x0071:
            r3.A02 = r2
            goto L_0x0037
        L_0x0074:
            java.lang.String r0 = "start_time_in_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002e
            int r0 = r5.A1D()
            r3.A01 = r0
            goto L_0x0037
        L_0x0083:
            java.lang.String r0 = "phrase"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002e
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0037
            java.lang.String r0 = r5.A1P()
            if (r0 == 0) goto L_0x0037
            r3.A03 = r0
            goto L_0x0037
        L_0x009c:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x00a1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WR3.invoke(X.16F):java.lang.Object");
    }
}
