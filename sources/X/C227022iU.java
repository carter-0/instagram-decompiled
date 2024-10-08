package X;

/* renamed from: X.2iU  reason: invalid class name and case insensitive filesystem */
public final class C227022iU extends 0ng {
    public final /* synthetic */ AnonymousClass2iL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C227022iU(AnonymousClass2iL r4, int i) {
        super(513, i, false, true);
        this.A00 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x041a, code lost:
        if (r5 != null) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x048c, code lost:
        if (r5 != null) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0490, code lost:
        if (r5.A00 == null) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        if (r13 != null) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r0 = r24
            X.2iL r0 = r0.A00
            X.1NK r1 = r0.A0c
            X.0jG r4 = r1.A0E
            if (r4 == 0) goto L_0x000f
            com.instagram.common.typedurl.ImageUrl r2 = r0.A0L
            r4.Cie(r2)
        L_0x000f:
            java.lang.Integer r3 = r0.A0Y
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r3 != r2) goto L_0x0019
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r0.A0Y = r2
        L_0x0019:
            java.lang.Integer r5 = r0.A0Y
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r3 = 0
            if (r5 == r2) goto L_0x010d
            com.instagram.common.typedurl.ImageUrl r12 = r0.A0L
            java.lang.String r13 = r1.A0L(r12)
            X.2iM r2 = r0.A0J
            boolean r2 = r2.A03
            if (r2 == 0) goto L_0x0035
            X.1Nu r2 = r1.A0F
            X.1JI r2 = r2.A00()
            r2.ED4(r13)
        L_0x0035:
            boolean r2 = X.1NK.A0j
            if (r2 == 0) goto L_0x0064
            boolean r6 = r0.A0E()
            X.1Nu r10 = r1.A0F
            android.content.Context r8 = r1.A0C
            X.1zH r11 = r1.A02
            X.0fA r9 = r1.A0D
            X.2iX r7 = new X.2iX
            r7.<init>(r8, r9, r10, r11, r12, r13)
            int r2 = r0.A0X
            X.2jm r5 = r7.A00(r4, r2, r6)
            if (r5 == 0) goto L_0x009a
            if (r6 == 0) goto L_0x006f
            X.2iZ r4 = r5.A01
            int r2 = r4.A00
            if (r2 != 0) goto L_0x006f
            r4.A01()
            X.1JI r2 = r10.A00()
            r2.ED4(r13)
        L_0x0064:
            r2 = 1
        L_0x0065:
            java.lang.String r4 = "disk"
            if (r3 == 0) goto L_0x0137
            java.util.Set r1 = r1.A0P
            X.AnonymousClass2iL.A0B(r0, r4, r1)
            return
        L_0x006f:
            X.2iZ r2 = r5.A01
            r0.A0A = r2
            int r2 = r5.A00
            r0.A04 = r2
            java.lang.String r2 = r5.A02
            r0.A0C = r2
            int r2 = r0.A0S
            if (r2 == 0) goto L_0x0097
            int r4 = r0.A0S
        L_0x0081:
            int r2 = r0.A04
            boolean r2 = X.1NK.A0E(r4, r2)
            r4 = r2 ^ 1
            if (r4 == 0) goto L_0x0094
            X.2iZ r2 = r0.A0A
            if (r2 == 0) goto L_0x0094
            int r2 = r2.A00
            if (r2 <= 0) goto L_0x0094
            r3 = 1
        L_0x0094:
            r2 = r4 ^ 1
            goto L_0x0065
        L_0x0097:
            int r4 = r0.A0X
            goto L_0x0081
        L_0x009a:
            X.1MZ r6 = r1.A0G
            boolean r2 = r6.A04
            if (r2 == 0) goto L_0x0064
            boolean r2 = r6.A06
            if (r2 == 0) goto L_0x0064
            int r2 = r0.A02
            if (r2 <= 0) goto L_0x0064
            boolean r2 = r6.A0B
            if (r2 == 0) goto L_0x0113
            X.1O7 r5 = r1.A0H
            X.0qQ.A0B(r12, r3)
            boolean r2 = r5.A02
            if (r2 == 0) goto L_0x0064
            boolean r2 = r5.A03
            if (r2 != 0) goto L_0x00c0
            java.lang.String r5 = "ImageCacheKeysHelper"
            java.lang.String r2 = "Trying to use direct similarity for cached images in logical similarity mode"
            X.0wb.A03(r5, r2)
        L_0x00c0:
            com.instagram.common.typedurl.ImageCacheKey r2 = X.C69820Nsh.A00(r12)
            if (r2 == 0) goto L_0x0064
            java.lang.String r13 = X.1NK.A03(r1, r2)
            if (r13 == 0) goto L_0x0064
        L_0x00cc:
            int r5 = r2.A01
            int r2 = r2.A00
            int[] r5 = new int[]{r5, r2}
            if (r13 == 0) goto L_0x0064
            boolean r2 = r6.A08
            if (r2 != 0) goto L_0x0064
            X.1zH r11 = r1.A02
            X.2iX r7 = new X.2iX
            r7.<init>(r8, r9, r10, r11, r12, r13)
            boolean r6 = r0.A0E()
            int r2 = r0.A0X
            X.2jm r6 = r7.A00(r4, r2, r6)
            int r2 = r0.A0S
            if (r2 == 0) goto L_0x0110
            int r2 = r0.A0S
        L_0x00f1:
            if (r6 == 0) goto L_0x0064
            int r4 = r6.A00
            boolean r2 = X.1NK.A0E(r2, r4)
            if (r2 != 0) goto L_0x0130
            X.2iZ r3 = r6.A01
            r0.A0A = r3
            r0.A04 = r4
            java.lang.String r2 = r6.A02
            r0.A0C = r2
            r0.A0G = r5
            int r2 = r3.A00
            r3 = 0
            if (r2 <= 0) goto L_0x010d
            r3 = 1
        L_0x010d:
            r2 = 0
            goto L_0x0065
        L_0x0110:
            int r2 = r0.A0X
            goto L_0x00f1
        L_0x0113:
            X.1O7 r7 = r1.A0H
            X.0qQ.A0B(r13, r3)
            boolean r2 = r7.A02
            if (r2 == 0) goto L_0x0064
            X.1O7.A03(r7)
            com.instagram.common.typedurl.ImageCacheKey r5 = X.1O7.A01(r7, r13)
            if (r5 == 0) goto L_0x0064
            X.16f r2 = r7.A00
            com.instagram.common.typedurl.ImageCacheKey r2 = X.1O7.A00(r2, r7, r5)
            if (r2 == 0) goto L_0x0064
            java.lang.String r13 = r2.A03
            goto L_0x00cc
        L_0x0130:
            X.2iZ r2 = r6.A01
            r2.A01()
            goto L_0x0064
        L_0x0137:
            if (r2 == 0) goto L_0x04a5
            java.lang.Integer r2 = r0.A0M
            int r2 = r2.intValue()
            switch(r2) {
                case 0: goto L_0x0450;
                case 1: goto L_0x0454;
                case 2: goto L_0x0154;
                case 3: goto L_0x0154;
                case 4: goto L_0x045e;
                case 5: goto L_0x0454;
                case 6: goto L_0x044c;
                default: goto L_0x0142;
            }
        L_0x0142:
            java.lang.String r1 = "Unsupported uri type: "
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0L
            java.lang.String r0 = r0.getUrl()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0154:
            android.content.Context r4 = r1.A0C
            X.1Nu r2 = r1.A0F
            r23 = r2
            com.instagram.common.typedurl.ImageUrl r2 = r0.A0L
            r22 = r2
            java.lang.String r12 = r1.A0L(r2)
            java.lang.String r2 = r0.A0N
            r21 = r2
            r3 = 1
            r7 = 0
            X.0qQ.A0B(r4, r7)
            r2 = r23
            X.0qQ.A0B(r2, r3)
            r5 = 2
            r2 = r22
            X.0qQ.A0B(r2, r5)
            r2 = 3
            X.0qQ.A0B(r12, r2)
            r5 = 4
            r2 = r21
            X.0qQ.A0B(r2, r5)
            java.lang.String r5 = r22.CCJ()
            java.lang.String r2 = "emoji:/"
            boolean r2 = X.00p.A0k(r5, r2, r7)
            java.lang.Class<X.7gE> r20 = X.C337367gE.class
            monitor-enter(r20)
            if (r2 == 0) goto L_0x022f
            X.7gE r14 = X.C337367gE.A02     // Catch:{ all -> 0x0449 }
            java.lang.String r5 = r22.CCJ()     // Catch:{ all -> 0x0449 }
            r2 = 7
            java.lang.String r6 = r5.substring(r2)     // Catch:{ all -> 0x0449 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x0449 }
            java.lang.String r5 = "//"
            X.11S r2 = new X.11S     // Catch:{ all -> 0x0449 }
            r2.<init>(r5)     // Catch:{ all -> 0x0449 }
            java.util.List r5 = r2.A03(r6)     // Catch:{ all -> 0x0449 }
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch:{ all -> 0x0449 }
            java.lang.Object[] r2 = r5.toArray(r2)     // Catch:{ all -> 0x0449 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x0449 }
            r9 = r2[r3]     // Catch:{ all -> 0x0449 }
            monitor-enter(r14)     // Catch:{ all -> 0x0449 }
            android.util.DisplayMetrics r2 = X.0nA.A0H(r4)     // Catch:{ all -> 0x022b }
            int r13 = r2.densityDpi     // Catch:{ all -> 0x022b }
            X.33y r2 = X.C70572Rz.A00()     // Catch:{ all -> 0x022b }
            android.graphics.Typeface r11 = r2.B76(r9)     // Catch:{ all -> 0x022b }
            X.7gF r10 = X.C337367gE.A00     // Catch:{ all -> 0x022b }
            android.graphics.Bitmap r2 = r10.A01     // Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x01d1
            int r2 = r10.A00     // Catch:{ all -> 0x022b }
            if (r2 != r13) goto L_0x01d1
            if (r11 == 0) goto L_0x0341
            android.graphics.Typeface r2 = r10.A04     // Catch:{ all -> 0x022b }
            if (r2 == r11) goto L_0x0341
        L_0x01d1:
            android.content.res.Resources r5 = r4.getResources()     // Catch:{ all -> 0x022b }
            r2 = 2131165266(0x7f070052, float:1.7944744E38)
            int r2 = r5.getDimensionPixelSize(r2)     // Catch:{ all -> 0x022b }
            X.C337367gE.A00(r11, r10, r2, r13)     // Catch:{ all -> 0x022b }
            r2 = 9
            float r2 = X.0nA.A04(r4, r2)     // Catch:{ all -> 0x022b }
            int r8 = java.lang.Math.round(r2)     // Catch:{ all -> 0x022b }
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ all -> 0x022b }
            r6.<init>()     // Catch:{ all -> 0x022b }
            android.text.TextPaint r5 = r10.A05     // Catch:{ all -> 0x022b }
            if (r5 == 0) goto L_0x0223
            java.lang.String r4 = "😁"
            r2 = 2
            r5.getTextBounds(r4, r7, r2, r6)     // Catch:{ all -> 0x022b }
            r10.A00 = r13     // Catch:{ all -> 0x022b }
            if (r11 == 0) goto L_0x01fe
            r10.A04 = r11     // Catch:{ all -> 0x022b }
        L_0x01fe:
            int r5 = r6.width()     // Catch:{ all -> 0x022b }
            int r5 = r5 + r8
            int r4 = r6.height()     // Catch:{ all -> 0x022b }
            int r4 = r4 + r8
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x022b }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r4, r2)     // Catch:{ all -> 0x022b }
            r10.A01 = r4     // Catch:{ all -> 0x022b }
            if (r4 == 0) goto L_0x021b
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x022b }
            r2.<init>(r4)     // Catch:{ all -> 0x022b }
            r10.A02 = r2     // Catch:{ all -> 0x022b }
            goto L_0x0341
        L_0x021b:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x022b }
            r1.<init>(r0)     // Catch:{ all -> 0x022b }
            goto L_0x022a
        L_0x0223:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x022b }
            r1.<init>(r0)     // Catch:{ all -> 0x022b }
        L_0x022a:
            throw r1     // Catch:{ all -> 0x022b }
        L_0x022b:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0449 }
            goto L_0x0448
        L_0x022f:
            X.7gE r9 = X.C337367gE.A02     // Catch:{ all -> 0x0449 }
            java.lang.String r5 = r22.CCJ()     // Catch:{ all -> 0x0449 }
            r2 = 20
            java.lang.String r6 = r5.substring(r2)     // Catch:{ all -> 0x0449 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x0449 }
            java.lang.String r5 = "//"
            X.11S r2 = new X.11S     // Catch:{ all -> 0x0449 }
            r2.<init>(r5)     // Catch:{ all -> 0x0449 }
            java.util.List r5 = r2.A03(r6)     // Catch:{ all -> 0x0449 }
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch:{ all -> 0x0449 }
            java.lang.Object[] r5 = r5.toArray(r2)     // Catch:{ all -> 0x0449 }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ all -> 0x0449 }
            r2 = r5[r3]     // Catch:{ all -> 0x0449 }
            int r15 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0449 }
            r2 = 2
            r6 = r5[r2]     // Catch:{ all -> 0x0449 }
            java.lang.String r5 = ","
            X.11S r2 = new X.11S     // Catch:{ all -> 0x0449 }
            r2.<init>(r5)     // Catch:{ all -> 0x0449 }
            java.util.List r5 = r2.A03(r6)     // Catch:{ all -> 0x0449 }
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch:{ all -> 0x0449 }
            java.lang.Object[] r14 = r5.toArray(r2)     // Catch:{ all -> 0x0449 }
            java.lang.String[] r14 = (java.lang.String[]) r14     // Catch:{ all -> 0x0449 }
            monitor-enter(r9)     // Catch:{ all -> 0x0449 }
            android.util.DisplayMetrics r2 = X.0nA.A0H(r4)     // Catch:{ all -> 0x0440 }
            int r8 = r2.densityDpi     // Catch:{ all -> 0x0440 }
            java.lang.String r5 = "😀"
            X.33y r2 = X.C70572Rz.A00()     // Catch:{ all -> 0x0440 }
            android.graphics.Typeface r6 = r2.B76(r5)     // Catch:{ all -> 0x0440 }
            X.7gF r13 = X.C337367gE.A01     // Catch:{ all -> 0x0440 }
            android.graphics.Bitmap r2 = r13.A01     // Catch:{ all -> 0x0440 }
            if (r2 == 0) goto L_0x028e
            int r2 = r13.A00     // Catch:{ all -> 0x0440 }
            if (r2 != r8) goto L_0x028e
            if (r6 == 0) goto L_0x02c8
            android.graphics.Typeface r2 = r13.A04     // Catch:{ all -> 0x0440 }
            if (r2 == r6) goto L_0x02c8
        L_0x028e:
            android.content.res.Resources r5 = r4.getResources()     // Catch:{ all -> 0x0440 }
            r2 = 2131165266(0x7f070052, float:1.7944744E38)
            int r2 = r5.getDimensionPixelSize(r2)     // Catch:{ all -> 0x0440 }
            X.C337367gE.A00(r6, r13, r2, r8)     // Catch:{ all -> 0x0440 }
            r2 = 48
            float r2 = X.0nA.A04(r4, r2)     // Catch:{ all -> 0x0440 }
            int r5 = java.lang.Math.round(r2)     // Catch:{ all -> 0x0440 }
            r13.A00 = r8     // Catch:{ all -> 0x0440 }
            if (r6 == 0) goto L_0x02ac
            r13.A04 = r6     // Catch:{ all -> 0x0440 }
        L_0x02ac:
            int r4 = r15 * r5
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0440 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r2)     // Catch:{ all -> 0x0440 }
            r13.A01 = r4     // Catch:{ all -> 0x0440 }
            if (r4 == 0) goto L_0x02c0
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x0440 }
            r2.<init>(r4)     // Catch:{ all -> 0x0440 }
            r13.A02 = r2     // Catch:{ all -> 0x0440 }
            goto L_0x02c8
        L_0x02c0:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0440 }
            r0.<init>(r1)     // Catch:{ all -> 0x0440 }
            throw r0     // Catch:{ all -> 0x0440 }
        L_0x02c8:
            monitor-exit(r9)     // Catch:{ all -> 0x0449 }
            android.graphics.Bitmap r11 = r13.A01     // Catch:{ all -> 0x0449 }
            java.lang.String r10 = "Required value was null."
            if (r11 == 0) goto L_0x043a
            android.graphics.Rect r9 = r13.A03     // Catch:{ all -> 0x0449 }
            if (r9 == 0) goto L_0x0434
            r11.eraseColor(r7)     // Catch:{ all -> 0x0449 }
            int r8 = r11.getWidth()     // Catch:{ all -> 0x0449 }
            int r8 = r8 / r15
            int r19 = r11.getHeight()     // Catch:{ all -> 0x0449 }
            X.0qQ.A0B(r14, r7)     // Catch:{ all -> 0x0449 }
            int r2 = r14.length     // Catch:{ all -> 0x0449 }
            int r4 = r2 + -1
            X.2HY r2 = new X.2HY     // Catch:{ all -> 0x0449 }
            r2.<init>(r7, r4)     // Catch:{ all -> 0x0449 }
            java.util.Iterator r18 = r2.iterator()     // Catch:{ all -> 0x0449 }
        L_0x02ee:
            boolean r2 = r18.hasNext()     // Catch:{ all -> 0x0449 }
            if (r2 == 0) goto L_0x0381
            r2 = r18
            X.0sh r2 = (X.0sh) r2     // Catch:{ all -> 0x0449 }
            int r17 = r2.A00()     // Catch:{ all -> 0x0449 }
            android.text.TextPaint r5 = r13.A05     // Catch:{ all -> 0x0449 }
            if (r5 == 0) goto L_0x033a
            r4 = r14[r17]     // Catch:{ all -> 0x0449 }
            int r2 = r4.length()     // Catch:{ all -> 0x0449 }
            r5.getTextBounds(r4, r7, r2, r9)     // Catch:{ all -> 0x0449 }
            int r2 = r9.top     // Catch:{ all -> 0x0449 }
            int r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0449 }
            float r15 = (float) r2     // Catch:{ all -> 0x0449 }
            int r2 = r9.bottom     // Catch:{ all -> 0x0449 }
            float r4 = (float) r2     // Catch:{ all -> 0x0449 }
            int r2 = r8 * r17
            float r6 = (float) r2     // Catch:{ all -> 0x0449 }
            float r2 = (float) r8     // Catch:{ all -> 0x0449 }
            r16 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r16
            float r6 = r6 + r2
            r2 = r19
            float r5 = (float) r2     // Catch:{ all -> 0x0449 }
            float r5 = r5 / r16
            float r15 = r15 / r16
            float r5 = r5 + r15
            float r4 = r4 / r16
            float r5 = r5 - r4
            android.graphics.Canvas r2 = r13.A02     // Catch:{ all -> 0x0449 }
            r16 = r2
            if (r2 == 0) goto L_0x02ee
            r4 = r14[r17]     // Catch:{ all -> 0x0449 }
            android.text.TextPaint r2 = r13.A05     // Catch:{ all -> 0x0449 }
            if (r2 == 0) goto L_0x0443
            r15 = r4
            r4 = r16
            r4.drawText(r15, r6, r5, r2)     // Catch:{ all -> 0x0449 }
            goto L_0x02ee
        L_0x033a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0449 }
            r0.<init>(r10)     // Catch:{ all -> 0x0449 }
            goto L_0x0448
        L_0x0341:
            monitor-exit(r14)     // Catch:{ all -> 0x0449 }
            android.graphics.Bitmap r11 = r10.A01     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "Required value was null."
            if (r11 == 0) goto L_0x042e
            android.graphics.Rect r5 = r10.A03     // Catch:{ all -> 0x0449 }
            if (r5 == 0) goto L_0x0428
            r11.eraseColor(r7)     // Catch:{ all -> 0x0449 }
            android.text.TextPaint r4 = r10.A05     // Catch:{ all -> 0x0449 }
            if (r4 == 0) goto L_0x035a
            int r2 = r9.length()     // Catch:{ all -> 0x0449 }
            r4.getTextBounds(r9, r7, r2, r5)     // Catch:{ all -> 0x0449 }
        L_0x035a:
            int r2 = r5.top     // Catch:{ all -> 0x0449 }
            int r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0449 }
            float r14 = (float) r2     // Catch:{ all -> 0x0449 }
            int r2 = r5.bottom     // Catch:{ all -> 0x0449 }
            float r13 = (float) r2     // Catch:{ all -> 0x0449 }
            int r2 = r11.getWidth()     // Catch:{ all -> 0x0449 }
            float r6 = (float) r2     // Catch:{ all -> 0x0449 }
            r4 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r4
            int r2 = r11.getHeight()     // Catch:{ all -> 0x0449 }
            float r5 = (float) r2     // Catch:{ all -> 0x0449 }
            float r5 = r5 / r4
            float r14 = r14 / r4
            float r5 = r5 + r14
            float r13 = r13 / r4
            float r5 = r5 - r13
            android.graphics.Canvas r4 = r10.A02     // Catch:{ all -> 0x0449 }
            if (r4 == 0) goto L_0x0381
            android.text.TextPaint r2 = r10.A05     // Catch:{ all -> 0x0449 }
            if (r2 == 0) goto L_0x0422
            r4.drawText(r9, r6, r5, r2)     // Catch:{ all -> 0x0449 }
        L_0x0381:
            X.1JI r2 = r23.A00()     // Catch:{ all -> 0x0449 }
            X.2ic r4 = r2.AR2(r12)     // Catch:{ all -> 0x0449 }
            java.lang.Object r2 = r4.A00     // Catch:{ all -> 0x0449 }
            if (r2 == 0) goto L_0x039d
            java.lang.Object r5 = r4.A00()     // Catch:{ all -> 0x0449 }
            X.3Ey r5 = (X.AnonymousClass3Ey) r5     // Catch:{ all -> 0x0449 }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0449 }
            r2 = 75
            X.0fO.A02(r4, r11, r5, r2)     // Catch:{ all -> 0x0449 }
            r5.A03()     // Catch:{ all -> 0x0449 }
        L_0x039d:
            monitor-exit(r20)
            r2 = r23
            X.1Nw r2 = r2.A03
            X.2iZ r6 = r2.A00()
            r5 = 0
            X.2ic r8 = new X.2ic     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            r8.<init>()     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            X.1JI r2 = r23.A00()     // Catch:{ all -> 0x0405 }
            X.2ic r8 = r2.AX8(r12)     // Catch:{ all -> 0x0405 }
            java.lang.Object r2 = r8.A00     // Catch:{ all -> 0x0405 }
            if (r2 == 0) goto L_0x0415
            java.lang.Object r2 = r8.A00()     // Catch:{ all -> 0x0405 }
            X.2jb r2 = (X.C227602jb) r2     // Catch:{ all -> 0x0405 }
            r6.A02(r2)     // Catch:{ all -> 0x0405 }
            r6.A01 = r3     // Catch:{ all -> 0x0405 }
            java.lang.Object r2 = r8.A00()     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            com.google.common.io.Closeables.A01(r2)     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            r2 = r23
            X.1NK r2 = r2.A04     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            X.1Mn r9 = r2.A0J     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            java.lang.Object r2 = r22.AjH()     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            com.instagram.common.typedurl.ImageCacheKey r2 = (com.instagram.common.typedurl.ImageCacheKey) r2     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            java.lang.String r8 = r2.A03     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            java.lang.String r12 = r22.Aqe()     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            byte[] r4 = r6.A02     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            int r2 = r6.A00     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            java.lang.String r14 = r22.CCJ()     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            r19 = -1
            r10 = r5
            r11 = r8
            r13 = r21
            r15 = r4
            r16 = r5
            r17 = r3
            r18 = r2
            r20 = r7
            X.2l6 r2 = r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            if (r2 == 0) goto L_0x0415
            android.graphics.Bitmap r7 = r2.A02     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            java.lang.String r4 = r2.A04     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            X.2l8 r2 = new X.2l8     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            r2.<init>(r7, r4)     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            goto L_0x0414
        L_0x0405:
            r4 = move-exception
            java.lang.Object r2 = r8.A00     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            if (r2 == 0) goto L_0x0413
            java.lang.Object r2 = r8.A00()     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ IOException -> 0x0415, all -> 0x041d }
            com.google.common.io.Closeables.A01(r2)     // Catch:{ IOException -> 0x0415, all -> 0x041d }
        L_0x0413:
            throw r4     // Catch:{ IOException -> 0x0415, all -> 0x041d }
        L_0x0414:
            r5 = r2
        L_0x0415:
            r6.A01()
            r0.A07 = r5
            if (r5 == 0) goto L_0x04a3
            goto L_0x048e
        L_0x041d:
            r0 = move-exception
            r6.A01()
            throw r0
        L_0x0422:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0449 }
            r0.<init>(r8)     // Catch:{ all -> 0x0449 }
            goto L_0x0448
        L_0x0428:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0449 }
            r0.<init>(r8)     // Catch:{ all -> 0x0449 }
            goto L_0x0448
        L_0x042e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0449 }
            r0.<init>(r8)     // Catch:{ all -> 0x0449 }
            goto L_0x0448
        L_0x0434:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0449 }
            r0.<init>(r10)     // Catch:{ all -> 0x0449 }
            goto L_0x0448
        L_0x043a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0449 }
            r0.<init>(r10)     // Catch:{ all -> 0x0449 }
            goto L_0x0448
        L_0x0440:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0449 }
            goto L_0x0448
        L_0x0443:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0449 }
            r0.<init>(r10)     // Catch:{ all -> 0x0449 }
        L_0x0448:
            throw r0     // Catch:{ all -> 0x0449 }
        L_0x0449:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        L_0x044c:
            X.AnonymousClass2iL.A05(r0)
            return
        L_0x0450:
            X.AnonymousClass2iL.A06(r0)
            return
        L_0x0454:
            java.util.Set r3 = r1.A0P
            java.lang.String r2 = "undefined"
            java.lang.String r1 = "UNKNOWN"
            X.AnonymousClass2iL.A09(r0, r2, r1, r3)
            return
        L_0x045e:
            com.instagram.common.typedurl.ImageUrl r4 = r0.A0L
            java.lang.String r3 = r4.CCJ()
            r2 = 9
            java.lang.String r8 = r3.substring(r2)
            android.content.Context r5 = r1.A0C
            X.1Nu r6 = r1.A0F
            java.lang.Object r7 = r4.AjH()
            com.instagram.common.typedurl.ImageCacheKey r7 = (com.instagram.common.typedurl.ImageCacheKey) r7
            int r10 = r0.A0T
            java.lang.String r9 = r0.A0N
            int r3 = r0.A03
            r2 = 0
            if (r3 <= 0) goto L_0x047e
            r2 = 1
        L_0x047e:
            r3 = 1
            r11 = r2 ^ 1
            X.499 r4 = new X.499
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.2l8 r5 = r4.A00()
            r0.A07 = r5
            if (r5 == 0) goto L_0x04a3
        L_0x048e:
            android.graphics.Bitmap r2 = r5.A00
            if (r2 == 0) goto L_0x04a3
        L_0x0492:
            r0.A0F = r3
            java.util.Set r4 = r1.A0P
            if (r3 == 0) goto L_0x04a0
            java.lang.String r2 = "SUCCESS"
        L_0x049a:
            java.lang.String r1 = "undefined"
            X.AnonymousClass2iL.A09(r0, r1, r2, r4)
            return
        L_0x04a0:
            java.lang.String r2 = "FAIL"
            goto L_0x049a
        L_0x04a3:
            r3 = 0
            goto L_0x0492
        L_0x04a5:
            r2 = 1
            r0.A0F = r2
            java.util.Set r2 = r1.A0P
            java.lang.String r1 = "SUCCESS"
            X.AnonymousClass2iL.A09(r0, r4, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227022iU.run():void");
    }
}
