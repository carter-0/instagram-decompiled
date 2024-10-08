package X;

/* renamed from: X.Oz5  reason: case insensitive filesystem */
public final class C72237Oz5 implements C252213ok {
    public final int A00;
    public final Object A01;

    public C72237Oz5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [androidx.fragment.app.Fragment, java.lang.Object, X.NV0] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r0.setLayoutParams(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ac, code lost:
        r0.DMs(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01dc, code lost:
        r3.setMargins(r3.leftMargin, r3.topMargin, r3.rightMargin, r9);
        X.C66940MfZ.A00(r6, r7, r5, r4).requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMr(int r9, boolean r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x00a4;
                case 1: goto L_0x01cb;
                case 2: goto L_0x01b0;
                case 3: goto L_0x007c;
                case 4: goto L_0x0059;
                case 5: goto L_0x0180;
                case 6: goto L_0x0153;
                case 7: goto L_0x0046;
                case 8: goto L_0x00bc;
                case 9: goto L_0x0029;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r8.A01
            X.NIf r3 = (X.C68442NIf) r3
            android.view.ViewGroup r0 = r3.A01
            if (r0 == 0) goto L_0x0027
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L_0x0011:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0026
            r1 = r2
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r3.A00
            if (r9 <= 0) goto L_0x001d
            int r0 = r0 + r9
        L_0x001d:
            r1.bottomMargin = r0
            android.view.ViewGroup r0 = r3.A01
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.setLayoutParams(r2)
        L_0x0026:
            return
        L_0x0027:
            r2 = 0
            goto L_0x0011
        L_0x0029:
            java.lang.Object r3 = r8.A01
            X.NJL r3 = (X.NJL) r3
            android.view.View r0 = r3.A03
            if (r0 == 0) goto L_0x0044
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L_0x0035:
            int r1 = r3.A00
            int r1 = r1 + r9
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0026
            r0 = r2
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.bottomMargin = r1
            android.view.View r0 = r3.A03
            goto L_0x0021
        L_0x0044:
            r2 = 0
            goto L_0x0035
        L_0x0046:
            java.lang.Object r0 = r8.A01
            X.NIk r0 = (X.C68447NIk) r0
            r0.A02 = r9
            r0.A00 = r9
            X.C68447NIk.A04(r0, r9)
            if (r9 == 0) goto L_0x0026
            com.instagram.common.ui.base.IgTextView r0 = r0.A05
            X.AnonymousClass7TH.A0R(r0)
            return
        L_0x0059:
            java.lang.Object r3 = r8.A01
            X.NIh r3 = (X.C68444NIh) r3
            android.view.ViewGroup r0 = r3.A00
            if (r0 == 0) goto L_0x007a
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L_0x0065:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0026
            if (r9 <= 0) goto L_0x0073
            r0 = r2
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.bottomMargin = r9
        L_0x0070:
            android.view.ViewGroup r0 = r3.A00
            goto L_0x0021
        L_0x0073:
            r1 = r2
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0 = 0
            r1.bottomMargin = r0
            goto L_0x0070
        L_0x007a:
            r2 = 0
            goto L_0x0065
        L_0x007c:
            java.lang.Object r3 = r8.A01
            X.NJ4 r3 = (X.NJ4) r3
            android.view.ViewGroup r0 = r3.A00
            if (r0 == 0) goto L_0x00a2
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L_0x0088:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0026
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r1 = X.DbS.A03(r1, r0)
            r0 = r2
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r9 <= 0) goto L_0x009d
            int r1 = r1 + r9
        L_0x009d:
            r0.bottomMargin = r1
            android.view.ViewGroup r0 = r3.A00
            goto L_0x0021
        L_0x00a2:
            r2 = 0
            goto L_0x0088
        L_0x00a4:
            if (r9 <= 0) goto L_0x0026
            java.lang.Object r0 = r8.A01
            X.OI6 r0 = (X.OI6) r0
            android.view.View r3 = r0.A03
            int r2 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r0 = r3.getPaddingRight()
            r3.setPadding(r2, r1, r0, r9)
            return
        L_0x00bc:
            java.lang.Object r4 = r8.A01
            X.NIn r4 = (X.C68449NIn) r4
            r4.A00 = r9
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            if (r0 == 0) goto L_0x00d3
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00d3
            int r0 = r4.A00
            if (r0 != 0) goto L_0x00d3
            X.C68449NIn.A0G(r4)
        L_0x00d3:
            boolean r0 = r4.A0t
            if (r0 != 0) goto L_0x00f0
            android.view.View r2 = r4.A04
            java.lang.String r0 = "bottomBarContainer"
            if (r2 != 0) goto L_0x00e5
            X.0qQ.A0F(r0)
        L_0x00e0:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e5:
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbX.A0G(r2)
            int r0 = r4.A00
            r1.bottomMargin = r0
            r2.setLayoutParams(r1)
        L_0x00f0:
            boolean r0 = r4.A0r
            if (r0 == 0) goto L_0x00fb
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x00ff
            X.C68449NIn.A0C(r4)
        L_0x00fb:
            r0 = 1
            r4.A0r = r0
            return
        L_0x00ff:
            boolean r0 = r4.A0t
            if (r0 != 0) goto L_0x00fb
            android.content.Context r0 = r4.requireContext()
            int r5 = X.AnonymousClass0nB.A00(r0)
            r6 = 2
            int r5 = r5 / r6
            X.2dZ r0 = r4.A0D
            if (r0 != 0) goto L_0x0117
            java.lang.String r2 = "actionBarService"
        L_0x0113:
            X.0qQ.A0F(r2)
            goto L_0x00e0
        L_0x0117:
            int r0 = r0.AYI()
            int r5 = r5 - r0
            android.view.View r0 = r4.A03
            java.lang.String r2 = "avatarContainer"
            if (r0 == 0) goto L_0x0113
            int r0 = r0.getHeight()
            int r5 = r5 - r0
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r5 = r5 - r0
            android.view.View r3 = r4.A03
            if (r3 == 0) goto L_0x0113
            float[] r2 = new float[r6]
            r1 = 0
            float r0 = r3.getTranslationY()
            r2[r1] = r0
            r1 = 1
            float r0 = (float) r5
            r2[r1] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r3, r0, r2)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r2.start()
            goto L_0x00fb
        L_0x0153:
            java.lang.Object r3 = r8.A01
            X.P1D r3 = (X.P1D) r3
            boolean r0 = X.AnonymousClass7TF.A1R(r9)
            r3.A01 = r0
            float r0 = (float) r9
            float r2 = -r0
            android.view.ViewGroup r1 = r3.A04
            float r0 = r1.getTranslationY()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x017d
            X.5nL r0 = X.JTP.A0b(r1)
            X.5nL r1 = r0.A0A()
            X.2co r0 = X.C71066Oal.A0F
            X.5nL r0 = r1.A0E(r0)
            r0.A0K(r2)
            r0.A0H()
        L_0x017d:
            X.7HL r0 = r3.A08
            goto L_0x01ac
        L_0x0180:
            java.lang.Object r3 = r8.A01
            X.P1C r3 = (X.P1C) r3
            boolean r0 = X.AnonymousClass7TF.A1R(r9)
            r3.A00 = r0
            float r0 = (float) r9
            float r2 = -r0
            android.view.ViewGroup r1 = r3.A05
            float r0 = r1.getTranslationY()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x01aa
            X.5nL r0 = X.JTP.A0b(r1)
            X.5nL r1 = r0.A0A()
            X.2co r0 = X.C71066Oal.A0F
            X.5nL r0 = r1.A0E(r0)
            r0.A0K(r2)
            r0.A0H()
        L_0x01aa:
            X.7HL r0 = r3.A07
        L_0x01ac:
            r0.DMs(r9)
            return
        L_0x01b0:
            java.lang.Object r7 = r8.A01
            X.NV0 r7 = (X.NV0) r7
            X.6rV r6 = r7.A06
            X.0YZ[] r5 = X.NV0.A0I
            r4 = 5
            android.view.View r0 = X.C66940MfZ.A00(r6, r7, r5, r4)
            android.view.ViewGroup$MarginLayoutParams r3 = X.DbX.A0G(r0)
            android.content.Context r0 = r7.requireContext()
            int r0 = X.DbY.A01(r0)
            int r9 = r9 + r0
            goto L_0x01dc
        L_0x01cb:
            java.lang.Object r7 = r8.A01
            X.NUz r7 = (X.C68739NUz) r7
            X.6rV r6 = r7.A02
            X.0YZ[] r5 = X.C68739NUz.A0D
            r4 = 1
            android.view.View r0 = X.C66940MfZ.A00(r6, r7, r5, r4)
            android.view.ViewGroup$MarginLayoutParams r3 = X.DbX.A0G(r0)
        L_0x01dc:
            int r2 = r3.leftMargin
            int r1 = r3.topMargin
            int r0 = r3.rightMargin
            r3.setMargins(r2, r1, r0, r9)
            android.view.View r0 = X.C66940MfZ.A00(r6, r7, r5, r4)
            r0.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72237Oz5.DMr(int, boolean):void");
    }
}
