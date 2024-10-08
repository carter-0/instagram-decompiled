package X;

import android.view.ViewStub;

/* renamed from: X.Okf  reason: case insensitive filesystem */
public final class C71440Okf implements ViewStub.OnInflateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71440Okf(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013d, code lost:
        if (r10 == 2) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0142, code lost:
        if (r10 != 0) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0144, code lost:
        r1 = com.instagram.android.R.id.secondary_style_button;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0147, code lost:
        if (r10 != 2) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0149, code lost:
        r1 = com.instagram.android.R.id.primary_style_button;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014c, code lost:
        r4 = X.C66583MXo.A0A(X.DbV.A0D(r6), r6, r4);
        r1 = X.JTR.A0n(r4, r1);
        r1.setText(r12);
        r1.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015e, code lost:
        if (r10 != 2) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0160, code lost:
        r1.setStyle(X.C273014lo.PRIMARY_LINK);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0165, code lost:
        X.AnonymousClass0fU.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInflate(android.view.ViewStub r16, android.view.View r17) {
        /*
            r15 = this;
            r5 = r17
            int r0 = r15.A00
            if (r0 == 0) goto L_0x0038
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r0 = r15.A01
            X.LSN r0 = (X.LSN) r0
            androidx.fragment.app.FragmentActivity r4 = r0.A0I
            r0 = 2131969876(0x7f134754, float:1.9576687E38)
            java.lang.String r3 = r4.getString(r0)
            r0 = 2131969877(0x7f134755, float:1.957669E38)
            android.text.SpannableStringBuilder r2 = X.DbY.A0D(r4, r3, r0)
            android.content.res.Resources r1 = r4.getResources()
            int r0 = X.2Yu.A06(r4)
            int r0 = r1.getColor(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.Ngx r0 = new X.Ngx
            r0.<init>((X.C71440Okf) r15, (java.lang.Integer) r1)
            X.AnonymousClass7AV.A05(r2, r0, r3)
            X.DbX.A1G(r5, r2)
        L_0x0037:
            return
        L_0x0038:
            r3 = 1
            X.0qQ.A0B(r5, r3)
            java.lang.Object r8 = r15.A01
            X.Nct r8 = (X.C69017Nct) r8
            java.lang.Object r11 = r15.A02
            r7 = 0
            X.0qQ.A0B(r8, r3)
            r9 = 2
            r0 = 2131436064(0x7f0b2220, float:1.8493988E38)
            android.view.View r0 = r5.requireViewById(r0)
            X.0qQ.A07(r0)
            android.widget.TextView r12 = X.C66582MXn.A0F(r5)
            r0 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131434180(0x7f0b1ac4, float:1.8490167E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r5, r0)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 2131431929(0x7f0b11f9, float:1.8485601E38)
            android.widget.ImageView r2 = X.DbX.A0J(r5, r0)
            r1 = 2131436072(0x7f0b2228, float:1.8494004E38)
            android.view.View r0 = r5.requireViewById(r1)
            X.0qQ.A07(r0)
            int[] r14 = X.OSO.A00
            r4 = 4
            r13 = 0
        L_0x007a:
            r0 = r14[r13]
            android.view.View r0 = r5.findViewById(r0)
            X.0nA.A0O(r0)
            int r13 = r13 + 1
            if (r13 < r4) goto L_0x007a
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x00a0
            r0 = 2131436067(0x7f0b2223, float:1.8493994E38)
            android.view.View r13 = X.AnonymousClass7TE.A0b(r5, r0)
            r0 = 0
            r13.setBackground(r0)
            r0 = 2131436076(0x7f0b222c, float:1.8494012E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r5, r0)
            r0.setVisibility(r7)
        L_0x00a0:
            android.view.View r0 = r5.findViewById(r1)
            X.0nA.A0O(r0)
            r5.setFocusable(r3)
            r5.setClickable(r3)
            java.lang.String r13 = r8.A07
            java.lang.Float r1 = r8.A03
            if (r13 == 0) goto L_0x01a2
            int r0 = r13.length()
            if (r0 == 0) goto L_0x01a2
            r12.setText(r13)
            if (r1 == 0) goto L_0x00c5
            float r0 = r1.floatValue()
            r12.setTextSize(r7, r0)
        L_0x00c5:
            java.lang.String r1 = r8.A04
            if (r1 == 0) goto L_0x019b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x019b
            r10.setText(r1)
        L_0x00d2:
            r0 = 5
            X.C71396Ojv.A00(r2, r0, r11)
            android.content.Context r1 = r2.getContext()
            r0 = 2131960863(0x7f13241f, float:1.9558407E38)
            X.DbU.A12(r1, r2, r0)
            android.content.Context r0 = r5.getContext()
            int r0 = X.C66581MXm.A02(r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            X.0qQ.A07(r0)
            r2.setImageTintList(r0)
            java.lang.String r12 = r8.A05
            int r5 = r8.A01
            r0 = 3
            X.Ojv r10 = new X.Ojv
            r10.<init>(r11, r0)
            if (r12 == 0) goto L_0x0199
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0199
            r2 = 2131626075(0x7f0e085b, float:1.8879376E38)
            r1 = 2131438190(0x7f0b2a6e, float:1.84983E38)
            if (r5 == 0) goto L_0x0112
            r2 = 2131626076(0x7f0e085c, float:1.8879378E38)
            r1 = 2131440872(0x7f0b34e8, float:1.850374E38)
        L_0x0112:
            android.view.LayoutInflater r0 = X.DbV.A0D(r6)
            android.view.View r5 = X.C66583MXo.A0A(r0, r6, r2)
            com.instagram.igds.components.button.IgdsButton r0 = X.JTR.A0n(r5, r1)
            r0.setText((java.lang.String) r12)
            r0.setVisibility(r7)
            X.AnonymousClass0fU.A00(r10, r0)
        L_0x0127:
            java.lang.String r12 = r8.A06
            int r10 = r8.A02
            X.Ojv r2 = new X.Ojv
            r2.<init>(r11, r4)
            if (r12 == 0) goto L_0x0197
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0197
            if (r10 == 0) goto L_0x013f
            r4 = 2131626076(0x7f0e085c, float:1.8879378E38)
            if (r10 != r9) goto L_0x0144
        L_0x013f:
            r4 = 2131626075(0x7f0e085b, float:1.8879376E38)
            if (r10 == 0) goto L_0x0149
        L_0x0144:
            r1 = 2131440872(0x7f0b34e8, float:1.850374E38)
            if (r10 != r9) goto L_0x014c
        L_0x0149:
            r1 = 2131438190(0x7f0b2a6e, float:1.84983E38)
        L_0x014c:
            android.view.LayoutInflater r0 = X.DbV.A0D(r6)
            android.view.View r4 = X.C66583MXo.A0A(r0, r6, r4)
            com.instagram.igds.components.button.IgdsButton r1 = X.JTR.A0n(r4, r1)
            r1.setText((java.lang.String) r12)
            r1.setVisibility(r7)
            if (r10 != r9) goto L_0x0165
            X.4lo r0 = X.C273014lo.PRIMARY_LINK
            r1.setStyle(r0)
        L_0x0165:
            X.AnonymousClass0fU.A00(r2, r1)
        L_0x0168:
            r6.setVisibility(r7)
            int r10 = r6.getPaddingLeft()
            int r9 = r6.getPaddingTop()
            int r2 = r6.getPaddingRight()
            android.content.Context r1 = r6.getContext()
            int r0 = X.AnonymousClass7TG.A06(r1)
            r6.setPadding(r10, r9, r2, r0)
            int r0 = r8.A00
            if (r0 != 0) goto L_0x01a9
            r6.setOrientation(r3)
            r6.setGravity(r3)
            if (r5 == 0) goto L_0x0191
            r6.addView(r5)
        L_0x0191:
            if (r4 == 0) goto L_0x0037
            r6.addView(r4)
            return
        L_0x0197:
            r4 = 0
            goto L_0x0168
        L_0x0199:
            r5 = 0
            goto L_0x0127
        L_0x019b:
            r0 = 8
            r10.setVisibility(r0)
            goto L_0x00d2
        L_0x01a2:
            r0 = 8
            r12.setVisibility(r0)
            goto L_0x00c5
        L_0x01a9:
            r6.setOrientation(r7)
            r6.setGravity(r3)
            if (r4 == 0) goto L_0x01b4
            r6.addView(r4)
        L_0x01b4:
            if (r5 == 0) goto L_0x0037
            r6.addView(r5)
            if (r4 == 0) goto L_0x0037
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            if (r0 == r3) goto L_0x01ca
            r5 = r4
        L_0x01ca:
            int r3 = r4.getPaddingLeft()
            int r2 = r4.getPaddingTop()
            int r1 = X.DbY.A01(r1)
            int r0 = r4.getPaddingBottom()
            r5.setPadding(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71440Okf.onInflate(android.view.ViewStub, android.view.View):void");
    }
}
