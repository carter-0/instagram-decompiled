package X;

/* renamed from: X.3og  reason: invalid class name and case insensitive filesystem */
public final class C252173og extends AnonymousClass4DB {
    public final ThreadLocal A00;
    public volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C252173og(X.AnonymousClass4D7 r4, X.C262094Cc r5) {
        /*
            r3 = this;
            X.1Wx r1 = X.1Wx.A00
            X.4Cb r0 = r5.get(r1)
            if (r0 != 0) goto L_0x003a
            X.4Cc r0 = r5.plus(r1)
        L_0x000c:
            r3.<init>(r4, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r3.A00 = r0
            X.4Cc r1 = r4.getContext()
            X.12d r0 = X.C262104Cd.A00
            X.4Cb r0 = r1.get(r0)
            boolean r0 = r0 instanceof X.AnonymousClass4CZ
            if (r0 != 0) goto L_0x0039
            r0 = 0
            java.lang.Object r2 = X.1F5.A00(r0, r5)
            X.1F5.A02(r2, r5)
            r0 = 1
            r3.threadLocalIsSet = r0
            java.lang.ThreadLocal r1 = r3.A00
            X.0eP r0 = new X.0eP
            r0.<init>(r5, r2)
            r1.set(r0)
        L_0x0039:
            return
        L_0x003a:
            r0 = r5
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252173og.<init>(X.4D7, X.4Cc):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2.A00.get() != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0X() {
        /*
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            if (r0 == 0) goto L_0x000d
            java.lang.ThreadLocal r0 = r2.A00
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.ThreadLocal r0 = r2.A00
            r0.remove()
            r0 = r1 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252173og.A0X():boolean");
    }
}
