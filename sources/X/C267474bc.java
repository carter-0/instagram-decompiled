package X;

/* renamed from: X.4bc  reason: invalid class name and case insensitive filesystem */
public final class C267474bc extends 0D3 {
    public final boolean A00;
    public final boolean A01;

    public final String getName() {
        return "BrowserLiteCookieManagerFixer";
    }

    public final void CMP() {
        if (this.A00) {
            RQ6.A01 = true;
            A0B("mFlushInBackground");
        }
        if (this.A01) {
            RQ6.A00 = true;
            A0B("mSkipFlush");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36314115995404735L) == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36314115995208125L) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C267474bc(X.AnonymousClass0Rt r7) {
        /*
            r6 = this;
            r6.<init>(r7)
            java.lang.Class<X.0hI> r0 = X.AnonymousClass0hI.class
            X.0Rt r5 = r6.A05(r0)
            X.0hI r5 = (X.AnonymousClass0hI) r5
            r4 = 1
            if (r5 == 0) goto L_0x0021
            com.instagram.common.session.UserSession r3 = r5.A00
            r3.getClass()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314115995404735(0x81037f003d09bf, double:3.0285314084776606E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r6.A01 = r0
            if (r5 == 0) goto L_0x003b
            com.instagram.common.session.UserSession r3 = r5.A00
            r3.getClass()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314115995208125(0x81037f003a09bd, double:3.0285314083533236E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x003b
        L_0x0038:
            r6.A00 = r4
            return
        L_0x003b:
            r4 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267474bc.<init>(X.0Rt):void");
    }
}
