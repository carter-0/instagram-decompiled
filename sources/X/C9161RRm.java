package X;

/* renamed from: X.RRm  reason: case insensitive filesystem */
public abstract class C9161RRm {
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (r1 != 0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        if (r14.getHeight() != r8) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(android.graphics.Bitmap r16, int r17, int r18) {
        /*
            r9 = r17
            if (r17 <= 0) goto L_0x0133
            r8 = r18
            if (r18 <= 0) goto L_0x0133
            r10 = r16
            android.graphics.Bitmap r7 = X.C11048S7s.A00(r10)
            int r6 = r10.getWidth()
            int r5 = r10.getHeight()
            float r0 = (float) r9
            float r1 = (float) r6
            float r0 = r0 / r1
            float r12 = (float) r8
            float r1 = (float) r5
            float r12 = r12 / r1
            r4 = 0
            r3 = 1
            int r1 = r10.getWidth()
            if (r9 != r1) goto L_0x003b
            int r1 = r10.getHeight()
            if (r8 != r1) goto L_0x003b
            boolean r0 = r10.isMutable()
            if (r0 == 0) goto L_0x00a9
            if (r10 != r7) goto L_0x00a9
            android.graphics.Bitmap$Config r0 = r10.getConfig()
            android.graphics.Bitmap r3 = r10.copy(r0, r3)
            return r3
        L_0x003b:
            android.graphics.Paint r2 = X.AnonymousClass7TE.A0V(r3)
            r2.setFilterBitmap(r3)
            int r11 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r11 < r1) goto L_0x0060
            X.C9159RRk.A00(r2)
        L_0x004b:
            if (r6 != r9) goto L_0x0066
            if (r5 != r8) goto L_0x0066
            android.graphics.Bitmap$Config r0 = r7.getConfig()
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r9, r8, r0)
            android.graphics.Canvas r1 = X.JTO.A0B(r3)
            r0 = 0
            r1.drawBitmap(r7, r0, r0, r2)
            return r3
        L_0x0060:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC
            X.Pxi.A0v(r2, r1)
            goto L_0x004b
        L_0x0066:
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.log(r13)
            r13 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            double r0 = (double) r0
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r14
            if (r11 <= 0) goto L_0x012d
            double r0 = java.lang.Math.ceil(r0)
        L_0x007c:
            int r11 = (int) r0
            r18 = r11
            int r11 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            double r0 = (double) r12
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r14
            if (r11 <= 0) goto L_0x0127
            double r0 = java.lang.Math.ceil(r0)
        L_0x008d:
            int r11 = (int) r0
            r17 = r11
            r14 = 0
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>(r4, r4, r6, r5)
            android.graphics.Rect r12 = X.AnonymousClass7TE.A0W()
            r11 = r18
            r1 = r17
        L_0x009e:
            if (r11 != 0) goto L_0x00aa
            if (r1 != 0) goto L_0x00ae
            if (r14 == r10) goto L_0x00a9
            if (r14 == 0) goto L_0x00a9
            r14.recycle()
        L_0x00a9:
            return r7
        L_0x00aa:
            if (r11 >= 0) goto L_0x0124
            int r11 = r11 + 1
        L_0x00ae:
            if (r1 >= 0) goto L_0x011f
            int r1 = r1 + 1
        L_0x00b2:
            if (r11 != 0) goto L_0x0112
            r0 = r9
        L_0x00b5:
            if (r1 != 0) goto L_0x0105
            r15 = r8
        L_0x00b8:
            r12.set(r4, r4, r0, r15)
            if (r11 != 0) goto L_0x00c1
            r16 = 1
            if (r1 == 0) goto L_0x00c3
        L_0x00c1:
            r16 = 0
        L_0x00c3:
            if (r14 == 0) goto L_0x00ec
            int r0 = r14.getWidth()
            if (r0 != r9) goto L_0x00d2
            int r15 = r14.getHeight()
            r0 = 1
            if (r15 == r8) goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            if (r14 == r10) goto L_0x00e7
            if (r16 == 0) goto L_0x00d9
            if (r0 == 0) goto L_0x00e7
        L_0x00d9:
            android.graphics.Canvas r0 = X.JTO.A0B(r14)
            r0.drawBitmap(r7, r13, r12, r2)
            r13.set(r12)
            r0 = r7
            r7 = r14
            r14 = r0
            goto L_0x009e
        L_0x00e7:
            if (r14 == r10) goto L_0x00ec
            r14.recycle()
        L_0x00ec:
            if (r11 > 0) goto L_0x0103
            if (r11 == 0) goto L_0x0103
            int r0 = -r11
            int r0 = r0 - r3
            int r0 = r9 << r0
        L_0x00f4:
            if (r1 > 0) goto L_0x0101
            if (r1 == 0) goto L_0x0101
            int r14 = -r1
            int r14 = r14 - r3
            int r14 = r8 << r14
        L_0x00fc:
            android.graphics.Bitmap r14 = X.C11048S7s.A01(r10, r0, r14)
            goto L_0x00d9
        L_0x0101:
            r14 = r8
            goto L_0x00fc
        L_0x0103:
            r0 = r9
            goto L_0x00f4
        L_0x0105:
            if (r1 <= 0) goto L_0x010d
            int r15 = r17 - r1
            int r15 = r3 << r15
            int r15 = r15 * r5
            goto L_0x00b8
        L_0x010d:
            int r15 = -r1
            int r15 = r15 - r3
            int r15 = r8 << r15
            goto L_0x00b8
        L_0x0112:
            if (r11 <= 0) goto L_0x011a
            int r0 = r18 - r11
            int r0 = r3 << r0
            int r0 = r0 * r6
            goto L_0x00b5
        L_0x011a:
            int r0 = -r11
            int r0 = r0 - r3
            int r0 = r9 << r0
            goto L_0x00b5
        L_0x011f:
            if (r1 <= 0) goto L_0x00b2
            int r1 = r1 + -1
            goto L_0x00b2
        L_0x0124:
            int r11 = r11 + -1
            goto L_0x00ae
        L_0x0127:
            double r0 = java.lang.Math.floor(r0)
            goto L_0x008d
        L_0x012d:
            double r0 = java.lang.Math.floor(r0)
            goto L_0x007c
        L_0x0133:
            java.lang.String r0 = "dstW and dstH must be > 0!"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9161RRm.A00(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }
}
