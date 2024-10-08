package X;

import java.util.concurrent.Callable;

/* renamed from: X.TNg  reason: case insensitive filesystem */
public final class C13148TNg implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C13148TNg(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A04 = str;
        this.A03 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        if (r7 == 270) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        X.1zE.A00(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ac, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r17 = this;
            r3 = r17
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x01cd;
                default: goto L_0x0007;
            }
        L_0x0007:
            r16 = 0
            java.lang.Object r1 = r3.A01     // Catch:{ Exception -> 0x01c4 }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r7 = r3.A02     // Catch:{ Exception -> 0x01c4 }
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7     // Catch:{ Exception -> 0x01c4 }
            r8 = 1
            java.lang.Object r0 = r3.A03     // Catch:{ Exception -> 0x01c4 }
            android.net.Uri r0 = (android.net.Uri) r0     // Catch:{ Exception -> 0x01c4 }
            android.graphics.Bitmap r0 = X.C64366Lai.A00(r1, r0, r7, r8)     // Catch:{ Exception -> 0x01c4 }
            if (r0 == 0) goto L_0x004f
            r0.getWidth()     // Catch:{ Exception -> 0x01c4 }
            java.io.File r6 = X.0mb.A04(r1)     // Catch:{ Exception -> 0x01c4 }
            X.1MF.A0M(r0, r6)     // Catch:{ Exception -> 0x01c4 }
            r0.recycle()     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r0 = r6.getPath()     // Catch:{ Exception -> 0x01c4 }
            long r4 = X.0mb.A03(r0)     // Catch:{ Exception -> 0x01c4 }
            r1 = 1024(0x400, double:5.06E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
            java.lang.String r2 = "group_photo_too_small"
            java.lang.String r1 = " : "
            java.lang.String r0 = r3.A04     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r0 = X.002.A04(r8, r1, r0)     // Catch:{ Exception -> 0x01c4 }
            X.0wb.A03(r2, r0)     // Catch:{ Exception -> 0x01c4 }
        L_0x0044:
            java.lang.String r1 = r3.A04     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r0 = X.JTP.A0u(r6)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r16 = X.C64134LPj.A00(r7, r1, r0)     // Catch:{ Exception -> 0x01c4 }
            return r16
        L_0x004f:
            java.lang.String r0 = "failed to load group photo bitmap"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x01c4 }
            throw r0     // Catch:{ Exception -> 0x01c4 }
        L_0x0056:
            r16 = 0
            java.lang.String r1 = r3.A04     // Catch:{ Exception -> 0x01b7 }
            java.lang.Object r4 = r3.A02     // Catch:{ Exception -> 0x01b7 }
            X.Rz3 r4 = (X.C10843Rz3) r4     // Catch:{ Exception -> 0x01b7 }
            java.lang.Object r8 = r3.A03     // Catch:{ Exception -> 0x01b7 }
            X.S3Y r8 = (X.S3Y) r8     // Catch:{ Exception -> 0x01b7 }
            java.lang.Object r2 = r3.A01     // Catch:{ Exception -> 0x01b7 }
            android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch:{ Exception -> 0x01b7 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x01b7 }
            byte[] r12 = r4.A0A     // Catch:{ all -> 0x01b4 }
            int r13 = r4.A01     // Catch:{ all -> 0x01b4 }
            int r14 = r4.A03     // Catch:{ all -> 0x01b4 }
            int r15 = r4.A00     // Catch:{ all -> 0x01b4 }
            android.graphics.YuvImage r11 = new android.graphics.YuvImage     // Catch:{ all -> 0x01b4 }
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01b4 }
            java.lang.Integer r0 = r8.A0C     // Catch:{ all -> 0x01b4 }
            int r5 = r0.intValue()     // Catch:{ all -> 0x01b4 }
            r10 = 0
            if (r5 == r10) goto L_0x009a
            r0 = 1
            if (r5 == r0) goto L_0x00b8
            r0 = 2
            if (r5 != r0) goto L_0x0095
            int r7 = r4.A02     // Catch:{ all -> 0x01b4 }
            r0 = 90
            if (r7 == r0) goto L_0x008f
            r6 = 270(0x10e, float:3.78E-43)
            r5 = r14
            r0 = r15
            if (r7 != r6) goto L_0x0091
        L_0x008f:
            r5 = r15
            r0 = r14
        L_0x0091:
            X.S9P.A01(r2, r5, r0)     // Catch:{ all -> 0x01b4 }
            goto L_0x00db
        L_0x0095:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x01b4 }
            throw r0     // Catch:{ all -> 0x01b4 }
        L_0x009a:
            android.graphics.RectF r0 = r8.A09     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x00ae
            float r7 = r0.top     // Catch:{ all -> 0x01b4 }
            float r6 = r0.bottom     // Catch:{ all -> 0x01b4 }
            float r5 = r0.left     // Catch:{ all -> 0x01b4 }
            float r0 = r0.right     // Catch:{ all -> 0x01b4 }
            float r5 = r5 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            X.S9P.A00(r2, r7, r6, r5)     // Catch:{ all -> 0x01b4 }
            goto L_0x00db
        L_0x00ae:
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            r0 = 1041865114(0x3e19999a, float:0.15)
            X.S9P.A00(r2, r5, r0, r0)     // Catch:{ all -> 0x01b4 }
            goto L_0x00db
        L_0x00b8:
            X.0qQ.A0B(r2, r10)     // Catch:{ all -> 0x01b4 }
            int r0 = r2.width()     // Catch:{ all -> 0x01b4 }
            int r6 = r0 / 2
            int r0 = r2.height()     // Catch:{ all -> 0x01b4 }
            int r5 = r0 / 2
            int r0 = r2.left     // Catch:{ all -> 0x01b4 }
            int r0 = r0 - r6
            r2.left = r0     // Catch:{ all -> 0x01b4 }
            int r0 = r2.top     // Catch:{ all -> 0x01b4 }
            int r0 = r0 - r5
            r2.top = r0     // Catch:{ all -> 0x01b4 }
            int r0 = r2.right     // Catch:{ all -> 0x01b4 }
            int r0 = r0 + r6
            r2.right = r0     // Catch:{ all -> 0x01b4 }
            int r0 = r2.bottom     // Catch:{ all -> 0x01b4 }
            int r0 = r0 + r5
            r2.bottom = r0     // Catch:{ all -> 0x01b4 }
        L_0x00db:
            int r6 = r4.A02     // Catch:{ all -> 0x01b4 }
            int r4 = 360 - r6
            X.0qQ.A0B(r2, r10)     // Catch:{ all -> 0x01b4 }
            r0 = 90
            if (r4 == r0) goto L_0x00ef
            r0 = 180(0xb4, float:2.52E-43)
            if (r4 == r0) goto L_0x0101
            r0 = 270(0x10e, float:3.78E-43)
            if (r4 != r0) goto L_0x0131
            goto L_0x0118
        L_0x00ef:
            int r9 = r2.width()     // Catch:{ all -> 0x01b4 }
            int r7 = r2.height()     // Catch:{ all -> 0x01b4 }
            int r5 = r14 - r7
            int r0 = r2.top     // Catch:{ all -> 0x01b4 }
            int r5 = r5 - r0
            int r4 = r2.left     // Catch:{ all -> 0x01b4 }
            r2.top = r4     // Catch:{ all -> 0x01b4 }
            goto L_0x0115
        L_0x0101:
            int r7 = r2.width()     // Catch:{ all -> 0x01b4 }
            int r9 = r2.height()     // Catch:{ all -> 0x01b4 }
            int r4 = r15 - r9
            int r0 = r2.top     // Catch:{ all -> 0x01b4 }
            int r4 = r4 - r0
            r2.top = r4     // Catch:{ all -> 0x01b4 }
            int r5 = r14 - r7
            int r0 = r2.left     // Catch:{ all -> 0x01b4 }
            int r5 = r5 - r0
        L_0x0115:
            r2.left = r5     // Catch:{ all -> 0x01b4 }
            goto L_0x012b
        L_0x0118:
            int r9 = r2.width()     // Catch:{ all -> 0x01b4 }
            int r7 = r2.height()     // Catch:{ all -> 0x01b4 }
            int r4 = r15 - r9
            int r0 = r2.left     // Catch:{ all -> 0x01b4 }
            int r4 = r4 - r0
            int r5 = r2.top     // Catch:{ all -> 0x01b4 }
            r2.left = r5     // Catch:{ all -> 0x01b4 }
            r2.top = r4     // Catch:{ all -> 0x01b4 }
        L_0x012b:
            int r4 = r4 + r9
            r2.bottom = r4     // Catch:{ all -> 0x01b4 }
            int r5 = r5 + r7
            r2.right = r5     // Catch:{ all -> 0x01b4 }
        L_0x0131:
            int r0 = r2.left     // Catch:{ all -> 0x01b4 }
            int r0 = java.lang.Math.max(r10, r0)     // Catch:{ all -> 0x01b4 }
            r2.left = r0     // Catch:{ all -> 0x01b4 }
            int r0 = r2.top     // Catch:{ all -> 0x01b4 }
            int r0 = java.lang.Math.max(r10, r0)     // Catch:{ all -> 0x01b4 }
            r2.top = r0     // Catch:{ all -> 0x01b4 }
            int r0 = r2.right     // Catch:{ all -> 0x01b4 }
            int r0 = java.lang.Math.min(r14, r0)     // Catch:{ all -> 0x01b4 }
            r2.right = r0     // Catch:{ all -> 0x01b4 }
            int r0 = r2.bottom     // Catch:{ all -> 0x01b4 }
            int r0 = java.lang.Math.min(r15, r0)     // Catch:{ all -> 0x01b4 }
            r2.bottom = r0     // Catch:{ all -> 0x01b4 }
            java.io.ByteArrayOutputStream r4 = X.Pxe.A0b()     // Catch:{ all -> 0x01b4 }
            r0 = 100
            r11.compressToJpeg(r2, r0, r4)     // Catch:{ all -> 0x01b4 }
            byte[] r7 = r4.toByteArray()     // Catch:{ all -> 0x01b4 }
            int r4 = r2.width()     // Catch:{ all -> 0x01b4 }
            int r0 = r2.height()     // Catch:{ all -> 0x01b4 }
            int r5 = java.lang.Math.min(r4, r0)     // Catch:{ all -> 0x01b4 }
            int r0 = r8.A07     // Catch:{ all -> 0x01b4 }
            float r4 = (float) r0     // Catch:{ all -> 0x01b4 }
            float r0 = (float) r5     // Catch:{ all -> 0x01b4 }
            float r4 = r4 / r0
            android.graphics.Matrix r14 = X.AnonymousClass7TE.A0U()     // Catch:{ all -> 0x01b4 }
            float r0 = (float) r6     // Catch:{ all -> 0x01b4 }
            r14.postRotate(r0)     // Catch:{ all -> 0x01b4 }
            r14.postScale(r4, r4)     // Catch:{ all -> 0x01b4 }
            int r0 = r7.length     // Catch:{ all -> 0x01b4 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeByteArray(r7, r10, r0)     // Catch:{ all -> 0x01b4 }
            if (r9 == 0) goto L_0x01ad
            int r12 = r2.width()     // Catch:{ all -> 0x01b4 }
            int r13 = r2.height()     // Catch:{ all -> 0x01b4 }
            r15 = 1
            X.0fO.A03(r9)     // Catch:{ all -> 0x01b4 }
            r11 = r10
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01b4 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x01b4 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x01b4 }
            r4.<init>(r1)     // Catch:{ all -> 0x01b4 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x01a6 }
            r0 = 95
            X.0fO.A02(r2, r5, r4, r0)     // Catch:{ all -> 0x01a6 }
            r4.close()     // Catch:{ all -> 0x01b4 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x01b7 }
            return r16
        L_0x01a6:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            X.1zE.A00(r4, r2)     // Catch:{ all -> 0x01b4 }
            throw r0     // Catch:{ all -> 0x01b4 }
        L_0x01ad:
            java.lang.String r0 = "Unable to decode jpeg"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01b4 }
            throw r0     // Catch:{ all -> 0x01b4 }
        L_0x01b4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x01b7 }
            throw r0     // Catch:{ Exception -> 0x01b7 }
        L_0x01b7:
            r1 = move-exception
            java.lang.Object r0 = r3.A03
            X.S3Y r0 = (X.S3Y) r0
            X.S4B r0 = r0.A02
            if (r0 == 0) goto L_0x01cc
            r0.A01(r1)
            return r16
        L_0x01c4:
            r2 = move-exception
            java.lang.String r1 = "group_photo_task"
            java.lang.String r0 = "Error building group photo config"
            X.0wb.A06(r1, r0, r2)
        L_0x01cc:
            return r16
        L_0x01cd:
            java.lang.Object r1 = r3.A02     // Catch:{ Exception -> 0x01f0 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ Exception -> 0x01f0 }
            int r4 = r1.getWidth()     // Catch:{ Exception -> 0x01f0 }
            java.lang.Object r0 = r3.A01     // Catch:{ Exception -> 0x01f0 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ Exception -> 0x01f0 }
            java.io.File r0 = X.0mb.A04(r0)     // Catch:{ Exception -> 0x01f0 }
            X.1MF.A0M(r1, r0)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r2 = r3.A04     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r1 = X.JTP.A0u(r0)     // Catch:{ Exception -> 0x01f0 }
            java.lang.Object r0 = r3.A03     // Catch:{ Exception -> 0x01f0 }
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0     // Catch:{ Exception -> 0x01f0 }
            X.C64134LPj.A01(r0, r2, r1, r4)     // Catch:{ Exception -> 0x01f0 }
            r16 = 0
            return r16
        L_0x01f0:
            r16 = move-exception
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13148TNg.call():java.lang.Object");
    }
}
