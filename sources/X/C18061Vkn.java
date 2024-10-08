package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;

/* renamed from: X.Vkn  reason: case insensitive filesystem */
public final class C18061Vkn {
    public final 1Ln A00;
    public final 1Ln A01;
    public final 1Ln A02;
    public final 1Ln A03;
    public final /* synthetic */ C231112qt A04;

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x032f, code lost:
        if (r0 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0354, code lost:
        if (r0 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0051, code lost:
        if (r0 != null) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18061Vkn(com.instagram.model.shopping.productfeed.ProductFeedItem r33, com.instagram.model.shopping.productfeed.ProductTile r34, X.C231112qt r35, int r36, int r37) {
        /*
            r32 = this;
            r14 = r32
            r12 = r35
            r14.A04 = r12
            r14.<init>()
            X.0wc r2 = r12.A01
            java.lang.String r27 = "instagram_shopping_product_card_tap"
            r0 = r27
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r2, r0)
            r0 = 318(0x13e, float:4.46E-43)
            X.1Ln r11 = new X.1Ln
            r11.<init>(r1, r0)
            r14.A02 = r11
            X.1Ln r10 = X.1Ln.A01(r2)
            r14.A00 = r10
            r13 = r34
            if (r34 == 0) goto L_0x0358
            com.instagram.api.schemas.FBProductItemDetailsDict r1 = X.C18768W0o.A01(r13)
        L_0x002a:
            r0 = 3548(0xddc, float:4.972E-42)
            java.lang.String r26 = X.AnonymousClass000.A00(r0)
            java.lang.String r25 = "fbProduct expected"
            r0 = 2773(0xad5, float:3.886E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            r24 = 1
            java.lang.String r8 = "product expected"
            r7 = 0
            r15 = r33
            if (r1 == 0) goto L_0x02fb
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r13)
            if (r0 == 0) goto L_0x0395
            java.lang.String r0 = X.C45683D1i.A00(r0)
            r6 = 10
            java.lang.Long r0 = X.00y.A0n(r6, r0)
            if (r0 == 0) goto L_0x0395
        L_0x0053:
            java.lang.Long r1 = X.C51968G9o.A0v(r0)
            java.lang.String r23 = "product_id"
            r0 = r23
            r11.A0Q(r0, r1)
            if (r34 == 0) goto L_0x02d6
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r13)
            if (r0 == 0) goto L_0x02d6
            r0 = 0
        L_0x0067:
            r11.A0e(r0)
            if (r34 == 0) goto L_0x02ba
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r13)
            if (r0 == 0) goto L_0x02ba
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r13)
            if (r0 == 0) goto L_0x02b7
            r0 = 0
        L_0x0079:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x007d:
            java.lang.String r22 = "is_checkout_enabled"
            r0 = r22
            r11.A0O(r0, r1)
            r31 = r36
            r30 = r37
            r1 = r31
            r0 = r30
            java.lang.String r1 = X.C320166rs.A01(r1, r0)
            java.lang.String r21 = "position"
            r0 = r21
            r11.A0R(r0, r1)
            java.lang.String r1 = r12.A04
            java.lang.String r0 = "chaining_session_id"
            r11.A0R(r0, r1)
            java.lang.String r1 = r12.A06
            java.lang.String r0 = "parent_m_pk"
            r11.A0R(r0, r1)
            java.lang.String r0 = r12.A09
            r20 = r0
            java.lang.String r19 = "product_collection_id"
            r1 = r19
            r11.A0R(r1, r0)
            X.1QJ r18 = X.AnonymousClass1QI.A00
            r0 = r18
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            r11.A0u(r0)
            java.lang.String r5 = r12.A0D
            java.lang.String r17 = "shopping_session_id"
            r0 = r17
            r11.A0R(r0, r5)
            java.lang.String r1 = r12.A07
            java.lang.String r0 = "prior_module"
            r11.A0R(r0, r1)
            java.lang.String r1 = r12.A08
            java.lang.String r0 = "prior_submodule"
            r11.A0R(r0, r1)
            r1 = 0
            java.lang.String r0 = "surface_category_id"
            r11.A0Q(r0, r1)
            java.lang.String r1 = r12.A0B
            java.lang.String r0 = "query_text"
            r11.A0R(r0, r1)
            java.lang.String r0 = r12.A0C
            if (r0 != 0) goto L_0x00e4
            r0 = 0
        L_0x00e4:
            java.lang.String r1 = X.C13992Tns.A0H(r11, r13, r0)
            java.lang.String r0 = "page_id"
            r11.A0R(r0, r1)
            if (r34 == 0) goto L_0x02b4
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r13)
            if (r0 == 0) goto L_0x02b4
            java.lang.String r1 = "fb"
        L_0x00f7:
            java.lang.String r0 = "redirect_app"
            r11.A0R(r0, r1)
            com.instagram.common.session.UserSession r0 = r12.A02
            com.instagram.api.schemas.ProductTileBannerMetadataDecoration r0 = X.W3C.A01(r0, r15)
            if (r0 == 0) goto L_0x02b1
            java.lang.String r1 = r0.AfG()
        L_0x0108:
            java.lang.String r0 = "label"
            r11.A0R(r0, r1)
            java.lang.String r4 = r12.A05
            if (r4 == 0) goto L_0x011b
            r11.A0m(r4)
            java.lang.String r1 = r12.A0E
            java.lang.String r0 = "tracking_token"
            r11.A0R(r0, r1)
        L_0x011b:
            java.lang.String r3 = r12.A0A
            if (r3 == 0) goto L_0x0124
            java.lang.String r0 = "product_collection_type"
            r11.A0R(r0, r3)
        L_0x0124:
            X.C13991Tnr.A19(r11, r13)
            int r2 = r12.A00
            r16 = -1
            r0 = r16
            if (r2 == r0) goto L_0x013b
            long r0 = (long) r2
            r28 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r28)
            java.lang.String r0 = "m_t"
            r11.A0Q(r0, r1)
        L_0x013b:
            if (r34 == 0) goto L_0x0150
            X.C13991Tnr.A1A(r11, r13)
            com.instagram.api.schemas.ProductTileUCILoggingInfoImpl r0 = r13.A03
            if (r0 == 0) goto L_0x014d
            X.UGX r1 = X.C18768W0o.A00(r0)
            java.lang.String r0 = "ranking_data_blob"
            r11.A0N(r1, r0)
        L_0x014d:
            X.C13992Tns.A0m(r11, r13)
        L_0x0150:
            java.lang.String r1 = r12.A03
            X.C13992Tns.A0o(r11, r1)
            r14.A03 = r11
            if (r5 != 0) goto L_0x015b
            java.lang.String r5 = ""
        L_0x015b:
            r0 = r17
            r10.A0R(r0, r5)
            X.V1Z r5 = X.V1Z.PRODUCT_ITEM
            java.lang.String r0 = "analytics_component"
            r10.A0M(r5, r0)
            java.lang.String r5 = "legacy_event_name"
            r0 = r27
            r10.A0R(r5, r0)
            r5 = r31
            r0 = r30
            java.lang.String r5 = X.C320166rs.A01(r5, r0)
            r0 = r21
            r10.A0R(r0, r5)
            if (r34 == 0) goto L_0x0258
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r13)
            if (r0 == 0) goto L_0x0258
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r13)
            if (r0 == 0) goto L_0x0367
            java.lang.String r0 = X.C45683D1i.A00(r0)
            java.lang.Long r0 = X.00y.A0n(r6, r0)
            if (r0 == 0) goto L_0x0367
        L_0x0193:
            java.lang.Long r5 = X.C51968G9o.A0v(r0)
            r0 = r23
            r10.A0Q(r0, r5)
            if (r34 == 0) goto L_0x0233
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r13)
            if (r0 == 0) goto L_0x0233
            r0 = 0
        L_0x01a5:
            java.lang.String r5 = "merchant_id"
            r10.A0Q(r5, r0)
            if (r34 == 0) goto L_0x0219
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r13)
            if (r0 == 0) goto L_0x0219
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r13)
            if (r0 == 0) goto L_0x0217
            r0 = 0
        L_0x01b9:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L_0x01bd:
            r0 = r22
            r10.A0O(r0, r5)
            if (r20 == 0) goto L_0x01cf
            r5 = r19
            r0 = r20
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r5, r0)
            r10.A0x(r0)
        L_0x01cf:
            r0 = r18
            X.1QM r0 = r0.A02
            java.lang.String r5 = r0.A00
            java.lang.String r0 = "navigation_chain"
            r10.A0R(r0, r5)
            if (r4 == 0) goto L_0x01e6
            r10.A0m(r4)
            java.lang.String r4 = r12.A0E
            java.lang.String r0 = "tracking_token"
            r10.A0R(r0, r4)
        L_0x01e6:
            if (r3 == 0) goto L_0x01ed
            java.lang.String r0 = "product_collection_type"
            r10.A0R(r0, r3)
        L_0x01ed:
            X.C13991Tnr.A19(r10, r13)
            r0 = r16
            if (r2 == r0) goto L_0x01fe
            long r2 = (long) r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "m_t"
            r10.A0R(r0, r2)
        L_0x01fe:
            if (r34 == 0) goto L_0x0203
            X.C13991Tnr.A1A(r10, r13)
        L_0x0203:
            if (r1 == 0) goto L_0x0214
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0214
            java.lang.Long r1 = X.DbV.A0q(r1)
            java.lang.String r0 = "marketer_id"
            r10.A0Q(r0, r1)
        L_0x0214:
            r14.A01 = r10
            return
        L_0x0217:
            r5 = 0
            goto L_0x01bd
        L_0x0219:
            boolean r0 = X.C231112qt.A01(r15)
            if (r0 == 0) goto L_0x0228
            com.instagram.model.androidlink.AndroidLink r0 = X.C231112qt.A00(r15)
            boolean r0 = X.AnonymousClass595.A04(r0)
            goto L_0x01b9
        L_0x0228:
            com.instagram.user.model.Product r0 = r15.A02()
            if (r0 == 0) goto L_0x035b
            boolean r0 = r0.A04()
            goto L_0x01b9
        L_0x0233:
            boolean r0 = X.C231112qt.A01(r15)
            if (r0 == 0) goto L_0x0247
            com.instagram.model.androidlink.AndroidLink r0 = X.C231112qt.A00(r15)
            java.lang.String r0 = X.AnonymousClass595.A00(r0)
        L_0x0241:
            java.lang.Long r0 = X.DbV.A0q(r0)
            goto L_0x01a5
        L_0x0247:
            com.instagram.user.model.Product r0 = r15.A02()
            if (r0 == 0) goto L_0x0361
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x0361
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x0361
            goto L_0x0241
        L_0x0258:
            boolean r0 = X.C231112qt.A01(r15)
            if (r0 == 0) goto L_0x029f
            X.1Xj r0 = r15.A00
            if (r0 == 0) goto L_0x028e
            boolean r5 = r0.A5D()
            r0 = r24
            if (r5 != r0) goto L_0x028e
            X.1Xj r0 = r15.A00
            if (r0 == 0) goto L_0x0375
            X.1Xj r0 = r0.A1c(r7)
            if (r0 == 0) goto L_0x0375
            java.util.List r0 = r0.A3P()
            java.lang.Object r0 = X.00k.A0O(r0, r7)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x0375
        L_0x0280:
            java.lang.String r0 = X.AnonymousClass595.A01(r0)
            if (r0 == 0) goto L_0x036f
            java.lang.Long r0 = X.00y.A0n(r6, r0)
            if (r0 == 0) goto L_0x036f
            goto L_0x0193
        L_0x028e:
            X.1Xj r0 = r15.A00
            if (r0 == 0) goto L_0x037b
            java.util.List r0 = r0.A3P()
            java.lang.Object r0 = X.00k.A0O(r0, r7)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x037b
            goto L_0x0280
        L_0x029f:
            com.instagram.user.model.Product r0 = r15.A02()
            if (r0 == 0) goto L_0x0383
            java.lang.String r0 = r0.A0H
            if (r0 == 0) goto L_0x0383
            java.lang.Long r0 = X.00y.A0n(r6, r0)
            if (r0 == 0) goto L_0x0383
            goto L_0x0193
        L_0x02b1:
            r1 = 0
            goto L_0x0108
        L_0x02b4:
            r1 = 0
            goto L_0x00f7
        L_0x02b7:
            r1 = 0
            goto L_0x007d
        L_0x02ba:
            boolean r0 = X.C231112qt.A01(r15)
            if (r0 == 0) goto L_0x02ca
            com.instagram.model.androidlink.AndroidLink r0 = X.C231112qt.A00(r15)
            boolean r0 = X.AnonymousClass595.A04(r0)
            goto L_0x0079
        L_0x02ca:
            com.instagram.user.model.Product r0 = r15.A02()
            if (r0 == 0) goto L_0x0389
            boolean r0 = r0.A04()
            goto L_0x0079
        L_0x02d6:
            boolean r0 = X.C231112qt.A01(r15)
            if (r0 == 0) goto L_0x02ea
            com.instagram.model.androidlink.AndroidLink r0 = X.C231112qt.A00(r15)
            java.lang.String r0 = X.AnonymousClass595.A00(r0)
        L_0x02e4:
            X.4Ny r0 = X.C263944Ny.A00(r0)
            goto L_0x0067
        L_0x02ea:
            com.instagram.user.model.Product r0 = r15.A02()
            if (r0 == 0) goto L_0x038f
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x038f
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x038f
            goto L_0x02e4
        L_0x02fb:
            boolean r0 = X.C231112qt.A01(r15)
            if (r0 == 0) goto L_0x0344
            X.1Xj r0 = r15.A00
            if (r0 == 0) goto L_0x0333
            boolean r1 = r0.A5D()
            r0 = r24
            if (r1 != r0) goto L_0x0333
            X.1Xj r0 = r15.A00
            if (r0 == 0) goto L_0x03a3
            X.1Xj r0 = r0.A1c(r7)
            if (r0 == 0) goto L_0x03a3
            java.util.List r0 = r0.A3P()
            java.lang.Object r0 = X.00k.A0O(r0, r7)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x03a3
        L_0x0323:
            java.lang.String r0 = X.AnonymousClass595.A01(r0)
            if (r0 == 0) goto L_0x039d
            r6 = 10
            java.lang.Long r0 = X.00y.A0n(r6, r0)
            if (r0 == 0) goto L_0x039d
            goto L_0x0053
        L_0x0333:
            X.1Xj r0 = r15.A00
            if (r0 == 0) goto L_0x03a9
            java.util.List r0 = r0.A3P()
            java.lang.Object r0 = X.00k.A0O(r0, r7)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x03a9
            goto L_0x0323
        L_0x0344:
            com.instagram.user.model.Product r0 = r15.A02()
            if (r0 == 0) goto L_0x03b1
            java.lang.String r0 = r0.A0H
            if (r0 == 0) goto L_0x03b1
            r6 = 10
            java.lang.Long r0 = X.00y.A0n(r6, r0)
            if (r0 == 0) goto L_0x03b1
            goto L_0x0053
        L_0x0358:
            r1 = 0
            goto L_0x002a
        L_0x035b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0361:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0367:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r25
            r1.<init>(r0)
            throw r1
        L_0x036f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0375:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x037b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r26
            r1.<init>(r0)
            throw r1
        L_0x0383:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0389:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x038f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0395:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r25
            r1.<init>(r0)
            throw r1
        L_0x039d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x03a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x03a9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r26
            r1.<init>(r0)
            throw r1
        L_0x03b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18061Vkn.<init>(com.instagram.model.shopping.productfeed.ProductFeedItem, com.instagram.model.shopping.productfeed.ProductTile, X.2qt, int, int):void");
    }

    public final void A00() {
        if (DbT.A1Y(this.A02)) {
            this.A03.Cgf();
        }
        if (DbT.A1Y(this.A00)) {
            this.A01.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ void A01(C268374dH r5) {
        1Ln r3 = this.A03;
        r3.A0R("product_collection_type", String.valueOf(r5.B5W()));
        1Ln r2 = this.A01;
        r2.A0R("product_collection_type", String.valueOf(r5.B5W()));
        String Bxn = r5.Bxn();
        if (Bxn != null) {
            r3.A0m(Bxn);
            r2.A0m(Bxn);
        }
        String Bxr = r5.Bxr();
        if (Bxr != null) {
            r3.A0R("source_media_type", Bxr);
        }
        if (r5 instanceof MultiProductComponent) {
            MultiProductComponent multiProductComponent = (MultiProductComponent) r5;
            r3.A0R("submodule", multiProductComponent.A00());
            r2.A0R("legacy_ui_component", multiProductComponent.A00());
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Integer num, String str) {
        if (str != null) {
            this.A03.A0R("source_media_type", str);
        }
        if (num != null) {
            this.A03.A0Q("chaining_position", Long.valueOf((long) num.intValue()));
        }
    }

    public final /* bridge */ /* synthetic */ void A03(String str) {
        if (str != null) {
            this.A03.A0R("submodule", str);
            this.A01.A0R("legacy_ui_component", str);
        }
    }
}
