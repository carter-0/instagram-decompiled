package X;

/* renamed from: X.WQx  reason: case insensitive filesystem */
public final class C19238WQx implements AnonymousClass1FD {
    public static final C19238WQx A00 = new C19238WQx();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.Jv6 r3 = new X.Jv6
            r3.<init>()
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0019
            java.lang.String r1 = "JSON string for AudioMutingInfo should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0019:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00a6
            java.lang.String r2 = X.AnonymousClass7TE.A17(r5)
            if (r2 == 0) goto L_0x00a1
            int r1 = r2.hashCode()
            r0 = 0
            switch(r1) {
                case -1619042518: goto L_0x0082;
                case -330398791: goto L_0x0073;
                case 9716456: goto L_0x0064;
                case 87336860: goto L_0x004b;
                case 1595120176: goto L_0x003c;
                default: goto L_0x002f;
            }
        L_0x002f:
            java.lang.String r1 = X.C13988Tno.A0g(r2)
            java.lang.String r0 = "AudioMutingInfoJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0038:
            r5.A0z()
            goto L_0x0019
        L_0x003c:
            java.lang.String r0 = "mute_audio"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002f
            boolean r0 = r5.A0d()
            r3.A03 = r0
            goto L_0x0038
        L_0x004b:
            java.lang.String r0 = "mute_reason_str"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002f
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0038
            java.lang.String r0 = r5.A1P()
            if (r0 == 0) goto L_0x0038
            r3.A01 = r0
            goto L_0x0038
        L_0x0064:
            java.lang.String r0 = "show_muted_audio_toast"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002f
            boolean r0 = r5.A0d()
            r3.A04 = r0
            goto L_0x0038
        L_0x0073:
            java.lang.String r0 = "allow_audio_editing"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002f
            boolean r0 = r5.A0d()
            r3.A02 = r0
            goto L_0x0038
        L_0x0082:
            java.lang.String r1 = "mute_reason"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002f
            X.16L r2 = r5.A11()
            X.16L r1 = X.16L.A0G
            if (r2 == r1) goto L_0x009e
            java.lang.String r1 = r5.A1P()
            if (r1 == 0) goto L_0x009e
            java.util.Map r0 = X.RFN.A01
            java.lang.Object r0 = r0.get(r1)
        L_0x009e:
            r3.A00 = r0
            goto L_0x0038
        L_0x00a1:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x00a6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19238WQx.invoke(X.16F):java.lang.Object");
    }
}
