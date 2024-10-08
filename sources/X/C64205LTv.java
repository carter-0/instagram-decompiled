package X;

import android.animation.ValueAnimator;

/* renamed from: X.LTv  reason: case insensitive filesystem */
public final class C64205LTv implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public static Object A00(C64205LTv lTv, Object obj) {
        0qQ.A0B(obj, 0);
        return lTv.A01;
    }

    public C64205LTv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C64205LTv(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0065, code lost:
        r1 = r1.requireView();
        r2 = r11.getAnimatedValue();
        X.0qQ.A0C(r2, "null cannot be cast to non-null type kotlin.Int");
        r2 = (java.lang.Number) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01bb, code lost:
        X.0nA.A0V(r1, r2.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0237, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x023e, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02a3, code lost:
        r2.setAlpha(r3.floatValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        if (r1.mView == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0276;
                case 1: goto L_0x023f;
                case 2: goto L_0x01e7;
                case 3: goto L_0x033e;
                case 4: goto L_0x033e;
                case 5: goto L_0x01c3;
                case 6: goto L_0x02da;
                case 7: goto L_0x01ab;
                case 8: goto L_0x0193;
                case 9: goto L_0x02c1;
                case 10: goto L_0x0163;
                case 11: goto L_0x00a4;
                case 12: goto L_0x0076;
                case 13: goto L_0x005b;
                case 14: goto L_0x0054;
                case 15: goto L_0x02b9;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x020c;
                case 19: goto L_0x02ab;
                case 20: goto L_0x003a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = A00(r10, r11)
            X.M0b r4 = (X.C65809M0b) r4
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r3 = X.DbW.A04(r1, r0)
            androidx.recyclerview.widget.RecyclerView r2 = r4.A03
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = 49
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            r1.height = r3
            r2.setLayoutParams(r1)
            boolean r0 = r4 instanceof X.C62245Kcf
            if (r0 == 0) goto L_0x0039
            X.Kcf r4 = (X.C62245Kcf) r4
            androidx.recyclerview.widget.RecyclerView r1 = r4.A03
            X.M5C r0 = new X.M5C
            r0.<init>(r4)
            r1.post(r0)
        L_0x0039:
            return
        L_0x003a:
            java.lang.Object r2 = A00(r10, r11)
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C51974G9v.A0e(r11, r2, r1)
            java.lang.Object r3 = r11.getAnimatedValue()
            X.0qQ.A0C(r3, r0)
            java.lang.Number r3 = (java.lang.Number) r3
            goto L_0x02a3
        L_0x0054:
            java.lang.Object r1 = A00(r10, r11)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            goto L_0x0061
        L_0x005b:
            java.lang.Object r1 = A00(r10, r11)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
        L_0x0061:
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0039
            android.view.View r1 = r1.requireView()
            java.lang.Object r2 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r2, r0)
            java.lang.Number r2 = (java.lang.Number) r2
            goto L_0x01bb
        L_0x0076:
            java.lang.Object r3 = A00(r10, r11)
            X.LtB r3 = (X.LtB) r3
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            r3.A00 = r0
            X.LtB.A00(r3)
            X.LCA r2 = r3.A0D
            if (r2 == 0) goto L_0x0039
            float r1 = r3.A00
            r0 = 1060320051(0x3f333333, float:0.7)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            X.K6H r0 = r2.A00
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.2db.A06(r0, r1)
            return
        L_0x00a4:
            java.lang.Object r2 = A00(r10, r11)
            X.333 r2 = (X.AnonymousClass333) r2
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            android.content.Context r9 = r2.A02
            android.app.Activity r3 = r2.A01
            if (r9 == 0) goto L_0x0039
            if (r3 == 0) goto L_0x0039
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r5 = X.C51970G9q.A04(r1, r0)
            androidx.fragment.app.Fragment r4 = r2.A03
            com.instagram.common.session.UserSession r7 = r2.A05
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            boolean r6 = X.C51970G9q.A1T(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317560555509074(0x8106a100051552, double:3.030709762157775E-306)
            boolean r8 = X.182.A06(r2, r7, r0)
            r2 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r1 = X.AnonymousClass7TF.A03(r9, r2)
            android.content.Context r0 = X.2Yn.A01(r3)
            int r0 = X.AnonymousClass7TF.A03(r0, r2)
            int r2 = X.0nH.A02(r5, r1, r0)
            int r7 = X.0nH.A02(r5, r0, r1)
            r0 = 2131442398(0x7f0b3ade, float:1.8506835E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 2131435742(0x7f0b20de, float:1.8493335E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x0100
            r1.setBackgroundColor(r2)
        L_0x0100:
            if (r0 == 0) goto L_0x0105
            r0.setBackgroundColor(r2)
        L_0x0105:
            r0 = 2131442400(0x7f0b3ae0, float:1.8506839E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 2131435743(0x7f0b20df, float:1.8493337E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x0118
            r1.setBackgroundColor(r2)
        L_0x0118:
            if (r0 == 0) goto L_0x011d
            r0.setBackgroundColor(r2)
        L_0x011d:
            java.util.ArrayList r0 = X.0Pn.A02(r3)
            java.util.Iterator r1 = r0.iterator()
        L_0x0125:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0138
            java.lang.Object r0 = r1.next()
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r0
            r0.setActiveColor(r7)
            r0.setNormalColor(r7)
            goto L_0x0125
        L_0x0138:
            X.AnonymousClass2uJ.A04(r3, r2)
            X.AnonymousClass2uJ.A06(r3, r6)
            boolean r0 = X.C317756nm.A06(r3)
            if (r0 == 0) goto L_0x015f
            android.view.Window r0 = r3.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.setBackgroundColor(r2)
        L_0x0152:
            if (r8 != 0) goto L_0x0039
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            X.2db.A04(r3, r4, r2, r0)
            return
        L_0x015f:
            X.C317756nm.A00(r3, r2)
            goto L_0x0152
        L_0x0163:
            java.lang.Object r2 = A00(r10, r11)
            X.Ls4 r2 = (X.C65363Ls4) r2
            java.lang.Object r1 = r11.getAnimatedValue()
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0191
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0191
            int r0 = r1.intValue()
        L_0x0179:
            r2.A00 = r0
            java.util.HashSet r0 = r2.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0181:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r1.next()
            X.3M8 r0 = (X.AnonymousClass3M8) r0
            r0.A0B(r2)
            goto L_0x0181
        L_0x0191:
            r0 = 0
            goto L_0x0179
        L_0x0193:
            java.lang.Object r2 = X.C51971G9r.A0o(r11)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0039
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0039
            java.lang.Object r1 = r10.A01
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            int r0 = r2.intValue()
            r1.setProgress(r0)
            return
        L_0x01ab:
            java.lang.Object r2 = X.C51971G9r.A0o(r11)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0039
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0039
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
        L_0x01bb:
            int r0 = r2.intValue()
            X.0nA.A0V(r1, r0)
            return
        L_0x01c3:
            java.lang.Object r3 = A00(r10, r11)
            X.K7Z r3 = (X.K7Z) r3
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            java.lang.String r4 = "recyclerView"
            if (r0 == 0) goto L_0x0237
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.DbW.A04(r1, r0)
            r2.height = r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            if (r0 == 0) goto L_0x0237
            r0.setLayoutParams(r2)
            return
        L_0x01e7:
            java.lang.Object r1 = X.C51971G9r.A0o(r11)
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0039
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0039
            float r2 = r1.floatValue()
            java.lang.Object r1 = r10.A01
            X.LmS r1 = (X.C65048LmS) r1
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A02
            java.lang.String r4 = "stickerView"
            if (r0 == 0) goto L_0x0237
            r0.setScaleX(r2)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A02
            if (r0 == 0) goto L_0x0237
            r0.setScaleY(r2)
            return
        L_0x020c:
            java.lang.Object r3 = A00(r10, r11)
            X.LjH r3 = (X.C64855LjH) r3
            X.0eM r0 = r3.A0D
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r2 = (com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar) r2
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            r2.setProgress(r0)
            float r1 = r11.getAnimatedFraction()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            X.JhO r2 = r3.A00
            if (r2 != 0) goto L_0x0348
            java.lang.String r4 = "viewModel"
        L_0x0237:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x023f:
            java.lang.Object r3 = X.C51971G9r.A0o(r11)
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r10.A01
            X.L3a r0 = (X.C63690L3a) r0
            X.LAt r2 = r0.A01
            android.view.View r1 = r2.A02
            java.lang.Number r3 = (java.lang.Number) r3
            float r0 = r3.floatValue()
            r1.setAlpha(r0)
            android.view.View r1 = r2.A07
            float r0 = r3.floatValue()
            r1.setAlpha(r0)
            android.view.View r1 = r2.A01
            float r0 = r3.floatValue()
            r1.setAlpha(r0)
            android.view.View r1 = r2.A06
            float r0 = r3.floatValue()
            r1.setAlpha(r0)
            android.view.View r2 = r2.A04
            goto L_0x02a3
        L_0x0276:
            java.lang.Object r3 = X.C51971G9r.A0o(r11)
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r10.A01
            X.L3Y r0 = (X.L3Y) r0
            X.OI6 r2 = r0.A01
            android.view.View r1 = r2.A03
            java.lang.Number r3 = (java.lang.Number) r3
            float r0 = r3.floatValue()
            r1.setAlpha(r0)
            android.view.View r1 = r2.A01
            float r0 = r3.floatValue()
            r1.setAlpha(r0)
            android.view.View r1 = r2.A00
            float r0 = r3.floatValue()
            r1.setAlpha(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = r2.A09
        L_0x02a3:
            float r0 = r3.floatValue()
            r2.setAlpha(r0)
            return
        L_0x02ab:
            java.lang.Object r1 = A00(r10, r11)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r11.getAnimatedValue()
            X.C51974G9v.A0e(r11, r1, r0)
            return
        L_0x02b9:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
            return
        L_0x02c1:
            java.lang.Object r1 = X.C51971G9r.A0o(r11)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r0 = X.C51970G9q.A04(r1, r0)
            java.lang.Object r2 = r10.A01
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = (int) r0
            r1.height = r0
            r2.setLayoutParams(r1)
            return
        L_0x02da:
            r5 = 0
            X.0qQ.A0B(r11, r5)
            java.lang.Object r1 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r6 = X.C51970G9q.A04(r1, r0)
            java.lang.Object r7 = r10.A01
            X.Jc2 r7 = (X.C59938Jc2) r7
            android.view.View r3 = r7.A05
            float r0 = -r6
            r3.setRotationY(r0)
            r4 = 1119748096(0x42be0000, float:95.0)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0309
            r2 = 0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = -1088421888(0xffffffffbf200000, float:-0.625)
            float r0 = X.0mi.A02(r6, r2, r4, r1, r0)
            float r0 = -r0
            r3.setScaleX(r0)
            r3.setScaleY(r0)
            return
        L_0x0309:
            r0 = 8
            r3.setVisibility(r0)
            X.JTR.A1B(r3)
            r0 = 0
            r3.setRotationY(r0)
            android.view.View r3 = r7.A04
            r3.setVisibility(r5)
            r2 = 1127481344(0x43340000, float:180.0)
            r1 = 1059061760(0x3f200000, float:0.625)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = X.0mi.A02(r6, r4, r2, r1, r0)
            r3.setScaleX(r2)
            r3.setScaleY(r2)
            X.7l2 r1 = r7.A06
            android.view.View r0 = r1.A0F
            r0.setScaleX(r2)
            r0.setScaleY(r2)
            X.7l1 r0 = r1.A0H
            android.view.View r0 = r0.A00()
            r0.setVisibility(r5)
            return
        L_0x033e:
            java.lang.Object r0 = r10.A01
            X.LAI r0 = (X.LAI) r0
            X.Jcw r0 = r0.A02
            r0.invalidateSelf()
            return
        L_0x0348:
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 32
            X.MG2.A01(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64205LTv.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
