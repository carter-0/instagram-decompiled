package X;

/* renamed from: X.2ay  reason: invalid class name and case insensitive filesystem */
public final class C71142ay implements AnonymousClass03Q {
    public final /* synthetic */ 2X4 A00;

    public C71142ay(2X4 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d4, code lost:
        if (r13 != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0109, code lost:
        r4 = (android.view.ViewGroup.MarginLayoutParams) r2.getLayoutParams();
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.04k Cvn(android.view.View r16, X.04k r17) {
        /*
            r15 = this;
            r11 = r17
            X.04h r10 = r11.A00
            X.02M r0 = r10.A03()
            int r9 = r0.A03
            X.2X4 r8 = r15.A00
            r7 = 0
            X.02M r0 = r10.A03()
            int r6 = r0.A03
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A0M
            r12 = 8
            if (r0 == 0) goto L_0x014a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x014a
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A0M
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A0M
            boolean r0 = r0.isShown()
            r14 = 1
            if (r0 == 0) goto L_0x0142
            android.graphics.Rect r0 = r8.A05
            if (r0 != 0) goto L_0x0044
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.A05 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.A06 = r0
        L_0x0044:
            android.graphics.Rect r2 = r8.A05
            android.graphics.Rect r4 = r8.A06
            X.02M r0 = r10.A03()
            int r13 = r0.A01
            X.02M r0 = r10.A03()
            int r3 = r0.A03
            X.02M r0 = r10.A03()
            int r1 = r0.A02
            int r0 = r11.A02()
            r2.set(r13, r3, r1, r0)
            android.view.ViewGroup r0 = r8.A09
            X.C10049Rlm.A00(r2, r4, r0)
            int r4 = r2.top
            int r3 = r2.left
            int r2 = r2.right
            android.view.ViewGroup r0 = r8.A09
            X.04k r0 = X.C586203k.A00(r0)
            if (r0 != 0) goto L_0x0132
            r1 = 0
            r0 = 0
        L_0x0076:
            int r13 = r5.topMargin
            if (r13 != r4) goto L_0x0129
            int r13 = r5.leftMargin
            if (r13 != r3) goto L_0x0129
            int r13 = r5.rightMargin
            if (r13 != r2) goto L_0x0129
            r13 = 0
        L_0x0083:
            if (r4 <= 0) goto L_0x0105
            android.view.View r2 = r8.A08
            if (r2 != 0) goto L_0x0105
            android.content.Context r3 = r8.A0l
            android.view.View r2 = new android.view.View
            r2.<init>(r3)
            r8.A08 = r2
            r2.setVisibility(r12)
            int r12 = r5.topMargin
            r4 = 51
            r3 = -1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r3, r12, r4)
            r2.leftMargin = r1
            r2.rightMargin = r0
            android.view.ViewGroup r1 = r8.A09
            android.view.View r0 = r8.A08
            r1.addView(r0, r3, r2)
        L_0x00aa:
            android.view.View r0 = r8.A08
            if (r0 == 0) goto L_0x0103
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00cd
            android.view.View r3 = r8.A08
            int r0 = r3.getWindowSystemUiVisibility()
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            android.content.Context r1 = r8.A0l
            r0 = 2131099650(0x7f060002, float:1.781166E38)
            if (r2 == 0) goto L_0x00c6
            r0 = 2131099651(0x7f060003, float:1.7811661E38)
        L_0x00c6:
            int r0 = r1.getColor(r0)
            r3.setBackgroundColor(r0)
        L_0x00cd:
            boolean r0 = r8.A0d
            if (r0 != 0) goto L_0x00d4
            if (r14 == 0) goto L_0x00d4
            r6 = 0
        L_0x00d4:
            if (r13 == 0) goto L_0x00db
        L_0x00d6:
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A0M
            r0.setLayoutParams(r5)
        L_0x00db:
            android.view.View r0 = r8.A08
            if (r0 == 0) goto L_0x00e6
            if (r14 != 0) goto L_0x00e3
            r7 = 8
        L_0x00e3:
            r0.setVisibility(r7)
        L_0x00e6:
            if (r9 == r6) goto L_0x00fc
            X.02M r0 = r10.A03()
            int r2 = r0.A01
            X.02M r0 = r10.A03()
            int r1 = r0.A02
            int r0 = r11.A02()
            X.04k r11 = r11.A04(r2, r6, r1, r0)
        L_0x00fc:
            r0 = r16
            X.04k r0 = X.03v.A05(r0, r11)
            return r0
        L_0x0103:
            r14 = 0
            goto L_0x00cd
        L_0x0105:
            android.view.View r2 = r8.A08
            if (r2 == 0) goto L_0x00aa
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r2 = r4.height
            int r3 = r5.topMargin
            if (r2 != r3) goto L_0x011d
            int r2 = r4.leftMargin
            if (r2 != r1) goto L_0x011d
            int r2 = r4.rightMargin
            if (r2 == r0) goto L_0x00aa
        L_0x011d:
            r4.height = r3
            r4.leftMargin = r1
            r4.rightMargin = r0
            android.view.View r0 = r8.A08
            r0.setLayoutParams(r4)
            goto L_0x00aa
        L_0x0129:
            r5.topMargin = r4
            r5.leftMargin = r3
            r5.rightMargin = r2
            r13 = 1
            goto L_0x0083
        L_0x0132:
            X.04h r13 = r0.A00
            X.02M r0 = r13.A03()
            int r1 = r0.A01
            X.02M r0 = r13.A03()
            int r0 = r0.A02
            goto L_0x0076
        L_0x0142:
            int r0 = r5.topMargin
            if (r0 == 0) goto L_0x014a
            r5.topMargin = r7
            r14 = 0
            goto L_0x00d6
        L_0x014a:
            r14 = 0
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71142ay.Cvn(android.view.View, X.04k):X.04k");
    }
}
