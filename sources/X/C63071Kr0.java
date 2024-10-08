package X;

/* renamed from: X.Kr0  reason: case insensitive filesystem */
public abstract class C63071Kr0 {
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r9, X.AnonymousClass6Tm r10) {
        /*
            r3 = 1
            java.lang.Object r2 = r10.A01()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>"
            X.0qQ.A0C(r2, r0)
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r1 = X.DbV.A16(r2)
        L_0x0010:
            boolean r0 = r1.hasNext()
            r8 = 0
            if (r0 == 0) goto L_0x006f
            java.lang.Object r7 = r1.next()
            java.lang.Object r0 = r2.get(r7)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 == 0) goto L_0x0010
        L_0x0025:
            java.lang.String r7 = (java.lang.String) r7
            r0 = 3
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r0)
            int r5 = r6.length
            r4 = 0
        L_0x002e:
            r3 = 0
            if (r4 >= r5) goto L_0x004f
            r2 = r6[r4]
            int r0 = r2.intValue()
            switch(r0) {
                case 1: goto L_0x0069;
                case 2: goto L_0x006c;
                default: goto L_0x003a;
            }
        L_0x003a:
            java.lang.String r0 = "auto_xpost"
        L_0x003c:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = X.DbT.A12(r1, r0)
            if (r7 == 0) goto L_0x0048
            java.lang.String r3 = X.DbT.A12(r1, r7)
        L_0x0048:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0066
            r3 = r2
        L_0x004f:
            X.0lg r1 = X.C308206Td.A0B(r9)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0071
            if (r1 == 0) goto L_0x0071
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r1)
            X.Jy0 r0 = new X.Jy0
            r0.<init>(r3)
            r1.A05(r0)
            return r8
        L_0x0066:
            int r4 = r4 + 1
            goto L_0x002e
        L_0x0069:
            java.lang.String r0 = "share_once"
            goto L_0x003c
        L_0x006c:
            java.lang.String r0 = "dismiss"
            goto L_0x003c
        L_0x006f:
            r7 = r8
            goto L_0x0025
        L_0x0071:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63071Kr0.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
