package X;

/* renamed from: X.5v2  reason: invalid class name and case insensitive filesystem */
public abstract class C299375v2 {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r7.A01(r0);
        r8 = r1.getHttpBody();
        r6 = r1.getHttpHeaders();
        r5 = (java.lang.String) r6.get("Content-Type");
        r10 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        if (r8 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (r17 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        r2 = r5;
        r0 = android.text.TextUtils.isEmpty(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        if (r11 != 4) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        if (r0 == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        r2 = X.AnonymousClass000.A00(252);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r0 = new X.C12767T6b(new X.1Fn("Content-Type", r2), r10);
        r7.A05 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r7.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r6 = r6.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        if (r6.hasNext() == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        r2 = (java.util.Map.Entry) r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
        if (((java.lang.String) r2.getValue()).equals(r5) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        r7.A03((java.lang.String) r2.getKey(), (java.lang.String) r2.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d6, code lost:
        if (r0 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d8, code lost:
        r2 = X.AnonymousClass000.A00(251);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        r0 = new X.C12766T6a(new X.1Fn("Content-Type", r2), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e9, code lost:
        if (r17 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00eb, code lost:
        r1 = r1.getUrl().startsWith("https://v.whatsapp.net/v2/fb_register_v2?");
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        throw new java.lang.IllegalArgumentException(X.002.A0R("Unrecognized http method: ", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fc, code lost:
        if (r1 == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fe, code lost:
        r0 = 252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0100, code lost:
        r2 = X.AnonymousClass000.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0104, code lost:
        r0 = new X.C297685sA(new X.1Fn("Content-Type", r2), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        r0 = 251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0112, code lost:
        r2 = r7.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011e, code lost:
        if ("critical-data".equals(r12.mTaskCategory) == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        r1 = X.1CE.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0122, code lost:
        r0 = new X.AnonymousClass1QT();
        r0.A04 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0136, code lost:
        return r4.A02(new X.C299385v4(r12, r3), r2, r0.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0137, code lost:
        r1 = X.1CE.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1T9 A00(com.facebook.msys.mci.DataTask r12, X.1HW r13, X.C299355v0 r14, X.C299365v1 r15, java.io.File r16, java.io.InputStream r17) {
        /*
            X.5v3 r3 = new X.5v3
            r0 = r16
            r3.<init>(r12, r14, r15, r0)
            X.1CO r4 = X.AnonymousClass1CO.A00()
            com.facebook.msys.mci.UrlRequest r1 = r12.mUrlRequest
            int r11 = r12.mTaskType
            X.1Pq r7 = new X.1Pq
            r7.<init>(r13)
            java.lang.String r0 = r1.getUrl()
            r7.A02(r0)
            java.lang.String r2 = r1.getHttpMethod()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r2.toUpperCase(r0)
            int r0 = r5.hashCode()
            switch(r0) {
                case 70454: goto L_0x0038;
                case 2213344: goto L_0x0043;
                case 2461856: goto L_0x004e;
                case 75900968: goto L_0x0059;
                case 2012838315: goto L_0x0064;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.String r0 = "Unrecognized http method: "
            java.lang.String r1 = X.002.A0R(r0, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0038:
            java.lang.String r0 = "GET"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x006e
        L_0x0043:
            java.lang.String r0 = "HEAD"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x006e
        L_0x004e:
            java.lang.String r0 = "POST"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x006e
        L_0x0059:
            java.lang.String r0 = "PATCH"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x006e
        L_0x0064:
            java.lang.String r0 = "DELETE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x006e:
            r7.A01(r0)
            byte[] r8 = r1.getHttpBody()
            java.util.Map r6 = r1.getHttpHeaders()
            java.lang.String r9 = "Content-Type"
            java.lang.Object r5 = r6.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            r10 = r17
            if (r8 != 0) goto L_0x00e9
            if (r17 == 0) goto L_0x00a6
        L_0x0087:
            r1 = 4
            r8 = 0
            r2 = r5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r11 != r1) goto L_0x00d6
            if (r0 == 0) goto L_0x0098
            r0 = 252(0xfc, float:3.53E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
        L_0x0098:
            X.1Fn r1 = new X.1Fn
            r1.<init>(r9, r2)
            X.T6b r0 = new X.T6b
            r0.<init>(r1, r10)
            r7.A05 = r8
        L_0x00a4:
            r7.A00 = r0
        L_0x00a6:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x00ae:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ae
            java.lang.Object r1 = r2.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r7.A03(r1, r0)
            goto L_0x00ae
        L_0x00d6:
            if (r0 == 0) goto L_0x00de
            r0 = 251(0xfb, float:3.52E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
        L_0x00de:
            X.1Fn r1 = new X.1Fn
            r1.<init>(r9, r2)
            X.T6a r0 = new X.T6a
            r0.<init>(r1, r10)
            goto L_0x00a4
        L_0x00e9:
            if (r17 != 0) goto L_0x0087
            java.lang.String r1 = r1.getUrl()
            java.lang.String r0 = "https://v.whatsapp.net/v2/fb_register_v2?"
            boolean r1 = r1.startsWith(r0)
            r2 = r5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0104
            if (r1 == 0) goto L_0x010f
            r0 = 252(0xfc, float:3.53E-43)
        L_0x0100:
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
        L_0x0104:
            X.1Fn r1 = new X.1Fn
            r1.<init>(r9, r2)
            X.5sA r0 = new X.5sA
            r0.<init>(r1, r8)
            goto L_0x00a4
        L_0x010f:
            r0 = 251(0xfb, float:3.52E-43)
            goto L_0x0100
        L_0x0112:
            X.1QS r2 = r7.A00()
            java.lang.String r1 = r12.mTaskCategory
            java.lang.String r0 = "critical-data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0137
            X.1CE r1 = X.1CE.A04
        L_0x0122:
            X.1QT r0 = new X.1QT
            r0.<init>()
            r0.A04 = r1
            X.1QU r1 = r0.A00()
            X.5v4 r0 = new X.5v4
            r0.<init>(r12, r3)
            X.1T9 r0 = r4.A02(r0, r2, r1)
            return r0
        L_0x0137:
            X.1CE r1 = X.1CE.A02
            goto L_0x0122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C299375v2.A00(com.facebook.msys.mci.DataTask, X.1HW, X.5v0, X.5v1, java.io.File, java.io.InputStream):X.1T9");
    }
}
