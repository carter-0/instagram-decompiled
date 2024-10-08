package X;

import android.view.ViewTreeObserver;

public final class WCB implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WCB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [X.E4q, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x01b2;
                case 1: goto L_0x01ef;
                case 2: goto L_0x0209;
                case 3: goto L_0x022b;
                case 4: goto L_0x0043;
                case 5: goto L_0x00a6;
                case 6: goto L_0x0258;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r9.A01
            X.E4O r5 = (X.E4O) r5
            java.lang.Object r1 = r9.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 2131437428(0x7f0b2774, float:1.8496754E38)
            android.view.View r4 = r1.findViewById(r0)
            r4.getClass()
            android.widget.ScrollView r4 = (android.widget.ScrollView) r4
            int r0 = r4.getChildCount()
            r3 = 1
            int r0 = r0 - r3
            android.view.View r0 = r4.getChildAt(r0)
            int r2 = r0.getBottom()
            int r1 = r4.getHeight()
            int r0 = r4.getScrollY()
            int r1 = r1 + r0
            int r2 = r2 - r1
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x0041
            if (r2 > 0) goto L_0x0041
        L_0x0039:
            X.F3G r1 = r5.A03
            boolean r0 = r5.A0B
            r1.A00(r3, r0)
        L_0x0040:
            return
        L_0x0041:
            r3 = 0
            goto L_0x0039
        L_0x0043:
            java.lang.Object r0 = r9.A01
            X.Dof r0 = (X.C46987Dof) r0
            com.instagram.common.ui.base.IgTextView r6 = r0.A02
            java.lang.Object r0 = r9.A02
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            boolean r5 = r0.A0V()
            android.text.Layout r0 = r6.getLayout()
            if (r0 == 0) goto L_0x0040
            java.lang.CharSequence r1 = r0.getText()
            X.0qQ.A07(r1)
            r8 = 1
            java.lang.String r0 = " "
            r7 = 0
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r4 = 0
            java.util.List r3 = X.00l.A0R(r1, r0, r7)
            int r0 = r3.size()
            if (r0 <= r8) goto L_0x0040
            int r0 = X.DbT.A02(r3, r8)
            java.lang.Object r0 = r3.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0040
            int r0 = X.DbT.A02(r3, r8)
            java.lang.String r0 = X.AnonymousClass7TE.A19(r3, r0)
            char r1 = r0.charAt(r7)
            r0 = 8230(0x2026, float:1.1533E-41)
            if (r1 != r0) goto L_0x0040
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r1 = X.DbT.A02(r3, r8)
        L_0x009a:
            if (r7 >= r1) goto L_0x02b0
            java.lang.String r0 = X.AnonymousClass7TE.A19(r3, r7)
            r2.append(r0)
            int r7 = r7 + 1
            goto L_0x009a
        L_0x00a6:
            java.lang.Object r6 = r9.A01
            X.WeL r6 = (X.C19719WeL) r6
            r0 = 0
            r6.A0A = r0
            com.instagram.common.ui.base.IgTextView r8 = r6.A0G
            int r0 = r8.getHeight()
            float r0 = (float) r0
            r6.A00 = r0
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r5 = r6.A0H
            int r1 = r5.getHeight()
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r4 = r6.A0I
            int r0 = r4.getHeight()
            int r1 = r1 - r0
            float r1 = (float) r1
            float r3 = r6.A0C
            float r1 = r1 - r3
            r7 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r7
            float r0 = r6.A00
            float r2 = java.lang.Math.max(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbS.A0D(r4)
            int r0 = (int) r2
            r1.topMargin = r0
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r0 = r2 - r0
            int r0 = (int) r0
            r1.bottomMargin = r0
            r4.setLayoutParams(r1)
            r6.A03 = r2
            int r0 = r4.getHeight()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0197
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00f0:
            r6.A07 = r0
            int r0 = r4.getHeight()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x011b
            int r0 = r4.getHeight()
            float r7 = (float) r0
            float r1 = r6.A03
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            float r7 = r7 + r1
            float r7 = r7 + r3
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r7 = r7 - r0
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x011b
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r0 = r0 - r7
            float r8 = X.JTP.A00(r0, r4)
        L_0x011b:
            r6.A04 = r8
            float r0 = r6.A07
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x018b
            float r2 = r6.A00
            float r0 = r6.A03
            float r2 = r2 - r0
        L_0x0128:
            r6.A05 = r2
            int r0 = r4.getHeight()
            float r1 = (float) r0
            float r0 = r6.A04
            float r1 = r1 * r0
            float r2 = r2 - r1
            int r0 = r4.getHeight()
            float r1 = (float) r0
            float r0 = r6.A07
            float r1 = r1 * r0
            float r2 = r2 + r1
            r6.A06 = r2
            int r0 = r5.getWidth()
            float r2 = (float) r0
            int r0 = r4.getWidth()
            float r1 = (float) r0
            float r0 = r6.A04
            float r1 = r1 * r0
            float r0 = X.C51967G9n.A00(r2, r1)
            r6.A01 = r0
            int r0 = r4.getHeight()
            float r1 = (float) r0
            float r0 = r6.A04
            float r1 = r1 * r0
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r1 = r1 - r0
            r6.A02 = r1
            int r0 = r6.A08
            int r0 = r0 + 1
            r6.A08 = r0
            java.lang.Object r0 = r9.A02
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            int r0 = r5.getHeight()
            if (r0 <= 0) goto L_0x0040
            int r0 = r4.getHeight()
            if (r0 <= 0) goto L_0x0040
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x0040
            X.C51967G9n.A0y(r5, r9)
            r0 = 0
            r6.A09 = r0
            return
        L_0x018b:
            android.widget.LinearLayout r0 = r6.A0E
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r2 = X.C51967G9n.A00(r3, r0)
            goto L_0x0128
        L_0x0197:
            int r0 = r5.getHeight()
            float r1 = (float) r0
            float r0 = r6.A00
            float r0 = r0 * r7
            float r1 = r1 - r0
            android.widget.LinearLayout r0 = r6.A0E
            int r0 = r0.getMeasuredHeight()
            float r0 = (float) r0
            float r1 = r1 - r0
            float r0 = X.JTP.A00(r1, r4)
            float r0 = java.lang.Math.min(r0, r2)
            goto L_0x00f0
        L_0x01b2:
            java.lang.Object r3 = r9.A02
            android.view.View r3 = (android.view.View) r3
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            X.WCD r0 = X.WCD.A00
            r1.removeOnGlobalLayoutListener(r0)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.view.View r0 = X.JTR.A0U(r3)
            int r0 = r0.getWidth()
            float r1 = (float) r0
            java.lang.Object r0 = r9.A01
            int r0 = X.AnonymousClass7TE.A0M(r0)
            switch(r0) {
                case 1: goto L_0x01e0;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01e7;
                case 4: goto L_0x01eb;
                default: goto L_0x01d5;
            }
        L_0x01d5:
            r0 = 1055286886(0x3ee66666, float:0.45)
        L_0x01d8:
            float r1 = r1 * r0
            int r0 = (int) r1
            r2.width = r0
            r3.setLayoutParams(r2)
            return
        L_0x01e0:
            r0 = 1057467924(0x3f07ae14, float:0.53)
            goto L_0x01d8
        L_0x01e4:
            r0 = 1061158912(0x3f400000, float:0.75)
            goto L_0x01d8
        L_0x01e7:
            r0 = 1062836634(0x3f59999a, float:0.85)
            goto L_0x01d8
        L_0x01eb:
            r0 = 1063675494(0x3f666666, float:0.9)
            goto L_0x01d8
        L_0x01ef:
            java.lang.Object r5 = r9.A02
            X.E4q r5 = (X.C47486E4q) r5
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L_0x0200
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0200
            r0.removeOnGlobalLayoutListener(r9)
        L_0x0200:
            java.lang.Object r4 = r9.A01
            X.3K2 r4 = (X.AnonymousClass3K2) r4
            r3 = 0
            android.graphics.RectF r2 = r5.A00
            r1 = 0
            goto L_0x0222
        L_0x0209:
            java.lang.Object r5 = r9.A02
            X.E4r r5 = (X.C47487E4r) r5
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L_0x021a
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x021a
            r0.removeOnGlobalLayoutListener(r9)
        L_0x021a:
            java.lang.Object r4 = r9.A01
            X.3K2 r4 = (X.AnonymousClass3K2) r4
            r3 = 0
            android.graphics.RectF r2 = r5.A00
            r1 = 2
        L_0x0222:
            X.WaW r0 = new X.WaW
            r0.<init>(r1)
            r4.A0W(r3, r2, r5, r0)
            return
        L_0x022b:
            java.lang.Object r4 = r9.A02
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x024c
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0256
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x023b:
            java.lang.Object r0 = r9.A01
            android.view.View r0 = (android.view.View) r0
            int r2 = r0.getHeight()
            r1 = 0
            if (r3 == 0) goto L_0x0254
            int r0 = r3.bottomMargin
        L_0x0248:
            int r2 = r2 - r0
            r4.setPadding(r1, r1, r1, r2)
        L_0x024c:
            java.lang.Object r0 = r9.A01
            android.view.View r0 = (android.view.View) r0
            X.C51967G9n.A0y(r0, r9)
            return
        L_0x0254:
            r0 = 0
            goto L_0x0248
        L_0x0256:
            r3 = 0
            goto L_0x023b
        L_0x0258:
            java.lang.Object r5 = r9.A02
            android.view.View r5 = (android.view.View) r5
            X.C51967G9n.A0y(r5, r9)
            r0 = 2131430668(0x7f0b0d0c, float:1.8483043E38)
            android.view.View r0 = r5.findViewById(r0)
            int r4 = r0.getHeight()
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r0 = r5.findViewById(r0)
            r3 = 0
            if (r0 == 0) goto L_0x02ae
            int r2 = r0.getHeight()
        L_0x0278:
            r0 = 2131431430(0x7f0b1006, float:1.8484589E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x02ac
            int r1 = r0.getHeight()
        L_0x0285:
            r0 = 2131433860(0x7f0b1984, float:1.8489518E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x0292
            int r3 = r0.getHeight()
        L_0x0292:
            r0 = 2131428901(0x7f0b0625, float:1.847946E38)
            android.view.View r0 = r5.findViewById(r0)
            int r0 = r0.getHeight()
            int r4 = r4 - r2
            int r4 = r4 - r1
            int r4 = r4 - r3
            int r4 = r4 - r0
            java.lang.Object r0 = r9.A01
            android.view.View r0 = (android.view.View) r0
            X.0qQ.A0A(r0)
            X.0nA.A0V(r0, r4)
            return
        L_0x02ac:
            r1 = 0
            goto L_0x0285
        L_0x02ae:
            r2 = 0
            goto L_0x0278
        L_0x02b0:
            java.lang.String r0 = X.DbT.A10(r2)
            X.C46334Dcc.A00(r6, r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WCB.onGlobalLayout():void");
    }
}
