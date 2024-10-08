package X;

/* renamed from: X.Viz  reason: case insensitive filesystem */
public final class C17965Viz {
    public final AnonymousClass4O9 A00;
    public final AnonymousClass4OA A01;

    public C17965Viz(AnonymousClass4O9 r2, AnonymousClass4OA r3) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0099, code lost:
        if (r3 == r4) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4OB A00(java.util.Map r6) {
        /*
            r5 = this;
            X.4O9 r1 = r5.A00
            X.4O9 r0 = X.AnonymousClass4O9.LOCATION_FOREGROUND
            if (r1 == r0) goto L_0x005f
            X.4O9 r0 = X.AnonymousClass4O9.LOCATION_BACKGROUND
            if (r1 == r0) goto L_0x005f
            X.4O9 r0 = X.AnonymousClass4O9.CAMERA
            if (r1 != r0) goto L_0x001b
            java.lang.String r0 = "android.permission.CAMERA"
        L_0x0010:
            java.lang.Object r4 = r6.get(r0)
            X.4OB r4 = (X.AnonymousClass4OB) r4
        L_0x0016:
            if (r4 != 0) goto L_0x001a
        L_0x0018:
            X.4OB r4 = X.AnonymousClass4OB.DENIED
        L_0x001a:
            return r4
        L_0x001b:
            X.4O9 r0 = X.AnonymousClass4O9.NOTIFICATION
            if (r1 != r0) goto L_0x0022
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            goto L_0x0010
        L_0x0022:
            X.4O9 r0 = X.AnonymousClass4O9.CONTACT
            if (r1 != r0) goto L_0x0058
            java.lang.String r2 = "android.permission.READ_CONTACTS"
            java.lang.Object r0 = r6.get(r2)
            X.4OB r4 = X.AnonymousClass4OB.NEVER_ASK_AGAIN
            if (r0 == r4) goto L_0x001a
            java.lang.String r1 = "android.permission.WRITE_CONTACTS"
            java.lang.Object r0 = r6.get(r1)
            if (r0 == r4) goto L_0x001a
            java.lang.Object r0 = r6.get(r2)
            X.4OB r4 = X.AnonymousClass4OB.GRANTED
            boolean r3 = X.AnonymousClass7TF.A1W(r0, r4)
            java.lang.Object r0 = r6.get(r1)
            boolean r2 = X.AnonymousClass7TF.A1W(r0, r4)
            X.4OA r1 = r5.A01
            X.4OA r0 = X.AnonymousClass4OA.CONTACTS_READ_WRITE
            if (r1 != r0) goto L_0x0055
            if (r3 == 0) goto L_0x0018
            if (r2 == 0) goto L_0x0018
            return r4
        L_0x0055:
            if (r3 == 0) goto L_0x0018
            return r4
        L_0x0058:
            X.4O9 r0 = X.AnonymousClass4O9.MICROPHONE
            if (r1 != r0) goto L_0x00b8
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            goto L_0x0010
        L_0x005f:
            r0 = 21
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r3 = r6.get(r0)
            X.4OB r3 = (X.AnonymousClass4OB) r3
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Object r2 = r6.get(r0)
            X.4O9 r0 = X.AnonymousClass4O9.LOCATION_BACKGROUND
            if (r1 != r0) goto L_0x0088
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0088
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            java.lang.Object r4 = r6.get(r0)
            X.4OB r4 = (X.AnonymousClass4OB) r4
            X.4OB r0 = X.AnonymousClass4OB.GRANTED
            if (r4 == r0) goto L_0x0088
            goto L_0x0016
        L_0x0088:
            X.4OA r1 = r5.A01
            X.4OA r0 = X.AnonymousClass4OA.LOCATION_PRECISE
            if (r1 != r0) goto L_0x009d
            X.4OB r4 = X.AnonymousClass4OB.GRANTED
            if (r3 != r4) goto L_0x0095
            if (r2 != r4) goto L_0x0095
            return r4
        L_0x0095:
            X.4OB r0 = X.AnonymousClass4OB.DENIED
            if (r2 != r0) goto L_0x00b1
            if (r3 != r4) goto L_0x00b1
            goto L_0x0018
        L_0x009d:
            X.4OA r0 = X.AnonymousClass4OA.UNSPECIFIED
            if (r1 != r0) goto L_0x00bb
            X.4OB r4 = X.AnonymousClass4OB.GRANTED
            if (r3 != r4) goto L_0x00a8
            if (r2 != r4) goto L_0x00a8
            return r4
        L_0x00a8:
            X.4OB r0 = X.AnonymousClass4OB.DENIED
            if (r2 != r0) goto L_0x00b1
            if (r3 != r4) goto L_0x00b1
            X.4OB r4 = X.AnonymousClass4OB.LOCATION_PARTIAL
            return r4
        L_0x00b1:
            X.4OB r4 = X.AnonymousClass4OB.NEVER_ASK_AGAIN
            if (r2 == r4) goto L_0x001a
            if (r3 != r4) goto L_0x0018
            return r4
        L_0x00b8:
            X.4OB r4 = X.AnonymousClass4OB.NOT_IMPLEMENTED
            return r4
        L_0x00bb:
            if (r3 != 0) goto L_0x00bf
            X.4OB r3 = X.AnonymousClass4OB.DENIED
        L_0x00bf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17965Viz.A00(java.util.Map):X.4OB");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        r4[r7] = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        r4 = new java.lang.String[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        r4[r9] = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r4[r1] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] A01() {
        /*
            r10 = this;
            X.4O9 r0 = r10.A00
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0035;
                case 2: goto L_0x0009;
                case 3: goto L_0x001b;
                case 4: goto L_0x0024;
                case 5: goto L_0x000d;
                case 6: goto L_0x0009;
                case 7: goto L_0x0009;
                case 8: goto L_0x0014;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            java.lang.String[] r4 = new java.lang.String[r0]
            return r4
        L_0x000d:
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            goto L_0x0021
        L_0x0014:
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            goto L_0x0021
        L_0x001b:
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "android.permission.CAMERA"
        L_0x0021:
            r4[r1] = r0
            return r4
        L_0x0024:
            X.4OA r1 = r10.A01
            X.4OA r0 = X.AnonymousClass4OA.CONTACTS_READ_WRITE
            java.lang.String r8 = "android.permission.READ_CONTACTS"
            r9 = 0
            r7 = 1
            if (r1 != r0) goto L_0x0084
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            java.lang.String[] r4 = new java.lang.String[]{r8, r0}
            return r4
        L_0x0035:
            X.4OA r0 = r10.A01
            int r6 = r0.ordinal()
            r5 = 3
            java.lang.String r8 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            r4 = 29
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            r0 = 21
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r1 = 0
            r7 = 2
            r9 = 1
            if (r6 == r1) goto L_0x0058
            if (r6 != r9) goto L_0x0058
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r4) goto L_0x0087
            java.lang.String[] r4 = new java.lang.String[]{r2}
            return r4
        L_0x0058:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r4) goto L_0x0061
            java.lang.String[] r4 = new java.lang.String[]{r3, r2}
            return r4
        L_0x0061:
            java.lang.String[] r4 = new java.lang.String[r5]
            r4[r1] = r3
            r4[r9] = r2
            goto L_0x0081
        L_0x0068:
            X.4OA r0 = r10.A01
            int r2 = r0.ordinal()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            r0 = 21
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            r9 = 0
            r0 = 2
            r7 = 1
            if (r2 == r9) goto L_0x007d
            if (r2 == r7) goto L_0x0084
        L_0x007d:
            java.lang.String[] r4 = new java.lang.String[r0]
            r4[r9] = r1
        L_0x0081:
            r4[r7] = r8
            return r4
        L_0x0084:
            java.lang.String[] r4 = new java.lang.String[r7]
            goto L_0x008b
        L_0x0087:
            java.lang.String[] r4 = new java.lang.String[r7]
            r4[r1] = r2
        L_0x008b:
            r4[r9] = r8
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17965Viz.A01():java.lang.String[]");
    }
}
