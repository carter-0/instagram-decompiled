package X;

/* renamed from: X.6TW  reason: invalid class name */
public abstract class AnonymousClass6TW {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r7.equals("normal") != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r1 = java.lang.Math.min(r5 + r1, com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage.MAX_ENTRIES);
        r0 = X.270.A01;
        X.02V.A01(r1, 1, "weight", com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage.MAX_ENTRIES);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r6 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        r6 = android.graphics.Typeface.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r0 = android.graphics.Typeface.create(r6, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        if (r7.equals("italic") != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        r1 = java.lang.Math.min(r5 + r1, com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage.MAX_ENTRIES);
        r0 = X.270.A01;
        X.02V.A01(r1, 1, "weight", com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage.MAX_ENTRIES);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        if (r6 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        r6 = android.graphics.Typeface.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        r0 = android.graphics.Typeface.create(r6, r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        X.0qQ.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        throw new java.io.IOException(X.002.A0R("Can't parse unknown typeface: ", r7));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Typeface A00(android.graphics.Typeface r6, java.lang.String r7) {
        /*
            r4 = 0
            r3 = 1
            r0 = 400(0x190, float:5.6E-43)
            if (r6 == 0) goto L_0x000a
            int r0 = r6.getWeight()
        L_0x000a:
            r5 = 400(0x190, float:5.6E-43)
            r1 = 0
            if (r0 <= r5) goto L_0x0011
            int r1 = r0 - r5
        L_0x0011:
            int r0 = r7.hashCode()
            switch(r0) {
                case -1178781136: goto L_0x0085;
                case -1078030475: goto L_0x0064;
                case -1039745817: goto L_0x005b;
                case 3029637: goto L_0x0050;
                case 99152071: goto L_0x0045;
                case 102970646: goto L_0x003a;
                case 1223860979: goto L_0x002f;
                case 1734741290: goto L_0x0024;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r0 = "Can't parse unknown typeface: "
            java.lang.String r1 = X.002.A0R(r0, r7)
            X.3yO r0 = new X.3yO
            r0.<init>(r1)
            throw r0
        L_0x0024:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r5 = 700(0x2bc, float:9.81E-43)
            goto L_0x008d
        L_0x002f:
            java.lang.String r0 = "semibold"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r5 = 600(0x258, float:8.41E-43)
            goto L_0x006e
        L_0x003a:
            java.lang.String r0 = "light"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r5 = 300(0x12c, float:4.2E-43)
            goto L_0x006e
        L_0x0045:
            java.lang.String r0 = "heavy"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r5 = 800(0x320, float:1.121E-42)
            goto L_0x006e
        L_0x0050:
            java.lang.String r0 = "bold"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r5 = 700(0x2bc, float:9.81E-43)
            goto L_0x006e
        L_0x005b:
            java.lang.String r0 = "normal"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            goto L_0x006e
        L_0x0064:
            java.lang.String r0 = "medium"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
            r5 = 500(0x1f4, float:7.0E-43)
        L_0x006e:
            int r5 = r5 + r1
            r2 = 1000(0x3e8, float:1.401E-42)
            int r1 = java.lang.Math.min(r5, r2)
            X.272 r0 = X.270.A01
            java.lang.String r0 = "weight"
            X.02V.A01(r1, r3, r0, r2)
            if (r6 != 0) goto L_0x0080
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
        L_0x0080:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r6, r1, r4)
            goto L_0x00a3
        L_0x0085:
            java.lang.String r0 = "italic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0018
        L_0x008d:
            int r5 = r5 + r1
            r2 = 1000(0x3e8, float:1.401E-42)
            int r1 = java.lang.Math.min(r5, r2)
            X.272 r0 = X.270.A01
            java.lang.String r0 = "weight"
            X.02V.A01(r1, r3, r0, r2)
            if (r6 != 0) goto L_0x009f
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
        L_0x009f:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r6, r1, r3)
        L_0x00a3:
            X.0qQ.A0A(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TW.A00(android.graphics.Typeface, java.lang.String):android.graphics.Typeface");
    }
}
