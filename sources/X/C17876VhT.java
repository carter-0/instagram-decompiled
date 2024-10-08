package X;

/* renamed from: X.VhT  reason: case insensitive filesystem */
public final class C17876VhT {
    public W1P A00;
    public W19 A01;
    public final X9F A02;
    public final VLU A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0204, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0205, code lost:
        r1 = X.C17876VhT.class;
        r4 = new java.lang.Object[]{java.lang.Integer.valueOf(r12)};
        r2 = X.0I1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0219, code lost:
        if (r2.isLoggable(6) != false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x021b, code lost:
        r2.e(r1.getSimpleName(), java.lang.String.format((java.util.Locale) null, "Rendering of frame unsuccessful. Frame number: %d", r4), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0227, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r5.drawBitmap((android.graphics.Bitmap) r3.A05(), 0.0f, 0.0f, (android.graphics.Paint) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ba, code lost:
        if (r6.A04 != X.C16489Uvk.DISPOSE_TO_BACKGROUND) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01bc, code lost:
        X.W19.A00(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01bf, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01cf A[Catch:{ IllegalStateException -> 0x0204 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017f A[Catch:{ IllegalStateException -> 0x0204 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x018d A[Catch:{ IllegalStateException -> 0x0204 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.graphics.Bitmap r18, int r19) {
        /*
            r17 = this;
            r11 = 1
            r0 = r17
            r12 = r19
            X.W19 r4 = r0.A01     // Catch:{ IllegalStateException -> 0x0204 }
            boolean r0 = r4.A02     // Catch:{ IllegalStateException -> 0x0204 }
            r1 = r18
            if (r0 == 0) goto L_0x014c
            android.graphics.Canvas r10 = new android.graphics.Canvas     // Catch:{ IllegalStateException -> 0x0204 }
            r10.<init>(r1)     // Catch:{ IllegalStateException -> 0x0204 }
            X.W1P r9 = r4.A01     // Catch:{ IllegalStateException -> 0x0204 }
            X.X9T r1 = r9.A06     // Catch:{ IllegalStateException -> 0x0204 }
            X.X94 r16 = r1.getFrame(r12)     // Catch:{ IllegalStateException -> 0x0204 }
            X.Va8 r14 = r1.getFrameInfo(r12)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r19 != 0) goto L_0x0022
            r13 = 0
            goto L_0x0028
        L_0x0022:
            int r0 = r19 + -1
            X.Va8 r13 = r1.getFrameInfo(r0)     // Catch:{ IllegalStateException -> 0x0204 }
        L_0x0028:
            int r0 = r16.getWidth()     // Catch:{ all -> 0x0147 }
            if (r0 <= 0) goto L_0x0143
            int r0 = r16.getHeight()     // Catch:{ all -> 0x0147 }
            if (r0 <= 0) goto L_0x0143
            boolean r0 = r1.doesRenderSupportScaling()     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x00de
            int r15 = r1.getWidth()     // Catch:{ all -> 0x0147 }
            int r8 = r1.getHeight()     // Catch:{ all -> 0x0147 }
            float r7 = (float) r15     // Catch:{ all -> 0x0147 }
            float r6 = (float) r8     // Catch:{ all -> 0x0147 }
            int r5 = r16.getWidth()     // Catch:{ all -> 0x0147 }
            int r4 = r16.getHeight()     // Catch:{ all -> 0x0147 }
            int r3 = r16.getXOffset()     // Catch:{ all -> 0x0147 }
            int r2 = r16.getYOffset()     // Catch:{ all -> 0x0147 }
            int r0 = r10.getWidth()     // Catch:{ all -> 0x0147 }
            float r0 = (float) r0     // Catch:{ all -> 0x0147 }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            int r0 = r10.getHeight()     // Catch:{ all -> 0x0147 }
            float r0 = (float) r0     // Catch:{ all -> 0x0147 }
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ac
        L_0x006b:
            int r0 = r10.getWidth()     // Catch:{ all -> 0x0147 }
            int r2 = java.lang.Math.min(r0, r15)     // Catch:{ all -> 0x0147 }
            int r0 = r10.getHeight()     // Catch:{ all -> 0x0147 }
            int r1 = java.lang.Math.min(r0, r8)     // Catch:{ all -> 0x0147 }
            float r0 = r7 / r6
            if (r2 <= r1) goto L_0x0083
            float r1 = (float) r2     // Catch:{ all -> 0x0147 }
            float r8 = r1 / r0
            goto L_0x0086
        L_0x0083:
            float r8 = (float) r1     // Catch:{ all -> 0x0147 }
            float r1 = r8 * r0
        L_0x0086:
            float r1 = r1 / r7
            float r8 = r8 / r6
            int r0 = r16.getWidth()     // Catch:{ all -> 0x0147 }
            float r0 = (float) r0     // Catch:{ all -> 0x0147 }
            int r5 = X.C13988Tno.A02(r0, r1)     // Catch:{ all -> 0x0147 }
            int r0 = r16.getHeight()     // Catch:{ all -> 0x0147 }
            float r0 = (float) r0     // Catch:{ all -> 0x0147 }
            int r4 = X.C13988Tno.A02(r0, r8)     // Catch:{ all -> 0x0147 }
            int r0 = r16.getXOffset()     // Catch:{ all -> 0x0147 }
            float r0 = (float) r0     // Catch:{ all -> 0x0147 }
            int r3 = X.C13988Tno.A02(r0, r1)     // Catch:{ all -> 0x0147 }
            int r0 = r16.getYOffset()     // Catch:{ all -> 0x0147 }
            float r0 = (float) r0     // Catch:{ all -> 0x0147 }
            int r2 = X.C13988Tno.A02(r0, r8)     // Catch:{ all -> 0x0147 }
        L_0x00ac:
            r0 = 0
            android.graphics.Rect r7 = new android.graphics.Rect     // Catch:{ all -> 0x0147 }
            r7.<init>(r0, r0, r5, r4)     // Catch:{ all -> 0x0147 }
            int r0 = r3 + r5
            int r15 = r2 + r4
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ all -> 0x0147 }
            r6.<init>(r3, r2, r0, r15)     // Catch:{ all -> 0x0147 }
            if (r13 == 0) goto L_0x00c0
            X.W1P.A02(r10, r13, r9, r1, r8)     // Catch:{ all -> 0x0147 }
        L_0x00c0:
            java.lang.Integer r1 = r14.A05     // Catch:{ all -> 0x0147 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0147 }
            if (r1 != r0) goto L_0x00cb
            android.graphics.Paint r0 = r9.A02     // Catch:{ all -> 0x0147 }
            r10.drawRect(r6, r0)     // Catch:{ all -> 0x0147 }
        L_0x00cb:
            monitor-enter(r9)     // Catch:{ all -> 0x0147 }
            android.graphics.Bitmap r1 = X.W1P.A00(r9, r5, r4)     // Catch:{ all -> 0x00db }
            r0 = r16
            r0.renderFrame(r5, r4, r1)     // Catch:{ all -> 0x00db }
            r0 = 0
            r10.drawBitmap(r1, r7, r6, r0)     // Catch:{ all -> 0x00db }
            monitor-exit(r9)     // Catch:{ all -> 0x00db }
            goto L_0x0143
        L_0x00db:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00db }
            goto L_0x0142
        L_0x00de:
            android.graphics.Rect r1 = r9.A05     // Catch:{ all -> 0x0147 }
            int r0 = r1.width()     // Catch:{ all -> 0x0147 }
            if (r0 <= 0) goto L_0x0143
            int r0 = r1.height()     // Catch:{ all -> 0x0147 }
            if (r0 <= 0) goto L_0x0143
            int r0 = r10.getWidth()     // Catch:{ all -> 0x0147 }
            float r2 = (float) r0     // Catch:{ all -> 0x0147 }
            int r0 = r1.width()     // Catch:{ all -> 0x0147 }
            float r0 = (float) r0     // Catch:{ all -> 0x0147 }
            float r2 = r2 / r0
            if (r13 == 0) goto L_0x00fc
            X.W1P.A02(r10, r13, r9, r2, r2)     // Catch:{ all -> 0x0147 }
        L_0x00fc:
            int r5 = r16.getWidth()     // Catch:{ all -> 0x0147 }
            int r4 = r16.getHeight()     // Catch:{ all -> 0x0147 }
            r0 = 0
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ all -> 0x0147 }
            r3.<init>(r0, r0, r5, r4)     // Catch:{ all -> 0x0147 }
            float r0 = (float) r5     // Catch:{ all -> 0x0147 }
            float r0 = r0 * r2
            int r7 = (int) r0     // Catch:{ all -> 0x0147 }
            float r0 = (float) r4     // Catch:{ all -> 0x0147 }
            float r0 = r0 * r2
            int r6 = (int) r0     // Catch:{ all -> 0x0147 }
            int r0 = r16.getXOffset()     // Catch:{ all -> 0x0147 }
            float r0 = (float) r0     // Catch:{ all -> 0x0147 }
            float r0 = r0 * r2
            int r1 = (int) r0     // Catch:{ all -> 0x0147 }
            int r0 = r16.getYOffset()     // Catch:{ all -> 0x0147 }
            float r0 = (float) r0     // Catch:{ all -> 0x0147 }
            float r0 = r0 * r2
            int r0 = (int) r0     // Catch:{ all -> 0x0147 }
            int r7 = r7 + r1
            int r6 = r6 + r0
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x0147 }
            r2.<init>(r1, r0, r7, r6)     // Catch:{ all -> 0x0147 }
            java.lang.Integer r1 = r14.A05     // Catch:{ all -> 0x0147 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0147 }
            if (r1 != r0) goto L_0x0130
            android.graphics.Paint r0 = r9.A02     // Catch:{ all -> 0x0147 }
            r10.drawRect(r2, r0)     // Catch:{ all -> 0x0147 }
        L_0x0130:
            monitor-enter(r9)     // Catch:{ all -> 0x0147 }
            android.graphics.Bitmap r1 = X.W1P.A00(r9, r5, r4)     // Catch:{ all -> 0x0140 }
            r0 = r16
            r0.renderFrame(r5, r4, r1)     // Catch:{ all -> 0x0140 }
            r0 = 0
            r10.drawBitmap(r1, r3, r2, r0)     // Catch:{ all -> 0x0140 }
            monitor-exit(r9)     // Catch:{ all -> 0x0140 }
            goto L_0x0143
        L_0x0140:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0140 }
        L_0x0142:
            throw r0     // Catch:{ all -> 0x0147 }
        L_0x0143:
            r16.dispose()     // Catch:{ IllegalStateException -> 0x0204 }
            return r11
        L_0x0147:
            r0 = move-exception
            r16.dispose()     // Catch:{ IllegalStateException -> 0x0204 }
            goto L_0x01c9
        L_0x014c:
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ IllegalStateException -> 0x0204 }
            r5.<init>(r1)     // Catch:{ IllegalStateException -> 0x0204 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC     // Catch:{ IllegalStateException -> 0x0204 }
            r5.drawColor(r1, r0)     // Catch:{ IllegalStateException -> 0x0204 }
            boolean r0 = X.W19.A02(r4, r12)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r0 != 0) goto L_0x01cc
            int r7 = r19 + -1
        L_0x015f:
            if (r7 < 0) goto L_0x01ca
            X.W1P r0 = r4.A01     // Catch:{ IllegalStateException -> 0x0204 }
            X.Va8[] r6 = r0.A0B     // Catch:{ IllegalStateException -> 0x0204 }
            r3 = r6[r7]     // Catch:{ IllegalStateException -> 0x0204 }
            X.Uvk r2 = r3.A04     // Catch:{ IllegalStateException -> 0x0204 }
            X.Uvk r0 = X.C16489Uvk.DISPOSE_DO_NOT     // Catch:{ IllegalStateException -> 0x0204 }
            if (r2 == r0) goto L_0x018a
            X.Uvk r0 = X.C16489Uvk.DISPOSE_TO_BACKGROUND     // Catch:{ IllegalStateException -> 0x0204 }
            if (r2 != r0) goto L_0x0180
            boolean r0 = X.W19.A01(r3, r4)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r0 == 0) goto L_0x018a
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IllegalStateException -> 0x0204 }
        L_0x0179:
            int r2 = r0.intValue()     // Catch:{ IllegalStateException -> 0x0204 }
            if (r2 == r1) goto L_0x018d
            goto L_0x01a3
        L_0x0180:
            X.Uvk r0 = X.C16489Uvk.DISPOSE_TO_PREVIOUS     // Catch:{ IllegalStateException -> 0x0204 }
            if (r2 != r0) goto L_0x0187
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ IllegalStateException -> 0x0204 }
            goto L_0x0179
        L_0x0187:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ IllegalStateException -> 0x0204 }
            goto L_0x0179
        L_0x018a:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ IllegalStateException -> 0x0204 }
            goto L_0x0179
        L_0x018d:
            r6 = r6[r7]     // Catch:{ IllegalStateException -> 0x0204 }
            X.VLU r0 = r4.A00     // Catch:{ IllegalStateException -> 0x0204 }
            X.VhT r0 = r0.A00     // Catch:{ IllegalStateException -> 0x0204 }
            X.X9F r0 = r0.A02     // Catch:{ IllegalStateException -> 0x0204 }
            X.3kY r3 = r0.AjM(r7)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r3 == 0) goto L_0x019c
            goto L_0x01ab
        L_0x019c:
            boolean r0 = X.W19.A02(r4, r7)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r0 == 0) goto L_0x01a8
            goto L_0x01cd
        L_0x01a3:
            if (r2 == r11) goto L_0x01ee
            r0 = 3
            if (r2 == r0) goto L_0x01cd
        L_0x01a8:
            int r7 = r7 + -1
            goto L_0x015f
        L_0x01ab:
            java.lang.Object r2 = r3.A05()     // Catch:{ all -> 0x01c5 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x01c5 }
            r1 = 0
            r0 = 0
            r5.drawBitmap(r2, r0, r0, r1)     // Catch:{ all -> 0x01c5 }
            X.Uvk r1 = r6.A04     // Catch:{ all -> 0x01c5 }
            X.Uvk r0 = X.C16489Uvk.DISPOSE_TO_BACKGROUND     // Catch:{ all -> 0x01c5 }
            if (r1 != r0) goto L_0x01bf
            X.W19.A00(r5, r6, r4)     // Catch:{ all -> 0x01c5 }
        L_0x01bf:
            int r7 = r7 + 1
            r3.close()     // Catch:{ IllegalStateException -> 0x0204 }
            goto L_0x01cd
        L_0x01c5:
            r0 = move-exception
            r3.close()     // Catch:{ IllegalStateException -> 0x0204 }
        L_0x01c9:
            throw r0     // Catch:{ IllegalStateException -> 0x0204 }
        L_0x01ca:
            r7 = 0
            goto L_0x01cd
        L_0x01cc:
            r7 = r12
        L_0x01cd:
            if (r7 >= r12) goto L_0x01f1
            X.W1P r6 = r4.A01     // Catch:{ IllegalStateException -> 0x0204 }
            X.Va8[] r0 = r6.A0B     // Catch:{ IllegalStateException -> 0x0204 }
            r3 = r0[r7]     // Catch:{ IllegalStateException -> 0x0204 }
            X.Uvk r2 = r3.A04     // Catch:{ IllegalStateException -> 0x0204 }
            X.Uvk r0 = X.C16489Uvk.DISPOSE_TO_PREVIOUS     // Catch:{ IllegalStateException -> 0x0204 }
            if (r2 == r0) goto L_0x01ee
            java.lang.Integer r1 = r3.A05     // Catch:{ IllegalStateException -> 0x0204 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IllegalStateException -> 0x0204 }
            if (r1 != r0) goto L_0x01e4
            X.W19.A00(r5, r3, r4)     // Catch:{ IllegalStateException -> 0x0204 }
        L_0x01e4:
            r6.A03(r5, r7)     // Catch:{ IllegalStateException -> 0x0204 }
            X.Uvk r0 = X.C16489Uvk.DISPOSE_TO_BACKGROUND     // Catch:{ IllegalStateException -> 0x0204 }
            if (r2 != r0) goto L_0x01ee
            X.W19.A00(r5, r3, r4)     // Catch:{ IllegalStateException -> 0x0204 }
        L_0x01ee:
            int r7 = r7 + 1
            goto L_0x01cd
        L_0x01f1:
            X.W1P r3 = r4.A01     // Catch:{ IllegalStateException -> 0x0204 }
            X.Va8[] r0 = r3.A0B     // Catch:{ IllegalStateException -> 0x0204 }
            r2 = r0[r19]     // Catch:{ IllegalStateException -> 0x0204 }
            java.lang.Integer r1 = r2.A05     // Catch:{ IllegalStateException -> 0x0204 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IllegalStateException -> 0x0204 }
            if (r1 != r0) goto L_0x0200
            X.W19.A00(r5, r2, r4)     // Catch:{ IllegalStateException -> 0x0204 }
        L_0x0200:
            r3.A03(r5, r12)     // Catch:{ IllegalStateException -> 0x0204 }
            return r11
        L_0x0204:
            r5 = move-exception
            java.lang.Class<X.VhT> r1 = X.C17876VhT.class
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r11 = 0
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            java.lang.String r3 = "Rendering of frame unsuccessful. Frame number: %d"
            X.0I2 r2 = X.0I1.A00
            r0 = 6
            boolean r0 = r2.isLoggable(r0)
            if (r0 == 0) goto L_0x0227
            java.lang.String r1 = r1.getSimpleName()
            r0 = 0
            java.lang.String r0 = java.lang.String.format(r0, r3, r4)
            r2.e(r1, r0, r5)
        L_0x0227:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17876VhT.A00(android.graphics.Bitmap, int):boolean");
    }

    public C17876VhT(X9F x9f, W1P w1p, boolean z) {
        VLU vlu = new VLU(this);
        this.A03 = vlu;
        this.A02 = x9f;
        this.A00 = w1p;
        this.A04 = z;
        this.A01 = new W19(vlu, w1p, z);
    }
}
