package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class W39 {
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f5, code lost:
        if (r0 != null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        if (r3.A04() != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0137, code lost:
        if (r1 == null) goto L_0x0139;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.common.collect.ImmutableMap A00(com.instagram.common.session.UserSession r10, com.instagram.shopping.intf.ProductDetailsPageArguments r11, java.lang.String r12) {
        /*
            com.google.common.collect.ImmutableMap$Builder r2 = new com.google.common.collect.ImmutableMap$Builder
            r2.<init>()
            com.google.common.collect.ImmutableMap$Builder r4 = new com.google.common.collect.ImmutableMap$Builder
            r4.<init>()
            java.lang.String r1 = r11.A0N
            java.lang.String r0 = "merchant_id"
            if (r1 == 0) goto L_0x0013
            r4.put(r0, r1)
        L_0x0013:
            com.instagram.user.model.Product r3 = r11.A06
            if (r3 == 0) goto L_0x0060
            com.instagram.user.model.User r5 = r3.A0B
            if (r5 == 0) goto L_0x0060
            com.instagram.common.typedurl.ImageUrl r6 = r5.Bh3()
            java.lang.String r1 = r6.getUrl()
            java.lang.String r0 = "merchant_profile_url"
            if (r1 == 0) goto L_0x002a
            r4.put(r0, r1)
        L_0x002a:
            int r0 = r6.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "merchant_profile_width"
            if (r1 == 0) goto L_0x0039
            r4.put(r0, r1)
        L_0x0039:
            int r0 = r6.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "merchant_profile_height"
            if (r1 == 0) goto L_0x0048
            r4.put(r0, r1)
        L_0x0048:
            java.lang.String r1 = r5.getUsername()
            java.lang.String r0 = "merchant_username"
            r4.put(r0, r1)
            boolean r0 = r5.isVerified()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_shop_verified"
            if (r1 == 0) goto L_0x0060
            r4.put(r0, r1)
        L_0x0060:
            java.lang.String r5 = r11.A0U
            if (r5 == 0) goto L_0x0069
            java.lang.String r0 = "product_id"
            r4.put(r0, r5)
        L_0x0069:
            if (r3 == 0) goto L_0x0201
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r7 = r0.A0F
            java.lang.String r6 = "launch_date"
            java.lang.String r1 = "has_launched"
            if (r7 != 0) goto L_0x01e8
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r4.put(r1, r0)
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x0082:
            r4.put(r6, r0)
        L_0x0085:
            java.lang.String r1 = r3.A0J
            java.lang.String r0 = "product_name"
            if (r1 == 0) goto L_0x008e
            r4.put(r0, r1)
        L_0x008e:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            java.lang.String r1 = r0.A0V
            if (r1 != 0) goto L_0x0096
            java.lang.String r1 = r0.A0T
        L_0x0096:
            java.lang.String r0 = "product_current_price"
            if (r1 == 0) goto L_0x009d
            r4.put(r0, r1)
        L_0x009d:
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = "product_full_price"
            if (r1 == 0) goto L_0x00a6
            r4.put(r0, r1)
        L_0x00a6:
            java.lang.String r1 = r3.A0K
            java.lang.String r0 = "product_per_unit_price"
            if (r1 == 0) goto L_0x00af
            r4.put(r0, r1)
        L_0x00af:
            java.lang.String r1 = r3.A0F
            java.lang.String r0 = "product_external_url"
            if (r1 == 0) goto L_0x00b8
            r4.put(r0, r1)
        L_0x00b8:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.api.schemas.CheckoutStyle r0 = r0.A00
            java.lang.String r1 = X.DbX.A0t(r0)
            java.util.Map r0 = com.instagram.api.schemas.CheckoutStyle.A01
            java.lang.Object r0 = r0.get(r1)
            com.instagram.api.schemas.CheckoutStyle r0 = (com.instagram.api.schemas.CheckoutStyle) r0
            if (r0 != 0) goto L_0x00cc
            com.instagram.api.schemas.CheckoutStyle r0 = com.instagram.api.schemas.CheckoutStyle.UNRECOGNIZED
        L_0x00cc:
            int r7 = r0.ordinal()
            r0 = 2
            java.lang.String r6 = "onsite_checkout"
            if (r7 == r0) goto L_0x00e3
            r0 = 3
            if (r7 == r0) goto L_0x01e3
            r0 = 1
            java.lang.String r1 = "offsite_link"
            if (r7 == r0) goto L_0x01e5
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x01e5
        L_0x00e3:
            java.lang.String r0 = "product_checkout_style"
            r4.put(r0, r6)
            boolean r0 = r3.A06()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_item_for_preorder"
            if (r1 == 0) goto L_0x00f7
            r4.put(r0, r1)
        L_0x00f7:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x01e0
            java.lang.Boolean r1 = r0.A02
        L_0x00ff:
            java.lang.String r0 = "is_cart_enabled"
            if (r1 == 0) goto L_0x0106
            r4.put(r0, r1)
        L_0x0106:
            X.6xT r0 = X.C323426xT.A00(r10)
            boolean r0 = r0.A08(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_item_in_cart"
            if (r1 == 0) goto L_0x0119
            r4.put(r0, r1)
        L_0x0119:
            boolean r0 = r3.A0P
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_product_soldout"
            if (r1 == 0) goto L_0x0128
            r4.put(r0, r1)
        L_0x0128:
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x0139
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x0139
            java.lang.Integer r1 = r0.A0C
            r0 = 1
            if (r1 != 0) goto L_0x013a
        L_0x0139:
            r0 = 0
        L_0x013a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_soldout_status_known"
            if (r1 == 0) goto L_0x0145
            r4.put(r0, r1)
        L_0x0145:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            java.lang.Boolean r0 = r0.A0K
            boolean r0 = X.DbX.A1a(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_variants"
            if (r1 == 0) goto L_0x0158
            r4.put(r0, r1)
        L_0x0158:
            com.instagram.model.mediasize.ImageInfo r0 = r3.A08
            if (r0 == 0) goto L_0x018b
            com.instagram.model.mediasize.ExtendedImageUrl r6 = X.1iI.A03(r0)
            if (r6 == 0) goto L_0x018b
            java.lang.String r1 = r6.getUrl()
            java.lang.String r0 = "product_thumb_image_url"
            if (r1 == 0) goto L_0x016d
            r4.put(r0, r1)
        L_0x016d:
            int r0 = r6.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "product_thumb_image_width"
            if (r1 == 0) goto L_0x017c
            r4.put(r0, r1)
        L_0x017c:
            int r0 = r6.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "product_thumb_image_height"
            if (r1 == 0) goto L_0x018b
            r4.put(r0, r1)
        L_0x018b:
            java.lang.String r1 = r3.A0E
            java.lang.String r0 = "product_description"
            if (r1 == 0) goto L_0x0194
            r4.put(r0, r1)
        L_0x0194:
            java.util.List r0 = r3.A0O
            if (r0 == 0) goto L_0x01f9
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x01a0:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r8 = r9.next()
            com.instagram.api.schemas.ProductVariantPossibleValueDictIntf r8 = (com.instagram.api.schemas.ProductVariantPossibleValueDictIntf) r8
            java.lang.String r1 = r8.getName()
            r0 = 5365(0x14f5, float:7.518E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r7 = new X.0eP
            r7.<init>(r0, r1)
            java.lang.String r1 = r8.getValue()
            r0 = 179(0xb3, float:2.51E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r1)
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r0 = r8.CFr()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "visual_style"
            X.0eP[] r0 = X.Pxg.A1b(r0, r1, r7, r3)
            java.util.HashMap r0 = X.0Yt.A02(r0)
            r6.add(r0)
            goto L_0x01a0
        L_0x01e0:
            r1 = 0
            goto L_0x00ff
        L_0x01e3:
            java.lang.String r1 = "offsite_iab_checkout"
        L_0x01e5:
            r6 = r1
            goto L_0x00e3
        L_0x01e8:
            java.lang.Boolean r0 = r7.BBR()
            if (r0 == 0) goto L_0x01f1
            r4.put(r1, r0)
        L_0x01f1:
            java.lang.Long r0 = r7.BLg()
            if (r0 == 0) goto L_0x0085
            goto L_0x0082
        L_0x01f9:
            r6 = 0
        L_0x01fa:
            java.lang.String r0 = "variant_values"
            if (r6 == 0) goto L_0x0201
            r4.put(r0, r6)
        L_0x0201:
            com.instagram.model.shopping.productfeed.ProductTileMedia r0 = r11.A03
            java.lang.String r3 = "product_pinned_media_id"
            if (r0 == 0) goto L_0x020e
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x020e
            r4.put(r3, r0)
        L_0x020e:
            java.lang.String r1 = r11.A0E
            if (r1 == 0) goto L_0x0221
            java.lang.String r0 = r11.A0F
            if (r0 == 0) goto L_0x0221
            java.lang.Integer r0 = r11.A08
            if (r0 == 0) goto L_0x0221
            java.lang.Integer r0 = r11.A07
            if (r0 == 0) goto L_0x0221
            r4.put(r3, r1)
        L_0x0221:
            com.instagram.common.typedurl.ImageUrlBase r3 = A01(r10, r11)
            if (r3 == 0) goto L_0x0250
            java.lang.String r1 = r3.getUrl()
            java.lang.String r0 = "product_main_image_url"
            if (r1 == 0) goto L_0x0232
            r4.put(r0, r1)
        L_0x0232:
            int r0 = r3.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "product_main_image_width"
            if (r1 == 0) goto L_0x0241
            r4.put(r0, r1)
        L_0x0241:
            int r0 = r3.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "product_main_image_height"
            if (r1 == 0) goto L_0x0250
            r4.put(r0, r1)
        L_0x0250:
            com.instagram.api.schemas.RankingInfo r3 = r11.A02
            if (r3 == 0) goto L_0x0266
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "ranking_info_recommender_type"
            if (r1 == 0) goto L_0x025d
            r4.put(r0, r1)
        L_0x025d:
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "ranking_info_request_uuid"
            if (r1 == 0) goto L_0x0266
            r4.put(r0, r1)
        L_0x0266:
            com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo r3 = r11.A05
            if (r3 == 0) goto L_0x0285
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "search_session_id"
            if (r1 == 0) goto L_0x0273
            r4.put(r0, r1)
        L_0x0273:
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "search_query_text"
            if (r1 == 0) goto L_0x027c
            r4.put(r0, r1)
        L_0x027c:
            java.util.HashMap r1 = r3.A02
            java.lang.String r0 = "search_filter_extras"
            if (r1 == 0) goto L_0x0285
            r4.put(r0, r1)
        L_0x0285:
            java.lang.String r0 = r11.A0M
            if (r0 == 0) goto L_0x02e2
            X.1Xj r1 = X.DbV.A0U(r10, r0)
            java.lang.Integer r0 = r11.A09
            X.UKi r7 = X.C294165ly.A07(r1, r0, r5)
            r1 = 0
            if (r7 == 0) goto L_0x037f
            java.lang.String r3 = r7.A05
        L_0x0298:
            java.lang.String r0 = "m_pk"
            if (r3 == 0) goto L_0x029f
            r4.put(r0, r3)
        L_0x029f:
            if (r7 == 0) goto L_0x037c
            long r5 = r7.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
        L_0x02a7:
            java.lang.String r0 = "m_t"
            if (r3 == 0) goto L_0x02ae
            r4.put(r0, r3)
        L_0x02ae:
            if (r7 == 0) goto L_0x0379
            X.5lz r0 = r7.A03
            if (r0 == 0) goto L_0x0379
            java.util.List r3 = r0.A03
        L_0x02b6:
            java.lang.String r0 = "product_ids"
            if (r3 == 0) goto L_0x02bd
            r4.put(r0, r3)
        L_0x02bd:
            X.0jB r5 = new X.0jB
            r5.<init>()
            android.os.Bundle r3 = r11.A01
            if (r3 == 0) goto L_0x02d3
            X.To7 r0 = new X.To7
            r0.<init>()
            r0.A00(r3)
            X.0jB r0 = r0.A00
            r5.A06(r0)
        L_0x02d3:
            X.9JL r0 = X.C294165ly.A01(r5)
            if (r0 == 0) goto L_0x02db
            java.lang.String r1 = r0.A04
        L_0x02db:
            java.lang.String r0 = "parent_m_pk"
            if (r1 == 0) goto L_0x02e2
            r4.put(r0, r1)
        L_0x02e2:
            java.lang.String r3 = "shopping_session_id"
            r4.put(r3, r12)
            java.lang.String r1 = r11.A0Q
            java.lang.String r0 = "prior_module"
            r4.put(r0, r1)
            java.lang.String r1 = r11.A0H
            java.lang.String r0 = "prior_submodule"
            r4.put(r0, r1)
            java.lang.String r1 = r11.A0A
            java.lang.String r0 = "ad_id"
            if (r1 == 0) goto L_0x02fe
            r4.put(r0, r1)
        L_0x02fe:
            java.lang.String r1 = r11.A0C
            java.lang.String r0 = "ad_tracking_token"
            if (r1 == 0) goto L_0x0307
            r4.put(r0, r1)
        L_0x0307:
            java.lang.String r1 = r11.A0B
            java.lang.String r0 = "ad_media_id"
            if (r1 == 0) goto L_0x0310
            r4.put(r0, r1)
        L_0x0310:
            java.lang.String r1 = r11.A0W
            java.lang.String r0 = "shops_first_entry_point"
            if (r1 == 0) goto L_0x0319
            r4.put(r0, r1)
        L_0x0319:
            java.lang.String r1 = r11.A0D
            java.lang.String r0 = "affiliate_marketer_id"
            if (r1 == 0) goto L_0x0322
            r4.put(r0, r1)
        L_0x0322:
            java.lang.String r1 = r11.A0J
            java.lang.String r0 = "gift_recipient_id"
            if (r1 == 0) goto L_0x032b
            r4.put(r0, r1)
        L_0x032b:
            java.lang.String r1 = r11.A0I
            java.lang.String r0 = "featured_product_permission_id"
            if (r1 == 0) goto L_0x0334
            r4.put(r0, r1)
        L_0x0334:
            boolean r0 = r11.A0a
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "direct_from_ad"
            if (r1 == 0) goto L_0x0341
            r4.put(r0, r1)
        L_0x0341:
            java.lang.String r1 = r11.A0X
            java.lang.String r0 = "timezone"
            if (r1 == 0) goto L_0x034a
            r4.put(r0, r1)
        L_0x034a:
            com.google.common.collect.ImmutableMap r1 = r4.build()
            java.lang.String r0 = "cpdp_product_data"
            r2.put(r0, r1)
            r2.put(r3, r12)
            java.lang.String r0 = "cpdp_mvp_bloks_pdp_arguments"
            r2.put(r0, r11)
            java.lang.String r1 = X.C2818159r.A01()
            java.lang.String r0 = "arg_cpdp_mvp_bloks_session_id"
            r2.put(r0, r1)
            org.json.JSONObject r0 = r11.A0Z
            java.lang.String r1 = X.DbX.A0t(r0)
            java.lang.String r0 = "device_capabilities"
            if (r1 == 0) goto L_0x0371
            r2.put(r0, r1)
        L_0x0371:
            com.google.common.collect.ImmutableMap r0 = r2.build()
            X.0qQ.A07(r0)
            return r0
        L_0x0379:
            r3 = r1
            goto L_0x02b6
        L_0x037c:
            r3 = r1
            goto L_0x02a7
        L_0x037f:
            r3 = r1
            goto L_0x0298
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W39.A00(com.instagram.common.session.UserSession, com.instagram.shopping.intf.ProductDetailsPageArguments, java.lang.String):com.google.common.collect.ImmutableMap");
    }

    public static final ImageUrlBase A01(UserSession userSession, ProductDetailsPageArguments productDetailsPageArguments) {
        ImageInfoImpl imageInfoImpl;
        ProductTileMedia productTileMedia;
        String str;
        Integer num;
        Integer num2;
        if (productDetailsPageArguments.A0E != null && (str = productDetailsPageArguments.A0F) != null && (num = productDetailsPageArguments.A08) != null && (num2 = productDetailsPageArguments.A07) != null) {
            return new SimpleImageUrl(str, num.intValue(), num2.intValue());
        }
        if (!182.A06(0Tu.A05, userSession, 2342155196765045705L) || (productTileMedia = productDetailsPageArguments.A03) == null) {
            Product product = productDetailsPageArguments.A06;
            if (product == null) {
                return null;
            }
            imageInfoImpl = product.A07;
        } else {
            imageInfoImpl = productTileMedia.A00;
        }
        if (imageInfoImpl != null) {
            return 1iI.A03(imageInfoImpl);
        }
        return null;
    }

    public static final void A02(Bundle bundle, ImmutableMap immutableMap, UserSession userSession, ProductDetailsPageArguments productDetailsPageArguments, Map map, boolean z, boolean z2) {
        0Tu r4;
        0Tu r42;
        Map map2 = map;
        ProductDetailsPageArguments productDetailsPageArguments2 = productDetailsPageArguments;
        0qQ.A0B(productDetailsPageArguments2, 1);
        UserSession userSession2 = userSession;
        if (immutableMap == null) {
            immutableMap = A00(userSession, productDetailsPageArguments2, C228022kf.A00(bundle));
        }
        if (map == null) {
            Object obj = immutableMap.get("cpdp_product_data");
            if (!(obj instanceof Map) || (map2 = (Map) obj) == null) {
                throw new IllegalArgumentException("Expected a Map<String,Any?> for cpdp params");
            }
        }
        if (z2) {
            r4 = 0Tu.A05;
        } else {
            r4 = 0Tu.A06;
        }
        Long A0Y = AnonymousClass7TF.A0Y(r4, userSession, 36593662528783819L);
        0qQ.A0A(A0Y);
        if (z2) {
            r42 = 0Tu.A05;
        } else {
            r42 = 0Tu.A06;
        }
        long A01 = 182.A01(r42, userSession, 36593662528849356L);
        0qQ.A0A(Long.valueOf(A01));
        HashMap A02 = 0Yt.A02(new 0eP[]{C13989Tnp.A0x("product_id", map2), C13989Tnp.A0x("merchant_id", map2), new 0eP("cache_version", A0Y), C13989Tnp.A0x("shopping_session_id", map2), C13989Tnp.A0x("prior_module", map2), C13989Tnp.A0x("prior_submodule", map2), C13989Tnp.A0x("ad_id", map2), C13989Tnp.A0x("ad_tracking_token", map2), C13989Tnp.A0x("ad_media_id", map2), C13989Tnp.A0x("m_pk", map2), C13989Tnp.A0x("product_pinned_media_id", map2), C13989Tnp.A0x("affiliate_marketer_id", map2)});
        if (z) {
            A02.put("layout_type", "BROWSE_HEAVY_PDP_LAYOUT");
        }
        A03(userSession2, "com.bloks.www.async.components.CPDPDataAsyncComponentQuery", A02, A01);
    }

    public static final void A04(UserSession userSession, String str, Map map, boolean z) {
        0Tu r0 = 0Tu.A05;
        UserSession userSession2 = userSession;
        Long A0Y = AnonymousClass7TF.A0Y(r0, userSession2, 36593662528783819L);
        0qQ.A0A(A0Y);
        double A00 = 182.A00(r0, userSession2, 37156612483055638L);
        0qQ.A0A(Double.valueOf(A00));
        Map map2 = map;
        HashMap A02 = 0Yt.A02(new 0eP[]{C13989Tnp.A0x("product_id", map2), C13989Tnp.A0x("merchant_id", map2), new 0eP("cache_version", A0Y), C13989Tnp.A0x("shopping_session_id", map2), C13989Tnp.A0x("prior_module", map2), C13989Tnp.A0x("prior_submodule", map2), C13989Tnp.A0x("ad_id", map2), C13989Tnp.A0x("ad_tracking_token", map2), C13989Tnp.A0x("ad_media_id", map2), C13989Tnp.A0x("m_pk", map2), C13989Tnp.A0x("product_pinned_media_id", map2), C13989Tnp.A0x("affiliate_marketer_id", map2), C13989Tnp.A0x("direct_from_ad", map2)});
        if (z) {
            A02.put("layout_type", "BROWSE_HEAVY_PDP_LAYOUT");
        }
        A03(userSession2, str, A02, (long) A00);
    }

    public static final void A05(ImageUrl imageUrl, String str, StringBuilder sb) {
        if (imageUrl == null) {
            sb.append(str);
            sb.append("is null, ");
            return;
        }
        A07(imageUrl.getUrl(), 002.A0R(str, ".url"), sb);
        A06(Integer.valueOf(imageUrl.getWidth()), 002.A0R(str, ".width"), sb);
        A06(Integer.valueOf(imageUrl.getHeight()), 002.A0R(str, ".height"), sb);
    }

    public static final void A06(Integer num, String str, StringBuilder sb) {
        String str2;
        if (num == null) {
            sb.append(str);
            str2 = " is null, ";
        } else {
            int intValue = num.intValue();
            if (intValue < 1) {
                sb.append(str);
                sb.append(" is ");
                sb.append(intValue);
                str2 = " < 1, ";
            } else {
                return;
            }
        }
        sb.append(str2);
    }

    public static final void A07(String str, String str2, StringBuilder sb) {
        String str3;
        if (str == null) {
            sb.append(str2);
            str3 = " is null, ";
        } else if (00l.A0W(str)) {
            sb.append(str2);
            str3 = " is blank, ";
        } else {
            return;
        }
        sb.append(str3);
    }

    public static final void A03(UserSession userSession, String str, Map map, long j) {
        C307516Qk.A00(C307496Qi.A00(userSession)).A03(Q3K.PARALLEL_FETCH, (JPG) null, str, map, (Set) null, j, false, false);
    }
}
