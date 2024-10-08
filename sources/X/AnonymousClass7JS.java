package X;

import android.view.View;

/* renamed from: X.7JS  reason: invalid class name */
public final class AnonymousClass7JS implements View.OnTouchListener {
    public final int[] A00 = new int[2];
    public final int[] A01 = new int[2];
    public final /* synthetic */ AnonymousClass7JI A02;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r1 != 3) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x026f, code lost:
        if (r10 < 750) goto L_0x0271;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r18, android.view.MotionEvent r19) {
        /*
            r17 = this;
            r7 = 0
            r5 = r18
            X.0qQ.A0B(r5, r7)
            r6 = 1
            r3 = r19
            X.0qQ.A0B(r3, r6)
            int r1 = r3.getAction()
            r4 = r17
            if (r1 == 0) goto L_0x02b7
            if (r1 == r6) goto L_0x0223
            r14 = 2
            if (r1 == r14) goto L_0x002c
            r0 = 3
            if (r1 == r0) goto L_0x0223
        L_0x001c:
            X.7JI r0 = r4.A02
            android.view.GestureDetector r0 = r0.A06
            if (r0 != 0) goto L_0x02ed
            java.lang.String r0 = "gestureDetector"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002c:
            X.7JI r2 = r4.A02
            android.graphics.RectF r0 = r2.A03
            if (r0 == 0) goto L_0x0187
            X.0eM r0 = r2.A0V
            java.lang.Object r0 = r0.getValue()
            X.Pvn r0 = (X.C74493Pvn) r0
            boolean r0 = r0.isRecording()
            if (r0 == 0) goto L_0x0187
            X.7JE r0 = r2.A0R
            X.2eb r13 = r0.A04
            android.view.View r1 = r13.A01()
            X.0qQ.A07(r1)
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            boolean r8 = r2.A0W
            if (r8 != 0) goto L_0x0065
            float r9 = r3.getRawX()
            int[] r0 = r4.A01
            r0 = r0[r7]
            float r0 = (float) r0
            float r9 = r9 - r0
            int r0 = r1.getWidth()
            int r0 = r0 / r14
            float r0 = (float) r0
            float r9 = r9 - r0
            r1.setX(r9)
        L_0x0065:
            float r0 = r3.getY()
            r11 = 0
            float r9 = java.lang.Math.min(r0, r11)
            r0 = 1082130432(0x40800000, float:4.0)
            float r9 = r9 / r0
            if (r8 != 0) goto L_0x007a
            int r0 = r2.A01
            float r0 = (float) r0
            float r0 = r0 + r9
            r1.setTranslationY(r0)
        L_0x007a:
            boolean r0 = X.2Y9.A00
            if (r0 == 0) goto L_0x0084
            X.AnonymousClass7JI.A03(r1, r2)
            r2.A0F()
        L_0x0084:
            android.graphics.RectF r0 = r2.A04
            if (r0 == 0) goto L_0x021f
            float r8 = r3.getRawY()
            float r1 = r0.bottom
            int r0 = r2.A00
            float r0 = (float) r0
            float r1 = r1 - r0
            float r1 = r1 + r9
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x021f
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
        L_0x0099:
            java.lang.Integer r0 = r2.A0E
            if (r0 == r1) goto L_0x00a7
            r2.A0E = r1
            X.AnonymousClass7JI.A08(r2)
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A03()
        L_0x00a7:
            float r1 = r3.getRawX()
            int[] r0 = r4.A00
            r0 = r0[r7]
            float r0 = (float) r0
            float r1 = r1 - r0
            float r0 = r3.getRawY()
            boolean r1 = X.AnonymousClass7JI.A0C(r2, r1, r0)
            boolean r0 = r2.A0G
            if (r0 == r1) goto L_0x0187
            r2.A0G = r1
            X.7OK r8 = X.AnonymousClass7JI.A01(r2)
            android.view.View r15 = r2.A08
            if (r15 == 0) goto L_0x0182
            android.widget.ImageView r12 = r2.A0B
            if (r12 == 0) goto L_0x0182
            android.graphics.RectF r0 = r2.A05
            if (r0 == 0) goto L_0x0182
            boolean r9 = r2.A0G
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.2S0 r1 = X.AnonymousClass2S0.A01
            if (r9 == 0) goto L_0x018c
            r1.A03()
            android.graphics.drawable.Drawable r1 = r8.A05
            r12.setBackground(r1)
            int r1 = r8.A01
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r1)
            r12.setColorFilter(r1)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.5nL r9 = X.C294975nL.A01(r15, r7)
            r9.A0G()
            r9.A04 = r7
            float r1 = r0.centerX()
            r16 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r16
            r9.A0P(r11, r1)
            int r1 = r15.getHeight()
            int r1 = r1 / r14
            float r1 = (float) r1
            r9.A0Q(r11, r1)
            X.5nL r1 = r9.A0F(r6)
            r1.A0H()
            java.lang.Integer r1 = r2.A0U
            if (r1 != r8) goto L_0x011c
            android.view.View r8 = r2.A07
            if (r8 == 0) goto L_0x011c
            r1 = 1060320051(0x3f333333, float:0.7)
            r8.setAlpha(r1)
        L_0x011c:
            android.view.View r1 = r13.A01()
            X.0qQ.A07(r1)
            X.5nL r8 = X.C294975nL.A01(r1, r7)
            r8.A0G()
            r8.A04 = r7
            r8.A0P(r11, r10)
            r8.A0Q(r11, r10)
            float r1 = r0.centerX()
            r8.A0J(r1)
            float r0 = r0.centerY()
            r8.A0K(r0)
            r0 = 8
            r8.A03 = r0
            X.5nL r0 = r8.A0F(r6)
            r0.A0H()
            X.5nL r8 = X.C294975nL.A01(r12, r7)
            r8.A0G()
            r8.A04 = r7
            r0 = 1068708659(0x3fb33333, float:1.4)
            r8.A0P(r0, r10)
            r8.A0Q(r0, r10)
            float r1 = r12.getRotation()
            r0 = -1054867456(0xffffffffc1200000, float:-10.0)
            r8.A0O(r1, r0)
            X.5nL r0 = r8.A0F(r6)
            r0.A0H()
            android.widget.TextView r7 = r2.A0C
            if (r7 == 0) goto L_0x0177
            r0 = 2131960729(0x7f132399, float:1.9558135E38)
        L_0x0174:
            r7.setText(r0)
        L_0x0177:
            android.widget.TextView r1 = r2.A0C
            if (r1 == 0) goto L_0x0182
            java.lang.CharSequence r0 = r1.getText()
            r1.announceForAccessibility(r0)
        L_0x0182:
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A03()
        L_0x0187:
            r5.setPressed(r6)
            goto L_0x001c
        L_0x018c:
            r1.A03()
            android.graphics.drawable.Drawable r1 = r8.A07
            r12.setBackground(r1)
            int r1 = r8.A03
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r1)
            r12.setColorFilter(r1)
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r8 = 1065353216(0x3f800000, float:1.0)
            X.5nL r1 = X.C294975nL.A01(r15, r7)
            r1.A0G()
            r1.A04 = r7
            float r0 = r0.centerX()
            r16 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r16
            r1.A0P(r8, r0)
            int r0 = r15.getHeight()
            int r0 = r0 / r14
            float r0 = (float) r0
            r1.A0Q(r8, r0)
            X.5nL r0 = r1.A0F(r6)
            r0.A0H()
            java.lang.Integer r1 = r2.A0E
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x01e7
            android.view.View r0 = r13.A01()
            X.0qQ.A07(r0)
            X.5nL r1 = X.C294975nL.A01(r0, r7)
            r1.A0G()
            r1.A04 = r7
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r1.A0Q(r0, r10)
            r1.A0P(r0, r10)
            r1.A0H()
        L_0x01e7:
            X.5nL r1 = X.C294975nL.A01(r12, r7)
            r1.A0G()
            r1.A04 = r7
            r1.A0P(r8, r10)
            r1.A0Q(r8, r10)
            float r0 = r12.getRotation()
            r1.A0O(r0, r11)
            X.5nL r0 = r1.A0F(r6)
            r0.A0H()
            java.lang.Integer r0 = r2.A0U
            if (r0 != r9) goto L_0x020f
            android.view.View r0 = r2.A07
            if (r0 == 0) goto L_0x020f
            r0.setAlpha(r8)
        L_0x020f:
            android.widget.TextView r7 = r2.A0C
            if (r7 == 0) goto L_0x0177
            boolean r1 = r2.A0X
            r0 = 2131960731(0x7f13239b, float:1.9558139E38)
            if (r1 == 0) goto L_0x0174
            r0 = 2131960732(0x7f13239c, float:1.955814E38)
            goto L_0x0174
        L_0x021f:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0099
        L_0x0223:
            X.7JI r8 = r4.A02
            r8.A0I = r7
            java.lang.Integer r1 = r8.A0E
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0245
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0245
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0240
            boolean r0 = r5.isPressed()
            if (r0 == 0) goto L_0x0240
            r8.A0H = r7
            X.AnonymousClass7JI.A05(r8)
        L_0x0240:
            r5.setPressed(r7)
            goto L_0x001c
        L_0x0245:
            X.7JE r0 = r8.A0R
            X.2eb r1 = r0.A04
            r0 = 8
            r1.A03(r0)
            boolean r0 = r8.A0G
            if (r0 != 0) goto L_0x02a6
            java.lang.Integer r0 = r8.A0E
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            if (r0 == r9) goto L_0x0271
            android.widget.Chronometer r0 = r8.A09
            if (r0 == 0) goto L_0x02a6
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0.getBase()
            long r10 = r10 - r0
            r1 = 1
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x02a6
            r1 = 750(0x2ee, double:3.705E-321)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a6
        L_0x0271:
            android.widget.TextView r1 = r8.A0C
            if (r1 == 0) goto L_0x027b
            r0 = 2131960733(0x7f13239d, float:1.9558143E38)
            r1.setText(r0)
        L_0x027b:
            X.AnonymousClass7JI.A07(r8)
            android.widget.Chronometer r0 = r8.A09
            if (r0 == 0) goto L_0x0285
            r0.setKeepScreenOn(r6)
        L_0x0285:
            java.lang.Integer r0 = r8.A0E
            if (r0 != r9) goto L_0x0240
            X.7GP r0 = r8.A0S
            X.NmJ r6 = X.C69475NmJ.LOCK
            X.0wc r2 = r0.A00
            java.lang.String r1 = "audio_clips_start_recording_click"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0240
            java.lang.String r0 = "source_click_category"
            r1.A8M(r6, r0)
            r1.Cgf()
            goto L_0x0240
        L_0x02a6:
            X.7JG r0 = r8.A0Q
            r0.Dzp()
            X.0eM r0 = r8.A0V
            java.lang.Object r0 = r0.getValue()
            X.Pvn r0 = (X.C74493Pvn) r0
            r0.EyI(r7)
            goto L_0x0240
        L_0x02b7:
            X.7JI r2 = r4.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A0E = r0
            X.7JE r0 = r2.A0R
            android.widget.FrameLayout r1 = r0.A03
            if (r1 == 0) goto L_0x02c8
            int[] r0 = r4.A01
            r1.getLocationOnScreen(r0)
        L_0x02c8:
            android.content.Context r1 = r2.A0L
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r0 = X.0mE.A00(r1, r0)
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x02e1
            android.view.Window r0 = r0.getWindow()
            android.view.View r1 = r0.getDecorView()
            int[] r0 = r4.A00
            r1.getLocationOnScreen(r0)
        L_0x02e1:
            r5.setPressed(r6)
            X.7JG r1 = r2.A0Q
            int r0 = r2.A0K
            r1.Dzl(r0)
            goto L_0x001c
        L_0x02ed:
            boolean r0 = r0.onTouchEvent(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JS.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public AnonymousClass7JS(AnonymousClass7JI r3) {
        this.A02 = r3;
    }
}
