package X;

public abstract class O0D {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        throw X.DbW.A0c("Invalid lifecycleState: ", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r10.equals(r1) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r1 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r10.equals("upload_failed_permanent") != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C270214gN r4, X.2Dm r5, com.instagram.model.direct.DirectThreadKey r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, X.AnonymousClass0eK r11) {
        /*
            r0 = r5
            X.2Dr r0 = (X.2Dr) r0
            X.3U9 r0 = X.2Dr.A03(r0, r6)
            if (r0 == 0) goto L_0x0036
            X.3su r0 = r5.BRy(r6, r9)
            if (r0 == 0) goto L_0x006e
            java.lang.String r1 = r0.A0g()
            if (r1 != 0) goto L_0x0036
        L_0x0015:
            r1 = 3957(0xf75, float:5.545E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r1.equals(r7)
            java.lang.String r3 = "upload_failed_permanent"
            java.lang.String r2 = "upload_failed_transient"
            if (r1 == 0) goto L_0x0037
            boolean r1 = r10.equals(r2)
            if (r1 != 0) goto L_0x0031
            boolean r1 = r10.equals(r3)
            if (r1 == 0) goto L_0x0037
        L_0x0031:
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
        L_0x0033:
            r5.A9g(r0, r4, r6, r1)
        L_0x0036:
            return
        L_0x0037:
            int r1 = r10.hashCode()
            switch(r1) {
                case -1090974990: goto L_0x0045;
                case -948696717: goto L_0x0048;
                case 1501196714: goto L_0x0053;
                case 1563991648: goto L_0x005a;
                case 1885454214: goto L_0x0065;
                default: goto L_0x003e;
            }
        L_0x003e:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r10)
            throw r0
        L_0x0045:
            java.lang.String r1 = "executing"
            goto L_0x004a
        L_0x0048:
            java.lang.String r1 = "queued"
        L_0x004a:
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x003e
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0033
        L_0x0053:
            boolean r1 = r10.equals(r3)
            if (r1 == 0) goto L_0x003e
            goto L_0x0031
        L_0x005a:
            java.lang.String r1 = "uploaded"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x003e
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            goto L_0x0033
        L_0x0065:
            boolean r1 = r10.equals(r2)
            if (r1 == 0) goto L_0x003e
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x0033
        L_0x006e:
            java.lang.Object r0 = r11.get()
            X.3su r0 = (X.C254703su) r0
            r0.A1f = r8
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O0D.A00(X.4gN, X.2Dm, com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0eK):void");
    }
}
