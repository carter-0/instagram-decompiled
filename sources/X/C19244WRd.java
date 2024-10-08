package X;

/* renamed from: X.WRd  reason: case insensitive filesystem */
public final class C19244WRd implements AnonymousClass1FD {
    public static final C19244WRd A00 = new C19244WRd();

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.UKP] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r5) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.String r1 = ""
            X.Uxm r0 = X.C16592Uxm.UNKNOWN
            X.UKP r2 = new X.UKP
            r2.<init>()
            r2.A02 = r3
            r2.A00 = r3
            r2.A01 = r3
            r2.A04 = r1
            r2.A03 = r0
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0027
            java.lang.String r1 = "JSON string for TextSpanMetadata should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00b7
            java.lang.String r1 = X.AnonymousClass7TE.A17(r5)
            if (r1 == 0) goto L_0x00b2
            int r0 = r1.hashCode()
            switch(r0) {
                case -1938130407: goto L_0x0099;
                case -1893976672: goto L_0x0076;
                case 1511663954: goto L_0x0067;
                case 1523908397: goto L_0x0058;
                case 2057435750: goto L_0x0049;
                default: goto L_0x003c;
            }
        L_0x003c:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "TextSpanMetadataJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0045:
            r5.A0z()
            goto L_0x0027
        L_0x0049:
            java.lang.String r0 = "span_end"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r5.A1D()
            r2.A00 = r0
            goto L_0x0045
        L_0x0058:
            java.lang.String r0 = "span_start"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r5.A1D()
            r2.A02 = r0
            goto L_0x0045
        L_0x0067:
            java.lang.String r0 = "span_flags"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r5.A1D()
            r2.A01 = r0
            goto L_0x0045
        L_0x0076:
            java.lang.String r0 = "metadata_model_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0045
            java.lang.String r1 = r5.A1P()
            if (r1 == 0) goto L_0x0045
            java.util.Map r0 = X.C16592Uxm.A01
            java.lang.Object r0 = r0.get(r1)
            X.Uxm r0 = (X.C16592Uxm) r0
            if (r0 == 0) goto L_0x0045
            r2.A03 = r0
            goto L_0x0045
        L_0x0099:
            java.lang.String r0 = "metadata_model"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0045
            java.lang.String r0 = r5.A1P()
            if (r0 == 0) goto L_0x0045
            r2.A04 = r0
            goto L_0x0045
        L_0x00b2:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x00b7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19244WRd.invoke(X.16F):java.lang.Object");
    }
}
