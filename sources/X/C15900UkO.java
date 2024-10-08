package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.UkO  reason: case insensitive filesystem */
public final class C15900UkO extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C231112qt A02;
    public final C17984VjM A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d8, code lost:
        if (r1 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (X.C17098VHu.A00(r2.A01.A0C, r2.A0P) == false) goto L_0x002d;
     */
    /* renamed from: A05 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C17372VSz r15, X.UO3 r16) {
        /*
            r14 = this;
            r5 = r16
            X.AnonymousClass7TG.A1N(r5, r15)
            com.instagram.model.shopping.productfeed.ProductFeedItem r10 = r5.A02
            com.instagram.user.model.Product r2 = r10.A02()
            com.instagram.model.shopping.productfeed.ProductTile r0 = r10.A02
            r3 = 0
            if (r0 == 0) goto L_0x0014
            com.instagram.api.schemas.FBProductItemDetailsDict r3 = X.C18768W0o.A01(r0)
        L_0x0014:
            if (r2 == 0) goto L_0x002d
            java.lang.String r1 = r5.A05
            java.lang.String r0 = "saved_products_collection"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002d
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r2.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r1 = r0.A0C
            boolean r0 = r2.A0P
            boolean r0 = X.C17098VHu.A00(r1, r0)
            r11 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r11 = 0
        L_0x002e:
            X.ULC r0 = r5.A03
            java.lang.String r9 = r0.A03
            X.9Iz r8 = r0.A00
            java.lang.String r7 = r0.A02
            if (r2 != 0) goto L_0x003a
            if (r3 == 0) goto L_0x00a2
        L_0x003a:
            X.4DU r3 = r14.A01
            java.lang.String r0 = r3.getModuleName()
            boolean r0 = X.C55146Hcu.A00(r0)
            if (r0 == 0) goto L_0x00a5
            X.VjM r6 = r14.A03
            if (r6 == 0) goto L_0x00a2
            if (r2 == 0) goto L_0x00a2
            if (r9 == 0) goto L_0x00a2
            int r5 = r15.A01
            int r4 = r15.A00
            X.0wc r1 = r6.A00
            java.lang.String r0 = "instagram_shoppable_everything_item_impression"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x00a2
            X.4DU r0 = r6.A02
            X.C51969G9p.A1A(r3, r0)
            X.1Xv r0 = X.1Xj.A0h
            java.lang.String r0 = X.1Xv.A05(r9)
            java.lang.Long r1 = X.DbZ.A0d(r0)
            java.lang.String r0 = "seed_media_id"
            r3.A9F(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r1 == 0) goto L_0x00a3
            if (r0 == 0) goto L_0x00a3
            int r0 = r5 * 2
            int r0 = r0 + r4
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0088:
            java.lang.String r0 = "position"
            r3.A9F(r0, r1)
            java.lang.String r1 = r2.A0H
            java.lang.String r0 = "product_id"
            r3.AAJ(r0, r1)
            com.instagram.user.model.User r0 = r2.A0B
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            java.lang.String r0 = "merchant_id"
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x00a2:
            return
        L_0x00a3:
            r1 = 0
            goto L_0x0088
        L_0x00a5:
            X.2qt r2 = r14.A02
            int r1 = r15.A01
            int r0 = r15.A00
            X.VWb r6 = new X.VWb
            r6.<init>(r10, r2, r1, r0)
            java.lang.String r4 = r5.A05
            if (r4 == 0) goto L_0x00bb
            X.1Ln r1 = r6.A01
            java.lang.String r0 = "submodule"
            r1.A0R(r0, r4)
        L_0x00bb:
            if (r11 == 0) goto L_0x01d2
            java.lang.String r1 = "add_to_bag"
        L_0x00bf:
            X.1Ln r0 = r6.A01
            r0.A0k(r1)
        L_0x00c4:
            java.lang.Long r1 = r5.A00
            if (r1 == 0) goto L_0x00e0
            long r12 = r1.longValue()
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e0
            X.1Ln r0 = r6.A01
            X.4Ny r5 = new X.4Ny
            r5.<init>(r1)
            java.lang.String r1 = "shop_linked_creator_id"
            X.0Aj r0 = r0.A00
            r0.AAE(r5, r1)
        L_0x00e0:
            X.2qt r0 = r6.A02
            if (r9 == 0) goto L_0x00f4
            X.1Ln r5 = r6.A01
            r5.A0m(r9)
            com.instagram.common.session.UserSession r0 = r0.A02
            java.lang.String r1 = X.C231122qu.A0I(r0, r9)
            java.lang.String r0 = "tracking_token"
            r5.A0R(r0, r1)
        L_0x00f4:
            if (r8 == 0) goto L_0x0108
            X.1Ln r5 = r6.A01
            java.lang.Object r1 = r8.A00
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.String r0 = "carousel_index"
            r5.A0Q(r0, r1)
            java.lang.String r1 = r8.A02
            java.lang.String r0 = "carousel_media_id"
            r5.A0R(r0, r1)
        L_0x0108:
            if (r7 == 0) goto L_0x0111
            X.1Ln r1 = r6.A01
            java.lang.String r0 = "content_type"
            r1.A0R(r0, r7)
        L_0x0111:
            X.1Ln r0 = r6.A00
            boolean r0 = X.DbT.A1Y(r0)
            if (r0 == 0) goto L_0x011e
            X.1Ln r0 = r6.A01
            r0.Cgf()
        L_0x011e:
            java.lang.String r1 = r3.getModuleName()
            java.lang.String r0 = "instagram_shopping_reconsideration_destination"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00a2
            com.instagram.common.session.UserSession r0 = r14.A00
            X.0wc r5 = X.AnonymousClass0kN.A01(r3, r0)
            X.V1Y r3 = X.V1Y.RECONSIDERATION_MODULE
            if (r4 == 0) goto L_0x013e
            java.lang.String r0 = "wish_list"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01c2
            X.V1Y r3 = X.V1Y.SAVED_ITEMS
        L_0x013e:
            java.lang.String r1 = r14.A04
            java.lang.String r4 = ""
            if (r1 == 0) goto L_0x00a2
            java.lang.String r0 = "instagram_shopping_mini_shop_storefront"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = "commerce_storefront_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r5, r0)
            r0 = 130(0x82, float:1.82E-43)
            X.1Ln r5 = new X.1Ln
            r5.<init>(r1, r0)
            boolean r0 = X.DbT.A1Y(r5)
            if (r0 == 0) goto L_0x00a2
            X.V1W r1 = X.V1W.STOREFRONT
            java.lang.String r0 = "referral_surface"
            r5.A0M(r1, r0)
            java.lang.String r0 = r2.A0D
            if (r0 == 0) goto L_0x016b
            r4 = r0
        L_0x016b:
            java.lang.String r0 = "shopping_session_id"
            r5.A0R(r0, r4)
            X.V1Z r1 = X.V1Z.PRODUCT_ITEM
            java.lang.String r0 = "analytics_component"
            r5.A0M(r1, r0)
            java.lang.String r0 = "analytics_module"
            X.C13991Tnr.A0z(r3, r5, r0)
        L_0x017c:
            java.lang.String r1 = X.DbS.A0k()
            java.lang.String r0 = "navigation_chain"
            r5.A0R(r0, r1)
            r5.Cgf()
            return
        L_0x0189:
            java.lang.String r0 = "instagram_shopping_home"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = "commerce_tab_feed_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r5, r0)
            r0 = 133(0x85, float:1.86E-43)
            X.1Ln r5 = new X.1Ln
            r5.<init>(r1, r0)
            boolean r0 = X.DbT.A1Y(r5)
            if (r0 == 0) goto L_0x00a2
            X.V1Z r1 = X.V1Z.PRODUCT_ITEM
            java.lang.String r0 = "analytics_component"
            X.C13991Tnr.A0z(r1, r5, r0)
            X.V1W r1 = X.V1W.TAB_FEED
            java.lang.String r0 = "referral_surface"
            r5.A0M(r1, r0)
            java.lang.String r0 = r2.A0D
            if (r0 == 0) goto L_0x01b7
            r4 = r0
        L_0x01b7:
            java.lang.String r0 = "shopping_session_id"
            r5.A0R(r0, r4)
            java.lang.String r0 = "analytics_module"
            r5.A0M(r3, r0)
            goto L_0x017c
        L_0x01c2:
            java.lang.String r0 = "cart"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01ce
            X.V1Y r3 = X.V1Y.CART_ITEM
            goto L_0x013e
        L_0x01ce:
            X.V1Y r3 = X.V1Y.RECENTLY_VIEWED
            goto L_0x013e
        L_0x01d2:
            com.instagram.model.shopping.productfeed.ProductTile r0 = r10.A02
            java.lang.String r1 = X.C18770W0r.A02(r0)
            if (r1 == 0) goto L_0x00c4
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15900UkO.A03(X.VSz, X.UO3):void");
    }

    public C15900UkO(UserSession userSession, AnonymousClass4DU r3, C231112qt r4, C17984VjM vjM, String str) {
        super(C13988Tno.A0K(userSession));
        this.A00 = userSession;
        this.A02 = r4;
        this.A04 = str;
        this.A01 = r3;
        this.A03 = vjM;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (X.C17098VHu.A00(r2.A01.A0C, r2.A0P) == false) goto L_0x0037;
     */
    /* renamed from: A06 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C17372VSz r11, X.UO3 r12) {
        /*
            r10 = this;
            X.AnonymousClass7TG.A1N(r12, r11)
            X.4DU r0 = r10.A01
            r3 = 0
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = X.C55146Hcu.A00(r0)
            if (r0 != 0) goto L_0x00bd
            com.instagram.model.shopping.productfeed.ProductFeedItem r8 = r12.A02
            com.instagram.user.model.Product r2 = r8.A02()
            com.instagram.model.shopping.productfeed.ProductTile r0 = r8.A02
            if (r0 == 0) goto L_0x001e
            com.instagram.api.schemas.FBProductItemDetailsDict r3 = X.C18768W0o.A01(r0)
        L_0x001e:
            if (r2 == 0) goto L_0x0037
            java.lang.String r1 = r12.A05
            java.lang.String r0 = "saved_products_collection"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0037
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r2.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r1 = r0.A0C
            boolean r0 = r2.A0P
            boolean r0 = X.C17098VHu.A00(r1, r0)
            r7 = 1
            if (r0 != 0) goto L_0x0038
        L_0x0037:
            r7 = 0
        L_0x0038:
            X.ULC r0 = r12.A03
            java.lang.String r6 = r0.A03
            X.9Iz r5 = r0.A00
            java.lang.String r4 = r0.A02
            if (r2 != 0) goto L_0x0044
            if (r3 == 0) goto L_0x00bd
        L_0x0044:
            X.2qt r2 = r10.A02
            int r1 = r11.A01
            int r0 = r11.A00
            X.VWc r3 = new X.VWc
            r3.<init>(r8, r2, r1, r0)
            java.lang.String r2 = r12.A05
            if (r2 == 0) goto L_0x005a
            X.1Ln r1 = r3.A01
            java.lang.String r0 = "submodule"
            r1.A0R(r0, r2)
        L_0x005a:
            if (r7 == 0) goto L_0x00be
            java.lang.String r1 = "add_to_bag"
        L_0x005e:
            X.1Ln r0 = r3.A01
            r0.A0k(r1)
        L_0x0063:
            java.lang.Long r9 = r12.A00
            if (r9 == 0) goto L_0x007f
            long r7 = r9.longValue()
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007f
            X.1Ln r0 = r3.A01
            X.4Ny r2 = new X.4Ny
            r2.<init>(r9)
            java.lang.String r1 = "shop_linked_creator_id"
            X.0Aj r0 = r0.A00
            r0.AAE(r2, r1)
        L_0x007f:
            X.2qt r0 = r3.A02
            if (r6 == 0) goto L_0x0093
            X.1Ln r2 = r3.A01
            r2.A0m(r6)
            com.instagram.common.session.UserSession r0 = r0.A02
            java.lang.String r1 = X.C231122qu.A0I(r0, r6)
            java.lang.String r0 = "tracking_token"
            r2.A0R(r0, r1)
        L_0x0093:
            if (r5 == 0) goto L_0x00a7
            X.1Ln r2 = r3.A01
            java.lang.Object r1 = r5.A00
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.String r0 = "carousel_index"
            r2.A0Q(r0, r1)
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "carousel_media_id"
            r2.A0R(r0, r1)
        L_0x00a7:
            if (r4 == 0) goto L_0x00b0
            X.1Ln r1 = r3.A01
            java.lang.String r0 = "content_type"
            r1.A0R(r0, r4)
        L_0x00b0:
            X.1Ln r0 = r3.A00
            boolean r0 = X.DbT.A1Y(r0)
            if (r0 == 0) goto L_0x00bd
            X.1Ln r0 = r3.A01
            r0.Cgf()
        L_0x00bd:
            return
        L_0x00be:
            com.instagram.model.shopping.productfeed.ProductTile r0 = r8.A02
            java.lang.String r1 = X.C18770W0r.A02(r0)
            if (r1 == 0) goto L_0x0063
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15900UkO.A04(X.VSz, X.UO3):void");
    }
}
