package X;

/* renamed from: X.MaO  reason: case insensitive filesystem */
public final class C66655MaO {
    public int A00;
    public C270214gN A01;
    public String A02;

    public static C66655MaO A00(1OS r4) {
        0qQ.A0B(r4, 0);
        return new C66655MaO(r4.A04, r4.A06, r4.A00);
    }

    public static C66655MaO A01(C74248Prc prc) {
        C66656MaP maP = (C66656MaP) prc;
        return new C66655MaO(maP.A01, maP.A02, maP.A00);
    }

    public static void A02(C66655MaO maO, String str, String str2) {
        int i;
        if (!str.equals("executing")) {
            if (str.equals("upload_failed_transient") && str2.equals("queued")) {
                i = 0;
            } else {
                return;
            }
        } else if (str2.equals("queued")) {
            i = maO.A00 + 1;
        } else {
            return;
        }
        maO.A00 = i;
    }

    public final void A04(String str) {
        String str2 = this.A02;
        A03(str2, str);
        A02(this, str2, str);
        this.A02 = str;
        this.A01 = null;
    }

    public C66655MaO(C270214gN r3, String str, int i) {
        this.A02 = str;
        this.A00 = i;
        if ("upload_failed_transient".equals(str) || "upload_failed_permanent".equals(str)) {
            if (r3 != null) {
                this.A01 = r3;
            }
        } else if (r3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid parameters: lifecycleState=");
            sb.append(str);
            sb.append(AnonymousClass000.A00(1988));
            sb.append(r3);
            0wb.A03("DirectMutationStateBuilder_init", sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r0 = r8.equals("upload_failed_transient");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r0 = r8.equals("upload_failed_permanent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r0 = r8.equals("queued");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r0 = r8.equals("executing");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r0 = r8.equals("uploaded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        switch(r2) {
            case 0: goto L_0x0027;
            case 1: goto L_0x003e;
            case 2: goto L_0x0044;
            case 3: goto L_0x0022;
            default: goto L_0x0015;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        throw X.AnonymousClass7TE.A0z(X.002.A0u("Invalid transition from ", r7, " to ", r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r0 = r8.equals("queued");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        switch(r8.hashCode()) {
            case -948696717: goto L_0x0039;
            case 1501196714: goto L_0x0034;
            case 1563991648: goto L_0x0044;
            case 1885454214: goto L_0x002f;
            default: goto L_0x002e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = r7.hashCode()
            java.lang.String r6 = "upload_failed_transient"
            java.lang.String r5 = "upload_failed_permanent"
            java.lang.String r4 = "executing"
            java.lang.String r3 = "queued"
            switch(r0) {
                case -1090974990: goto L_0x005d;
                case -948696717: goto L_0x0057;
                case 1501196714: goto L_0x0051;
                case 1885454214: goto L_0x004b;
                default: goto L_0x000f;
            }
        L_0x000f:
            r2 = -1
        L_0x0010:
            java.lang.String r1 = "uploaded"
            switch(r2) {
                case 0: goto L_0x0027;
                case 1: goto L_0x003e;
                case 2: goto L_0x0044;
                case 3: goto L_0x0022;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.String r1 = "Invalid transition from "
            java.lang.String r0 = " to "
            java.lang.String r0 = X.002.A0u(r1, r7, r0, r8)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0022:
            boolean r0 = r8.equals(r3)
            goto L_0x0042
        L_0x0027:
            int r0 = r8.hashCode()
            switch(r0) {
                case -948696717: goto L_0x0039;
                case 1501196714: goto L_0x0034;
                case 1563991648: goto L_0x0044;
                case 1885454214: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0015
        L_0x002f:
            boolean r0 = r8.equals(r6)
            goto L_0x0048
        L_0x0034:
            boolean r0 = r8.equals(r5)
            goto L_0x0048
        L_0x0039:
            boolean r0 = r8.equals(r3)
            goto L_0x0048
        L_0x003e:
            boolean r0 = r8.equals(r4)
        L_0x0042:
            if (r0 != 0) goto L_0x0065
        L_0x0044:
            boolean r0 = r8.equals(r1)
        L_0x0048:
            if (r0 != 0) goto L_0x0065
            goto L_0x0015
        L_0x004b:
            boolean r0 = r7.equals(r6)
            r2 = 3
            goto L_0x0062
        L_0x0051:
            boolean r0 = r7.equals(r5)
            r2 = 2
            goto L_0x0062
        L_0x0057:
            boolean r0 = r7.equals(r3)
            r2 = 1
            goto L_0x0062
        L_0x005d:
            boolean r0 = r7.equals(r4)
            r2 = 0
        L_0x0062:
            if (r0 != 0) goto L_0x0010
            goto L_0x000f
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66655MaO.A03(java.lang.String, java.lang.String):void");
    }
}
