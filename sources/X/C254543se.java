package X;

/* renamed from: X.3se  reason: invalid class name and case insensitive filesystem */
public abstract class C254543se {
    public static final Long A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            return 00y.A0n(10, str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r6.isEmpty() != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap A01(java.util.List r6) {
        /*
            if (r6 == 0) goto L_0x0009
            boolean r1 = r6.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r5 = 0
            if (r0 == 0) goto L_0x000e
            return r5
        L_0x000e:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r3 = r6.iterator()
        L_0x0017:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r3.next()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r2 = r0.A0H
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
        L_0x002d:
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto L_0x003d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r1 == 0) goto L_0x003d
            r4.put(r1, r0)
        L_0x003d:
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L_0x0017
        L_0x0043:
            r1 = r5
            goto L_0x002d
        L_0x0045:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254543se.A01(java.util.List):java.util.HashMap");
    }
}
