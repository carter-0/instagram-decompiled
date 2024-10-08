package X;

/* renamed from: X.4ep  reason: invalid class name and case insensitive filesystem */
public enum C269254ep {
    ANY,
    PUBLIC_ONLY,
    NONE,
    DEFAULT;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (java.lang.reflect.Modifier.isProtected(r4.getModifiers()) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(java.lang.reflect.Member r4) {
        /*
            r3 = this;
            int r2 = r3.ordinal()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x0027
            if (r2 == r1) goto L_0x0012
            r0 = 2
            if (r2 == r0) goto L_0x001d
            r0 = 3
            if (r2 == r0) goto L_0x0028
            r0 = 0
            return r0
        L_0x0012:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPrivate(r0)
            r0 = r0 ^ 1
            return r0
        L_0x001d:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isProtected(r0)
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            return r1
        L_0x0028:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269254ep.A00(java.lang.reflect.Member):boolean");
    }
}
