package X;

/* renamed from: X.Inh  reason: case insensitive filesystem */
public final class C58177Inh extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58177Inh(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cc, code lost:
        if (((X.C317746nl) r3.A03.getValue()).A01() == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023d, code lost:
        r2.Epw(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r18 = this;
            r2 = r18
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0255;
                case 2: goto L_0x0268;
                case 3: goto L_0x0273;
                case 4: goto L_0x028e;
                case 5: goto L_0x029e;
                case 6: goto L_0x02ae;
                case 7: goto L_0x02b5;
                case 8: goto L_0x0255;
                case 9: goto L_0x02dc;
                case 10: goto L_0x00b2;
                case 11: goto L_0x00f4;
                case 12: goto L_0x0273;
                case 13: goto L_0x028e;
                case 14: goto L_0x02e9;
                case 15: goto L_0x030d;
                case 16: goto L_0x031f;
                case 17: goto L_0x032f;
                case 18: goto L_0x033f;
                case 19: goto L_0x0252;
                case 20: goto L_0x0346;
                case 21: goto L_0x034d;
                case 22: goto L_0x0252;
                case 23: goto L_0x0346;
                case 24: goto L_0x034d;
                case 25: goto L_0x0354;
                case 26: goto L_0x033f;
                case 27: goto L_0x0369;
                case 28: goto L_0x011c;
                case 29: goto L_0x0129;
                case 30: goto L_0x0379;
                case 31: goto L_0x0393;
                case 32: goto L_0x0177;
                case 33: goto L_0x0180;
                case 34: goto L_0x018d;
                case 35: goto L_0x019a;
                case 36: goto L_0x01a6;
                case 37: goto L_0x01b1;
                case 38: goto L_0x01ba;
                case 39: goto L_0x0007;
                case 40: goto L_0x03aa;
                case 41: goto L_0x01c4;
                case 42: goto L_0x01d2;
                case 43: goto L_0x0007;
                case 44: goto L_0x01e2;
                case 45: goto L_0x01f6;
                case 46: goto L_0x03c0;
                case 47: goto L_0x03cc;
                case 48: goto L_0x03e8;
                case 49: goto L_0x01ff;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r2.A01
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r1
            r0 = 0
            r1.setCornerRadius(r0)
        L_0x000f:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0012:
            java.lang.Object r1 = r2.A01
            X.GT9 r1 = (X.GT9) r1
            X.GgO r2 = r1.A04()
            X.GmL r0 = r1.A03()
            java.lang.Integer r0 = r0.A06
            int r4 = X.DbX.A02(r0)
            X.0eM r0 = r1.A09
            X.4DU r13 = X.I03.A00(r0)
            r16 = 1
            X.7a5 r0 = r2.A0B
            X.1Xl r3 = r0.A00
            if (r3 == 0) goto L_0x000f
            X.7a0 r10 = r2.A0C
            android.app.Application r0 = r2.A0D()
            android.content.Context r9 = X.DbT.A05(r0)
            X.GmL r0 = r2.A08
            java.lang.Integer r1 = r0.A04
            r0 = 0
            int r5 = X.AnonymousClass7TG.A0A(r1)
            X.1Xj r6 = r3.BPf()
            X.IL5 r8 = new X.IL5
            r8.<init>(r5)
            boolean r7 = r3 instanceof X.AnonymousClass3OA
            if (r7 == 0) goto L_0x00ab
            r14 = r3
            X.3OA r14 = (X.AnonymousClass3OA) r14
            com.instagram.common.session.UserSession r12 = r10.A02
            X.4HH r10 = new X.4HH
            r10.<init>(r9, r8, r12, r6)
            r11 = 0
            X.GTB r9 = new X.GTB
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x0062:
            X.3b1 r9 = (X.C244333b1) r9
            X.4Lh r13 = r9.AWe()
            if (r13 == 0) goto L_0x009c
            java.lang.String r7 = r9.AWo()
            java.util.List r14 = X.0sr.A1N(r7)
            boolean r6 = r6.A5D()
            r8 = 0
            if (r6 == 0) goto L_0x00a9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
        L_0x007d:
            X.3Ds r5 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            X.3Dt r7 = new X.3Dt
            r7.<init>(r6, r5, r8, r8)
            X.3Ds r6 = X.C238863Ds.REACTION_BROWSER
            X.3Dt r5 = new X.3Dt
            r5.<init>(r6)
            X.3Dt[] r5 = new X.C238873Dt[]{r7, r5}
            java.util.List r15 = X.0sr.A1P(r5)
            X.3GX r12 = X.AnonymousClass3GX.A00(r12)
            r17 = r0
            r12.A04(r13, r14, r15, r16, r17)
        L_0x009c:
            X.05G r2 = r2.A0O
            int r0 = X.C51967G9n.A04(r1, r0)
            X.7c6 r1 = new X.7c6
            r1.<init>(r3, r0, r4)
            goto L_0x023d
        L_0x00a9:
            r6 = r8
            goto L_0x007d
        L_0x00ab:
            com.instagram.common.session.UserSession r12 = r10.A02
            X.3e7 r9 = X.C51971G9r.A0f(r9, r8, r12, r6, r13)
            goto L_0x0062
        L_0x00b2:
            java.lang.Object r3 = r2.A01
            X.H3o r3 = (X.C54219H3o) r3
            X.GmL r0 = r3.A03()
            boolean r0 = r0.A0d
            r2 = 1
            if (r0 == 0) goto L_0x00ce
            X.0eM r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            X.6nl r0 = (X.C317746nl) r0
            boolean r0 = r0.A01()
            r1 = 1
            if (r0 != 0) goto L_0x00cf
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            X.GmL r0 = r3.A03()
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x00f2
            X.0eM r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            X.6nl r0 = (X.C317746nl) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00f2
        L_0x00e5:
            if (r1 != 0) goto L_0x00e9
            if (r2 == 0) goto L_0x000f
        L_0x00e9:
            X.0sP r1 = r3.A0B
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C51967G9n.A1Q(r1, r0)
            goto L_0x000f
        L_0x00f2:
            r2 = 0
            goto L_0x00e5
        L_0x00f4:
            java.lang.Object r1 = r2.A01
            X.GT9 r1 = (X.GT9) r1
            X.GmL r0 = r1.A03()
            boolean r0 = r0.A0d
            if (r0 != 0) goto L_0x000f
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            if (r0 == 0) goto L_0x000f
            X.37D r4 = X.DbT.A0i(r0)
            if (r4 == 0) goto L_0x000f
            X.0xx r3 = X.DbW.A0E(r1)
            r2 = 0
            r1 = 2
            X.MG0 r0 = new X.MG0
            r0.<init>(r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x000f
        L_0x011c:
            java.lang.Object r1 = r2.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 0
            r1.setImageDrawable(r0)
            r1.setOnClickListener(r0)
            goto L_0x000f
        L_0x0129:
            java.lang.Object r4 = r2.A01
            X.7fH r4 = (X.C336847fH) r4
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0135
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x000f
        L_0x0135:
            X.7cA r1 = r4.A03
            com.instagram.common.session.UserSession r0 = r4.A02
            r12 = 0
            X.0qQ.A0B(r0, r12)
            X.2rm r0 = X.C231492rl.A00(r0)
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x0174
            java.lang.ref.WeakReference r0 = r1.A01
            if (r0 == 0) goto L_0x0172
            java.lang.Object r1 = r0.get()
        L_0x014d:
            android.view.GestureDetector r1 = (android.view.GestureDetector) r1
            if (r1 == 0) goto L_0x0163
            long r5 = android.os.SystemClock.uptimeMillis()
            long r7 = android.os.SystemClock.uptimeMillis()
            r9 = 3
            r10 = 0
            r11 = r10
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
            r1.onTouchEvent(r0)
        L_0x0163:
            X.GgO r3 = r4.A01
            if (r3 == 0) goto L_0x000f
            com.instagram.user.model.User r2 = r4.A04
            java.lang.String r1 = r4.A06
            boolean r0 = r4.A0A
            r3.A0X(r2, r1, r0)
            goto L_0x000f
        L_0x0172:
            r1 = 0
            goto L_0x014d
        L_0x0174:
            java.lang.Object r1 = r1.A00
            goto L_0x014d
        L_0x0177:
            java.lang.Object r2 = r2.A01
            X.GwG r2 = (X.C53910GwG) r2
            long r0 = X.C53910GwG.A09
            X.5xz r1 = r2.A02
            goto L_0x01a0
        L_0x0180:
            java.lang.Object r0 = r2.A01
            X.HpB r0 = (X.C55890HpB) r0
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x000f
        L_0x018d:
            java.lang.Object r0 = r2.A01
            X.RvJ r0 = (X.C10625RvJ) r0
            if (r0 == 0) goto L_0x000f
            android.animation.ValueAnimator r0 = r0.A01
            r0.cancel()
            goto L_0x000f
        L_0x019a:
            java.lang.Object r0 = r2.A01
            X.Guu r0 = (X.C53827Guu) r0
            X.5xz r1 = r0.A00
        L_0x01a0:
            r0 = 0
            r1.A01(r0)
            goto L_0x000f
        L_0x01a6:
            java.lang.Object r1 = r2.A01
            com.instagram.ui.emptystaterow.EmptyStateView r1 = (com.instagram.ui.emptystaterow.EmptyStateView) r1
            X.6rr r0 = X.C320156rr.GONE
            r1.A0P(r0)
            goto L_0x000f
        L_0x01b1:
            java.lang.Object r0 = r2.A01
            X.8Wt r0 = (X.C357158Wt) r0
            r0.A02()
            goto L_0x000f
        L_0x01ba:
            java.lang.Object r1 = r2.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 0
            r1.setImageDrawable(r0)
            goto L_0x000f
        L_0x01c4:
            java.lang.Object r1 = r2.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 0
            r1.setImageDrawable(r0)
            r0 = 0
            r1.setElevation(r0)
            goto L_0x000f
        L_0x01d2:
            java.lang.Object r1 = r2.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 0
            r1.setImageDrawable(r0)
            r1.setOnClickListener(r0)
            r1.setOnLongClickListener(r0)
            goto L_0x000f
        L_0x01e2:
            java.lang.Object r0 = r2.A01
            X.7bR r0 = (X.C334527bR) r0
            X.GgO r1 = r0.A00
            X.7a3 r0 = r1.A09
            r0.A01()
            X.05G r1 = r1.A0P
            X.7cd r0 = X.C335237cd.A00
            r1.Epw(r0)
            goto L_0x000f
        L_0x01f6:
            java.lang.Object r0 = r2.A01
            X.7fc r0 = (X.C337057fc) r0
            X.C337077fe.A04(r0)
            goto L_0x000f
        L_0x01ff:
            java.lang.Object r5 = r2.A01
            X.GgO r5 = (X.C52971GgO) r5
            X.7a5 r0 = r5.A0B
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x000f
            X.1Xj r4 = r0.BPf()
            if (r4 == 0) goto L_0x000f
            boolean r0 = r4.A67()
            if (r0 == 0) goto L_0x000f
            com.instagram.common.session.UserSession r3 = r5.A0E
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318247752112180(0x81074100211834, double:3.0311443480566977E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x000f
            X.1Xy r0 = r4.A0C
            java.util.List r0 = r0.C0K()
            if (r0 == 0) goto L_0x024e
            int r3 = r0.size()
            r0 = 3
            if (r3 <= r0) goto L_0x0242
            r0 = 1063675494(0x3f666666, float:0.9)
        L_0x0236:
            X.05G r2 = r5.A0O
            X.7bj r1 = new X.7bj
            r1.<init>(r0)
        L_0x023d:
            r2.Epw(r1)
            goto L_0x000f
        L_0x0242:
            if (r3 == 0) goto L_0x024e
            r2 = 1057384038(0x3f066666, float:0.525)
            r1 = 1035489772(0x3db851ec, float:0.09)
            float r0 = (float) r3
            float r0 = r0 * r1
            float r0 = r0 + r2
            goto L_0x0236
        L_0x024e:
            r0 = 1058893988(0x3f1d70a4, float:0.615)
            goto L_0x0236
        L_0x0252:
            java.lang.Object r4 = r2.A01
            return r4
        L_0x0255:
            r0 = 2
            int[] r1 = new int[r0]
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            r0.getLocationOnScreen(r1)
            r0 = 1
            r0 = r1[r0]
            float r0 = (float) r0
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        L_0x0268:
            java.lang.Object r0 = r2.A01
            X.H3n r0 = (X.C54218H3n) r0
            int r0 = r0.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0273:
            java.lang.Object r3 = r2.A01
            X.GT9 r3 = (X.GT9) r3
            X.0eM r0 = r3.A0A
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.328 r1 = new X.328
            r1.<init>(r3)
            X.0eM r0 = r3.A09
            X.4DU r0 = X.I03.A00(r0)
            X.32A r4 = new X.32A
            r4.<init>(r0, r2, r1)
            return r4
        L_0x028e:
            java.lang.Object r0 = r2.A01
            X.GT9 r0 = (X.GT9) r0
            X.0eM r0 = r0.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6nl r4 = new X.6nl
            r4.<init>(r0)
            return r4
        L_0x029e:
            java.lang.Object r0 = r2.A01
            X.GT9 r0 = (X.GT9) r0
            X.0eM r0 = r0.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7b0 r4 = new X.7b0
            r4.<init>(r0)
            return r4
        L_0x02ae:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.FragmentActivity r4 = X.DbZ.A0E(r0)
            return r4
        L_0x02b5:
            java.lang.Object r5 = r2.A01
            X.GT9 r5 = (X.GT9) r5
            X.0eM r0 = r5.A0A
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            X.GmL r6 = r5.A03()
            X.0eM r0 = r5.A09
            X.4DU r8 = X.I03.A00(r0)
            r0 = 6
            X.Inh r9 = new X.Inh
            r9.<init>(r5, r0)
            r0 = 33
            X.Imy r10 = new X.Imy
            r10.<init>(r5, r0)
            X.7bg r4 = new X.7bg
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x02dc:
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getHeight()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x02e9:
            java.lang.Object r2 = r2.A01
            X.H3o r2 = (X.C54219H3o) r2
            X.2k4 r1 = r2.dayNightMode
            X.2k4 r0 = X.AnonymousClass2k4.NIGHT
            if (r1 != r0) goto L_0x0308
            X.GmL r0 = r2.A03()
            boolean r0 = r0.A0d
            if (r0 == 0) goto L_0x0308
            android.content.Context r1 = r2.requireContext()
            r0 = 2132018205(0x7f14041d, float:1.967471E38)
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper
            r4.<init>(r1, r0)
            return r4
        L_0x0308:
            android.content.Context r4 = X.C58177Inh.super.getThemedContext()
            return r4
        L_0x030d:
            java.lang.Object r2 = r2.A01
            X.K4b r2 = (X.C61359K4b) r2
            X.0eM r0 = r2.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r2.A05
            X.H5s r4 = new X.H5s
            r4.<init>(r1, r0)
            return r4
        L_0x031f:
            java.lang.Object r0 = r2.A01
            X.K4b r0 = (X.C61359K4b) r0
            X.0eM r0 = r0.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7cS r4 = new X.7cS
            r4.<init>(r0)
            return r4
        L_0x032f:
            java.lang.Object r0 = r2.A01
            X.K4b r0 = (X.C61359K4b) r0
            X.0eM r0 = r0.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5X r4 = new X.H5X
            r4.<init>(r0)
            return r4
        L_0x033f:
            java.lang.Object r0 = r2.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x0346:
            java.lang.Object r0 = r2.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x034d:
            java.lang.Object r0 = r2.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x0354:
            java.lang.Object r2 = r2.A01
            X.K7G r2 = (X.K7G) r2
            X.0eM r0 = r2.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1Am r1 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A0r
            X.0xa r4 = X.C51969G9p.A0n(r1, r0, r2)
            return r4
        L_0x0369:
            java.lang.Object r0 = r2.A01
            X.K7G r0 = (X.K7G) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7cS r4 = new X.7cS
            r4.<init>(r0)
            return r4
        L_0x0379:
            java.lang.Object r2 = r2.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            r0 = 2131238360(0x7f081dd8, float:1.8092997E38)
            android.graphics.drawable.Drawable r4 = X.C244013aV.A0D(r2, r0)
            X.2V1 r0 = r2.A05
            android.content.Context r1 = r0.A0C
            r0 = 2130970239(0x7f04067f, float:1.7549183E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.C51973G9u.A0x(r4, r2, r0)
            return r4
        L_0x0393:
            java.lang.Object r1 = r2.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            r0 = 2131238362(0x7f081dda, float:1.8093E38)
            android.graphics.drawable.Drawable r4 = X.C244013aV.A0D(r1, r0)
            X.2V1 r0 = r1.A05
            android.content.Context r0 = r0.A0C
            int r0 = X.2Yu.A09(r0)
            X.C51973G9u.A0x(r4, r1, r0)
            return r4
        L_0x03aa:
            java.lang.Object r0 = r2.A01
            X.Gwr r0 = (X.C53947Gwr) r0
            X.7fs r4 = r0.A02
            java.lang.String r3 = r4.A03
            java.lang.String r2 = r4.A05
            int r0 = r4.A01
            float r1 = (float) r0
            int r0 = r4.A00
            float r0 = (float) r0
            com.instagram.model.mediasize.GifUrlImpl r4 = new com.instagram.model.mediasize.GifUrlImpl
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x03c0:
            java.lang.Object r0 = r2.A01
            X.GgO r0 = (X.C52971GgO) r0
            com.instagram.common.session.UserSession r0 = r0.A0E
            X.Hi8 r4 = new X.Hi8
            r4.<init>(r0)
            return r4
        L_0x03cc:
            java.lang.Object r1 = r2.A01
            X.GgO r1 = (X.C52971GgO) r1
            com.instagram.comments.mvvm.data.MediaCommentListRepository r6 = r1.A0A
            com.instagram.common.session.UserSession r9 = r1.A0E
            X.GmL r5 = r1.A08
            X.0eM r0 = r1.A0M
            java.lang.Object r8 = r0.getValue()
            X.I0j r8 = (X.I0j) r8
            X.7a5 r7 = r1.A0B
            X.7aO r10 = r1.A0I
            X.I47 r4 = new X.I47
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x03e8:
            java.lang.Object r0 = r2.A01
            X.GgO r0 = (X.C52971GgO) r0
            com.instagram.comments.mvvm.data.MediaCommentListRepository r3 = r0.A0A
            com.instagram.common.session.UserSession r2 = r0.A0E
            X.GmL r0 = r0.A08
            boolean r1 = r0.A0e
            java.lang.String r0 = r0.A0E
            X.I0j r4 = new X.I0j
            r4.<init>(r3, r2, r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58177Inh.invoke():java.lang.Object");
    }
}
