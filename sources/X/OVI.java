package X;

public final class OVI {
    public final /* synthetic */ OWR A00;
    public final /* synthetic */ C70665OFm A01;
    public final /* synthetic */ C71087ObS A02;
    public final /* synthetic */ String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r1 != 13) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C69545Nnp r8, java.lang.Integer r9, java.lang.Integer r10) {
        /*
            r7 = this;
            r6 = 0
            java.lang.Throwable r1 = r8.A01
            boolean r0 = r1 instanceof X.C69542Nnm
            if (r0 == 0) goto L_0x0073
            X.Nnm r1 = (X.C69542Nnm) r1
            java.lang.Integer r0 = r1.A00
            if (r0 == 0) goto L_0x0073
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x0065
            X.Nk3 r4 = X.C69363Nk3.A0B
        L_0x0016:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Restore module fetch failure (error: "
            r2.append(r0)
            java.lang.String r5 = r4.A01
            r2.append(r5)
            java.lang.String r0 = ", attempts remaining: "
            r2.append(r0)
            java.lang.String r1 = "null"
            r0 = r9
            if (r9 != 0) goto L_0x002f
            r0 = r1
        L_0x002f:
            r2.append(r0)
            java.lang.String r0 = ", backoff time (s): "
            r2.append(r0)
            if (r10 == 0) goto L_0x003a
            r1 = r10
        L_0x003a:
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r1, r2)
            java.lang.String r0 = "VestaLoginClient"
            X.0KC.A0F(r0, r1, r8)
            X.OWR r0 = r7.A00
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r0.A01
            r2 = 1021649468(0x3ce5223c, float:0.027970426)
            int r1 = r0.A00
            java.lang.String r0 = "fetch_recovery_code_error"
            r3.markerPoint(r2, r1, r0)
            java.lang.String r0 = "fetch_rc_error"
            r3.markerAnnotate(r2, r1, r0, r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            X.ObS r1 = r7.A02
            X.OW0 r0 = new X.OW0
            r0.<init>(r4, r2, r10, r9)
            r1.A05(r0)
            return
        L_0x0065:
            r0 = 3
            if (r1 == r0) goto L_0x0091
            r0 = 10
            if (r1 == r0) goto L_0x008b
            r0 = 11
            if (r1 != r0) goto L_0x0088
            X.Nk3 r4 = X.C69363Nk3.A09
            goto L_0x0016
        L_0x0073:
            java.lang.Integer r0 = r8.A00
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x0094
            r0 = 9
            if (r1 == r0) goto L_0x0091
            r0 = 8
            if (r1 == r0) goto L_0x008e
            r0 = 13
            if (r1 == r0) goto L_0x008b
        L_0x0088:
            X.Nk3 r4 = X.C69363Nk3.A07
            goto L_0x0016
        L_0x008b:
            X.Nk3 r4 = X.C69363Nk3.A05
            goto L_0x0016
        L_0x008e:
            X.Nk3 r4 = X.C69363Nk3.A0E
            goto L_0x0016
        L_0x0091:
            X.Nk3 r4 = X.C69363Nk3.A08
            goto L_0x0016
        L_0x0094:
            X.Nk3 r4 = X.C69363Nk3.A06
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVI.A01(X.Nnp, java.lang.Integer, java.lang.Integer):void");
    }

    public OVI(OWR owr, C70665OFm oFm, C71087ObS obS, String str) {
        this.A00 = owr;
        this.A03 = str;
        this.A01 = oFm;
        this.A02 = obS;
    }

    public static void A00(C70639OEl oEl, OVI ovi, C69545Nnp nnp) {
        ovi.A01(nnp, oEl.A00, oEl.A01);
    }
}
