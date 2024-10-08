package X;

import android.view.View;

/* renamed from: X.8bW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C358818bW implements View.OnFocusChangeListener {
    public final /* synthetic */ C358368an A00;

    public /* synthetic */ C358818bW(C358368an r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0110, code lost:
        if (r2 == 0) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0133, code lost:
        if (r6.A00() == ((X.AnonymousClass91c) r8).A0X()) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014f, code lost:
        if (r7 != r6) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.A0Z != false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0157, code lost:
        if (r2 != false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d0, code lost:
        if (X.182.A06(X.0Tu.A06, r5, 36320043047067544L) == false) goto L_0x01d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFocusChange(android.view.View r50, boolean r51) {
        /*
            r49 = this;
            r0 = r49
            X.8an r0 = r0.A00
            boolean r13 = r0.A0f
            if (r13 == 0) goto L_0x000d
            boolean r2 = r0.A0Z
            r1 = 1
            if (r2 == 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            if (r51 == 0) goto L_0x006c
            com.instagram.common.session.UserSession r1 = r0.A1J
            X.8A2 r1 = X.AnonymousClass8A1.A01(r1)
            X.28D r5 = r0.A1H
            X.4yO r2 = X.C358368an.A01(r0)
            java.lang.String r3 = r2.A02
            X.82p r2 = r0.A1Q
            X.82o r2 = r2.A02
            X.8nd r2 = r2.A01()
            java.lang.String r2 = r2.toString()
            r12 = 0
            X.0qQ.A0B(r5, r12)
            r18 = 1
            r4 = 2
            X.0qQ.A0B(r2, r4)
            X.29E r6 = r1.A0K
            r7 = 0
            r9 = 17643726(0x10d38ce, float:2.5938365E-38)
            r10 = 600000(0x927c0, double:2.964394E-318)
            r8 = r7
            long r8 = r6.A04(r7, r8, r9, r10)
            r1.A04 = r8
            java.lang.String r11 = r5.name()
            java.lang.String r10 = "entry_point"
            r7 = r6
            r7.A0B(r8, r10, r11, r12)
            long r14 = r1.A04
            java.lang.String r16 = "camera_destination"
            r13 = r6
            r17 = r3
            r13.A0B(r14, r16, r17, r18)
            long r3 = r1.A04
            java.lang.String r8 = "media_type"
            r5 = r6
            r6 = r3
            r9 = r2
            r10 = r12
            r5.A0B(r6, r8, r9, r10)
            X.8MG r1 = r0.A1X
            r1.DmS()
            r0.A0V()
        L_0x006b:
            return
        L_0x006c:
            if (r1 != 0) goto L_0x006b
            com.instagram.common.session.UserSession r5 = r0.A1J
            X.8A2 r7 = X.AnonymousClass8A1.A01(r5)
            X.28D r9 = r0.A1H
            X.4yO r1 = X.C358368an.A01(r0)
            java.lang.String r8 = r1.A02
            X.82p r1 = r0.A1Q
            X.82o r1 = r1.A02
            X.8nd r1 = r1.A01()
            java.lang.String r6 = r1.toString()
            r4 = 0
            X.0qQ.A0B(r9, r4)
            r12 = 1
            r1 = 2
            X.0qQ.A0B(r6, r1)
            X.29E r14 = r7.A0K
            r1 = 0
            r17 = 17636030(0x10d1abe, float:2.5916796E-38)
            r18 = 12000(0x2ee0, double:5.929E-320)
            r15 = r1
            r16 = r1
            long r2 = r14.A04(r15, r16, r17, r18)
            r7.A00 = r2
            java.lang.String r22 = r9.name()
            java.lang.String r21 = "entry_point"
            r18 = r14
            r19 = r2
            r23 = r4
            r18.A0B(r19, r21, r22, r23)
            long r2 = r7.A00
            java.lang.String r21 = "camera_destination"
            r19 = r2
            r22 = r8
            r23 = r12
            r18.A0B(r19, r21, r22, r23)
            long r2 = r7.A00
            java.lang.String r21 = "media_type"
            r19 = r2
            r22 = r6
            r23 = r4
            r18.A0B(r19, r21, r22, r23)
            com.instagram.ui.text.ConstrainedEditText r3 = r0.A1j
            android.text.Editable r6 = r3.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x03de
            java.lang.String r2 = r6.toString()
            java.lang.String r2 = r2.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x03de
            X.6if r2 = r0.A1g
            r48 = r2
            java.lang.Object r2 = r48.get()
            X.8f8 r2 = (X.C360778f8) r2
            X.8bb r9 = r2.A07()
            X.6Ly r8 = r0.A0L
            r16 = 0
            if (r8 != 0) goto L_0x00fb
            r16 = 1
        L_0x00fb:
            boolean r10 = r8 instanceof X.AnonymousClass91c
            boolean r2 = X.C358368an.A0Q(r0)
            if (r2 == 0) goto L_0x03ce
            X.6if r2 = r0.A1b
            if (r2 == 0) goto L_0x0112
            java.lang.Object r2 = r2.get()
            X.7zW r2 = (X.C349057zW) r2
            int r2 = r2.A00
        L_0x010f:
            r11 = 1
            if (r2 != 0) goto L_0x0113
        L_0x0112:
            r11 = 0
        L_0x0113:
            boolean r2 = X.C358368an.A0Q(r0)
            if (r2 == 0) goto L_0x0135
            X.6if r2 = r0.A1b
            if (r2 == 0) goto L_0x0135
            java.lang.Object r6 = r2.get()
            X.7zW r6 = (X.C349057zW) r6
            boolean r2 = r8 instanceof X.AnonymousClass91c
            if (r2 == 0) goto L_0x0135
            X.8f3 r6 = r6.A00()
            r2 = r8
            X.91c r2 = (X.AnonymousClass91c) r2
            X.8f3 r2 = r2.A0X()
            r14 = 1
            if (r6 != r2) goto L_0x0136
        L_0x0135:
            r14 = 0
        L_0x0136:
            boolean r2 = X.C358368an.A0R(r0)
            if (r2 == 0) goto L_0x0151
            if (r8 == 0) goto L_0x0151
            X.6if r2 = r0.A1e
            if (r2 == 0) goto L_0x0151
            java.lang.Object r2 = r2.get()
            X.7zg r2 = (X.C349157zg) r2
            X.6Lz r7 = r8.A0I
            X.6Lz r6 = r2.A00()
            r2 = 1
            if (r7 != r6) goto L_0x0152
        L_0x0151:
            r2 = 0
        L_0x0152:
            if (r11 != r10) goto L_0x0159
            if (r14 != 0) goto L_0x0159
            r15 = 0
            if (r2 == 0) goto L_0x015a
        L_0x0159:
            r15 = 1
        L_0x015a:
            if (r16 != 0) goto L_0x015e
            if (r15 == 0) goto L_0x016e
        L_0x015e:
            X.6Ly r7 = X.C358368an.A03(r0, r9)
            if (r8 == 0) goto L_0x03ca
            java.lang.Integer r6 = r8.A0M
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r6 != r2) goto L_0x03ca
        L_0x016a:
            r7.A0M = r2
            r0.A0L = r7
        L_0x016e:
            X.6Ly r8 = r0.A0L
            r8.getClass()
            X.8MG r7 = r0.A1X
            r7.CnB(r8)
            boolean r2 = r8 instanceof X.AnonymousClass9UM
            if (r2 == 0) goto L_0x0186
            r6 = r8
            X.9UM r6 = (X.AnonymousClass9UM) r6
            java.lang.Integer r2 = r0.A0R
            X.0qQ.A0B(r2, r4)
            r6.A01 = r2
        L_0x0186:
            r0.A0e(r8)
            java.lang.Object r2 = r48.get()
            X.8f8 r2 = (X.C360778f8) r2
            X.8bb r14 = r2.A07()
            android.text.Editable r11 = r3.getText()
            float r2 = r3.getTextSize()
            android.content.Context r6 = r0.A0q
            float r10 = X.C39815AAm.A00(r6, r11, r14, r8, r2)
            float r2 = X.C39815AAm.A01(r6, r11, r14, r8, r2)
            r8.A0C(r10, r2)
            X.AnonymousClass9UR.A02(r6, r3)
            if (r16 == 0) goto L_0x03b7
            boolean r2 = r8 instanceof X.AnonymousClass91c
            r24 = 0
            r23 = 0
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            X.8bi r9 = r9.A06
            float r14 = r9.A02
            r40 = r2 ^ 1
            X.4yO r9 = X.C358368an.A01(r0)
            boolean r9 = r9 instanceof X.AnonymousClass80O
            if (r9 == 0) goto L_0x01d2
            X.0Tu r11 = X.0Tu.A06
            r9 = 36320043047067544(0x8108e3000c1f98, double:3.0322796998155424E-306)
            boolean r9 = X.182.A06(r11, r5, r9)
            r38 = 1
            if (r9 != 0) goto L_0x01d4
        L_0x01d2:
            r38 = 0
        L_0x01d4:
            java.util.List r9 = r0.A0W
            if (r9 == 0) goto L_0x03b3
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x03b3
            java.lang.String r9 = "sticky_text_drawable_tag"
        L_0x01e0:
            r33 = 0
            if (r2 == 0) goto L_0x01e6
            r33 = 1
        L_0x01e6:
            java.lang.Integer r2 = r0.A0Q
            if (r2 == 0) goto L_0x01ee
            r23 = r2
            r0.A0Q = r1
        L_0x01ee:
            java.lang.Integer r2 = r0.A0P
            if (r2 == 0) goto L_0x01f6
            r24 = r2
            r0.A0P = r1
        L_0x01f6:
            r28 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.6b1 r2 = new X.6b1
            r19 = r1
            r20 = r1
            r21 = r1
            r25 = r9
            r26 = r1
            r27 = r1
            r29 = r14
            r30 = r28
            r31 = r28
            r32 = r28
            r34 = r12
            r35 = r4
            r36 = r12
            r37 = r12
            r39 = r4
            r41 = r12
            r42 = r12
            r43 = r12
            r44 = r12
            r45 = r12
            r46 = r4
            r47 = r4
            r18 = r2
            r18.<init>((X.AnonymousClass8BH) r19, (X.AnonymousClass8DA) r20, (X.C3510487j) r21, (java.lang.Integer) r22, (java.lang.Integer) r23, (java.lang.Integer) r24, (java.lang.Object) r25, (java.lang.String) r26, (java.util.List) r27, (float) r28, (float) r29, (float) r30, (float) r31, (float) r32, (int) r33, (boolean) r34, (boolean) r35, (boolean) r36, (boolean) r37, (boolean) r38, (boolean) r39, (boolean) r40, (boolean) r41, (boolean) r42, (boolean) r43, (boolean) r44, (boolean) r45, (boolean) r46, (boolean) r47)
            r7.AAQ(r8, r2)
        L_0x022e:
            X.6if r2 = r0.A1Z
            java.lang.Object r2 = r2.get()
            X.91a r2 = (X.AnonymousClass91a) r2
            java.lang.Integer r10 = r2.A00
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r9 = r0.A1n
            java.util.Map r2 = r0.A1q
            X.AnonymousClass9UR.A09(r3, r8, r9, r10, r2)
            android.text.StaticLayout r14 = r8.A0G
            if (r14 == 0) goto L_0x0256
            android.text.Spannable r11 = r8.A0F
            android.text.TextPaint r2 = r8.A0b
            float r10 = r2.getTextSize()
            android.text.Layout$Alignment r3 = r8.A0E
            X.9UN r2 = X.AnonymousClass9UV.A00
            java.lang.Integer r2 = r2.A00(r3)
            X.AnonymousClass9UR.A03(r14, r11, r2, r10)
        L_0x0256:
            int r10 = r9.getActiveDrawableId()
            r2 = -1
            if (r10 == r2) goto L_0x02ed
            X.8un r3 = r9.A0N(r10)
            java.util.Map r11 = r0.A1r
            X.6Ly r2 = r0.A0L
            java.lang.Object r2 = r11.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            r14 = 1
            if (r3 == 0) goto L_0x027b
            if (r2 == 0) goto L_0x027b
            float r3 = r3.A06
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x027b
            r14 = 0
        L_0x027b:
            java.lang.Object r2 = r48.get()
            X.8f8 r2 = (X.C360778f8) r2
            X.8bb r3 = r2.A07()
            if (r14 == 0) goto L_0x02be
            X.0qQ.A0B(r6, r12)
            android.content.res.Resources r15 = r6.getResources()
            int r14 = X.AnonymousClass8XF.A00(r6)
            r2 = 2131165270(0x7f070056, float:1.7944752E38)
            int r2 = r15.getDimensionPixelSize(r2)
            int r2 = r2 * 2
            int r14 = r14 - r2
            X.6Ly r2 = r0.A0L
            r2.getClass()
            int r2 = r2.A06
            r15 = 1065353216(0x3f800000, float:1.0)
            float r14 = (float) r14
            float r2 = (float) r2
            float r14 = r14 / r2
            float r15 = java.lang.Math.min(r15, r14)
            X.B3f r2 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A02(r9, r10)
            if (r2 == 0) goto L_0x02b5
            r2.EjE(r15)
        L_0x02b5:
            X.6Ly r14 = r0.A0L
            java.lang.Float r2 = java.lang.Float.valueOf(r15)
            r11.put(r14, r2)
        L_0x02be:
            X.6if r2 = r0.A1e
            if (r2 == 0) goto L_0x03ad
            java.lang.Object r2 = r2.get()
            X.7zg r2 = (X.C349157zg) r2
            X.6Lz r2 = r2.A00()
            if (r2 == 0) goto L_0x03ad
            r2 = 1069128090(0x3fb9999a, float:1.45)
        L_0x02d1:
            X.B3f r3 = r9.A0P(r10)
            if (r3 == 0) goto L_0x03aa
            X.9Qs r3 = (X.C378669Qs) r3
            android.graphics.drawable.Drawable r3 = r3.A0B
        L_0x02db:
            X.B3f r10 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r3, r9)
            if (r10 == 0) goto L_0x02ed
            X.9Qs r10 = (X.C378669Qs) r10
            r10.A05 = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r10.A04
            float r2 = r2 * r3
            r10.EjE(r2)
        L_0x02ed:
            r8.A0R()
            r8.setVisible(r12, r4)
            r8.invalidateSelf()
            if (r16 != 0) goto L_0x02fb
            r7.Cnq(r8)
        L_0x02fb:
            X.8un r2 = r0.A0M
            if (r2 == 0) goto L_0x030f
            float r3 = r2.A01
            float r2 = r2.A02
            r9.A0p(r8, r3, r2)
            X.8un r2 = r0.A0M
            float r2 = r2.A05
            r9.A0n(r8, r2)
            r0.A0M = r1
        L_0x030f:
            X.6if r3 = r0.A1d
            if (r3 == 0) goto L_0x039c
            boolean r2 = X.C358368an.A0Q(r0)
            if (r2 == 0) goto L_0x039c
            java.lang.Object r9 = r3.get()
            X.7zP r9 = (X.C348987zP) r9
            android.os.Handler r4 = r9.A06
            r4.removeCallbacksAndMessages(r1)
            X.3oV r3 = r9.A07
            boolean r2 = r3.CVM()
            if (r2 == 0) goto L_0x033b
            X.C348987zP.A00(r9)
            java.lang.Runnable r2 = r9.A09
            r4.removeCallbacks(r2)
            android.view.View r2 = r3.getView()
            r2.setBackground(r1)
        L_0x033b:
            if (r13 != 0) goto L_0x035e
            X.0Tu r9 = X.0Tu.A05
            r2 = 36323002279144173(0x810b9400062aed, double:3.034151130096674E-306)
            boolean r4 = X.182.A06(r9, r5, r2)
            if (r4 == 0) goto L_0x035e
            X.1Av r4 = r0.A1i
            boolean r3 = X.182.A06(r9, r5, r2)
            X.27r r2 = X.27p.A01(r5)
            X.LIK.A01(r6, r5, r2, r4, r3)
            X.27r r2 = X.27p.A01(r5)
            X.LIK.A00(r6, r5, r2, r4)
        L_0x035e:
            android.text.Spannable r2 = r8.A0F
            java.lang.String r3 = r2.toString()
            java.util.regex.Pattern r2 = X.AnonymousClass9UR.A00
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r2 = r2.find()
            r7.DFg(r2)
            X.8A2 r7 = X.AnonymousClass8A1.A01(r5)
            X.29E r6 = r7.A0K
            long r3 = r7.A04
            r2 = 17643726(0x10d38ce, float:2.5938365E-38)
            long r2 = r6.A02(r2, r3)
            r7.A04 = r2
            X.8A2 r7 = X.AnonymousClass8A1.A01(r5)
            X.29E r5 = r7.A0K
            long r3 = r7.A00
            r2 = r17
            long r2 = r5.A02(r2, r3)
        L_0x0390:
            r7.A00 = r2
            java.lang.Runnable r2 = r0.A0T
            if (r2 == 0) goto L_0x006b
            r2.run()
            r0.A0T = r1
            return
        L_0x039c:
            X.6if r2 = r0.A1a
            if (r2 == 0) goto L_0x033b
            java.lang.Object r2 = r2.get()
            X.7iL r2 = (X.C338677iL) r2
            r2.A04()
            goto L_0x033b
        L_0x03aa:
            r3 = 0
            goto L_0x02db
        L_0x03ad:
            X.8bi r2 = r3.A06
            float r2 = r2.A02
            goto L_0x02d1
        L_0x03b3:
            java.lang.String r9 = r0.A1o
            goto L_0x01e0
        L_0x03b7:
            if (r15 == 0) goto L_0x03c5
            android.graphics.drawable.Drawable r2 = r0.A04
            if (r2 != 0) goto L_0x03bf
            X.6Ly r2 = r0.A0L
        L_0x03bf:
            r2.getClass()
            r7.EFO(r2, r8)
        L_0x03c5:
            r7.FKD(r8)
            goto L_0x022e
        L_0x03ca:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x016a
        L_0x03ce:
            X.6if r2 = r0.A1a
            if (r2 == 0) goto L_0x0112
            java.lang.Object r2 = r2.get()
            X.7iL r2 = (X.C338677iL) r2
            boolean r2 = r2.A07()
            goto L_0x010f
        L_0x03de:
            android.graphics.drawable.Drawable r6 = r0.A04
            if (r6 != 0) goto L_0x03e6
            X.6Ly r6 = r0.A0L
            if (r6 == 0) goto L_0x03ef
        L_0x03e6:
            X.8MG r2 = r0.A1X
            r2.EDV(r6, r4)
            r0.A0L = r1
            r0.A04 = r1
        L_0x03ef:
            X.6if r4 = r0.A1d
            if (r4 == 0) goto L_0x0464
            boolean r2 = X.C358368an.A0Q(r0)
            if (r2 == 0) goto L_0x0464
            java.lang.Object r8 = r4.get()
            X.7zP r8 = (X.C348987zP) r8
            android.os.Handler r7 = r8.A06
            r7.removeCallbacksAndMessages(r1)
            X.3oV r4 = r8.A07
            boolean r2 = r4.CVM()
            if (r2 == 0) goto L_0x041b
            X.C348987zP.A00(r8)
            java.lang.Runnable r2 = r8.A09
            r7.removeCallbacks(r2)
            android.view.View r2 = r4.getView()
            r2.setBackground(r1)
        L_0x041b:
            X.8MG r4 = r0.A1X
            android.text.Editable r2 = r3.getText()
            java.lang.String r3 = r2.toString()
            java.util.regex.Pattern r2 = X.AnonymousClass9UR.A00
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r2 = r2.find()
            r4.DFg(r2)
            X.8A2 r7 = X.AnonymousClass8A1.A01(r5)
            java.lang.String r14 = "delete text sticker"
            java.lang.String r4 = "exit with empty text"
            r10 = r4
            if (r6 == 0) goto L_0x043e
            r10 = r14
        L_0x043e:
            X.29E r8 = r7.A0K
            long r2 = r7.A04
            r11 = 17643726(0x10d38ce, float:2.5938365E-38)
            java.lang.String r9 = "user_cancelled"
            r12 = r2
            long r2 = r8.A06(r9, r10, r11, r12)
            r7.A04 = r2
            X.8A2 r7 = X.AnonymousClass8A1.A01(r5)
            if (r6 != 0) goto L_0x0455
            r14 = r4
        L_0x0455:
            X.29E r12 = r7.A0K
            long r2 = r7.A00
            r13 = r9
            r15 = r17
            r16 = r2
            long r2 = r12.A06(r13, r14, r15, r16)
            goto L_0x0390
        L_0x0464:
            X.6if r2 = r0.A1a
            if (r2 == 0) goto L_0x041b
            java.lang.Object r2 = r2.get()
            X.7iL r2 = (X.C338677iL) r2
            r2.A04()
            goto L_0x041b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358818bW.onFocusChange(android.view.View, boolean):void");
    }
}
