package X;

/* renamed from: X.Oav  reason: case insensitive filesystem */
public final class C71076Oav {
    public static final C71076Oav A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        throw X.DbW.A0c("Invalid lifecycleState: ", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r9.equals(r0) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r1.A04.A04(java.lang.Integer.valueOf(r5), r7.A05, A01(r9));
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (r9.equals(r0) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        r1.A04.A05(r7.A05, java.lang.Integer.valueOf(r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C66481nR r7, X.2Dm r8, java.lang.String r9) {
        /*
            X.DbY.A1S(r8, r9)
            java.util.List r0 = r7.A00
            if (r0 == 0) goto L_0x0075
            java.util.Iterator r6 = r0.iterator()
            r3 = 0
            r5 = 0
        L_0x000d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r1 = r6.next()
            int r4 = r5 + 1
            if (r5 >= 0) goto L_0x0023
            X.0sr.A1T()
        L_0x001e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0023:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r8
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r0 = r0.A0C
            X.2PM r1 = r0.A0A(r1)
            if (r1 == 0) goto L_0x0073
            int r0 = r9.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0060;
                case -948696717: goto L_0x005d;
                case 1501196714: goto L_0x0044;
                case 1563991648: goto L_0x0041;
                case 1885454214: goto L_0x003e;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r9)
            throw r0
        L_0x003e:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0046
        L_0x0041:
            java.lang.String r0 = "uploaded"
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0046:
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.3SB r3 = r1.A04
            java.lang.String r2 = r7.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = A01(r9)
            r3.A04(r1, r2, r0)
            r3 = 1
            goto L_0x0073
        L_0x005d:
            java.lang.String r0 = "queued"
            goto L_0x0062
        L_0x0060:
            java.lang.String r0 = "executing"
        L_0x0062:
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.3SB r2 = r1.A04
            java.lang.String r1 = r7.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A05(r1, r0)
        L_0x0073:
            r5 = r4
            goto L_0x000d
        L_0x0075:
            java.lang.String r0 = "folderSequence"
            X.0qQ.A0F(r0)
            goto L_0x001e
        L_0x007b:
            if (r3 == 0) goto L_0x0084
            X.2Dr r8 = (X.2Dr) r8
            X.2ED r0 = r8.A0C
            r0.A0H()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71076Oav.A00(X.1nR, X.2Dm, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r2.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        throw X.DbW.A0c("Invalid lifecycleState: ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        throw X.DbW.A0c("Invalid lifecycleState: ", r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            java.lang.String r1 = "Invalid lifecycleState: "
            switch(r0) {
                case -1090974990: goto L_0x0028;
                case -948696717: goto L_0x0025;
                case 1501196714: goto L_0x001b;
                case 1563991648: goto L_0x0011;
                case 1885454214: goto L_0x000e;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r2)
            throw r0
        L_0x000e:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x001d
        L_0x0011:
            java.lang.String r0 = "uploaded"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0009
            r0 = 1
            return r0
        L_0x001b:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x001d:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0009
            r0 = 0
            return r0
        L_0x0025:
            java.lang.String r0 = "queued"
            goto L_0x002a
        L_0x0028:
            java.lang.String r0 = "executing"
        L_0x002a:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71076Oav.A01(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r8.equals(r0) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r3 = r1.A03;
        r2 = r6.A05;
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r1 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r3.A04(r1, r2, A01(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r8.equals(r0) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r2 = r1.A03;
        r1 = r6.A05;
        r0 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r0 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r2.A05(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r4.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        r0 = "folderName";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass1nJ r6, X.2Dm r7, java.lang.String r8) {
        /*
            r5 = this;
            X.DbY.A1S(r7, r8)
            X.2Dr r7 = (X.2Dr) r7
            X.2ED r4 = r7.A0C
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x005a
            X.2PM r1 = r4.A0A(r0)
            if (r1 == 0) goto L_0x0056
            int r0 = r8.hashCode()
            switch(r0) {
                case -1090974990: goto L_0x0040;
                case -948696717: goto L_0x003d;
                case 1501196714: goto L_0x0025;
                case 1563991648: goto L_0x0022;
                case 1885454214: goto L_0x001f;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r8)
            throw r0
        L_0x001f:
            java.lang.String r0 = "upload_failed_transient"
            goto L_0x0027
        L_0x0022:
            java.lang.String r0 = "uploaded"
            goto L_0x0027
        L_0x0025:
            java.lang.String r0 = "upload_failed_permanent"
        L_0x0027:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            X.3SB r3 = r1.A03
            java.lang.String r2 = r6.A05
            java.lang.String r1 = r6.A01
            if (r1 == 0) goto L_0x0057
            boolean r0 = A01(r8)
            r3.A04(r1, r2, r0)
            goto L_0x0053
        L_0x003d:
            java.lang.String r0 = "queued"
            goto L_0x0042
        L_0x0040:
            java.lang.String r0 = "executing"
        L_0x0042:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            X.3SB r2 = r1.A03
            java.lang.String r1 = r6.A05
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x0057
            r2.A05(r1, r0)
        L_0x0053:
            r4.A0H()
        L_0x0056:
            return
        L_0x0057:
            java.lang.String r0 = "folderName"
            goto L_0x005c
        L_0x005a:
            java.lang.String r0 = "folderId"
        L_0x005c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71076Oav.A02(X.1nJ, X.2Dm, java.lang.String):void");
    }
}
