package X;

/* renamed from: X.LIc  reason: case insensitive filesystem */
public final class C64000LIc {
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final double A00(java.lang.Integer r7, java.lang.String r8, int r9, int r10) {
        /*
            r4 = 0
            android.graphics.Bitmap r4 = X.C7245Q0r.A00(r9, r10)     // Catch:{ Exception -> 0x008f }
            java.lang.String r5 = "image_upload_quality_error"
            java.lang.String r6 = "Image upload %s calc error"
            r3 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r8)     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            if (r3 == 0) goto L_0x003c
            int r1 = r4.getWidth()     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            int r0 = r3.getWidth()     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            if (r1 != r0) goto L_0x0043
            int r1 = r4.getHeight()     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            int r0 = r3.getHeight()     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            if (r1 != r0) goto L_0x0043
            com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils r1 = new com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            r1.<init>()     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            if (r7 != r0) goto L_0x0033
            float r0 = r1.calculateSSIM(r4, r3)     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            double r0 = (double) r0     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            goto L_0x0037
        L_0x0033:
            double r0 = r1.calculateMSSSIM(r4, r3)     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
        L_0x0037:
            r3.recycle()     // Catch:{ Exception -> 0x008f }
            goto L_0x00bb
        L_0x003c:
            java.lang.String r0 = "null bitmap"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
            goto L_0x0049
        L_0x0043:
            java.lang.String r0 = "size mismatch"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
        L_0x0049:
            throw r0     // Catch:{ RuntimeException -> 0x004c, OutOfMemoryError -> 0x004a }
        L_0x004a:
            r2 = move-exception
            goto L_0x0066
        L_0x004c:
            r2 = move-exception
            java.lang.Class<X.LIc> r1 = X.C64000LIc.class
            int r0 = r7.intValue()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "MSSSIM"
        L_0x0057:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch:{ all -> 0x0088 }
            X.0KC.A09(r1, r6, r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = X.DbT.A10(r1)     // Catch:{ all -> 0x0088 }
            goto L_0x007b
        L_0x0063:
            java.lang.String r0 = "SSIM"
            goto L_0x0057
        L_0x0066:
            java.lang.Class<X.LIc> r1 = X.C64000LIc.class
            int r0 = r7.intValue()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "MSSSIM"
        L_0x0070:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch:{ all -> 0x0088 }
            X.0KC.A09(r1, r6, r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = X.DbT.A10(r1)     // Catch:{ all -> 0x0088 }
        L_0x007b:
            X.0kD.A07(r0, r5, r2)     // Catch:{ all -> 0x0088 }
            goto L_0x0082
        L_0x007f:
            java.lang.String r0 = "SSIM"
            goto L_0x0070
        L_0x0082:
            if (r3 == 0) goto L_0x00b9
            r3.recycle()     // Catch:{ Exception -> 0x008f }
            goto L_0x00b9
        L_0x0088:
            r0 = move-exception
            if (r3 == 0) goto L_0x008e
            r3.recycle()     // Catch:{ Exception -> 0x008f }
        L_0x008e:
            throw r0     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00c1 }
            java.lang.Class<X.LIc> r2 = X.C64000LIc.class
            r1.append(r2)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "#measureImageSimilarityFromGLFrame"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "image_upload_quality_error"
            X.0kD.A07(r1, r0, r3)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "Image upload %s calc error"
            int r0 = r7.intValue()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "MSSSIM"
        L_0x00ae:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}     // Catch:{ all -> 0x00c1 }
            X.0KC.A09(r2, r1, r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x00b9
        L_0x00b6:
            java.lang.String r0 = "SSIM"
            goto L_0x00ae
        L_0x00b9:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x00bb:
            if (r4 == 0) goto L_0x00c0
            r4.recycle()
        L_0x00c0:
            return r0
        L_0x00c1:
            r0 = move-exception
            if (r4 == 0) goto L_0x00c7
            r4.recycle()
        L_0x00c7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64000LIc.A00(java.lang.Integer, java.lang.String, int, int):double");
    }
}
