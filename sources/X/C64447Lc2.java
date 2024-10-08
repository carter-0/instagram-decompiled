package X;

/* renamed from: X.Lc2  reason: case insensitive filesystem */
public final class C64447Lc2 implements C74301Psb {
    public final int A00;
    public final Object A01;

    public C64447Lc2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        X.AnonymousClass0fU.A00(r1, r2);
        r8.A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0137, code lost:
        r8.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0144, code lost:
        r0 = "tabPagerAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0147, code lost:
        r0 = "tabLayout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0149, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0150, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D5R(X.C324746zp r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x011f;
                case 1: goto L_0x00d9;
                case 2: goto L_0x006f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r6 = 0
            java.lang.Object r5 = r7.A01
            X.H0W r5 = (X.H0W) r5
            X.JqH r0 = r5.A03
            if (r0 == 0) goto L_0x0144
            java.util.List r0 = r0.A00
            java.lang.Object r3 = r0.get(r9)
            X.HMX r3 = (X.HMX) r3
            com.google.android.material.tabs.TabLayout r2 = r5.A01
            if (r2 == 0) goto L_0x0147
            android.content.Context r1 = r5.requireContext()
            android.content.Context r0 = r5.getContext()
            int r0 = X.2Yu.A07(r0)
            int r1 = r1.getColor(r0)
            java.lang.String r0 = "text"
            X.6zy r4 = X.C324816zw.A00(r2, r0, r1)
            X.HMX r0 = X.HMX.GALLERY
            if (r3 != r0) goto L_0x0036
            r5.A02 = r4
        L_0x0036:
            int r1 = r3.ordinal()
            r3 = 1
            if (r1 == r3) goto L_0x006b
            if (r1 != r6) goto L_0x00d4
            r0 = 2131976752(0x7f136230, float:1.9590633E38)
        L_0x0042:
            java.lang.String r0 = X.DbU.A0m(r5, r0)
            r4.setTitle(r0)
            if (r1 != r3) goto L_0x005b
            android.content.Context r1 = r5.requireContext()
            r0 = 2131238076(0x7f081cbc, float:1.809242E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x005b
            r4.setTitleDrawable(r0)
        L_0x005b:
            android.view.View r2 = r4.getView()
            X.IBj r1 = new X.IBj
            r1.<init>(r9, r3, r4, r5)
        L_0x0064:
            X.AnonymousClass0fU.A00(r1, r2)
            r8.A03(r2)
            return
        L_0x006b:
            r0 = 2131976751(0x7f13622f, float:1.9590631E38)
            goto L_0x0042
        L_0x006f:
            r6 = 0
            java.lang.Object r4 = r7.A01
            X.K5B r4 = (X.K5B) r4
            X.JqG r0 = r4.A04
            if (r0 == 0) goto L_0x0144
            java.util.List r0 = r0.A00
            java.lang.Object r5 = r0.get(r9)
            X.KhX r5 = (X.C62541KhX) r5
            com.google.android.material.tabs.TabLayout r2 = r4.A02
            if (r2 == 0) goto L_0x0147
            android.content.Context r1 = r4.requireContext()
            android.content.Context r0 = r4.getContext()
            int r0 = X.2Yu.A07(r0)
            int r1 = r1.getColor(r0)
            java.lang.String r0 = "text"
            X.6zy r3 = X.C324816zw.A00(r2, r0, r1)
            X.KhX r0 = X.C62541KhX.GALLERY
            if (r5 != r0) goto L_0x00a0
            r4.A06 = r3
        L_0x00a0:
            int r2 = r5.ordinal()
            r1 = 1
            if (r2 == r1) goto L_0x00d0
            if (r2 != r6) goto L_0x013f
            r0 = 2131966640(0x7f133ab0, float:1.9570124E38)
        L_0x00ac:
            java.lang.String r0 = X.DbU.A0m(r4, r0)
            r3.setTitle(r0)
            if (r2 != r1) goto L_0x00c5
            android.content.Context r1 = r4.requireContext()
            r0 = 2131238076(0x7f081cbc, float:1.809242E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x00c5
            r3.setTitleDrawable(r0)
        L_0x00c5:
            android.view.View r2 = r3.getView()
            r0 = 7
            X.LY9 r1 = new X.LY9
            r1.<init>((int) r9, (int) r0, (java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x0064
        L_0x00d0:
            r0 = 2131966639(0x7f133aaf, float:1.9570122E38)
            goto L_0x00ac
        L_0x00d4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d9:
            r2 = 0
            java.util.Map r0 = X.C62547Khd.A01
            java.lang.Object r0 = X.C51968G9o.A10(r0, r9)
            X.Khd r0 = (X.C62547Khd) r0
            if (r0 == 0) goto L_0x010e
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x00fd
            r0 = 1
            if (r1 != r0) goto L_0x0109
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131964111(0x7f1330cf, float:1.9564994E38)
        L_0x00f8:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0137
        L_0x00fd:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131964104(0x7f1330c8, float:1.956498E38)
            goto L_0x00f8
        L_0x0109:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x010e:
            java.lang.String r1 = "IGTVCoverTabType: position "
            r0 = 1987(0x7c3, float:2.784E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0c(r1, r0, r9)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x011f:
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2
            java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r0)
            int r0 = X.JTO.A0A(r0, r9)
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x013b
            r0 = 2131951730(0x7f130072, float:1.9539883E38)
        L_0x0133:
            java.lang.String r0 = r1.getString(r0)
        L_0x0137:
            r8.A04(r0)
            return
        L_0x013b:
            r0 = 2131961885(0x7f13281d, float:1.956048E38)
            goto L_0x0133
        L_0x013f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0144:
            java.lang.String r0 = "tabPagerAdapter"
            goto L_0x0149
        L_0x0147:
            java.lang.String r0 = "tabLayout"
        L_0x0149:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64447Lc2.D5R(X.6zp, int):void");
    }
}
