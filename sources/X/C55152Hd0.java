package X;

/* renamed from: X.Hd0  reason: case insensitive filesystem */
public abstract class C55152Hd0 {
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.instagram.common.session.UserSession r5, X.1Xj r6, java.lang.String r7) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r3 = 1
            r4 = 1
            if (r7 == 0) goto L_0x0031
            java.util.ArrayList r0 = r6.A3A()
            if (r0 == 0) goto L_0x0031
            java.util.Iterator r2 = r0.iterator()
        L_0x0012:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r1 = r2.next()
            com.instagram.model.shopping.ProductTag r1 = (com.instagram.model.shopping.ProductTag) r1
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r1.A02
            com.instagram.user.model.Product r0 = X.C14502TxO.A00(r0)
            java.lang.String r0 = r0.A0H
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 == 0) goto L_0x0012
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0012
            return r3
        L_0x0031:
            java.util.ArrayList r0 = r6.A3K(r3)
            r3 = 0
            if (r0 == 0) goto L_0x0085
            java.util.Iterator r2 = r0.iterator()
        L_0x003c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r2.next()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            if (r1 != 0) goto L_0x0054
        L_0x0052:
            java.lang.String r1 = ""
        L_0x0054:
            java.lang.String r0 = r5.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            r1 = 1
        L_0x005d:
            boolean r0 = X.C51968G9o.A1W(r5, r6)
            if (r0 != 0) goto L_0x0083
            com.instagram.user.model.User r0 = r6.A2A(r5)
            if (r0 == 0) goto L_0x0083
            com.instagram.user.model.User r0 = r6.A2A(r5)
            if (r0 == 0) goto L_0x0073
            java.lang.String r3 = r0.getId()
        L_0x0073:
            boolean r0 = X.C51966G9m.A1W(r5, r3)
            if (r0 != 0) goto L_0x0083
            if (r1 == 0) goto L_0x0083
            X.1Xy r0 = r6.A0C
            X.3ZV r0 = r0.AaD()
            if (r0 == 0) goto L_0x0084
        L_0x0083:
            r4 = 0
        L_0x0084:
            return r4
        L_0x0085:
            r1 = 0
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55152Hd0.A00(com.instagram.common.session.UserSession, X.1Xj, java.lang.String):boolean");
    }
}
