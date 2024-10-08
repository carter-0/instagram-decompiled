package X;

/* renamed from: X.LjX  reason: case insensitive filesystem */
public final class C64871LjX implements C252213ok {
    public final int A00;
    public final Object A01;

    public C64871LjX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r2 = (X.C62041KXd) r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        r0.clearFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ff, code lost:
        r1.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0102, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        X.AnonymousClass7TE.A1Z(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0191, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0198, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMr(int r10, boolean r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            r6 = r10
            switch(r0) {
                case 0: goto L_0x0133;
                case 1: goto L_0x00ea;
                case 2: goto L_0x000e;
                case 3: goto L_0x0177;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00b2;
                case 6: goto L_0x0092;
                case 7: goto L_0x0081;
                case 8: goto L_0x005e;
                case 9: goto L_0x0048;
                case 10: goto L_0x012b;
                case 11: goto L_0x0116;
                case 12: goto L_0x0103;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r9.A01
            X.LOw r0 = (X.C64125LOw) r0
            X.C64125LOw.A00(r0)
        L_0x000d:
            return
        L_0x000e:
            r3 = 0
            r2 = 1
            if (r10 != 0) goto L_0x0027
            r2 = 0
            java.lang.Object r1 = r9.A01
            X.KG4 r1 = (X.KG4) r1
            X.Joy r0 = r1.A00
            if (r0 == 0) goto L_0x0027
            android.widget.EditText r0 = r0.A01
            r0.clearFocus()
            X.L0K r0 = r1.A04
            X.Lh1 r0 = r0.A00
            X.C64724Lh1.A00(r0)
        L_0x0027:
            java.lang.Object r0 = r9.A01
            X.KG4 r0 = (X.KG4) r0
            android.view.View r0 = r0.A01
            X.5nL r1 = X.C294975nL.A01(r0, r3)
            float r0 = (float) r10
            float r0 = -r0
            r1.A0K(r0)
            r1.A04 = r3
            if (r2 != 0) goto L_0x003c
            r3 = 8
        L_0x003c:
            r1.A03 = r3
            r0 = 0
            if (r2 == 0) goto L_0x0043
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0043:
            r1.A0I(r0)
            goto L_0x00ff
        L_0x0048:
            if (r10 > 0) goto L_0x000d
            java.lang.Object r2 = r9.A01
            X.KXd r2 = (X.C62041KXd) r2
            com.instagram.common.ui.base.IgEditText r0 = r2.A02
            r1 = 1
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.hasFocus()
            if (r0 != r1) goto L_0x000d
            com.instagram.common.ui.base.IgEditText r0 = r2.A02
            if (r0 == 0) goto L_0x000d
            goto L_0x00bc
        L_0x005e:
            java.lang.Object r1 = r9.A01
            X.LZa r1 = (X.C64300LZa) r1
            r3 = 0
            boolean r0 = X.AnonymousClass7TF.A1R(r10)
            r1.A00 = r0
            android.view.View r2 = r1.A02
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x000d
            r0 = r1
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r10 <= 0) goto L_0x007e
            r0.bottomMargin = r10
        L_0x007a:
            r2.setLayoutParams(r1)
            return
        L_0x007e:
            r0.bottomMargin = r3
            goto L_0x007a
        L_0x0081:
            if (r10 != 0) goto L_0x000d
            java.lang.Object r0 = r9.A01
            X.K66 r0 = (X.K66) r0
            X.LBG r0 = r0.A06
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = "viewHolder"
            goto L_0x0191
        L_0x008f:
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r0.A0A
            goto L_0x00bc
        L_0x0092:
            java.lang.Object r1 = r9.A01
            X.K5H r1 = (X.K5H) r1
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x000d
            android.app.Activity r0 = r1.getRootActivity()
            if (r0 == 0) goto L_0x000d
            android.app.Activity r0 = r1.getRootActivity()
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x000d
            android.view.View r0 = r1.A07
            if (r0 == 0) goto L_0x000d
            X.0nA.A0T(r0, r10)
            return
        L_0x00b2:
            if (r10 != 0) goto L_0x000d
            java.lang.Object r0 = r9.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = X.LQa.A01(r0)
        L_0x00bc:
            r0.clearFocus()
            return
        L_0x00c0:
            java.lang.Object r3 = r9.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r3 = (com.instagram.creation.fragment.EditMediaInfoFragment) r3
            android.view.View r1 = r3.mScrollView
            if (r1 == 0) goto L_0x000d
            android.view.ViewGroup r0 = r3.mMediaTitleLayout
            if (r0 == 0) goto L_0x000d
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r4 = r1.getDimensionPixelOffset(r0)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
        L_0x00df:
            android.app.Activity r0 = r1.getParent()
            if (r0 == 0) goto L_0x0140
            android.app.Activity r1 = r1.getParent()
            goto L_0x00df
        L_0x00ea:
            java.lang.Object r0 = r9.A01
            X.Ll3 r0 = (X.C64964Ll3) r0
            android.view.View r0 = r0.A04
            if (r0 == 0) goto L_0x000d
            X.5nL r0 = X.JTP.A0b(r0)
            X.5nL r1 = r0.A0A()
            float r0 = (float) r10
            float r0 = -r0
            r1.A0K(r0)
        L_0x00ff:
            r1.A0H()
            return
        L_0x0103:
            java.lang.Object r0 = r9.A01
            X.M0b r0 = (X.C65809M0b) r0
            X.JiJ r2 = r0.A09
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 18
            X.MGv r3 = new X.MGv
            r3.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r1, (int) r0)
            goto L_0x0127
        L_0x0116:
            int r0 = X.AnonymousClass2uJ.A01
            boolean r8 = X.C51970G9q.A1W(r10, r0)
            java.lang.Object r4 = r9.A01
            X.4Cq r4 = (X.C262224Cq) r4
            r5 = 0
            r7 = 1
            X.MEU r3 = new X.MEU
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x0127:
            X.AnonymousClass7TE.A1Z(r3, r4)
            return
        L_0x012b:
            java.lang.Object r0 = r9.A01
            X.0sP r0 = (X.0sP) r0
            X.C51967G9n.A0w(r10, r0)
            return
        L_0x0133:
            java.lang.Object r1 = r9.A01
            X.LCe r1 = (X.LCe) r1
            X.JyY r0 = new X.JyY
            r0.<init>(r10)
            r1.A00(r0)
            return
        L_0x0140:
            android.view.Window r0 = r1.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            int r1 = r0.getHeight()
            android.view.ViewGroup r0 = r3.mActionBar
            if (r0 == 0) goto L_0x0175
            int r0 = r0.getHeight()
        L_0x0157:
            int r1 = r1 - r0
            android.view.ViewGroup r0 = r3.mMediaTitleLayout
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            int r0 = X.2db.A01(r0)
            int r1 = r1 - r0
            int r1 = r1 - r4
            int r1 = r1 - r10
            int r0 = X.AnonymousClass2uJ.A00
            int r1 = r1 - r0
            r2.height = r1
            android.view.View r0 = r3.mScrollView
            r0.setLayoutParams(r2)
            return
        L_0x0175:
            r0 = 0
            goto L_0x0157
        L_0x0177:
            java.lang.Object r2 = r9.A01
            X.LmV r2 = (X.C65051LmV) r2
            int r0 = r2.A00
            if (r0 <= r10) goto L_0x0189
            X.80U r1 = r2.A0E
            X.8SD r0 = new X.8SD
            r0.<init>()
            r1.E3H(r0)
        L_0x0189:
            r2.A00 = r10
            android.view.View r1 = r2.A02
            if (r1 != 0) goto L_0x0199
            java.lang.String r0 = "editorView"
        L_0x0191:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0199:
            int r0 = -r10
            int r0 = r0 / 2
            float r0 = (float) r0
            r1.setTranslationY(r0)
            android.widget.TextView r1 = r2.A03
            if (r1 != 0) goto L_0x01a7
            java.lang.String r0 = "helperText"
            goto L_0x0191
        L_0x01a7:
            float r0 = (float) r10
            float r0 = -r0
            r1.setTranslationY(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64871LjX.DMr(int, boolean):void");
    }
}
