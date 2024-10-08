package X;

public final class IP1 implements C252213ok {
    public final int A00;
    public final Object A01;

    public IP1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r8 > 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMr(int r8, boolean r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0103
            java.lang.Object r3 = r7.A01
            X.H1O r3 = (X.H1O) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r3.A09 = r0
            X.0eM r0 = r3.A0P
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            java.lang.String r6 = "composerContainer"
            r4 = 1
            if (r0 != 0) goto L_0x0061
            android.view.View r1 = r3.A02
            if (r1 == 0) goto L_0x00f6
            X.0eM r0 = r3.A0J
            int r0 = X.DbX.A07(r0)
            int r0 = r0 + r8
            X.0nA.A0T(r1, r0)
            if (r8 <= 0) goto L_0x0041
        L_0x0029:
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x00f6
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x003f
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x00f6
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r4)
        L_0x003f:
            r3.A0A = r4
        L_0x0041:
            X.H1O.A04(r3)
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0058
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x0058
            if (r8 != 0) goto L_0x0058
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r3.A07
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.isChecked()
            if (r0 != r4) goto L_0x0059
        L_0x0058:
            return
        L_0x0059:
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0058
            X.DbT.A1J(r3)
            return
        L_0x0061:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r3.A07
            if (r8 <= 0) goto L_0x00d1
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r0.isChecked()
            if (r0 != r4) goto L_0x00c0
            float r0 = (float) r8
            float r2 = -r0
            android.view.View r1 = r3.requireView()
            r0 = 2131442871(0x7f0b3cb7, float:1.8507794E38)
            android.view.View r0 = r1.requireViewById(r0)
            int r1 = r0.getHeight()
            android.content.Context r0 = r3.requireContext()
            int r5 = X.AnonymousClass0nB.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            int r0 = X.2db.A01(r0)
            int r5 = r5 - r0
            int r5 = r5 - r1
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x00f6
            int r0 = r0.getHeight()
            int r5 = r5 - r0
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x00f6
            int r0 = X.0nA.A0C(r0)
            int r5 = r5 - r0
            android.view.View r1 = r3.A02
            if (r1 == 0) goto L_0x00f6
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00be
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r1)
            int r0 = r0.bottomMargin
        L_0x00b4:
            int r5 = r5 - r0
            int r5 = r5 - r8
            float r1 = (float) r5
            X.Iqy r0 = X.C58379Iqy.A00
            X.H1O.A07(r3, r0, r2, r1)
            goto L_0x0029
        L_0x00be:
            r0 = 0
            goto L_0x00b4
        L_0x00c0:
            android.view.ViewGroup r0 = r3.A03
            if (r0 == 0) goto L_0x00fe
            X.0nA.A0V(r0, r8)
            android.view.ViewGroup r1 = r3.A03
            if (r1 == 0) goto L_0x0029
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x0029
        L_0x00d1:
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.isChecked()
            if (r0 != r4) goto L_0x0041
            X.0eM r0 = r3.A0Q
            boolean r0 = X.G9t.A1b(r0)
            if (r0 == 0) goto L_0x0041
            r1 = 1058642330(0x3f19999a, float:0.6)
            android.content.Context r0 = r3.requireContext()
            int r0 = X.AnonymousClass0nB.A00(r0)
            float r2 = (float) r0
            float r2 = r2 * r1
            r1 = 0
            X.Iqy r0 = X.C58379Iqy.A00
            X.H1O.A07(r3, r0, r1, r2)
            goto L_0x0041
        L_0x00f6:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0103:
            java.lang.Object r0 = r7.A01
            X.H0X r0 = (X.H0X) r0
            X.0eM r0 = r0.A08
            java.lang.Object r2 = r0.getValue()
            X.GhJ r2 = (X.C53028GhJ) r2
            if (r8 <= 0) goto L_0x0118
            r0 = 1
            r2.A06 = r0
        L_0x0114:
            X.C53028GhJ.A00(r2)
            return
        L_0x0118:
            r1 = 0
            r2.A06 = r1
            java.lang.String r0 = r2.A01
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x0127
            r0 = 1
            r2.A05 = r0
            goto L_0x0114
        L_0x0127:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0114
            r2.A05 = r1
            r2.A01()
            goto L_0x0114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IP1.DMr(int, boolean):void");
    }
}
