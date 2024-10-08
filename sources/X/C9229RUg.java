package X;

/* renamed from: X.RUg  reason: case insensitive filesystem */
public abstract class C9229RUg {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r6.A01.isEmpty() != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.C10503RtI r6, java.lang.String r7) {
        /*
            if (r6 == 0) goto L_0x00a9
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x000f
            java.util.List r0 = r6.A01
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x00a9
            r4 = 0
            android.net.Uri r4 = X.0cp.A03(r7)     // Catch:{ SecurityException -> 0x0018 }
            goto L_0x0024
        L_0x0018:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "IABStickyUTMParamsDecorator"
            java.lang.String r0 = "URL parsing throw security exception: %s"
            X.SQO.A01(r1, r0, r2)
        L_0x0024:
            if (r4 == 0) goto L_0x00a9
            java.lang.String r1 = r6.A00
            if (r1 != 0) goto L_0x0075
            r2 = 0
        L_0x002b:
            java.lang.String r1 = r4.getAuthority()
            if (r1 != 0) goto L_0x006e
            r0 = 0
        L_0x0032:
            boolean r0 = X.2Ob.A00(r2, r0)
            if (r0 == 0) goto L_0x00a9
            android.net.Uri$Builder r1 = X.Pxe.A0I()
            java.lang.String r0 = r4.getScheme()
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = r4.getAuthority()
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = r4.getPath()
            android.net.Uri$Builder r5 = r1.path(r0)
            java.util.Set r0 = r4.getQueryParameterNames()
            java.util.Iterator r2 = r0.iterator()
        L_0x005c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            java.lang.String r0 = r4.getQueryParameter(r1)
            r5.appendQueryParameter(r1, r0)
            goto L_0x005c
        L_0x006e:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            goto L_0x0032
        L_0x0075:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toLowerCase(r0)
            goto L_0x002b
        L_0x007c:
            java.util.List r0 = r6.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x0082:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r2 = r3.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r0 = r2.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r4.getQueryParameter(r0)
            if (r0 != 0) goto L_0x0082
            java.lang.Object r1 = r2.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r2.second
            java.lang.String r0 = (java.lang.String) r0
            r5.appendQueryParameter(r1, r0)
            goto L_0x0082
        L_0x00a4:
            java.lang.String r0 = X.Pxf.A0b(r5)
            return r0
        L_0x00a9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9229RUg.A00(X.RtI, java.lang.String):java.lang.String");
    }
}
