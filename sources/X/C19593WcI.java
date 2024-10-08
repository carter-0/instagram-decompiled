package X;

import com.instagram.shopping.fragment.variantselector.MultiVariantSelectorLoadingFragment;

/* renamed from: X.WcI  reason: case insensitive filesystem */
public final class C19593WcI implements X6x {
    public final int A00;
    public final Object A01;

    public C19593WcI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DED() {
        C273414mX r0;
        if (this.A00 != 0) {
            C17393VTu vTu = ((MultiVariantSelectorLoadingFragment) this.A01).A01;
            if (vTu != null) {
                W27 w27 = vTu.A01;
                w27.A01 = new C19679Wdh(3);
                DbW.A1K(w27.A00);
                if (w27.A02 && (r0 = w27.A01) != null) {
                    r0.Cyc();
                    w27.A01 = null;
                    return;
                }
                return;
            }
            return;
        }
        UZF.A00(((C17868VhL) this.A01).A00.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (X.C367088qA.A05(r3, false) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DoS(com.instagram.model.shopping.ProductGroup r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            if (r0 == 0) goto L_0x00ff
            if (r13 == 0) goto L_0x0261
            java.util.List r0 = r13.A02
            boolean r0 = X.C13988Tno.A1a(r0)
            if (r0 != 0) goto L_0x0261
            java.lang.Object r0 = r12.A01
            com.instagram.shopping.fragment.variantselector.MultiVariantSelectorLoadingFragment r0 = (com.instagram.shopping.fragment.variantselector.MultiVariantSelectorLoadingFragment) r0
            X.VTu r5 = r0.A01
            if (r5 == 0) goto L_0x0069
            java.util.List r0 = r13.A00()
            java.util.Iterator r3 = r0.iterator()
        L_0x001e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r3)
            com.instagram.user.model.Product r2 = (com.instagram.user.model.Product) r2
            X.W27 r0 = r5.A01
            java.util.Map r1 = r0.A06
            java.lang.String r0 = r2.A0H
            r1.put(r0, r13)
            goto L_0x001e
        L_0x0034:
            X.VTt r4 = r5.A00
            X.W27 r6 = r5.A01
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = r6.A04
            com.instagram.user.model.User r1 = r0.A01(r3)
            boolean r0 = r1.A1V()
            r7 = 0
            if (r0 != 0) goto L_0x0054
            boolean r0 = r1.A1Q()
            if (r0 != 0) goto L_0x0054
            boolean r0 = X.C367088qA.A05(r3, r7)
            r2 = 0
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            r2 = 1
        L_0x0055:
            java.util.List r0 = r13.A02
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r0 = r0.get(r7)
            com.instagram.model.shopping.ProductVariantDimension r0 = (com.instagram.model.shopping.ProductVariantDimension) r0
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r1 = r0.A00
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r0 = com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle.THUMBNAIL
            if (r1 == r0) goto L_0x006a
            if (r2 == 0) goto L_0x006a
        L_0x0069:
            return
        L_0x006a:
            X.VX6 r2 = r6.A05
            r2.A00 = r13
            java.util.List r1 = r13.A00()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r2.A01 = r0
            java.util.Map r9 = r2.A02
            r9.clear()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Map r5 = r4.A01
            java.util.List r0 = r13.A02
            java.util.Iterator r4 = X.JTQ.A0h(r0)
        L_0x008b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r4)
            com.instagram.model.shopping.ProductVariantDimension r2 = (com.instagram.model.shopping.ProductVariantDimension) r2
            java.lang.String r0 = r2.A02
            java.lang.Object r1 = r5.get(r0)
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r0 = r9.get(r2)
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ac
            goto L_0x008b
        L_0x00ac:
            r9.put(r2, r1)
            goto L_0x008b
        L_0x00b0:
            r8.add(r2)
            goto L_0x008b
        L_0x00b4:
            boolean r0 = X.DbT.A1b(r8)
            if (r0 == 0) goto L_0x00fa
            r5 = 1
            java.lang.Object r0 = r8.get(r7)
            com.instagram.model.shopping.ProductVariantDimension r0 = (com.instagram.model.shopping.ProductVariantDimension) r0
            X.7Pr r4 = new X.7Pr
            r4.<init>(r3)
            androidx.fragment.app.FragmentActivity r3 = r6.A03
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2131976369(0x7f1360b1, float:1.9589857E38)
            java.lang.String r0 = r0.A03
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            r4.A0d = r0
            r4.A01()
            X.UbL r2 = X.W27.A01(r6, r8, r7, r5)
            r4.A0T = r2
            X.7Pu r0 = r6.A00
            if (r0 == 0) goto L_0x00e8
            r0.A0G(r2, r4, r7, r5)
            return
        L_0x00e8:
            r1 = 5
            X.Wdo r0 = new X.Wdo
            r0.<init>((java.lang.Object) r6, (int) r1)
            r4.A0U = r0
            X.7Pu r0 = r4.A00()
            r6.A00 = r0
            r0.A02(r3, r2)
            return
        L_0x00fa:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x00ff:
            java.lang.Object r0 = r12.A01
            X.VhL r0 = (X.C17868VhL) r0
            X.VPF r0 = r0.A00
            r7 = 0
            java.lang.String r11 = "productGroup"
            r10 = 0
            if (r13 != 0) goto L_0x0122
            X.UZF r1 = r0.A00
            com.instagram.model.shopping.ProductGroup r0 = r1.A02
            if (r0 == 0) goto L_0x026f
            java.util.List r0 = r0.A00()
            java.lang.Object r0 = r0.get(r7)
            X.0qQ.A07(r0)
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            X.UZF.A01(r1, r0)
            return
        L_0x0122:
            X.UZF r2 = r0.A00
            r2.A02 = r13
            java.util.List r9 = r13.A00()
            X.0qQ.A07(r9)
            com.instagram.model.shopping.ProductGroup r0 = r2.A02
            if (r0 == 0) goto L_0x026f
            java.util.List r0 = r0.A02
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            X.0qQ.A07(r1)
            int r0 = r1.size()
            r5 = 1
            if (r0 <= r5) goto L_0x018e
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.instagram.model.shopping.ProductVariantDimension r8 = r2.A03
            if (r8 == 0) goto L_0x0188
            java.util.List r0 = r8.A05
            java.util.Iterator r6 = r0.iterator()
        L_0x0150:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.String r1 = X.AnonymousClass7TE.A18(r6)
            com.instagram.model.shopping.ProductGroup r0 = r2.A02
            if (r0 == 0) goto L_0x026f
            java.util.List r4 = r0.A01(r8, r1)
            X.0qQ.A07(r4)
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x0150
            java.util.Iterator r3 = r4.iterator()
        L_0x016f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0183
            java.lang.Object r1 = r3.next()
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            boolean r0 = r1.A0P
            if (r0 == 0) goto L_0x016f
        L_0x017f:
            r9.add(r1)
            goto L_0x0150
        L_0x0183:
            java.lang.Object r1 = r4.get(r7)
            goto L_0x017f
        L_0x0188:
            com.instagram.model.shopping.ProductVariantDimension r0 = r2.A03
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
        L_0x018e:
            boolean r0 = X.AnonymousClass7TE.A1b(r9)     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 == 0) goto L_0x022c
            X.UA4 r8 = r2.A09     // Catch:{ IllegalStateException -> 0x025d }
            X.0qQ.A0B(r1, r5)     // Catch:{ IllegalStateException -> 0x025d }
            int r0 = r9.size()     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.common.typedurl.ImageUrl[] r0 = new com.instagram.common.typedurl.ImageUrl[r0]     // Catch:{ IllegalStateException -> 0x025d }
            r8.A05 = r0     // Catch:{ IllegalStateException -> 0x025d }
            int r0 = r9.size()     // Catch:{ IllegalStateException -> 0x025d }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ IllegalStateException -> 0x025d }
            r8.A06 = r0     // Catch:{ IllegalStateException -> 0x025d }
            int r0 = r9.size()     // Catch:{ IllegalStateException -> 0x025d }
            boolean[] r0 = new boolean[r0]     // Catch:{ IllegalStateException -> 0x025d }
            r8.A07 = r0     // Catch:{ IllegalStateException -> 0x025d }
            r8.A04 = r7     // Catch:{ IllegalStateException -> 0x025d }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ IllegalStateException -> 0x025d }
        L_0x01b7:
            boolean r0 = r4.hasNext()     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r3 = r4.next()     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.model.shopping.ProductVariantDimension r3 = (com.instagram.model.shopping.ProductVariantDimension) r3     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r1 = r3.A00     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r0 = com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle.THUMBNAIL     // Catch:{ IllegalStateException -> 0x025d }
            if (r1 != r0) goto L_0x01b7
            r8.A01 = r3     // Catch:{ IllegalStateException -> 0x025d }
        L_0x01cb:
            com.instagram.model.shopping.ProductVariantDimension r0 = r8.A01     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 == 0) goto L_0x0251
            int r6 = r9.size()     // Catch:{ IllegalStateException -> 0x025d }
            r5 = 0
        L_0x01d4:
            if (r5 >= r6) goto L_0x0229
            java.lang.Object r3 = r9.get(r5)     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.user.model.Product r3 = (com.instagram.user.model.Product) r3     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.model.mediasize.ImageInfo r0 = r3.A08     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.common.typedurl.ImageUrl[] r1 = r8.A05     // Catch:{ IllegalStateException -> 0x025d }
            X.0qQ.A0A(r1)     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 == 0) goto L_0x01e6
            goto L_0x01e8
        L_0x01e6:
            r0 = r10
            goto L_0x01ec
        L_0x01e8:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A03(r0)     // Catch:{ IllegalStateException -> 0x025d }
        L_0x01ec:
            r1[r5] = r0     // Catch:{ IllegalStateException -> 0x025d }
            java.lang.String[] r1 = r8.A06     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.model.shopping.ProductVariantDimension r0 = r8.A01     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 == 0) goto L_0x01fc
            java.lang.String r0 = r0.A02     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 == 0) goto L_0x01fc
            r3.A01(r0)     // Catch:{ IllegalStateException -> 0x025d }
            goto L_0x024c
        L_0x01fc:
            r1[r5] = r10     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r4 = r0.A0C     // Catch:{ IllegalStateException -> 0x025d }
            boolean[] r3 = r8.A07     // Catch:{ IllegalStateException -> 0x025d }
            r1 = 1
            if (r4 == 0) goto L_0x0218
            java.lang.Integer r0 = r4.A0C     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 == 0) goto L_0x0216
            java.lang.Integer r0 = r4.A0C     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 == 0) goto L_0x0216
            int r0 = r0.intValue()     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 <= 0) goto L_0x0216
            goto L_0x0218
        L_0x0216:
            r0 = 0
            goto L_0x0219
        L_0x0218:
            r0 = 1
        L_0x0219:
            r3[r5] = r0     // Catch:{ IllegalStateException -> 0x025d }
            boolean r0 = r8.A03     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 != 0) goto L_0x0224
            boolean r0 = r3[r5]     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 == 0) goto L_0x0224
            r1 = 0
        L_0x0224:
            r8.A03 = r1     // Catch:{ IllegalStateException -> 0x025d }
            int r5 = r5 + 1
            goto L_0x01d4
        L_0x0229:
            r8.notifyDataSetChanged()     // Catch:{ IllegalStateException -> 0x025d }
        L_0x022c:
            android.widget.LinearLayout r0 = r2.A00     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 != 0) goto L_0x0236
            java.lang.String r0 = "contentContainer"
        L_0x0232:
            X.0qQ.A0F(r0)     // Catch:{ IllegalStateException -> 0x025d }
            goto L_0x024c
        L_0x0236:
            r0.setVisibility(r7)     // Catch:{ IllegalStateException -> 0x025d }
            com.instagram.ui.widget.spinner.RefreshSpinner r0 = r2.A06     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 != 0) goto L_0x0240
            java.lang.String r0 = "refreshSpinner"
            goto L_0x0232
        L_0x0240:
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ IllegalStateException -> 0x025d }
            android.widget.LinearLayout r0 = r2.A01     // Catch:{ IllegalStateException -> 0x025d }
            if (r0 != 0) goto L_0x0259
            java.lang.String r0 = "errorContainer"
            goto L_0x0232
        L_0x024c:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0258
        L_0x0251:
            java.lang.String r0 = "No product variant dimension found with visual style as THUMBNAIL"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x025d }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x025d }
        L_0x0258:
            throw r1     // Catch:{ IllegalStateException -> 0x025d }
        L_0x0259:
            r0.setVisibility(r1)     // Catch:{ IllegalStateException -> 0x025d }
            return
        L_0x025d:
            X.UZF.A00(r2)
            return
        L_0x0261:
            java.lang.String r2 = "MultiVariantSelectorLoadingFragment"
            java.lang.String r1 = "Attempting to fetch a product group for a product that does not have one. Product ID = "
            java.lang.Object r0 = r12.A01
            com.instagram.shopping.fragment.variantselector.MultiVariantSelectorLoadingFragment r0 = (com.instagram.shopping.fragment.variantselector.MultiVariantSelectorLoadingFragment) r0
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x0277
            java.lang.String r11 = "productId"
        L_0x026f:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0277:
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0wb.A03(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19593WcI.DoS(com.instagram.model.shopping.ProductGroup):void");
    }
}
