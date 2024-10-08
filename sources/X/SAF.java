package X;

public abstract class SAF {
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r19, X.AnonymousClass6Tm r20) {
        /*
            r9 = 0
            r4 = r20
            java.lang.Object r8 = r4.A03(r9)
            java.lang.String r0 = X.C66579MXk.A00(r9)
            X.0qQ.A0C(r8, r0)
            X.6Rm r8 = (X.C307786Rm) r8
            r12 = 1
            java.lang.String r3 = X.DbY.A0h(r4, r12)
            java.lang.Object r0 = r4.A00()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Number"
            int r2 = X.DbW.A04(r0, r1)
            r0 = 3
            java.lang.Object r0 = r4.A03(r0)
            int r5 = X.DbW.A04(r0, r1)
            r0 = 4
            java.util.List r1 = r4.A00
            X.4uI r7 = X.DbV.A0R(r1, r0)
            r0 = 5
            X.4uI r6 = X.DbV.A0R(r1, r0)
            X.6QE r0 = X.AnonymousClass6QE.A02
            r14 = 0
            android.net.Uri r0 = X.DbT.A09(r3)
            android.net.Uri r4 = X.AnonymousClass6QJ.A01(r0, r9)
            X.0Tu r3 = X.0Tu.A05
            X.0qQ.A08(r3)
            r0 = 18313074830555604(0x410fa5000539d4, double:1.8981116543807416E-307)
            boolean r0 = X.1AW.A06(r3, r0)
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r4.getPath()
            if (r0 == 0) goto L_0x006a
            X.OOC r1 = new X.OOC
            r1.<init>()
            r1.A06(r0)
            java.lang.String r0 = "image/"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.A07(r0)
            r1.A00()
        L_0x006a:
            android.content.Context r0 = r8.A00
            r20 = r0
            java.lang.String r0 = r4.toString()
            r3 = r5
            r10 = r19
            if (r5 <= 0) goto L_0x01e3
            if (r2 <= 0) goto L_0x01e3
            android.net.Uri r13 = X.0cp.A03(r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            java.lang.String r0 = r13.getPath()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            if (r0 != 0) goto L_0x008f
            if (r6 == 0) goto L_0x0209
            java.lang.String r0 = "invalid_parameter"
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            A01(r10, r6, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            return r14
        L_0x008f:
            java.io.File r19 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            boolean r0 = X.C227922kK.A0N     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            java.lang.String r1 = r19.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            X.2kK r0 = new X.2kK     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            r0.<init>((java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            java.lang.String r11 = "Orientation"
            int r1 = r0.A0M(r11, r9)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            r0 = 6
            if (r1 == r0) goto L_0x00ab
            r0 = 8
            if (r1 != r0) goto L_0x00ad
        L_0x00ab:
            r3 = r2
            r2 = r5
        L_0x00ad:
            android.content.ContentResolver r0 = r20.getContentResolver()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            java.io.InputStream r4 = r0.openInputStream(r13)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            if (r4 != 0) goto L_0x00c3
            if (r6 == 0) goto L_0x0209
            java.lang.String r0 = "internal_error"
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            A01(r10, r6, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            return r14
        L_0x00c3:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x01d9 }
            r0.<init>()     // Catch:{ all -> 0x01d9 }
            r0.inJustDecodeBounds = r12     // Catch:{ all -> 0x01d9 }
            android.graphics.BitmapFactory.decodeStream(r4, r14, r0)     // Catch:{ all -> 0x01d9 }
            int r5 = r0.outWidth     // Catch:{ all -> 0x01d9 }
            int r1 = r0.outHeight     // Catch:{ all -> 0x01d9 }
            android.graphics.Rect r18 = new android.graphics.Rect     // Catch:{ all -> 0x01d9 }
            r0 = r18
            r0.<init>(r9, r9, r5, r1)     // Catch:{ all -> 0x01d9 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            int r1 = r18.width()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            int r0 = r18.height()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            if (r1 <= 0) goto L_0x01cd
            if (r0 <= 0) goto L_0x01cd
            if (r1 > r2) goto L_0x00f9
            if (r0 > r3) goto L_0x00f9
            if (r7 == 0) goto L_0x0209
            java.lang.String r0 = X.Pxi.A0c(r13)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            A01(r10, r7, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            return r14
        L_0x00f9:
            android.graphics.Rect r15 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            r15.<init>(r9, r9, r2, r3)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            int r0 = r18.width()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r4 = (double) r0     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r16
            int r0 = r15.width()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r0 = (double) r0     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r4 = r4 / r0
            int r0 = r18.height()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r2 = (double) r0     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r2 = r2 * r16
            int r0 = r15.height()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r0 = (double) r0     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r2 = r2 / r0
            double r4 = java.lang.Math.max(r4, r2)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            int r0 = r18.width()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r0 = (double) r0     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r0 = r0 / r4
            int r3 = (int) r0     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            int r0 = r18.height()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r0 = (double) r0     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            double r0 = r0 / r4
            int r2 = (int) r0     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            r5.<init>(r9, r9, r3, r2)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            android.content.ContentResolver r0 = r20.getContentResolver()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            java.io.InputStream r3 = r0.openInputStream(r13)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            r4 = 0
            if (r3 == 0) goto L_0x01c1
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x014e
            int r1 = r5.width()     // Catch:{ all -> 0x01b7 }
            int r0 = r5.height()     // Catch:{ all -> 0x01b7 }
            android.graphics.Bitmap r4 = X.0fO.A00(r2, r1, r0, r12)     // Catch:{ all -> 0x01b7 }
        L_0x014e:
            r3.close()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            if (r4 == 0) goto L_0x01c1
            java.io.File r3 = X.0mb.A04(r20)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            if (r3 != 0) goto L_0x0165
            if (r6 == 0) goto L_0x0209
            java.lang.String r0 = "internal_error"
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            A01(r10, r6, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            return r14
        L_0x0165:
            java.io.FileOutputStream r2 = X.JTO.A0t(r3)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x01ad }
            r0 = 100
            X.0fO.A02(r1, r4, r2, r0)     // Catch:{ all -> 0x01ad }
            r2.flush()     // Catch:{ all -> 0x01ad }
            r2.close()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            java.lang.String r0 = r3.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            X.2kK r2 = new X.2kK     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            r2.<init>((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            java.lang.String r1 = r19.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            X.2kK r0 = new X.2kK     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            r0.<init>((java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            int r0 = r0.A0M(r11, r9)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            r2.A0P(r11, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            r2.A0O()     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
        L_0x0198:
            android.net.Uri r0 = android.net.Uri.fromFile(r3)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            X.0qQ.A0B(r0, r9)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            if (r7 == 0) goto L_0x0209
            java.lang.String r0 = X.Pxi.A0c(r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            A01(r10, r7, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            return r14
        L_0x01ad:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01b2 }
            goto L_0x01b6
        L_0x01b2:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
        L_0x01b6:
            throw r1     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
        L_0x01b7:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01bc }
            goto L_0x01c0
        L_0x01bc:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
        L_0x01c0:
            throw r1     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
        L_0x01c1:
            if (r6 == 0) goto L_0x0209
            java.lang.String r0 = "internal_error"
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            A01(r10, r6, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            return r14
        L_0x01cd:
            if (r6 == 0) goto L_0x0209
            java.lang.String r0 = "invalid_parameter"
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            A01(r10, r6, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            return r14
        L_0x01d9:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x01de }
            goto L_0x01e2
        L_0x01de:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
        L_0x01e2:
            throw r1     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
        L_0x01e3:
            if (r6 == 0) goto L_0x0209
            java.lang.String r0 = "invalid_parameter"
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            A01(r10, r6, r0)     // Catch:{ FileNotFoundException -> 0x01f2, IOException -> 0x01f5, SecurityException -> 0x01ef }
            return r14
        L_0x01ef:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x01f7
        L_0x01f2:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x01f7
        L_0x01f5:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x01f7:
            if (r6 == 0) goto L_0x0209
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x020a;
                case 1: goto L_0x020d;
                default: goto L_0x0200;
            }
        L_0x0200:
            java.lang.String r0 = "internal_error"
        L_0x0202:
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}
            A01(r10, r6, r0)
        L_0x0209:
            return r14
        L_0x020a:
            java.lang.String r0 = "file_not_found"
            goto L_0x0202
        L_0x020d:
            java.lang.String r0 = "invalid_parameter"
            goto L_0x0202
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SAF.A00(X.6Rx, X.6Tm):java.lang.Object");
    }

    public static void A01(C307896Rx r2, C277014uI r3, Object[] objArr) {
        C299275ur.A00(r2, new AnonymousClass6Tm(0sr.A1P(objArr)), r3);
    }
}
