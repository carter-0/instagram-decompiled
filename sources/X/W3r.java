package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

public abstract class W3r {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        if (r5.equals(r6) != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass0iw r7, com.instagram.common.session.UserSession r8, X.1Xj r9, com.instagram.user.model.Product r10, java.lang.String r11) {
        /*
            r0 = 1
            X.0qQ.A0B(r8, r0)
            com.instagram.user.model.User r0 = r10.A0B
            r6 = 0
            if (r0 == 0) goto L_0x008c
            java.lang.String r5 = X.AnonymousClass3ZA.A00(r0)
        L_0x000d:
            if (r9 == 0) goto L_0x0019
            com.instagram.user.model.User r0 = r9.A2A(r8)
            if (r0 == 0) goto L_0x0019
            java.lang.String r6 = r0.getId()
        L_0x0019:
            X.0xN r4 = X.C60510iO.A00(r8)
            r0 = 43
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0xI r3 = X.0xI.A00(r7, r0)
            java.lang.String r0 = "prior_module"
            r3.A0C(r0, r11)
            boolean r0 = r10.A04()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_checkout_enabled"
            r3.A09(r0, r1)
            java.lang.String r1 = "product_id"
            java.lang.String r0 = r10.A0H
            r3.A0C(r1, r0)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r10.A01
            java.lang.String r1 = r0.A0V
            if (r1 != 0) goto L_0x0048
            java.lang.String r1 = r0.A0T
        L_0x0048:
            r0 = 277(0x115, float:3.88E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0C(r0, r1)
            java.lang.String r1 = r10.A0G
            r0 = 1380(0x564, float:1.934E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0C(r0, r1)
            java.lang.String r1 = X.DbS.A0k()
            java.lang.String r0 = "nav_chain"
            r3.A0C(r0, r1)
            X.0j9 r0 = X.C271774jZ.A5e
            r3.A07(r0, r5)
            java.lang.String r0 = "media_owner_id"
            if (r6 == 0) goto L_0x0071
            r3.A0C(r0, r6)
        L_0x0071:
            java.lang.String r2 = "is_influencer"
            if (r5 == 0) goto L_0x007e
            if (r6 == 0) goto L_0x007e
            boolean r1 = r5.equals(r6)
            r0 = 1
            if (r1 == 0) goto L_0x007f
        L_0x007e:
            r0 = 0
        L_0x007f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x0088
            r3.A09(r2, r0)
        L_0x0088:
            r4.EFq(r3)
            return
        L_0x008c:
            r5 = r6
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3r.A04(X.0iw, com.instagram.common.session.UserSession, X.1Xj, com.instagram.user.model.Product, java.lang.String):void");
    }

    public static final void A08(UserSession userSession, 1Xj r6, AnonymousClass4DU r7, Product product, String str, String str2) {
        String id;
        String A00;
        0qQ.A0B(product, 3);
        if (r6.A5D()) {
            id = r6.A0C.Am5();
        } else {
            id = r6.getId();
        }
        String str3 = null;
        if (id != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_shopping_product_tag_tap");
            if (A0e.isSampled()) {
                C51965G9l.A1I(A0e, id);
                A0e.A9F("carousel_index", Long.valueOf((long) r6.A15(userSession)));
                A0e.AAJ("carousel_media_id", r6.A1e(userSession).getId());
                C13989Tnp.A1E(A0e, C13989Tnp.A0Q(str2), str);
                A0e.AAe("product_ids", C294165ly.A0C(r6.A3B()));
                A0e.A9H("product_merchant_ids", C294165ly.A0D(r6.A3B()));
                C13989Tnp.A1H(A0e, product);
                AnonymousClass3YD r2 = AnonymousClass3YC.A00;
                A0e.AAJ("product_collection_id", r2.A03(r6));
                AnonymousClass57K A02 = r2.A02(r6);
                if (A02 != null) {
                    str3 = A02.toString();
                }
                A0e.AAJ("product_collection_type", str3);
                A0e.Cgf();
            }
        }
        User user = product.A0B;
        if (user != null && (A00 = AnonymousClass3ZA.A00(user)) != null) {
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), AnonymousClass000.A00(2910));
            if (A0e2.isSampled()) {
                if (str == null) {
                    str = "";
                }
                C13988Tno.A1D(A0e2, str);
                A0e2.A8M(V1Z.PRODUCT_TAG, "analytics_component");
                A0e2.A8M(V1Y.POST, "analytics_module");
                A0e2.A8M(V1X.POSTS_FEED, "analytics_page");
                A0e2.AAJ("legacy_event_name", "instagram_product_tag_tap");
                C13989Tnp.A1H(A0e2, product);
                A0e2.A9F("merchant_id", AnonymousClass7TE.A10(A00));
                C51965G9l.A1I(A0e2, product.A0C);
                A0e2.AAJ("carousel_index", String.valueOf(r6.A15(userSession)));
                HashMap hashMap = new HashMap();
                hashMap.put(C273654mx.A00(185), product.A05.toString());
                A0e2.A9H("extra_data", hashMap);
                A0e2.Cgf();
            }
        }
    }

    public static final void A0D(UserSession userSession, AnonymousClass4DU r6, C268374dH r7, String str, String str2, String str3) {
        String str4;
        String str5;
        0qQ.A0B(str, 3);
        X9B Aif = r7.Aif();
        if (Aif != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_shopping_product_carousel_action_tap");
            String str6 = null;
            if (A0e.isSampled()) {
                switch (Aif.Awk().intValue()) {
                    case 0:
                        str4 = "view_shop";
                        break;
                    case 1:
                        str4 = "dismiss";
                        break;
                    case 2:
                        str4 = "cta_with_dismiss";
                        break;
                    case 3:
                        str4 = "cta";
                        break;
                    case 4:
                        str4 = "bag_from_merchant";
                        break;
                    case 5:
                        str4 = "profile_shop_product_collections_feed";
                        break;
                    case 6:
                        str4 = "recently_viewed_from_merchant";
                        break;
                    case 7:
                        str4 = "saved";
                        break;
                    case 8:
                        str4 = "saved_from_merchant";
                        break;
                    case 9:
                        str4 = "saved_from_merchants";
                        break;
                    case 10:
                        str4 = "products_from_liked_media";
                        break;
                    case 11:
                        str4 = "products_from_saved_media";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str4 = "products_from_followed_brands";
                        break;
                    case 13:
                        str4 = "editorial";
                        break;
                    case 14:
                        str4 = "checkout_reconsideration";
                        break;
                    case 15:
                        str4 = "seller_product_collection";
                        break;
                    case 16:
                        str4 = "view_checkout_product_feed";
                        break;
                    case 17:
                        str4 = "drops_destination";
                        break;
                    case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                        str4 = "incentive_details";
                        break;
                    default:
                        str4 = "unrecognized";
                        break;
                }
                A0e.AAJ(C273654mx.A00(138), str4);
                A0e.AAJ("from", str);
                C13988Tno.A1C(A0e, str2);
                C13988Tno.A1D(A0e, str3);
                C16675UzB B5W = r7.B5W();
                if (B5W == null || (str5 = B5W.toString()) == null) {
                    str5 = r7.getId();
                }
                A0e.AAJ("submodule", str5);
                User BRo = Aif.BRo();
                if (BRo != null) {
                    str6 = AnonymousClass3ZA.A00(BRo);
                }
                A0e.AAJ("merchant_id", str6);
                A0e.Cgf();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0E(UserSession userSession, AnonymousClass4DU r4, C268374dH r5, String str, String str2, String str3, int i) {
        C263944Ny r1;
        0qQ.A0B(str, 4);
        X9B Aif = r5.Aif();
        if (Aif != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), AnonymousClass000.A00(3379));
            User BRo = Aif.BRo();
            if (BRo != null) {
                r1 = C263944Ny.A00(BRo.getId());
            } else {
                r1 = null;
            }
            A0e.AAE(r1, "merchant_id");
            0bb r2 = new 0bb();
            r2.A06("chaining_session_id", str);
            r2.A05("chaining_position", Long.valueOf((long) i));
            r2.A06("m_pk", str3);
            r2.A06("parent_m_pk", str3);
            r2.A06("source_media_type", r5.Bxr());
            A0e.AAK(r2, "pivots_logging_info");
            0bb r22 = new 0bb();
            C13989Tnp.A1K(r22, "shopping_session_id", str2);
            C13988Tno.A19(A0e, r22, "submodule", r5.C2K());
            A0e.Cgf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static void A02(0Aj r3, 1Xj r4) {
        Long l;
        AnonymousClass3YD r2 = AnonymousClass3YC.A00;
        r3.AAJ("product_collection_id", r2.A03(r4));
        String A05 = r2.A05(r4);
        if (A05 != null) {
            l = 00y.A0n(10, A05);
        } else {
            l = null;
        }
        r3.A9F("discount_id", l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c4, code lost:
        if (r0 != false) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.api.schemas.RankingInfo r20, com.instagram.common.session.UserSession r21, X.1Xj r22, X.AnonymousClass4DU r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            r4 = r21
            r2 = r26
            r3 = r24
            com.instagram.user.model.User r1 = X.DbV.A0j(r4, r2)
            r14 = 0
            if (r1 == 0) goto L_0x01d4
            r5 = 0
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.String r17 = r1.getId()
            java.lang.String r19 = r1.getUsername()
            com.instagram.common.typedurl.ImageUrl r13 = r1.Bh3()
            X.4Cl r0 = r1.A03
            com.instagram.api.schemas.SellerShoppableFeedType r12 = r0.BsB()
            X.4Cl r0 = r1.A03
            com.instagram.api.schemas.MerchantCheckoutStyle r11 = r0.BRp()
            boolean r0 = r1.isVerified()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r5)
            r18 = r14
            com.instagram.user.model.User r10 = X.1aC.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x003a:
            r12 = r23
            X.0wc r0 = X.AnonymousClass0kN.A01(r12, r4)
            java.lang.String r9 = "instagram_shopping_tap_view_shop"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r0, r9)
            r1 = 1
            boolean r0 = r8.isSampled()
            if (r0 != 0) goto L_0x004e
            r1 = 0
        L_0x004e:
            r13 = 0
            r11 = r28
            if (r1 == 0) goto L_0x01d1
            X.4Ny r1 = X.C263944Ny.A00(r27)
            java.lang.String r0 = "ig_profile_user_id"
            r8.AAE(r1, r0)
            X.327 r1 = X.C13989Tnp.A0Q(r25)
            java.lang.String r0 = "submodule"
            r1.A06(r0, r11)
            java.lang.String r0 = "shopping_session_id"
            r1.A06(r0, r3)
            java.lang.String r0 = "prior_submodule"
            r5 = r29
            X.C13988Tno.A19(r8, r1, r0, r5)
            X.UFp r1 = new X.UFp
            r1.<init>()
            java.lang.String r0 = "checkout_session_id"
            r5 = r32
            r1.A06(r0, r5)
            java.lang.String r0 = "global_bag_entry_point"
            r5 = r33
            r1.A06(r0, r5)
            java.lang.String r0 = "global_bag_prior_module"
            r5 = r34
            r1.A06(r0, r5)
            java.lang.String r0 = "merchant_bag_entry_point"
            r5 = r35
            r1.A06(r0, r5)
            java.lang.String r0 = "merchant_bag_prior_module"
            r5 = r36
            r1.A06(r0, r5)
            java.lang.String r0 = "bag_logging_info"
            r8.AAK(r1, r0)
            if (r10 == 0) goto L_0x01ce
            X.4Cl r0 = r10.A03
            com.instagram.api.schemas.MerchantCheckoutStyle r1 = r0.BRp()
            com.instagram.api.schemas.MerchantCheckoutStyle r0 = com.instagram.api.schemas.MerchantCheckoutStyle.NONE
            boolean r0 = X.C51969G9p.A1a(r1, r0)
        L_0x00ac:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_checkout_enabled"
            r8.A7p(r0, r1)
            X.UFu r1 = new X.UFu
            r1.<init>()
            java.lang.String r0 = "chaining_session_id"
            r5 = r30
            r1.A06(r0, r5)
            java.lang.String r0 = "parent_m_pk"
            r5 = r31
            r1.A06(r0, r5)
            java.lang.String r0 = "chaining_position"
            r1.A05(r0, r14)
            java.lang.String r0 = "pivots_logging_info"
            r8.AAK(r1, r0)
            java.lang.String r0 = X.C51969G9p.A0u(r22)
            X.C51965G9l.A1I(r8, r0)
            X.UFy r7 = new X.UFy
            r7.<init>()
            if (r22 == 0) goto L_0x01c8
            com.instagram.model.shopping.reels.ProfileShopLinkIntf r6 = r22.A1z()
            com.instagram.model.shopping.reels.ProductCollectionLinkIntf r5 = r22.A1y()
            com.instagram.model.shopping.reels.ReelProductLink r1 = r22.A21()
            com.instagram.model.shopping.reels.ReelMultiProductLinkIntf r0 = r22.A20()
        L_0x00f0:
            java.util.HashMap r1 = X.C271784ja.A00(r5, r6, r0, r1)
            java.lang.String r0 = "profile_shop_link"
            r7.A08(r0, r1)
            java.lang.String r0 = "stories_logging_info"
            r8.AAK(r7, r0)
            r1 = r14
            java.lang.String r0 = "guide_logging_info"
            r8.AAK(r14, r0)
            if (r20 == 0) goto L_0x010a
            X.UFv r1 = X.VF4.A00(r20)
        L_0x010a:
            java.lang.String r0 = "ranking_logging_info"
            r8.AAK(r1, r0)
            java.lang.String r0 = "pdp_logging_info"
            r8.AAK(r14, r0)
            r0 = 1
        L_0x0115:
            if (r26 == 0) goto L_0x01c4
            if (r0 == 0) goto L_0x011f
            X.C13988Tno.A1A(r8, r2)
        L_0x011c:
            r8.Cgf()
        L_0x011f:
            X.0wc r0 = X.AnonymousClass0kN.A01(r12, r4)
            X.1Ln r4 = X.1Ln.A01(r0)
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x0190
            java.lang.String r5 = ""
            if (r24 != 0) goto L_0x0132
            r3 = r5
        L_0x0132:
            java.lang.String r0 = "shopping_session_id"
            r4.A0R(r0, r3)
            java.lang.String r0 = "cta_bar"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01c0
            X.V1Z r1 = X.V1Z.CTA_BAR
        L_0x0141:
            java.lang.String r0 = "analytics_component"
            r4.A0M(r1, r0)
            java.lang.String r0 = "legacy_event_name"
            r4.A0R(r0, r9)
            java.lang.String r0 = "legacy_ui_component"
            r4.A0R(r0, r11)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r27)
            java.lang.String r0 = "ig_profile_user_id"
            r4.A0Q(r0, r1)
            if (r10 == 0) goto L_0x0167
            X.4Cl r0 = r10.A03
            com.instagram.api.schemas.MerchantCheckoutStyle r1 = r0.BRp()
            com.instagram.api.schemas.MerchantCheckoutStyle r0 = com.instagram.api.schemas.MerchantCheckoutStyle.NONE
            boolean r13 = X.C51969G9p.A1a(r1, r0)
        L_0x0167:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            java.lang.String r0 = "is_checkout_enabled"
            r4.A0O(r0, r1)
            if (r25 == 0) goto L_0x0174
            r5 = r25
        L_0x0174:
            r0 = 799(0x31f, float:1.12E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.A0R(r0, r5)
            java.lang.String r0 = X.C51969G9p.A0u(r22)
            r4.A0m(r0)
            if (r20 == 0) goto L_0x018a
            X.UFv r14 = X.VF4.A00(r20)
        L_0x018a:
            java.lang.String r0 = "ranking_logging_info"
            r4.A0N(r14, r0)
            r14 = r4
        L_0x0190:
            if (r26 == 0) goto L_0x019d
            if (r14 == 0) goto L_0x019d
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r2)
            java.lang.String r0 = "merchant_id"
            r14.A0Q(r0, r1)
        L_0x019d:
            java.lang.String r0 = "shop_selector"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01b2
            X.V1Y r1 = X.V1Y.SHOP_SELECTOR
        L_0x01a7:
            if (r14 == 0) goto L_0x01b1
            java.lang.String r0 = "analytics_module"
            r14.A0M(r1, r0)
        L_0x01ae:
            r14.Cgf()
        L_0x01b1:
            return
        L_0x01b2:
            java.lang.String r0 = "shopping_more_products"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01bd
            X.V1Y r1 = X.V1Y.BOTTOM_SHEET
            goto L_0x01a7
        L_0x01bd:
            if (r14 == 0) goto L_0x01b1
            goto L_0x01ae
        L_0x01c0:
            X.V1Z r1 = X.V1Z.STOREFRONT_ENTRY
            goto L_0x0141
        L_0x01c4:
            if (r0 == 0) goto L_0x011f
            goto L_0x011c
        L_0x01c8:
            r6 = r14
            r5 = r14
            r1 = r14
            r0 = r14
            goto L_0x00f0
        L_0x01ce:
            r0 = 0
            goto L_0x00ac
        L_0x01d1:
            r0 = 0
            goto L_0x0115
        L_0x01d4:
            r10 = r14
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3r.A03(com.instagram.api.schemas.RankingInfo, com.instagram.common.session.UserSession, X.1Xj, X.4DU, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c8, code lost:
        if (r0 != null) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(com.instagram.common.session.UserSession r22, X.1Xj r23, X.AnonymousClass4DU r24, X.AnonymousClass3W1 r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.List r30, boolean r31) {
        /*
            r6 = r22
            r5 = r23
            r14 = r24
            r3 = r27
            X.AnonymousClass7TG.A1T(r14, r6, r5)
            X.0wc r0 = X.AnonymousClass0kN.A01(r14, r6)
            java.lang.String r9 = "instagram_shopping_feed_cta_bar_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r0, r9)
            boolean r0 = r2.isSampled()
            r1 = 0
            r8 = 0
            r4 = r25
            r10 = r26
            if (r0 == 0) goto L_0x011c
            if (r31 == 0) goto L_0x01c4
            r17 = r30
            if (r30 == 0) goto L_0x01c4
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x01c4
            X.1Xj r0 = r5.A1e(r6)
            int r7 = r5.A15(r6)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r18 = 0
            boolean r11 = r0.A5D()
            if (r11 == 0) goto L_0x01c1
            if (r12 == 0) goto L_0x01c1
            r11 = -1
            if (r7 == r11) goto L_0x01c1
            long r11 = (long) r7
            java.lang.Long r13 = java.lang.Long.valueOf(r11)
            X.1Xj r11 = r0.A1c(r7)
            java.lang.String r12 = X.C51969G9p.A0u(r11)
            X.1Xj r7 = r0.A1c(r7)
            if (r7 == 0) goto L_0x01be
            X.1iA r7 = r7.BR7()
            int r7 = r7.A00
            long r15 = (long) r7
            java.lang.Long r11 = java.lang.Long.valueOf(r15)
        L_0x0064:
            r7 = 5
            X.9Iz r15 = new X.9Iz
            r15.<init>((java.lang.Object) r13, (java.lang.Object) r11, (java.lang.String) r12, (int) r7)
        L_0x006a:
            java.lang.String r20 = r0.getId()
            if (r20 != 0) goto L_0x0072
            java.lang.String r20 = ""
        L_0x0072:
            X.1iA r7 = r0.BR7()
            int r7 = r7.A00
            long r11 = (long) r7
            long r26 = r0.A1A()
            java.lang.String r21 = r0.C9L()
            boolean r7 = r0.A5D()
            if (r7 == 0) goto L_0x01b6
            X.1Xj r7 = r0.A1c(r8)
            if (r7 == 0) goto L_0x01b2
            X.1Xy r7 = r7.A0C
            java.lang.String r22 = r7.AYt()
        L_0x0093:
            X.1Xy r7 = r0.A0C
            java.lang.String r23 = r7.getLoggingInfoToken()
            r7 = r17
            X.5lz r19 = X.C294165ly.A06(r0, r7)
            boolean r7 = r0.A5v()
            if (r7 == 0) goto L_0x00a9
            X.Jw8 r18 = X.C294165ly.A02(r0, r1)
        L_0x00a9:
            X.UKi r0 = new X.UKi
            r24 = r11
            r17 = r15
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26)
        L_0x00b4:
            X.5lz r11 = r0.A03
            if (r11 == 0) goto L_0x011c
            java.lang.String r0 = r5.getId()
            X.C51965G9l.A1I(r2, r0)
            X.327 r7 = new X.327
            r7.<init>()
            java.lang.String r0 = "shopping_session_id"
            r7.A06(r0, r3)
            java.lang.String r0 = "submodule"
            r12 = r28
            r7.A06(r0, r12)
            java.lang.String r0 = "prior_submodule"
            r12 = r29
            X.C13988Tno.A19(r2, r7, r0, r12)
            java.util.Map r7 = r11.A08
            java.lang.String r0 = "product_merchant_ids"
            r2.A9H(r0, r7)
            java.util.List r7 = r11.A03
            java.lang.String r0 = "product_ids"
            r2.AAe(r0, r7)
            java.lang.Boolean r7 = r11.A01
            java.lang.String r0 = "is_checkout_enabled"
            r2.A7p(r0, r7)
            if (r4 == 0) goto L_0x01af
            boolean r0 = r4.A29
        L_0x00f0:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r0 = 312(0x138, float:4.37E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A7p(r0, r7)
            A02(r2, r5)
            java.lang.String r0 = "cta_bar_type"
            r2.AAJ(r0, r10)
            if (r4 == 0) goto L_0x01ac
            java.util.List r7 = A01(r5, r4)
        L_0x010b:
            java.lang.String r0 = "arts_labels"
            r2.AAe(r0, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r31)
            java.lang.String r0 = "is_ai_suggested"
            r2.A7p(r0, r7)
            r2.Cgf()
        L_0x011c:
            X.0wc r0 = X.AnonymousClass0kN.A01(r14, r6)
            X.1Ln r7 = X.1Ln.A01(r0)
            boolean r0 = X.DbT.A1Y(r7)
            if (r0 == 0) goto L_0x01a9
            X.UKi r0 = A00(r6, r5)
            if (r0 == 0) goto L_0x01a9
            X.5lz r11 = r0.A03
            if (r11 == 0) goto L_0x01a9
            if (r3 != 0) goto L_0x0138
            java.lang.String r3 = ""
        L_0x0138:
            java.lang.String r0 = "shopping_session_id"
            r7.A0R(r0, r3)
            X.V1Z r2 = X.V1Z.CTA_BAR
            java.lang.String r0 = "analytics_component"
            r7.A0M(r2, r0)
            java.lang.String r0 = "legacy_event_name"
            r7.A0R(r0, r9)
            java.lang.String r6 = "cta_bar_type"
            r7.A0R(r6, r10)
            java.util.Map r0 = r11.A08
            r7.A0y(r0)
            java.util.List r2 = r11.A03
            java.lang.String r0 = "product_ids"
            r7.A0S(r0, r2)
            java.lang.Boolean r2 = r11.A01
            java.lang.String r0 = "is_checkout_enabled"
            r7.A0O(r0, r2)
            if (r4 == 0) goto L_0x0165
            boolean r8 = r4.A29
        L_0x0165:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            r0 = 312(0x138, float:4.37E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r2)
            X.3YD r3 = X.AnonymousClass3YC.A00
            java.lang.String r2 = r3.A05(r5)
            if (r2 == 0) goto L_0x01aa
            r0 = 10
            java.lang.Long r2 = X.00y.A0n(r0, r2)
        L_0x0180:
            java.lang.String r0 = "discount_id"
            r7.A0Q(r0, r2)
            r7.A0R(r6, r10)
            if (r4 == 0) goto L_0x018e
            java.util.List r1 = A01(r5, r4)
        L_0x018e:
            java.lang.String r0 = "arts_labels"
            r7.A0S(r0, r1)
            java.lang.String r2 = r3.A03(r5)
            if (r2 == 0) goto L_0x01a6
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = "product_collection_id"
            r1.put(r0, r2)
            r7.A0x(r1)
        L_0x01a6:
            r7.Cgf()
        L_0x01a9:
            return
        L_0x01aa:
            r2 = 0
            goto L_0x0180
        L_0x01ac:
            r7 = r1
            goto L_0x010b
        L_0x01af:
            r0 = 0
            goto L_0x00f0
        L_0x01b2:
            r22 = r1
            goto L_0x0093
        L_0x01b6:
            X.1Xy r7 = r0.A0C
            java.lang.String r22 = r7.AYt()
            goto L_0x0093
        L_0x01be:
            r11 = r1
            goto L_0x0064
        L_0x01c1:
            r15 = r1
            goto L_0x006a
        L_0x01c4:
            X.UKi r0 = A00(r6, r5)
            if (r0 == 0) goto L_0x011c
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3r.A06(com.instagram.common.session.UserSession, X.1Xj, X.4DU, X.3W1, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):void");
    }

    public static final void A09(UserSession userSession, 1Xj r10, AnonymousClass4DU r11, String str) {
        C15029UKi A00;
        C263944Ny r1;
        List list;
        Map map;
        List list2;
        List list3;
        List list4;
        Boolean bool;
        String str2;
        String str3;
        Long l;
        String str4;
        Long l2;
        Long l3;
        Number number;
        C232682uF r112;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r11, userSession), "instagram_organic_media_show_tags");
        if (A0e.isSampled() && (A00 = A00(userSession, r10)) != null) {
            0jB r0 = null;
            if ((r11 instanceof C232682uF) && (r112 = (C232682uF) r11) != null) {
                r0 = r112.E4l(r10);
            }
            AnonymousClass9JL A01 = C294165ly.A01(r0);
            C294175lz r6 = A00.A03;
            C376699Iz r2 = A00.A01;
            A0e.A9F("m_t", Long.valueOf(A00.A00));
            C51965G9l.A1I(A0e, A00.A05);
            String str5 = null;
            if (r6 != null) {
                r1 = r6.A00;
            } else {
                r1 = null;
            }
            A0e.AAE(r1, "merchant_id");
            if (r6 != null) {
                list = r6.A03;
            } else {
                list = null;
            }
            A0e.AAe("product_ids", list);
            A0e.AAJ("submodule", "media");
            C51973G9u.A14(A0e, "shopping_session_id", str);
            if (r6 != null) {
                map = r6.A08;
            } else {
                map = null;
            }
            A0e.A9H("product_merchant_ids", map);
            if (r6 != null) {
                list2 = r6.A05;
            } else {
                list2 = null;
            }
            A0e.AAe("tagged_user_ids", list2);
            C61070Jw8 jw8 = A00.A02;
            if (jw8 != null) {
                list3 = (List) jw8.A01;
            } else {
                list3 = null;
            }
            A0e.AAe("shared_product_ids", list3);
            if (r6 != null) {
                list4 = r6.A02;
            } else {
                list4 = null;
            }
            A0e.AAe("drops_product_ids", list4);
            if (r6 != null) {
                bool = r6.A01;
            } else {
                bool = null;
            }
            A0e.A7p("is_checkout_enabled", bool);
            if (A01 != null) {
                str2 = A01.A04;
            } else {
                str2 = null;
            }
            A0e.AAJ("parent_m_pk", str2);
            if (A01 != null) {
                str3 = A01.A03;
            } else {
                str3 = null;
            }
            A0e.AAJ("chaining_session_id", str3);
            if (A01 == null || (number = (Number) A01.A01) == null) {
                l = null;
            } else {
                l = C51969G9p.A0r(number);
            }
            A0e.A9F("chaining_position", l);
            if (r2 != null) {
                str4 = r2.A02;
            } else {
                str4 = null;
            }
            A0e.AAJ("carousel_media_id", str4);
            if (r2 != null) {
                l2 = (Long) r2.A00;
            } else {
                l2 = null;
            }
            A0e.A9F("carousel_index", l2);
            AnonymousClass3YD r22 = AnonymousClass3YC.A00;
            String A05 = r22.A05(r10);
            if (A05 != null) {
                l3 = 00y.A0n(10, A05);
            } else {
                l3 = null;
            }
            A0e.A9F("discount_id", l3);
            A0e.AAJ("product_collection_id", r22.A03(r10));
            AnonymousClass57K A02 = r22.A02(r10);
            if (A02 != null) {
                str5 = A02.toString();
            }
            A0e.AAJ("product_collection_type", str5);
            A0e.Cgf();
        }
    }

    public static final void A0F(UserSession userSession, String str, String str2) {
        String A00 = AnonymousClass000.A00(80);
        if (str2 != null) {
            AnonymousClass0xN A002 = C60510iO.A00(userSession);
            0xI A01 = 0xI.A01(str, A00);
            A01.A0C(AnonymousClass000.A00(3759), str2);
            A002.EFq(A01);
        }
    }

    public static final C15029UKi A00(UserSession userSession, 1Xj r4) {
        return C294165ly.A07(r4.A1e(userSession), Integer.valueOf(r4.A15(userSession)), (String) null);
    }

    public static final List A01(1Xj r3, AnonymousClass3W1 r4) {
        List Alu;
        List Alu2;
        if (!r3.A5D() || (Alu = r3.A0C.Alu()) == null || Alu.get(r4.A02) == null || ((Alu2 = r3.A0C.Alu()) != null && (r3 = DbZ.A0T(Alu2, r4.A02)) != null)) {
            return r3.A0C.BMp();
        }
        return null;
    }

    public static final void A05(AnonymousClass0iw r1, UserSession userSession, 1Xj r3, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), "instagram_shopping_tags_list_entry_point_impression");
        if (A0e.isSampled()) {
            C51973G9u.A14(A0e, "shopping_session_id", str);
            A0e.A9H("product_merchant_ids", C294165ly.A0D(r3.A3B()));
            A0e.A7p("is_checkout_enabled", C294165ly.A08(r3.A3B()));
            C51965G9l.A1I(A0e, r3.getId());
            A0e.Cgf();
        }
    }

    public static final void A07(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, Product product) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_organic_shopping_remove_tag");
        String id = r4.getId();
        if (id != null) {
            C51965G9l.A1I(A0e, id);
            C13989Tnp.A1H(A0e, product);
            A0e.A9F("product_id", C51971G9r.A0n(0, product.A0H));
            A0e.A7p("is_influencer", Boolean.valueOf(r4.A6X(userSession)));
            C13988Tno.A1A(A0e, C13991Tnr.A0j(product));
            A0e.AAe("product_ids", C294165ly.A0C(r4.A3B()));
            A0e.Cgf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0A(UserSession userSession, 1Xj r7, AnonymousClass4DU r8, String str, String str2, String str3) {
        C15029UKi A00;
        Map map;
        Long l;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), "instagram_shopping_tap_view_tags_list");
        if (A0e.isSampled() && (A00 = A00(userSession, r7)) != null) {
            C294175lz r4 = A00.A03;
            C376699Iz r5 = A00.A01;
            C51965G9l.A1I(A0e, A00.A05);
            A0e.A9F("m_t", Long.valueOf(A00.A00));
            String str4 = null;
            if (r4 == null || (map = r4.A08) == null) {
                throw AnonymousClass7TE.A0y();
            }
            A0e.A9H("product_merchant_ids", map);
            A0e.AAe("product_ids", r4.A03);
            C13988Tno.A1C(A0e, str);
            C51973G9u.A14(A0e, "prior_submodule", str3);
            A0e.AAe("tagged_user_ids", r4.A04);
            C51965G9l.A1L(A0e, A00.A06);
            DbS.A1N(A0e, "TAG_INDICATOR_PIVOT");
            if (r5 != null) {
                l = (Long) r5.A00;
            } else {
                l = null;
            }
            A0e.A9F("carousel_index", l);
            if (r5 != null) {
                str4 = r5.A02;
            }
            A0e.AAJ("carousel_media_id", str4);
            C13988Tno.A1D(A0e, str2);
            A0e.AAe("drops_product_ids", r4.A02);
            A02(A0e, r7);
            A0e.A7p("is_checkout_enabled", r4.A01);
            A0e.Cgf();
        }
    }

    public static final void A0B(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        0Aj A0e;
        int i;
        Long l;
        0wc A01 = AnonymousClass0kN.A01(r5, userSession);
        if (!z) {
            A0e = AnonymousClass7TE.A0e(A01, "instagram_shopping_feed_cta_bar_impression");
            i = 312;
        } else {
            A0e = AnonymousClass7TE.A0e(A01, "instagram_shopping_feed_cta_bar_sub_impression");
            i = 313;
        }
        1Ln r2 = new 1Ln(A0e, i);
        0bb r1 = new 0bb();
        r1.A06("shopping_session_id", str2);
        r1.A06("submodule", str3);
        r1.A06("prior_submodule", str4);
        r2.A0N(r1, "navigation_info");
        r2.A0m(r4.getId());
        AnonymousClass3YD r3 = AnonymousClass3YC.A00;
        r2.A0R("product_collection_id", r3.A03(r4));
        String A05 = r3.A05(r4);
        if (A05 != null) {
            l = 00y.A0n(10, A05);
        } else {
            l = null;
        }
        r2.A0Q("discount_id", l);
        r2.A0R("cta_bar_type", str);
        r2.A0S("arts_labels", r4.A0C.BMp());
        r2.A0O("is_ai_suggested", Boolean.valueOf(z2));
        r2.Cgf();
    }

    public static final void A0C(UserSession userSession, 1Xj r5, AnonymousClass4DU r6, String str, boolean z) {
        C294175lz r3;
        C15029UKi A00 = A00(userSession, r5);
        if (A00 != null && (r3 = A00.A03) != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_shopping_feed_shopping_indicator_tap");
            if (A0e.isSampled()) {
                String id = r5.getId();
                if (id != null) {
                    C51965G9l.A1I(A0e, id);
                    C13989Tnp.A1E(A0e, new 0bb(), str);
                    A0e.A9H("product_merchant_ids", r3.A08);
                    A0e.AAe("product_ids", r3.A03);
                    A0e.A7p("is_checkout_enabled", r3.A01);
                    A0e.A7p(AnonymousClass000.A00(312), Boolean.valueOf(z));
                    A02(A0e, r5);
                    A0e.Cgf();
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
