package X;

/* renamed from: X.Wco  reason: case insensitive filesystem */
public final class C19625Wco implements X51 {
    public final /* synthetic */ C15341Uar A00;

    public C19625Wco(C15341Uar uar) {
        this.A00 = uar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r0.A00 == X.C16659Uyv.CATALOG) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DZu() {
        /*
            r8 = this;
            X.Uar r5 = r8.A00
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x003f
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r0 = r5.A0M
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            boolean r0 = r0.A1R()
            if (r0 == 0) goto L_0x003f
            X.U8q r0 = X.C13990Tnq.A0X(r5)
            X.2Fk r1 = r0.A01
            X.Tpd r0 = X.C13989Tnp.A0c(r1)
            java.util.Set r0 = r0.A06
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0056
            X.Tpd r0 = X.C13989Tnp.A0c(r1)
            com.instagram.model.shopping.ProductSource r0 = r0.A00
            if (r0 == 0) goto L_0x0056
            X.Tpd r0 = X.C13989Tnp.A0c(r1)
            com.instagram.model.shopping.ProductSource r0 = r0.A00
            X.0qQ.A0A(r0)
            X.Uyv r1 = r0.A00
            X.Uyv r0 = X.C16659Uyv.CATALOG
            if (r1 != r0) goto L_0x0056
        L_0x003f:
            r7 = 0
        L_0x0040:
            X.0eM r1 = r5.A0M
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r6 = X.C367088qA.A00(r0)
            if (r7 != 0) goto L_0x0058
            if (r6 != 0) goto L_0x0058
            java.lang.String r1 = "MultiProductPickerFragment"
            java.lang.String r0 = "Product source row clicked with no product source type enabled"
            X.0wb.A03(r1, r0)
            return
        L_0x0056:
            r7 = 1
            goto L_0x0040
        L_0x0058:
            X.3kF r3 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r0 = "multi_product_search"
            X.ViV r4 = r3.A0A(r2, r1, r0)
            r4.A06 = r7
            r4.A08 = r7
            r4.A07 = r6
            X.Uxb r0 = r5.A06
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "surface"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007c:
            r4.A01 = r0
            X.U8q r0 = X.C13990Tnq.A0X(r5)
            X.2Fk r1 = r0.A01
            X.Tpd r0 = X.C13989Tnp.A0c(r1)
            com.instagram.model.shopping.ProductSource r3 = r0.A00
            if (r3 == 0) goto L_0x00b4
            X.Tpd r0 = X.C13989Tnp.A0c(r1)
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x00b1
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r2 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.ALREADY_TAGGED
        L_0x0096:
            X.Tpd r0 = X.C13989Tnp.A0c(r1)
            java.lang.String r1 = r0.A01
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = new com.instagram.shopping.model.productsource.ProductSourceOverrideState
            r0.<init>(r3, r2, r1)
        L_0x00a1:
            r4.A02 = r0
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A03 = r0
            r4.A00 = r5
            r4.A00()
            return
        L_0x00b1:
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r2 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.A05
            goto L_0x0096
        L_0x00b4:
            r0 = 0
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19625Wco.DZu():void");
    }
}
