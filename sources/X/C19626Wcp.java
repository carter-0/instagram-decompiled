package X;

/* renamed from: X.Wcp  reason: case insensitive filesystem */
public final class C19626Wcp implements X51 {
    public final /* synthetic */ C15338Uan A00;

    public C19626Wcp(C15338Uan uan) {
        this.A00 = uan;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r1 != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a7, code lost:
        if (r1 != false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DZu() {
        /*
            r7 = this;
            X.Uan r2 = r7.A00
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r2.A09
            java.lang.String r6 = "productSourceOverrideState"
            if (r0 == 0) goto L_0x00cb
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r3 = r0.A01
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r0 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.A05
            if (r3 == r0) goto L_0x0027
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r0 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.ALREADY_TAGGED
            if (r3 == r0) goto L_0x0027
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x0022
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r2.A09
            if (r0 == 0) goto L_0x00cb
            com.instagram.model.shopping.ProductSource r0 = r0.A00
            r3.A00(r1, r0)
            return
        L_0x0022:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0027:
            X.3kF r5 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            X.0eM r4 = r2.A0N
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r0 = "product_search"
            X.ViV r3 = r5.A0A(r3, r1, r0)
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r0 = r2.A08
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0064
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r4)
            boolean r0 = r0.A1R()
            if (r0 == 0) goto L_0x0064
            boolean r0 = X.C15338Uan.A02(r2)
            if (r0 != 0) goto L_0x0064
            java.lang.String r1 = X.DbU.A0u(r4)
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r2.A09
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r0.A02
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            r3.A06 = r0
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r5 = r2.A09
            if (r5 == 0) goto L_0x00cb
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r1 = r5.A01
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r0 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.ALREADY_TAGGED
            if (r1 != r0) goto L_0x00c0
            com.instagram.model.shopping.ProductSource r0 = r5.A00
            if (r0 == 0) goto L_0x00c0
            X.Uyv r1 = r0.A00
            X.Uyv r0 = X.C16659Uyv.CATALOG
            if (r1 == r0) goto L_0x00c0
            r0 = 0
        L_0x007c:
            r3.A07 = r0
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r0 = r2.A08
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x00a9
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r4)
            boolean r0 = r0.A1R()
            if (r0 == 0) goto L_0x00a9
            boolean r0 = X.C15338Uan.A02(r2)
            if (r0 != 0) goto L_0x00a9
            java.lang.String r1 = X.DbU.A0u(r4)
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r2.A09
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r0.A02
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            r3.A08 = r0
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r2.A09
            if (r0 == 0) goto L_0x00cb
            r3.A02 = r0
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
            r3.A00 = r2
            r3.A00()
            return
        L_0x00c0:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.C367088qA.A00(r0)
            goto L_0x007c
        L_0x00c9:
            java.lang.String r6 = "arguments"
        L_0x00cb:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19626Wcp.DZu():void");
    }
}
