package X;

public abstract class RTW {
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r6.equals("full") != false) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[SYNTHETIC, Splitter:B:8:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            java.lang.String r1 = "DatetimeTextProviderUtils"
            if (r6 == 0) goto L_0x000e
            int r3 = X.AnonymousClass6Su.A04(r6)     // Catch:{ 3yO -> 0x0009 }
            goto L_0x000f
        L_0x0009:
            java.lang.String r0 = "Error while parsing DateTime format"
            X.1Kn.A02(r1, r0)
        L_0x000e:
            r3 = 2
        L_0x000f:
            if (r7 == 0) goto L_0x001b
            int r4 = X.AnonymousClass6Su.A04(r7)     // Catch:{ 3yO -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            java.lang.String r0 = "Error while parsing Time format"
            X.1Kn.A02(r1, r0)
        L_0x001b:
            r4 = r3
        L_0x001c:
            if (r6 != 0) goto L_0x0021
            java.lang.String r6 = "medium"
        L_0x0021:
            int r0 = r5.hashCode()
            r2 = 2
            r1 = -1
            switch(r0) {
                case 3076014: goto L_0x0034;
                case 3560141: goto L_0x003e;
                case 1793702779: goto L_0x0049;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r1) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0053;
                case 2: goto L_0x0097;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.String r0 = "Unknown dateformat type: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r5)
            throw r0
        L_0x0034:
            java.lang.String r0 = "date"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r1 = 0
            goto L_0x002a
        L_0x003e:
            java.lang.String r0 = "time"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r1 = 1
            goto L_0x002a
        L_0x0049:
            java.lang.String r0 = "datetime"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r1 = 2
            goto L_0x002a
        L_0x0053:
            java.text.DateFormat r2 = java.text.DateFormat.getTimeInstance(r4)
            goto L_0x009b
        L_0x0058:
            r0 = 369(0x171, float:5.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "medium"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "long"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "full"
            boolean r1 = r6.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x007f
        L_0x007e:
            r0 = 1
        L_0x007f:
            if (r0 == 0) goto L_0x008f
            int r0 = X.AnonymousClass6Su.A04(r6)     // Catch:{ 3yO -> 0x008a }
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r0)     // Catch:{ 3yO -> 0x008a }
            goto L_0x009b
        L_0x008a:
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r2)
            goto L_0x009b
        L_0x008f:
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            r2.<init>(r6, r0)
            goto L_0x009b
        L_0x0097:
            java.text.DateFormat r2 = java.text.DateFormat.getDateTimeInstance(r3, r4)
        L_0x009b:
            if (r8 != 0) goto L_0x00a9
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.TimeZone r0 = r0.getTimeZone()
            java.lang.String r8 = r0.getID()
        L_0x00a9:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r8)
            r2.setTimeZone(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = r2.format(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RTW.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):java.lang.String");
    }
}
