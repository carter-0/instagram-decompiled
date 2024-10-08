package X;

public final class WRU implements AnonymousClass1FD {
    public static final WRU A00 = new WRU();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r13) {
        /*
            r12 = this;
            r8 = 0
            X.0qQ.A0B(r13, r8)
            r3 = 0
            r10 = 63
            r11 = 2
            X.ULw r2 = new X.ULw
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.16L r1 = r13.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0022
            java.lang.String r1 = "JSON string for MediaStickerTimedInfo should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0022:
            X.16L r1 = r13.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00a3
            java.lang.String r1 = X.AnonymousClass7TE.A17(r13)
            if (r1 == 0) goto L_0x009e
            int r0 = r1.hashCode()
            switch(r0) {
                case -993625031: goto L_0x008f;
                case -952357052: goto L_0x0080;
                case -557632268: goto L_0x0071;
                case 537866993: goto L_0x0062;
                case 1089510420: goto L_0x0053;
                case 1106770299: goto L_0x0044;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaStickerTimedInfoJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0040:
            r13.A0z()
            goto L_0x0022
        L_0x0044:
            java.lang.String r0 = "start_time_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            int r0 = r13.A1D()
            r2.A01 = r0
            goto L_0x0040
        L_0x0053:
            java.lang.String r0 = "tts_voice_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = X.C13989Tnp.A0o(r13)
            r2.A04 = r0
            goto L_0x0040
        L_0x0062:
            java.lang.String r0 = "tts_shortwave_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = X.C13989Tnp.A0o(r13)
            r2.A03 = r0
            goto L_0x0040
        L_0x0071:
            java.lang.String r0 = "end_time_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            int r0 = r13.A1D()
            r2.A00 = r0
            goto L_0x0040
        L_0x0080:
            java.lang.String r0 = "tts_voice_name"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = X.C13989Tnp.A0o(r13)
            r2.A05 = r0
            goto L_0x0040
        L_0x008f:
            java.lang.String r0 = "tts_sfx"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = X.C13989Tnp.A0o(r13)
            r2.A02 = r0
            goto L_0x0040
        L_0x009e:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x00a3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRU.invoke(X.16F):java.lang.Object");
    }
}
