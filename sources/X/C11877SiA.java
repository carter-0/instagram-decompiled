package X;

/* renamed from: X.SiA  reason: case insensitive filesystem */
public abstract class C11877SiA implements C13916TlI {
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C13796ThF FHe(android.content.Context r12, X.C13796ThF r13, int r14, int r15) {
        /*
            r11 = this;
            boolean r0 = X.C11424STg.A05(r14, r15)
            if (r0 == 0) goto L_0x019b
            X.SUv r0 = X.SUv.A00(r12)
            X.Thg r5 = r0.A01
            java.lang.Object r4 = r13.get()
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 != r0) goto L_0x001a
            int r14 = r4.getWidth()
        L_0x001a:
            if (r15 != r0) goto L_0x0020
            int r15 = r4.getHeight()
        L_0x0020:
            r1 = r11
            boolean r0 = r11 instanceof com.bumptech.glide.load.resource.bitmap.RoundedCorners
            if (r0 == 0) goto L_0x0094
            com.bumptech.glide.load.resource.bitmap.RoundedCorners r1 = (com.bumptech.glide.load.resource.bitmap.RoundedCorners) r1
            int r10 = r1.A00
            java.util.concurrent.locks.Lock r0 = X.SQc.A02
            boolean r1 = X.AnonymousClass7TF.A1R(r10)
            java.lang.String r0 = "roundingRadius must be greater than 0."
            if (r1 == 0) goto L_0x008f
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGBA_F16
            android.graphics.Bitmap$Config r0 = r4.getConfig()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0042
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0042:
            android.graphics.Bitmap r7 = X.SQc.A00(r4, r5)
            int r1 = r7.getWidth()
            int r0 = r7.getHeight()
            android.graphics.Bitmap r1 = r5.AWz(r1, r0, r2)
            r3 = 1
            r1.setHasAlpha(r3)
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            r0.<init>(r7, r2, r2)
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r9.setAntiAlias(r3)
            r9.setShader(r0)
            float r3 = X.JTO.A02(r1)
            float r2 = X.JTO.A01(r1)
            r0 = 0
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r0, r0, r3, r2)
            java.util.concurrent.locks.Lock r8 = X.SQc.A02
            r8.lock()
            android.graphics.Canvas r3 = X.JTO.A0B(r1)     // Catch:{ all -> 0x00fa }
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x00fa }
            r3.drawColor(r2, r0)     // Catch:{ all -> 0x00fa }
            float r0 = (float) r10     // Catch:{ all -> 0x00fa }
            r3.drawRoundRect(r6, r0, r0, r9)     // Catch:{ all -> 0x00fa }
            r0 = 0
            r3.setBitmap(r0)     // Catch:{ all -> 0x00fa }
            goto L_0x0183
        L_0x008f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0094:
            boolean r0 = r11 instanceof com.bumptech.glide.load.resource.bitmap.FitCenter
            if (r0 != 0) goto L_0x017e
            boolean r0 = r11 instanceof X.QHD
            if (r0 == 0) goto L_0x00ff
            java.util.concurrent.locks.Lock r0 = X.SQc.A02
            int r8 = java.lang.Math.min(r14, r15)
            float r9 = (float) r8
            r6 = 1073741824(0x40000000, float:2.0)
            float r2 = r9 / r6
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            float r7 = (float) r1
            float r1 = r9 / r7
            float r3 = (float) r0
            float r0 = r9 / r3
            float r1 = java.lang.Math.max(r1, r0)
            float r7 = r7 * r1
            float r1 = r1 * r3
            float r0 = r9 - r7
            float r0 = r0 / r6
            float r9 = r9 - r1
            float r9 = r9 / r6
            float r7 = r7 + r0
            float r1 = r1 + r9
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r0, r9, r7, r1)
            android.graphics.Bitmap r7 = X.SQc.A00(r4, r5)
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16
            android.graphics.Bitmap$Config r0 = r4.getConfig()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d9
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x00d9:
            android.graphics.Bitmap r1 = r5.AWz(r8, r8, r1)
            r0 = 1
            r1.setHasAlpha(r0)
            java.util.concurrent.locks.Lock r8 = X.SQc.A02
            r8.lock()
            android.graphics.Canvas r3 = X.JTO.A0B(r1)     // Catch:{ all -> 0x00fa }
            android.graphics.Paint r0 = X.SQc.A01     // Catch:{ all -> 0x00fa }
            r3.drawCircle(r2, r2, r2, r0)     // Catch:{ all -> 0x00fa }
            r2 = 0
            android.graphics.Paint r0 = X.SQc.A00     // Catch:{ all -> 0x00fa }
            r3.drawBitmap(r7, r2, r6, r0)     // Catch:{ all -> 0x00fa }
            r3.setBitmap(r2)     // Catch:{ all -> 0x00fa }
            goto L_0x0183
        L_0x00fa:
            r0 = move-exception
            r8.unlock()
            throw r0
        L_0x00ff:
            boolean r1 = r11 instanceof com.bumptech.glide.load.resource.bitmap.CenterInside
            java.util.concurrent.locks.Lock r0 = X.SQc.A02
            int r0 = r4.getWidth()
            if (r1 == 0) goto L_0x0119
            r2 = 2
            java.lang.String r1 = "TransformationUtils"
            if (r0 > r14) goto L_0x017b
            int r0 = r4.getHeight()
            if (r0 > r15) goto L_0x017b
            android.util.Log.isLoggable(r1, r2)
        L_0x0117:
            r1 = r4
            goto L_0x018f
        L_0x0119:
            if (r0 != r14) goto L_0x0122
            int r0 = r4.getHeight()
            if (r0 != r15) goto L_0x0122
            goto L_0x0117
        L_0x0122:
            android.graphics.Matrix r3 = X.AnonymousClass7TE.A0U()
            int r1 = r4.getWidth()
            int r1 = r1 * r15
            int r0 = r4.getHeight()
            int r0 = r0 * r14
            r2 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r1 <= r0) goto L_0x016c
            float r6 = (float) r15
            float r0 = X.JTO.A01(r4)
            float r6 = r6 / r0
            float r2 = (float) r14
            float r0 = X.JTO.A02(r4)
            float r0 = r0 * r6
            float r2 = r2 - r0
            float r2 = r2 * r7
            r1 = 0
        L_0x0144:
            r3.setScale(r6, r6)
            float r2 = r2 + r7
            int r0 = (int) r2
            float r2 = (float) r0
            float r1 = r1 + r7
            int r0 = (int) r1
            float r0 = (float) r0
            r3.postTranslate(r2, r0)
            android.graphics.Bitmap$Config r0 = r4.getConfig()
            if (r0 == 0) goto L_0x0169
            android.graphics.Bitmap$Config r0 = r4.getConfig()
        L_0x015a:
            android.graphics.Bitmap r1 = r5.AWz(r14, r15, r0)
            boolean r0 = r4.hasAlpha()
            r1.setHasAlpha(r0)
            X.SQc.A02(r4, r1, r3)
            goto L_0x018f
        L_0x0169:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x015a
        L_0x016c:
            float r6 = (float) r14
            float r0 = X.JTO.A02(r4)
            float r6 = r6 / r0
            float r1 = (float) r15
            float r0 = X.JTO.A01(r4)
            float r0 = r0 * r6
            float r1 = r1 - r0
            float r1 = r1 * r7
            goto L_0x0144
        L_0x017b:
            android.util.Log.isLoggable(r1, r2)
        L_0x017e:
            android.graphics.Bitmap r1 = X.SQc.A01(r4, r5, r14, r15)
            goto L_0x018f
        L_0x0183:
            r8.unlock()
            boolean r0 = r7.equals(r4)
            if (r0 != 0) goto L_0x018f
            r5.E5H(r7)
        L_0x018f:
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L_0x019a
            X.Sik r13 = new X.Sik
            r13.<init>(r1, r5)
        L_0x019a:
            return r13
        L_0x019b:
            java.lang.String r2 = "Cannot apply transformation on width: "
            java.lang.String r1 = " or height: "
            java.lang.String r0 = " less than or equal to zero and not Target.SIZE_ORIGINAL"
            java.lang.String r0 = X.002.A0n(r2, r1, r0, r14, r15)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11877SiA.FHe(android.content.Context, X.ThF, int, int):X.ThF");
    }
}
