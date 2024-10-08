package X;

/* renamed from: X.Wr6  reason: case insensitive filesystem */
public final class C20421Wr6 implements C61910qF, 02o {
    public final int A00;
    public final Object A01;

    public C20421Wr6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0116, code lost:
        if (X.C308426Uf.A00.A00(r11, r6) == false) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r2 = r18
            r1 = r19
            int r0 = r2.A00
            X.X1g r1 = (X.C20854X1g) r1
            if (r0 == 0) goto L_0x0032
            java.lang.Object r2 = r2.A01
            X.VYp r2 = (X.C17511VYp) r2
            boolean r0 = r1 instanceof X.UOL
            if (r0 == 0) goto L_0x002a
            X.UOL r1 = (X.UOL) r1
            android.view.View r5 = r2.A00
            android.widget.TextView r4 = r2.A01
            X.0eM r0 = r2.A02
            java.lang.Object r3 = r0.getValue()
            r2 = 4
            X.WvX r0 = new X.WvX
            r0.<init>(r3, r2)
            X.VI1.A00(r5, r4, r1, r0)
        L_0x0027:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x002a:
            android.view.View r1 = r2.A00
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0027
        L_0x0032:
            java.lang.Object r0 = r2.A01
            X.VtD r0 = (X.C18514VtD) r0
            boolean r2 = r1 instanceof X.UOK
            if (r2 == 0) goto L_0x0242
            r4 = r1
            X.UOK r4 = (X.UOK) r4
            java.lang.Integer r5 = r4.A02
            X.X1g r3 = r0.A00
            boolean r2 = r3 instanceof X.UOK
            if (r2 == 0) goto L_0x023f
            X.UOK r3 = (X.UOK) r3
            if (r3 == 0) goto L_0x023f
            java.lang.Integer r2 = r3.A02
        L_0x004b:
            if (r5 == r2) goto L_0x00e8
            int r3 = r5.intValue()
            r7 = 0
            if (r3 == r7) goto L_0x0228
            r2 = 1
            if (r3 == r2) goto L_0x021c
            r2 = 2
            if (r3 == r2) goto L_0x0205
            r2 = 3
            if (r3 != r2) goto L_0x0258
            android.view.View r6 = r0.A02
            X.07Z r2 = r0.A05
            X.07V r2 = r2.getLifecycle()
            X.0qQ.A0B(r2, r7)
            X.VX9 r2 = X.C64072LLq.A00(r2)
            X.0eM r2 = r2.A02
            java.lang.Object r2 = r2.getValue()
            X.VPd r2 = (X.C17276VPd) r2
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r2.A00
            android.view.View r2 = r2.A0F
            r7 = 0
            if (r2 == 0) goto L_0x0202
            java.lang.Object r3 = r2.getTag()
        L_0x007f:
            boolean r2 = r3 instanceof X.C316036l0
            if (r2 == 0) goto L_0x0086
            r7 = r3
            X.6l0 r7 = (X.C316036l0) r7
        L_0x0086:
            java.lang.Class<X.VtD> r3 = X.C18514VtD.class
            X.0Yh r2 = new X.0Yh
            r2.<init>(r3)
            java.lang.Class r2 = r2.A00
            java.lang.String r2 = X.0q1.A01(r2)
            java.lang.String r5 = java.lang.String.valueOf(r2)
            r3 = 0
            if (r7 == 0) goto L_0x01ff
            com.instagram.ui.widget.textureview.ScalingTextureView r2 = r7.C5p()
            com.instagram.feed.widget.IgProgressImageView r3 = r7.BGP()
        L_0x00a2:
            android.view.View[] r2 = new android.view.View[]{r2, r3}
            X.Vc0 r7 = new X.Vc0
            r7.<init>(r6, r5, r2)
            r2 = 4
            r7.A00 = r2
            android.content.Context r5 = r0.A01
            r2 = 2131100283(0x7f06027b, float:1.7812943E38)
            int r2 = r5.getColor(r2)
            r7.A03 = r2
            android.content.res.Resources r3 = r5.getResources()
            r2 = 2131165219(0x7f070023, float:1.7944649E38)
            int r2 = r3.getDimensionPixelSize(r2)
            r7.A01 = r2
            X.U1A r2 = new X.U1A
            r2.<init>(r7)
            r6.setBackground(r2)
            int r5 = X.C66582MXn.A01(r5)
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            r2 = 3
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.0qQ.A0C(r3, r2)
            X.2dQ r3 = (X.C71492dQ) r3
            r3.A0e = r5
            r6.setLayoutParams(r3)
            r6.setMinimumHeight(r5)
        L_0x00e8:
            android.view.View r8 = r0.A02
            r3 = 0
            r8.setVisibility(r3)
            android.widget.TextView r5 = r0.A04
            r5.setVisibility(r3)
            android.view.View r6 = r0.A03
            r6.setVisibility(r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r2)
            X.U91 r9 = X.C18514VtD.A00(r0)
            com.instagram.common.session.UserSession r11 = r0.A06
            X.UOF r2 = X.U91.A00(r9)
            if (r2 == 0) goto L_0x0118
            com.instagram.user.model.User r6 = X.C17103VHz.A00(r2)
            if (r6 == 0) goto L_0x0118
            X.6Uf r2 = X.C308426Uf.A00
            boolean r2 = r2.A00(r11, r6)
            r7 = 1
            if (r2 != 0) goto L_0x0119
        L_0x0118:
            r7 = 0
        L_0x0119:
            X.Vbe r2 = r9.A08
            java.lang.String r6 = X.U91.A01(r9)
            X.Vgm r2 = r2.A03
            r2.A00(r6, r7)
            X.X1e r9 = r4.A00
            java.lang.String r2 = r4.A03
            X.X1g r7 = r0.A00
            boolean r6 = r7 instanceof X.UOK
            if (r6 == 0) goto L_0x01fc
            X.UOK r7 = (X.UOK) r7
            if (r7 == 0) goto L_0x01fc
            X.X1e r6 = r7.A00
        L_0x0134:
            boolean r6 = X.0qQ.A0K(r6, r9)
            if (r6 != 0) goto L_0x018d
            com.instagram.common.ui.base.IgEditText r6 = r0.A07
            boolean r6 = X.VI0.A00(r6, r9)
            if (r6 != 0) goto L_0x018d
            X.U91 r10 = X.C18514VtD.A00(r0)
            X.0Ud r6 = r10.A0G
            java.lang.Object r6 = r6.getValue()
            boolean r7 = r6 instanceof X.UOK
            r14 = 0
            if (r7 == 0) goto L_0x018d
            X.UOK r6 = (X.UOK) r6
            if (r6 == 0) goto L_0x018d
            X.05G r7 = r10.A0E
            X.UOF r9 = X.U91.A00(r10)
            if (r9 == 0) goto L_0x0161
            com.instagram.user.model.User r14 = X.C17103VHz.A00(r9)
        L_0x0161:
            X.6d8 r12 = r10.A03
            X.VPf r13 = r10.A0A
            X.VgI r9 = r10.A0B
            boolean r16 = r9.A00()
            r15 = 0
            r17 = 1
            X.X1e r13 = X.W2B.A00(r12, r13, r14, r15, r16, r17)
            java.lang.String r10 = r6.A03
            java.lang.Integer r15 = r6.A02
            boolean r9 = r6.A04
            X.X1f r14 = r6.A01
            X.AnonymousClass7TG.A1T(r13, r10, r15)
            r6 = 4
            X.0qQ.A0B(r14, r6)
            X.UOK r12 = new X.UOK
            r17 = r9
            r16 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            r7.Epw(r12)
        L_0x018d:
            com.instagram.common.ui.base.IgEditText r7 = r0.A07
            java.lang.String r6 = X.AnonymousClass7TF.A0f(r7)
            boolean r6 = X.0qQ.A0K(r2, r6)
            if (r6 != 0) goto L_0x01a3
            r7.setText(r2)
            int r2 = r7.length()
            r7.setSelection(r2)
        L_0x01a3:
            boolean r2 = r4.A04
            r5.setEnabled(r2)
            X.X1f r5 = r4.A01
            com.instagram.common.ui.base.IgTextView r4 = r0.A08
            android.content.Context r10 = r4.getContext()
            boolean r2 = r10 instanceof android.app.Activity
            if (r2 == 0) goto L_0x01dc
            android.app.Activity r10 = (android.app.Activity) r10
            if (r10 == 0) goto L_0x01dc
            boolean r2 = r5 instanceof X.UOI
            if (r2 == 0) goto L_0x01e0
            r4.setVisibility(r3)
            X.1px r9 = X.AnonymousClass1q4.A00()
            X.UOI r5 = (X.UOI) r5
            java.lang.String r13 = r5.A01
            int r15 = r4.getLineHeight()
            int r2 = r4.getCurrentTextColor()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            java.lang.String r14 = r5.A00
            android.text.SpannableStringBuilder r2 = r9.C19(r10, r11, r12, r13, r14, r15)
            X.DbX.A1G(r4, r2)
        L_0x01dc:
            r0.A00 = r1
            goto L_0x0027
        L_0x01e0:
            boolean r2 = r5 instanceof X.C19665WdT
            if (r2 == 0) goto L_0x01f6
            r4.setVisibility(r3)
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r8)
            r2 = 2131974506(0x7f13596a, float:1.9586078E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r2)
            r4.setText(r2)
            goto L_0x01dc
        L_0x01f6:
            r2 = 8
            r4.setVisibility(r2)
            goto L_0x01dc
        L_0x01fc:
            r6 = 0
            goto L_0x0134
        L_0x01ff:
            r2 = r3
            goto L_0x00a2
        L_0x0202:
            r3 = r7
            goto L_0x007f
        L_0x0205:
            android.view.View r5 = r0.A02
            android.content.Context r3 = r0.A01
            r2 = 2131240024(0x7f082458, float:1.8096371E38)
            X.DbU.A11(r3, r5, r2)
            com.instagram.common.ui.base.IgEditText r3 = r0.A07
            r2 = -1
            r3.setHintTextColor(r2)
            android.view.View r2 = r0.A03
            r2.setBackgroundColor(r7)
            goto L_0x00e8
        L_0x021c:
            android.view.View r5 = r0.A02
            android.content.Context r3 = r0.A01
            r2 = 2131240022(0x7f082456, float:1.8096367E38)
            X.DbU.A11(r3, r5, r2)
            goto L_0x00e8
        L_0x0228:
            android.view.View r5 = r0.A03
            r2 = 0
            r5.setAlpha(r2)
            r3 = 8
            r5.setVisibility(r3)
            android.widget.TextView r2 = r0.A04
            r2.setVisibility(r3)
            android.view.View r2 = r0.A02
            r2.setVisibility(r3)
            goto L_0x00e8
        L_0x023f:
            r2 = 0
            goto L_0x004b
        L_0x0242:
            android.view.View r4 = r0.A03
            r2 = 0
            r4.setAlpha(r2)
            r3 = 8
            r4.setVisibility(r3)
            android.widget.TextView r2 = r0.A04
            r2.setVisibility(r3)
            android.view.View r2 = r0.A02
            r2.setVisibility(r3)
            goto L_0x01dc
        L_0x0258:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20421Wr6.emit(java.lang.Object, X.4D7):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof 02o) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        Class cls;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            cls = C17511VYp.class;
        } else {
            cls = C18514VtD.class;
        }
        return new 0Yk(2, obj, cls, "updateState", "updateState(Lcom/instagram/stories/messagecomposer/domain/StoriesMessageComposerViewModel$UiState;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
