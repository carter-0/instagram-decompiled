package X;

import android.graphics.Rect;

public final class M7A implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ K6Y A01;

    public M7A(Rect rect, K6Y k6y) {
        this.A01 = k6y;
        this.A00 = rect;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0164, code lost:
        if (r1 != null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016a, code lost:
        if (r1 == null) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            X.K6Y r5 = r12.A01
            android.graphics.Rect r7 = r12.A00
            X.0vF r0 = X.K6Y.A0O
            boolean r0 = com.instagram.util.jpeg.JpegBridge.A01()
            X.17k.A0F(r0)
            X.8m2 r6 = r5.A0A
            if (r6 == 0) goto L_0x00e7
            android.graphics.Bitmap r0 = r5.A01
            if (r0 == 0) goto L_0x00e7
            int r4 = r6.getWidth()
            int r3 = r6.getHeight()
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            android.graphics.RectF r0 = X.JW0.A07(r7)
            android.graphics.Rect r0 = X.JW0.A06(r0, r4, r3, r2, r1)
            android.graphics.Rect r4 = X.JW0.A02(r0)
            java.lang.String r0 = r6.AvM()
            if (r0 == 0) goto L_0x00e7
            com.instagram.util.jpeg.NativeImage r2 = com.instagram.util.jpeg.JpegBridge.A00(r4, r0)
            X.0qQ.A07(r2)
            int r1 = r2.width
            int r0 = r4.width()
            r3 = 1
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            X.17k.A0E(r0)
            int r1 = r2.height
            int r0 = r4.height()
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            X.17k.A0E(r0)
            int r1 = r4.width()
            int r0 = r4.height()
            int r1 = java.lang.Math.min(r1, r0)
            int r0 = r5.A00
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 12
            com.instagram.util.jpeg.NativeImage r4 = com.instagram.util.jpeg.JpegBridge.scaleImage(r2, r1, r1, r0)
            X.0qQ.A07(r4)
            int r0 = r4.width
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r1)
            X.17k.A0E(r0)
            int r0 = r4.height
            if (r0 == r1) goto L_0x0082
            r3 = 0
        L_0x0082:
            X.17k.A0E(r3)
            int r0 = r2.bufferId
            com.instagram.util.jpeg.JpegBridge.releaseNativeBuffer(r0)
            com.instagram.creation.photo.util.ExifImageData r0 = r5.A07
            if (r0 == 0) goto L_0x0095
            int r0 = r0.A00
            if (r0 == 0) goto L_0x0095
            com.instagram.util.jpeg.JpegBridge.rotateImage(r4, r0)
        L_0x0095:
            android.net.Uri r3 = r5.A03
            if (r3 == 0) goto L_0x0175
            java.lang.String r1 = r3.getScheme()
        L_0x009d:
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0103
            java.lang.String r2 = r3.getPath()
        L_0x00a9:
            r10 = 0
            r9 = 1
            if (r2 == 0) goto L_0x00e8
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00e8
            android.net.Uri r0 = r5.A03
            if (r0 == 0) goto L_0x00e2
            java.lang.String r8 = r0.getPath()
            if (r8 == 0) goto L_0x00e2
            r7 = 95
            X.0eM r0 = r5.A0N
            X.0lg r6 = X.AnonymousClass7TF.A0L(r0, r10)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36313291357685617(0x8102bf00000771, double:3.028009904263541E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            int r0 = com.instagram.util.jpeg.JpegBridge.saveImage(r4, r8, r7, r0, r10)
            if (r0 != r9) goto L_0x00f0
            android.os.Handler r1 = r5.A0L
            X.M3V r0 = new X.M3V
            r0.<init>(r5)
        L_0x00dd:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.post(r0)
        L_0x00e2:
            int r0 = r4.bufferId
            com.instagram.util.jpeg.JpegBridge.releaseNativeBuffer(r0)
        L_0x00e7:
            return
        L_0x00e8:
            java.lang.Class<X.K6Y> r1 = X.K6Y.class
            java.lang.String r0 = "Can't crop: saveUri is not valid"
            X.0KC.A02(r1, r0)
            goto L_0x00fb
        L_0x00f0:
            java.lang.Class<X.K6Y> r3 = X.K6Y.class
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "Native jpeg save failed for file %s"
            X.0KC.A09(r3, r0, r1)
        L_0x00fb:
            android.os.Handler r1 = r5.A0L
            X.M3W r0 = new X.M3W
            r0.<init>(r5)
            goto L_0x00dd
        L_0x0103:
            android.content.Context r0 = r5.requireContext()
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r3)
            r2 = 1
            if (r0 != 0) goto L_0x011c
            java.lang.Class<X.K6Y> r2 = X.K6Y.class
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "getRealPathFromUri failed for non-document uri %s"
            X.0KC.A0A(r2, r0, r1)
            java.lang.String r2 = ""
            goto L_0x00a9
        L_0x011c:
            java.lang.String r1 = android.provider.DocumentsContract.getDocumentId(r3)
            X.0qQ.A07(r1)
            java.lang.String r0 = ":"
            java.util.List r0 = X.DbV.A18(r1, r0)
            java.lang.String r0 = X.AnonymousClass7TE.A19(r0, r2)
            java.lang.String[] r10 = new java.lang.String[]{r0}
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            X.0qQ.A08(r7)
            java.lang.String r9 = "_id=?"
            java.lang.String r3 = "_data"
            java.lang.String[] r8 = new java.lang.String[]{r3}
            android.content.Context r0 = r5.requireContext()
            android.content.ContentProviderClient r6 = X.C61990qh.A00(r0, r7)
            java.lang.String r2 = ""
            if (r6 == 0) goto L_0x00a9
            r11 = 0
            r1 = 0
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ RemoteException -> 0x0167, all -> 0x0178 }
            if (r1 == 0) goto L_0x0161
            boolean r0 = r1.moveToFirst()     // Catch:{ RemoteException -> 0x0167, all -> 0x0178 }
            if (r0 == 0) goto L_0x0161
            int r0 = r1.getColumnIndexOrThrow(r3)     // Catch:{ RemoteException -> 0x0167, all -> 0x0178 }
            java.lang.String r2 = r1.getString(r0)     // Catch:{ RemoteException -> 0x0167, all -> 0x0178 }
            goto L_0x016d
        L_0x0161:
            r6.release()
            if (r1 == 0) goto L_0x00a9
            goto L_0x0170
        L_0x0167:
            r6.release()
            if (r1 == 0) goto L_0x00a9
            goto L_0x0170
        L_0x016d:
            r6.release()
        L_0x0170:
            r1.close()
            goto L_0x00a9
        L_0x0175:
            r1 = 0
            goto L_0x009d
        L_0x0178:
            r0 = move-exception
            r6.release()
            if (r1 == 0) goto L_0x0181
            r1.close()
        L_0x0181:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M7A.run():void");
    }
}
