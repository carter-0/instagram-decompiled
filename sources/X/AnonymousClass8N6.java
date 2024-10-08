package X;

/* renamed from: X.8N6  reason: invalid class name */
public final class AnonymousClass8N6 extends C321016tR {
    /* JADX WARNING: type inference failed for: r7v2, types: [X.9WP, android.graphics.drawable.BitmapDrawable] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8N6(android.content.Context r16, android.content.res.Resources.Theme r17, com.instagram.common.session.UserSession r18, X.C317966o8 r19, X.C321086tY r20) {
        /*
            r15 = this;
            r0 = 1
            r5 = r16
            X.0qQ.A0B(r5, r0)
            r0 = 2
            r8 = r18
            X.0qQ.A0B(r8, r0)
            r0 = 3
            r4 = r19
            X.0qQ.A0B(r4, r0)
            java.lang.String r12 = r4.A0S
            X.0qQ.A07(r12)
            com.instagram.common.typedurl.ImageUrl r0 = r4.A0H
            if (r0 != 0) goto L_0x0088
            java.lang.String r13 = ""
        L_0x001d:
            int r0 = r4.A09
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.String r14 = r4.A0c
            float r1 = r4.A01
            float r0 = r4.A00
            float r3 = r1 / r0
            int r2 = (int) r1
            int r1 = (int) r0
            r0 = 240(0xf0, float:3.36E-43)
            X.6tX r10 = X.C321066tW.A00(r3, r2, r1, r0)
            java.util.List r0 = r4.A0o
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            X.0qQ.A07(r0)
            java.lang.Object r1 = X.00k.A0J(r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x0086
            android.content.res.Resources r0 = r5.getResources()
            X.0qQ.A07(r0)
            r3 = 2
            X.9WP r7 = new X.9WP
            r7.<init>(r0, r1)
            r0 = 200(0xc8, float:2.8E-43)
            r7.A00 = r0
            int[] r0 = new int[r3]
            r0 = {128, 200} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r2.setDuration(r0)
            r2.setRepeatMode(r3)
            r0 = -1
            r2.setRepeatCount(r0)
            X.AJO r0 = new X.AJO
            r0.<init>(r7)
            r2.addUpdateListener(r0)
            r2.start()
        L_0x007d:
            r4 = r15
            r6 = r17
            r9 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0086:
            r7 = 0
            goto L_0x007d
        L_0x0088:
            com.instagram.common.typedurl.ImageUrl r0 = X.C226972iH.A00(r0)
            java.lang.String r13 = r0.getUrl()
            X.0qQ.A07(r13)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8N6.<init>(android.content.Context, android.content.res.Resources$Theme, com.instagram.common.session.UserSession, X.6o8, X.6tY):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8N6(android.content.Context r27, android.content.res.Resources.Theme r28, android.graphics.drawable.Drawable r29, com.instagram.common.session.UserSession r30, X.C321086tY r31, X.C321076tX r32, java.lang.Integer r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            r26 = this;
            X.6oG r9 = X.C318046oG.CUTOUT_VIDEO
            r5 = r27
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r3 = (float) r0
            r4 = r28
            if (r28 != 0) goto L_0x0059
            r0 = 2131099902(0x7f0600fe, float:1.781217E38)
        L_0x0017:
            int r21 = r5.getColor(r0)
            if (r28 != 0) goto L_0x004a
            r0 = 2131100179(0x7f060213, float:1.7812732E38)
        L_0x0020:
            int r22 = r5.getColor(r0)
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            r8 = 0
            r23 = 0
            r24 = 1
            r4 = r26
            r6 = r29
            r7 = r30
            r10 = r31
            r11 = r32
            r13 = r33
            r16 = r34
            r15 = r35
            r18 = r36
            r12 = r8
            r17 = r8
            r19 = r8
            r20 = r3
            r25 = r24
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        L_0x004a:
            r2 = 2130970878(0x7f0408fe, float:1.7550479E38)
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = 1
            r4.resolveAttribute(r2, r1, r0)
            int r0 = r1.resourceId
            goto L_0x0020
        L_0x0059:
            r2 = 2130970875(0x7f0408fb, float:1.7550472E38)
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = 1
            r4.resolveAttribute(r2, r1, r0)
            int r0 = r1.resourceId
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8N6.<init>(android.content.Context, android.content.res.Resources$Theme, android.graphics.drawable.Drawable, com.instagram.common.session.UserSession, X.6tY, X.6tX, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8N6(android.content.Context r12, android.content.res.Resources.Theme r13, com.instagram.common.session.UserSession r14, java.lang.String r15, java.lang.String r16, int r17, int r18) {
        /*
            r11 = this;
            r0 = 2
            r4 = r14
            X.0qQ.A0B(r14, r0)
            r0 = 3
            r8 = r15
            X.0qQ.A0B(r15, r0)
            r0 = 4
            r9 = r16
            X.0qQ.A0B(r9, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1
            r3 = r17
            r2 = r18
            X.6tX r6 = X.C321066tW.A00(r1, r3, r2, r0)
            r3 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r3
            r7 = r3
            r10 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8N6.<init>(android.content.Context, android.content.res.Resources$Theme, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, int, int):void");
    }
}
