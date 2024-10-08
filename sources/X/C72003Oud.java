package X;

/* renamed from: X.Oud  reason: case insensitive filesystem */
public final /* synthetic */ class C72003Oud implements AnonymousClass68Z {
    public final /* synthetic */ MYb A00;

    public /* synthetic */ C72003Oud(MYb mYb) {
        this.A00 = mYb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r10 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r10) {
        /*
            r9 = this;
            X.MYb r7 = r9.A00
            java.lang.String r10 = (java.lang.String) r10
            X.MYd r8 = r7.A0G
            java.lang.String r2 = r8.A00(r10)
            if (r2 == 0) goto L_0x0021
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.util.HashMap r1 = r8.A00
            java.lang.String r0 = X.OXF.A01(r10)
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x0023
            X.1aU r0 = X.1aU.A09(r2)
            return r0
        L_0x0021:
            if (r10 == 0) goto L_0x007f
        L_0x0023:
            int r0 = r10.length()
            if (r0 == 0) goto L_0x007f
            r4 = 0
            android.net.Uri r3 = X.DbT.A09(r10)
            r2 = 0
            java.util.List r1 = r3.getPathSegments()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0046
            java.lang.Object r0 = r1.get(r2)     // Catch:{ NumberFormatException -> 0x0046 }
            X.0qQ.A07(r0)     // Catch:{ NumberFormatException -> 0x0046 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x0046 }
            java.lang.Long r4 = X.DbV.A0q(r0)     // Catch:{ NumberFormatException -> 0x0046 }
        L_0x0046:
            int r0 = X.DbV.A03(r3)
            r6 = 2
            if (r0 >= r6) goto L_0x0075
            r5 = 0
        L_0x004e:
            if (r4 == 0) goto L_0x007f
            if (r5 == 0) goto L_0x007f
            r8.A01(r10)
            long r2 = r4.longValue()
            X.1aU r4 = r7.A0B
            r1 = 1
            X.Ov2 r0 = new X.Ov2
            r0.<init>(r2, r5, r1)
            X.1aU r1 = r4.A0M(r0)
            X.Ov3 r0 = new X.Ov3
            r0.<init>(r10, r7, r6)
            X.1aU r1 = r1.A0K(r0)
            java.lang.String r0 = "rxmailbox_load_media_from_msys_media_cache"
            X.1aU r0 = X.C66581MXm.A0N(r1, r0)
            return r0
        L_0x0075:
            java.util.List r1 = r3.getPathSegments()
            r0 = 1
            java.lang.String r5 = X.AnonymousClass7TE.A19(r1, r0)
            goto L_0x004e
        L_0x007f:
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.util.HashMap r0 = r8.A01
            r0.remove(r10)
            java.lang.String r0 = ""
            X.1aU r0 = X.1aU.A09(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72003Oud.apply(java.lang.Object):java.lang.Object");
    }
}
