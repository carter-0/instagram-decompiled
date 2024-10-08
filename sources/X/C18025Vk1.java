package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.user.model.User;

/* renamed from: X.Vk1  reason: case insensitive filesystem */
public final class C18025Vk1 {
    public int A00;
    public AnonymousClass57K A01;
    public ProductFeedResponse A02;
    public User A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final UserSession A0I;
    public final C16675UzB A0J;
    public final String A0K;
    public final FragmentActivity A0L;
    public final String A0M;

    public final void A01(AnonymousClass57K r2, String str) {
        0qQ.A0B(str, 0);
        this.A0B = str;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00cd, code lost:
        if (r7 == X.AnonymousClass57K.SELLER_CURATED_V2) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ea, code lost:
        if (r0.A0F == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x00c3, code lost:
        if (r7 == X.AnonymousClass57K.DROP_V2) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r35 = this;
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0 = r35
            java.lang.String r2 = r0.A0M
            java.lang.String r13 = "shopping_session_id"
            r1.putString(r13, r2)
            java.lang.String r12 = r0.A0K
            java.lang.String r2 = "prior_module_name"
            r1.putString(r2, r12)
            X.UzB r2 = r0.A0J
            r34 = r2
            java.lang.String r3 = r34.toString()
            java.lang.String r2 = "product_feed_type"
            r1.putString(r2, r3)
            java.lang.String r3 = r0.A0B
            java.lang.String r2 = "product_collection_id"
            r1.putString(r2, r3)
            X.57K r2 = r0.A01
            if (r2 == 0) goto L_0x0036
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "product_collection_type"
            r1.putString(r2, r3)
        L_0x0036:
            r3 = 0
            java.lang.String r2 = "viewer_session_id"
            r1.putString(r2, r3)
            java.lang.String r3 = r0.A05
            java.lang.String r2 = "incentive_id"
            r1.putString(r2, r3)
            java.lang.String r3 = r0.A0D
            java.lang.String r22 = "product_feed_label"
            r2 = r22
            r1.putString(r2, r3)
            java.lang.String r3 = r0.A0C
            java.lang.String r2 = "product_feed_subtitle"
            r1.putString(r2, r3)
            java.lang.String r2 = r0.A07
            java.lang.String r14 = "media_id"
            r1.putString(r14, r2)
            com.instagram.user.model.User r3 = r0.A03
            java.lang.String r2 = "merchant"
            r1.putParcelable(r2, r3)
            java.lang.String r2 = r0.A08
            java.lang.String r11 = "merchant_id"
            r1.putString(r11, r2)
            java.lang.String r3 = r0.A09
            java.lang.String r2 = "merchant_username"
            r1.putString(r2, r3)
            java.lang.String r3 = r0.A0A
            java.lang.String r2 = "prior_submodule_name"
            r1.putString(r2, r3)
            com.instagram.model.shopping.productfeed.ProductFeedResponse r3 = r0.A02
            java.lang.String r2 = "product_feed"
            r1.putParcelable(r2, r3)
            int r3 = r0.A00
            java.lang.String r2 = "product_feed_index"
            r1.putInt(r2, r3)
            boolean r3 = r0.A0F
            r2 = 166(0xa6, float:2.33E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r1.putBoolean(r2, r3)
            r21 = 0
            java.lang.String r3 = "is_modal"
            r2 = r21
            r1.putBoolean(r3, r2)
            r4 = 0
            java.lang.String r2 = "product_collection_header"
            r1.putParcelable(r2, r4)
            java.lang.String r3 = "show_wishlist_icon"
            r2 = r21
            r1.putBoolean(r3, r2)
            java.lang.String r2 = "query_text"
            r1.putString(r2, r4)
            java.lang.String r2 = "search_session_id"
            r1.putString(r2, r4)
            java.lang.String r2 = "gift_recipient_id"
            r1.putString(r2, r4)
            java.lang.String r2 = "should_show_tab_bar"
            r3 = 1
            r1.putBoolean(r2, r3)
            X.57K r7 = r0.A01
            X.57K r2 = X.AnonymousClass57K.DROP
            if (r7 == r2) goto L_0x00c5
            X.57K r2 = X.AnonymousClass57K.DROP_V2
            r6 = 0
            if (r7 != r2) goto L_0x00c6
        L_0x00c5:
            r6 = 1
        L_0x00c6:
            X.57K r2 = X.AnonymousClass57K.SELLER_CURATED
            if (r7 == r2) goto L_0x00cf
            X.57K r2 = X.AnonymousClass57K.SELLER_CURATED_V2
            r5 = 0
            if (r7 != r2) goto L_0x00d0
        L_0x00cf:
            r5 = 1
        L_0x00d0:
            java.lang.String r2 = r0.A06
            r20 = 1
            if (r2 != 0) goto L_0x01c7
            r20 = 0
            boolean r2 = r0.A0F
            if (r2 != 0) goto L_0x01c7
            if (r6 != 0) goto L_0x00e0
            if (r5 == 0) goto L_0x01c7
        L_0x00e0:
            r19 = 1
        L_0x00e2:
            boolean r2 = r0.A0H
            if (r2 == 0) goto L_0x00ec
            boolean r2 = r0.A0F
            r18 = 1
            if (r2 != 0) goto L_0x00ee
        L_0x00ec:
            r18 = 0
        L_0x00ee:
            com.instagram.common.session.UserSession r5 = r0.A0I
            X.1E8 r6 = X.1E7.A00(r5)
            java.lang.String r2 = r0.A07
            X.1Xj r2 = r6.A02(r2)
            r6 = 19
            java.lang.String r17 = X.Pxd.A00(r6)
            X.0xG r8 = new X.0xG
            r6 = r17
            r8.<init>(r6)
            java.lang.String r16 = X.C228022kf.A00(r1)
            if (r19 != 0) goto L_0x0111
            if (r18 != 0) goto L_0x0111
            if (r20 == 0) goto L_0x014c
        L_0x0111:
            java.lang.String r6 = r0.A0B
            if (r6 == 0) goto L_0x014c
            X.57K r6 = r0.A01
            if (r6 == 0) goto L_0x014c
            java.lang.String r6 = r0.A0A
            r15 = r6
            java.lang.String r10 = r0.A08
            java.lang.String r7 = r0.A07
            java.lang.String r6 = r0.A06
            X.W2p r9 = new X.W2p
            r23 = r9
            r24 = r8
            r25 = r5
            r26 = r16
            r27 = r12
            r28 = r15
            r29 = r10
            r30 = r7
            r31 = r6
            r32 = r4
            r33 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.String r8 = r0.A0B
            java.lang.String r6 = "Required value was null."
            if (r8 == 0) goto L_0x02e0
            X.57K r7 = r0.A01
            if (r7 == 0) goto L_0x02da
            java.lang.String r6 = r0.A05
            r9.A05(r7, r8, r6)
        L_0x014c:
            java.lang.String r10 = "bloks_params"
            java.lang.String r9 = "prior_submodule"
            java.lang.String r8 = "prior_module"
            if (r20 == 0) goto L_0x019b
            java.util.HashMap r7 = X.Dba.A0f(r8, r12)
            java.lang.String r6 = r0.A0A
            r7.put(r9, r6)
            java.lang.String r13 = r0.A06
            java.lang.String r6 = "shop_page_link_id"
            r7.put(r6, r13)
        L_0x0164:
            r1.putSerializable(r10, r7)
        L_0x0167:
            boolean r6 = r0.A0E
            if (r6 == 0) goto L_0x01cb
            if (r19 == 0) goto L_0x0198
            java.lang.String r4 = "product_collection_bloks"
        L_0x016f:
            if (r18 == 0) goto L_0x0192
            if (r2 == 0) goto L_0x0192
            boolean r2 = r2.A5H()
            if (r2 != r3) goto L_0x0192
            java.lang.String r2 = r0.A07
            r1.putString(r14, r2)
            java.lang.String r3 = r0.A0D
            if (r3 != 0) goto L_0x018b
            androidx.fragment.app.FragmentActivity r3 = r0.A0L
            r2 = 2131969797(0x7f134705, float:1.9576527E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r3, r2)
        L_0x018b:
            java.lang.String r2 = "product_collection_title"
            r1.putString(r2, r3)
            java.lang.String r4 = "product_collection_mini_shops_bloks"
        L_0x0192:
            androidx.fragment.app.FragmentActivity r0 = r0.A0L
            X.VG2.A00(r1, r0, r5, r4)
            return
        L_0x0198:
            java.lang.String r4 = "product_collection"
            goto L_0x016f
        L_0x019b:
            if (r19 == 0) goto L_0x0167
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r6 = r0.A0B
            r15 = r6
            r6 = 77
            java.lang.String r6 = X.C273654mx.A00(r6)
            r7.put(r6, r15)
            r7.put(r8, r12)
            java.lang.String r6 = r0.A0A
            r7.put(r9, r6)
            r6 = r16
            r7.put(r13, r6)
            if (r2 == 0) goto L_0x0164
            java.lang.String r13 = r2.getId()
            java.lang.String r6 = "m_pk"
            r7.put(r6, r13)
            goto L_0x0164
        L_0x01c7:
            r19 = 0
            goto L_0x00e2
        L_0x01cb:
            X.3kF r6 = X.C249713kF.A00
            X.W3Y r13 = r6.A0T()
            X.0qQ.A07(r13)
            X.UzB r7 = X.C16675UzB.DISCOUNTS
            r6 = r34
            if (r6 != r7) goto L_0x023f
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String r7 = r0.A08
            java.lang.String r6 = "merchant_igid"
            r11.put(r6, r7)
            java.lang.String r7 = r0.A04
            java.lang.String r6 = "discount_id"
            r11.put(r6, r7)
            r11.put(r8, r12)
            java.lang.String r6 = r0.A0A
            r11.put(r9, r6)
            java.lang.String r7 = "false"
            java.lang.String r6 = "show_cover_image"
            r11.put(r6, r7)
            r1.putSerializable(r10, r11)
            r13 = 2131627865(0x7f0e0f59, float:1.8883006E38)
            r6 = 37355530(0x23a000a, float:1.3665133E-37)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            java.lang.String r10 = "com.bloks.www.minishops.promo.collection"
            java.lang.String r11 = "instagram_shopping_discounts_product_collection"
            r6 = r1
            r7 = r4
            r8 = r5
            r12 = r4
            X.3M3 r7 = X.W3Y.A00(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0215:
            androidx.fragment.app.FragmentActivity r6 = r0.A0L
            X.6Yo r1 = new X.6Yo
            r1.<init>(r6, r5)
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x0224
            r0 = r21
            r1.A0D = r0
        L_0x0224:
            if (r2 == 0) goto L_0x023b
            boolean r0 = r2.A5H()
            if (r0 != r3) goto L_0x023b
            boolean r0 = r2.CcK()
            if (r0 != r3) goto L_0x023b
            r1.A0E = r3
        L_0x0234:
            r1.A0B(r4, r7)
            r1.A04()
            return
        L_0x023b:
            r1.A08()
            goto L_0x0234
        L_0x023f:
            if (r20 == 0) goto L_0x0288
            java.lang.String r6 = r5.A05
            java.lang.String r7 = "IgSessionManager.SESSION_TOKEN_KEY"
            r1.putString(r7, r6)
            java.lang.String r6 = r0.A08
            r1.putString(r11, r6)
            r13 = 2131627865(0x7f0e0f59, float:1.8883006E38)
            java.lang.String r6 = "seller_shoppable_feed_type"
            r1.getSerializable(r6)
            java.lang.String r15 = r1.getString(r11)
            java.lang.String r17 = r1.getString(r7)
            r6 = r22
            java.lang.String r12 = r1.getString(r6)
            java.lang.String r6 = "attribution_username"
            java.lang.String r18 = r1.getString(r6)
            java.lang.String r6 = ""
            if (r15 != 0) goto L_0x026e
            r15 = r6
        L_0x026e:
            if (r17 != 0) goto L_0x0272
            r17 = r6
        L_0x0272:
            X.WNr r7 = new X.WNr
            r14 = r7
            r16 = r12
            r19 = r21
            r14.<init>(r15, r16, r17, r18, r19)
            java.lang.String r10 = "com.bloks.www.minishops.pagelink"
            java.lang.String r11 = "instagram_shopping_mini_shop_storefront"
            r6 = r1
            r8 = r5
            r9 = r4
            X.3M3 r7 = X.W3Y.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0215
        L_0x0288:
            if (r19 == 0) goto L_0x02a2
            r13 = 2131627865(0x7f0e0f59, float:1.8883006E38)
            r6 = 37355530(0x23a000a, float:1.3665133E-37)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            java.lang.String r10 = "com.bloks.www.minishops.collection.ig_encoded"
            r6 = r1
            r7 = r4
            r8 = r5
            r11 = r17
            r12 = r4
            X.3M3 r7 = X.W3Y.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0215
        L_0x02a2:
            if (r18 == 0) goto L_0x02cb
            if (r2 == 0) goto L_0x02d5
            X.JwE r1 = X.SAZ.A00(r5, r2)
            java.lang.String r8 = r1.A01
            java.lang.Object r7 = r1.A00
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.String r1 = r0.A0D
            if (r1 != 0) goto L_0x02bd
            androidx.fragment.app.FragmentActivity r6 = r0.A0L
            r1 = 2131969797(0x7f134705, float:1.9576527E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r6, r1)
        L_0x02bd:
            r14 = r5
            r15 = r8
            r16 = r17
            r17 = r1
            r18 = r7
            X.3M3 r7 = r13.A0C(r14, r15, r16, r17, r18)
            goto L_0x0215
        L_0x02cb:
            com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment r7 = new com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment
            r7.<init>()
            r7.setArguments(r1)
            goto L_0x0215
        L_0x02d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x02e0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18025Vk1.A00():void");
    }

    public C18025Vk1(FragmentActivity fragmentActivity, UserSession userSession, C16675UzB uzB, String str, String str2) {
        this.A0L = fragmentActivity;
        this.A0I = userSession;
        this.A0M = str;
        this.A0K = str2;
        this.A0J = uzB;
    }
}
