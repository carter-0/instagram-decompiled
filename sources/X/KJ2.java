package X;

public final class KJ2 extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C62934Kom A01;
    public final /* synthetic */ LP1 A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            X.LP1 r6 = r0.A02
            int r5 = r0.A00
            X.Kom r4 = r0.A01
            X.MUV r0 = r6.A02
            double[] r1 = r6.A04
            if (r0 == 0) goto L_0x00d0
            if (r1 == 0) goto L_0x00d0
            if (r5 < 0) goto L_0x00d0
            int r0 = r1.length
            if (r5 >= r0) goto L_0x00d0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r0 = r1[r5]
            double r0 = r0 * r2
            long r11 = (long) r0
            android.util.LruCache r3 = r6.A09
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            java.lang.Object r8 = r3.get(r2)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 != 0) goto L_0x0047
            java.lang.String r9 = "Failed to retrieve bitmap"
            java.lang.String r1 = "VideoFrameThumbnailsGenerator"
            X.LA8 r0 = r6.A01
            int r7 = r0.A00
            r0 = -1
            if (r7 != r0) goto L_0x00e3
            android.media.MediaMetadataRetriever r10 = r6.A00
            r13 = 2
            int r14 = r6.A06
            int r15 = r6.A05
            android.graphics.Bitmap r8 = r10.getScaledFrameAtTime(r11, r13, r14, r15)
            if (r8 == 0) goto L_0x0136
        L_0x0044:
            r3.put(r2, r8)
        L_0x0047:
            double[] r7 = r6.A04
            if (r7 == 0) goto L_0x00d0
            if (r8 == 0) goto L_0x00d0
            double r0 = r4.A01
            int r3 = (int) r0
            double r1 = r4.A00
            int r0 = (int) r1
            r14 = 0
            android.graphics.Bitmap r8 = X.1MF.A09(r8, r3, r0, r14, r14)
            r11 = 1
            if (r5 == 0) goto L_0x005f
            int r0 = r7.length
            int r0 = r0 - r11
            if (r5 != r0) goto L_0x00c6
        L_0x005f:
            int r15 = r6.A07
            if (r15 <= 0) goto L_0x00c6
            if (r5 != 0) goto L_0x0066
            r14 = 1
        L_0x0066:
            r16 = 7
            r13 = 6
            r9 = 5
            r7 = 4
            r3 = 3
            r2 = 2
            r1 = 0
            r0 = 8
            r12 = 0
            float[] r10 = new float[r0]
            if (r14 == 0) goto L_0x00d1
            float r0 = (float) r15
            r10[r1] = r0
            r10[r11] = r0
            r10[r2] = r12
            r10[r3] = r12
            r10[r7] = r12
            r10[r9] = r12
            r10[r13] = r0
            r10[r16] = r0
        L_0x0086:
            int r2 = r8.getWidth()
            int r1 = r8.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r7 = X.JTO.A0B(r9)
            float r1 = X.JTO.A02(r8)
            float r0 = X.JTO.A01(r8)
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r12, r12, r1, r0)
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            r0.<init>(r8, r1, r1)
            android.graphics.Paint r2 = X.JTO.A0C()
            r2.setAntiAlias(r11)
            r2.setShader(r0)
            android.graphics.Path r1 = X.C51965G9l.A0C()
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r3, r10, r0)
            r7.drawPath(r1, r2)
            r8.recycle()
            r8 = r9
        L_0x00c6:
            android.os.Handler r1 = r6.A08
            X.M9k r0 = new X.M9k
            r0.<init>(r8, r4, r6, r5)
            r1.post(r0)
        L_0x00d0:
            return
        L_0x00d1:
            r10[r1] = r12
            r10[r11] = r12
            float r0 = (float) r15
            r10[r2] = r0
            r10[r3] = r0
            r10[r7] = r0
            r10[r9] = r0
            r10[r13] = r12
            r10[r16] = r12
            goto L_0x0086
        L_0x00e3:
            android.media.MediaMetadataRetriever r8 = r6.A00
            r0 = 2
            android.graphics.Bitmap r8 = r8.getFrameAtTime(r11, r0)
            if (r8 == 0) goto L_0x0136
            int r10 = r6.A06
            int r0 = r6.A05
            r9 = 0
            if (r10 <= 0) goto L_0x0108
            if (r0 <= 0) goto L_0x0108
            int r1 = r8.getHeight()
            int r1 = r1 / r0
            int r0 = r8.getWidth()
            int r0 = r0 / r10
            int r10 = java.lang.Math.min(r1, r0)
        L_0x0103:
            r1 = 1
            if (r10 != 0) goto L_0x010a
            r10 = 1
            goto L_0x010a
        L_0x0108:
            r10 = 0
            goto L_0x0103
        L_0x010a:
            X.0vF r0 = X.C363878kU.A00     // Catch:{ RuntimeException -> 0x011b }
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo     // Catch:{ RuntimeException -> 0x011b }
            r0.<init>()     // Catch:{ RuntimeException -> 0x011b }
            android.hardware.Camera.getCameraInfo(r7, r0)     // Catch:{ RuntimeException -> 0x011b }
            int r7 = r0.orientation     // Catch:{ RuntimeException -> 0x011b }
            int r0 = r0.facing     // Catch:{ RuntimeException -> 0x011e }
            if (r0 != r1) goto L_0x0126
            goto L_0x0125
        L_0x011b:
            r1 = move-exception
            r7 = 0
            goto L_0x011f
        L_0x011e:
            r1 = move-exception
        L_0x011f:
            java.lang.String r0 = "getCroppedBitmap().getCameraInfo() failed"
            X.0wb.A07(r0, r1)
            goto L_0x0126
        L_0x0125:
            r9 = 1
        L_0x0126:
            int r1 = r8.getWidth()
            int r1 = r1 / r10
            int r0 = r8.getHeight()
            int r0 = r0 / r10
            android.graphics.Bitmap r8 = X.1MF.A09(r8, r1, r0, r7, r9)
            goto L_0x0044
        L_0x0136:
            X.0wb.A03(r1, r9)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KJ2.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJ2(C62934Kom kom, LP1 lp1, int i) {
        super(1700797870);
        this.A02 = lp1;
        this.A00 = i;
        this.A01 = kom;
    }
}
