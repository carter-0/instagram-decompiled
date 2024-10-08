package X;

public abstract class V9I {
    /* JADX WARNING: type inference failed for: r9v0, types: [X.Vum, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.V4R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.V4R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.V4R, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        if (r3 == false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r15, X.AnonymousClass6Tm r16) {
        /*
            r6 = 0
            r0 = 0
            r2 = r16
            X.4uI r11 = X.DbW.A0P(r2, r6)
            java.lang.Object r3 = r2.A02()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.A00()
            X.0qQ.A0C(r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            r14 = 0
            java.lang.String r1 = X.AnonymousClass7TF.A0k(r3)     // Catch:{ IllegalArgumentException -> 0x0026 }
            X.4O9 r3 = X.AnonymousClass4O9.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0026 }
            goto L_0x0027
        L_0x0026:
            r3 = r14
        L_0x0027:
            java.lang.String r1 = X.AnonymousClass7TF.A0k(r2)     // Catch:{ IllegalArgumentException -> 0x0030 }
            X.4OA r7 = X.AnonymousClass4OA.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r7 = r14
        L_0x0031:
            X.6Rm r1 = r15.A03
            if (r1 == 0) goto L_0x0102
            X.4O7 r2 = X.VK6.A00
            android.content.Context r1 = r1.A00
            android.app.Activity r4 = r2.A01(r1)
            if (r4 == 0) goto L_0x0102
            if (r3 == 0) goto L_0x0102
            if (r7 == 0) goto L_0x0102
            X.Vum r9 = new X.Vum
            r9.<init>()
            X.UpH r10 = new X.UpH
            r10.<init>()
            X.UpJ r8 = new X.UpJ
            r8.<init>()
            X.VFO r5 = new X.VFO
            r5.<init>()
            X.UpI r1 = new X.UpI
            r1.<init>()
            int r13 = r3.ordinal()
            switch(r13) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x0076;
                case 2: goto L_0x0063;
                case 3: goto L_0x00a0;
                case 4: goto L_0x0089;
                case 5: goto L_0x0082;
                case 6: goto L_0x0063;
                case 7: goto L_0x0063;
                case 8: goto L_0x007d;
                default: goto L_0x0063;
            }
        L_0x0063:
            X.WKB r2 = new X.WKB
            r2.<init>(r15, r11, r0)
            X.VVH r3 = new X.VVH
            r3.<init>(r15, r11, r0)
            X.VVI r12 = new X.VVI
            r12.<init>(r15, r11, r0)
            switch(r13) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x00df;
                case 2: goto L_0x0075;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00b9;
                case 6: goto L_0x0075;
                case 7: goto L_0x0075;
                case 8: goto L_0x00bd;
                default: goto L_0x0075;
            }
        L_0x0075:
            return r14
        L_0x0076:
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r0 = X.1DL.A05(r4, r0)
            goto L_0x0063
        L_0x007d:
            boolean r0 = X.C16132UpJ.A00(r4)
            goto L_0x0063
        L_0x0082:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r0 = X.1DL.A05(r4, r0)
            goto L_0x0063
        L_0x0089:
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            boolean r0 = X.1DL.A05(r4, r0)
            java.lang.String r2 = "android.permission.WRITE_CONTACTS"
            boolean r3 = X.1DL.A05(r4, r2)
            X.4OA r2 = X.AnonymousClass4OA.CONTACTS_READ_WRITE
            if (r7 != r2) goto L_0x0063
            if (r0 == 0) goto L_0x009e
            r0 = 1
            if (r3 != 0) goto L_0x0063
        L_0x009e:
            r0 = 0
            goto L_0x0063
        L_0x00a0:
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = X.1DL.A05(r4, r0)
            goto L_0x0063
        L_0x00a7:
            X.4OA r0 = X.AnonymousClass4OA.LOCATION_PRECISE
            if (r7 != r0) goto L_0x00b2
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
        L_0x00ad:
            boolean r0 = X.1DL.A05(r4, r0)
            goto L_0x0063
        L_0x00b2:
            r0 = 21
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x00ad
        L_0x00b9:
            r1.A02(r4, r12)
            return r14
        L_0x00bd:
            r8.A02(r4, r12)
            return r14
        L_0x00c1:
            r10.A02(r4, r12)
            return r14
        L_0x00c5:
            r9.A02(r4, r7, r2)
            return r14
        L_0x00c9:
            X.4O9 r0 = X.AnonymousClass4O9.CONTACT
            X.Viz r1 = new X.Viz
            r1.<init>(r0, r7)
            r0 = 2
            X.WRn r2 = new X.WRn
            r2.<init>(r0, r1, r3, r5)
            java.lang.String[] r1 = r1.A01()
            int r0 = r1.length
            X.C13990Tnq.A0k(r4, r2, r1, r0)
            return r14
        L_0x00df:
            X.4O9 r0 = X.AnonymousClass4O9.LOCATION_BACKGROUND
            X.Viz r3 = new X.Viz
            r3.<init>(r0, r7)
            java.lang.Integer r1 = r9.A01(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x00f7
            X.4OA r0 = r3.A01
            X.4OB r0 = X.C18595Vum.A00(r4, r0, r6)
            r2.DWn(r0, r1)
        L_0x00f7:
            X.WRo r2 = X.C19255WRo.A00
            java.lang.String[] r1 = r3.A01()
            int r0 = r1.length
            X.C13990Tnq.A0k(r4, r2, r1, r0)
            return r14
        L_0x0102:
            X.6Tl r1 = new X.6Tl
            r1.<init>()
            java.lang.String r0 = "status_error"
            X.DbX.A1P(r15, r1, r11, r0, r6)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V9I.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
