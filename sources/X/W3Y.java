package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class W3Y {
    public final ShoppingMoreProductsFragment A0F(UserSession userSession, 1Xj r9, AnonymousClass4DU r10, 1sy r11, X71 x71, C16560UxC uxC, Integer num, String str, String str2, String str3, List list) {
        ArrayList arrayList;
        List A0N;
        17k.A07(r9, "Need to provide a media we can extract the tagged products from");
        String str4 = str3;
        ProductCollection productCollection = null;
        if (C55146Hcu.A00(str4)) {
            arrayList = new ArrayList();
        } else if (r9.A5G()) {
            r9.A0C.getClipsMetadata().getClass();
            ClipsShoppingInfoIntf Btl = r9.A0C.getClipsMetadata().Btl();
            Btl.getClass();
            arrayList = new ArrayList(C17023VEx.A00(Btl));
            productCollection = Btl.Aoo();
        } else if (r9.A5Y()) {
            r9.A0C.BFq().getClass();
            arrayList = C17024VEy.A00(r9.A0C.BFq());
            productCollection = r9.A0C.BFq().Aoo();
        } else {
            if (r9.A5v() && r9.A20() != null) {
                ReelMultiProductLinkIntf A20 = r9.A20();
                A20.getClass();
                if (A20.Bga() != null) {
                    ReelMultiProductLinkIntf A202 = r9.A20();
                    A202.getClass();
                    A0N = C14502TxO.A02(A202.Bga());
                    arrayList = new ArrayList(A0N);
                }
            }
            if (r9.A5v()) {
                AnonymousClass3WT r5 = AnonymousClass3WT.PRODUCT;
                if (r9.A3o(r5) != null) {
                    arrayList = new ArrayList();
                    arrayList.add(((C255783ui) r9.A3o(r5).get(0)).A0I());
                }
            }
            if (r9.A5v()) {
                AnonymousClass3WT r4 = AnonymousClass3WT.MULTI_PRODUCT;
                if (r9.A3o(r4) != null) {
                    List A3o = r9.A3o(r4);
                    A3o.getClass();
                    if (((C255783ui) A3o.get(0)).A0N() != null) {
                        List A3o2 = r9.A3o(r4);
                        A3o2.getClass();
                        A0N = ((C255783ui) A3o2.get(0)).A0N();
                        arrayList = new ArrayList(A0N);
                    }
                }
            }
            arrayList = r9.A3B();
        }
        if (list != null && !list.isEmpty()) {
            arrayList = (ArrayList) list;
        }
        ShoppingMoreProductsFragment shoppingMoreProductsFragment = new ShoppingMoreProductsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("tagged_products", arrayList);
        bundle.putParcelable("product_collection", productCollection);
        bundle.putString("media_id", r9.getId());
        bundle.putString("surface_title", str);
        bundle.putString("media_id", r9.getId());
        bundle.putString("prior_module_name", r10.getModuleName());
        DbU.A1D(bundle, userSession);
        bundle.putString("shopping_session_id", str2);
        bundle.putSerializable("media_surface", r11);
        bundle.putBoolean("as_fullscreen", false);
        bundle.putString("prior_submodule_name", str4);
        if (uxC != null) {
            bundle.putInt("ad_product_destination_override", uxC.A00);
        }
        if (num != null) {
            bundle.putInt("media_carousel_index", num.intValue());
        }
        if (r10 instanceof C232682uF) {
            0jB E4l = ((C232682uF) r10).E4l(r9);
            C14005To7 to7 = new C14005To7();
            to7.A02(E4l);
            to7.A01(bundle);
        }
        shoppingMoreProductsFragment.A07 = x71;
        shoppingMoreProductsFragment.setArguments(bundle);
        return shoppingMoreProductsFragment;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.FpL, java.lang.Object] */
    public static AnonymousClass3M3 A00(Bundle bundle, XCK xck, UserSession userSession, Integer num, String str, String str2, String str3, int i) {
        HashMap hashMap;
        if (str3 == null) {
            str3 = bundle.getString("product_feed_label");
        }
        boolean z = bundle.getBoolean("should_show_tab_bar", false);
        if (bundle.getSerializable("bloks_params") == null) {
            hashMap = new HashMap();
        } else {
            hashMap = (HashMap) bundle.getSerializable("bloks_params");
        }
        C46649DiU A04 = C46649DiU.A04(str, hashMap);
        if (num != null) {
            A04.A00 = num.intValue();
        }
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0N = Integer.valueOf(i);
        igBloksScreenConfig.A0U = str3;
        igBloksScreenConfig.A0R = str2;
        igBloksScreenConfig.A02 = new Object();
        igBloksScreenConfig.A0l = z;
        if (xck != null) {
            igBloksScreenConfig.A04 = xck;
        }
        return C49891FBs.A02(igBloksScreenConfig, A04);
    }

    public static C19159WNr A01(Bundle bundle) {
        bundle.getSerializable("seller_shoppable_feed_type");
        String string = bundle.getString("displayed_user_id");
        String string2 = bundle.getString("product_feed_label");
        String string3 = bundle.getString("attribution_username");
        String string4 = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
        if (string == null) {
            string = "";
        }
        if (string4 == null) {
            string4 = "";
        }
        return new C19159WNr(string, string2, string4, string3, true);
    }

    public static ArrayList A02(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            DbT.A1Q(0wj.A01, "Received null FeedItem list from MediaFeedResponse payload on IG ShoppingFragmentFactoryImpl", 817903268);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C51971G9r.A0v(it));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.FpL, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        if (r2 != null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A09(android.os.Bundle r10, com.instagram.common.session.UserSession r11) {
        /*
            r9 = this;
            java.lang.String r4 = "bloks_params"
            java.io.Serializable r1 = r10.getSerializable(r4)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            if (r1 == 0) goto L_0x0042
            java.lang.String r0 = "prior_module"
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r0 = "media_id"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.1Xj r0 = X.DbV.A0U(r11, r0)
            if (r3 == 0) goto L_0x0042
            if (r0 == 0) goto L_0x0042
            r0 = 288(0x120, float:4.04E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 1354(0x54a, float:1.897E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 362(0x16a, float:5.07E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r0.contains(r3)
        L_0x0042:
            java.lang.String r0 = "seller_shoppable_feed_type"
            java.io.Serializable r3 = r10.getSerializable(r0)
            java.io.Serializable r1 = r10.getSerializable(r4)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            if (r1 == 0) goto L_0x00e3
            java.lang.String r0 = "request_source"
            java.lang.Object r2 = r1.get(r0)
        L_0x0056:
            com.instagram.api.schemas.SellerShoppableFeedType r0 = com.instagram.api.schemas.SellerShoppableFeedType.A05
            if (r3 != r0) goto L_0x005d
            r1 = 1
            if (r2 == 0) goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.lang.String r0 = "product_feed_label"
            java.lang.String r8 = r10.getString(r0)
            X.WNr r7 = A01(r10)
            r6 = 2131627866(0x7f0e0f5a, float:1.8883009E38)
            if (r1 == 0) goto L_0x0070
            r6 = 2131627867(0x7f0e0f5b, float:1.888301E38)
        L_0x0070:
            java.lang.String r2 = "com.bloks.www.minishops.storefront.ig"
            java.lang.String r5 = "instagram_shopping_mini_shop_storefront"
            if (r8 != 0) goto L_0x007a
            java.lang.String r8 = r10.getString(r0)
        L_0x007a:
            r3 = 0
            java.lang.String r0 = "should_show_tab_bar"
            boolean r1 = r10.getBoolean(r0, r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r4.<init>((X.0lg) r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r4.A0N = r0
            r4.A0U = r8
            r4.A0R = r5
            r4.A0l = r1
            X.FpL r0 = new X.FpL
            r0.<init>()
            r4.A02 = r0
            r4.A0R = r5
            r4.A04 = r7
            java.lang.String r0 = "mini_shop_request_builder"
            java.lang.Integer r1 = X.DbV.A0o(r10, r0)
            java.lang.Class<X.VaQ> r0 = X.C17572VaQ.class
            java.lang.Object r5 = X.C14615TzM.A01(r0, r1)
            X.VaQ r5 = (X.C17572VaQ) r5
            if (r5 == 0) goto L_0x00eb
            java.util.BitSet r0 = r5.A02
            int r1 = r0.nextClearBit(r3)
            r0 = 1
            if (r1 < r0) goto L_0x00e6
            java.util.Map r0 = r5.A05
            java.util.HashMap r1 = X.C359608dC.A01(r0)
            java.util.Map r0 = r5.A04
            X.DiU r3 = new X.DiU
            r3.<init>(r1, r0, r2)
            r0 = 777060353(0x2e510001, float:4.75211E-11)
            r3.A00 = r0
            r2 = 0
            r3.A05 = r2
            r0 = 0
            r3.A01 = r0
            r3.A06 = r2
            r3.A03 = r2
            r3.A02 = r2
            r3.A04 = r2
            java.util.Map r0 = r5.A03
            r3.A0H(r0)
            android.content.Context r0 = r5.A01
            X.3M3 r0 = r3.A0C(r0, r4)
            return r0
        L_0x00e3:
            r2 = 0
            goto L_0x0056
        L_0x00e6:
            java.lang.IllegalStateException r1 = X.DbU.A0i()
            throw r1
        L_0x00eb:
            java.lang.String r0 = "MiniShopIGStorefrontAppControllerScreen couldn't be null. Please make sure you are setting the controller in BloksDataStorage and passing the generated key in arguments"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3Y.A09(android.os.Bundle, com.instagram.common.session.UserSession):androidx.fragment.app.Fragment");
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.FpL, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015f, code lost:
        if ("BROWSE_HEAVY_PDP_LAYOUT".equals(r3.A0L) == false) goto L_0x0161;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A0A(android.os.Bundle r35, com.instagram.common.session.UserSession r36) {
        /*
            r34 = this;
            java.lang.String r0 = "pdp_arguments"
            r6 = r35
            android.os.Parcelable r3 = r6.getParcelable(r0)
            r3.getClass()
            com.instagram.shopping.intf.ProductDetailsPageArguments r3 = (com.instagram.shopping.intf.ProductDetailsPageArguments) r3
            r17 = 0
            r20 = 1
            r1 = r36
            r0 = r20
            X.AnonymousClass7TF.A1B(r3, r0, r1)
            X.02m r4 = X.02m.A0p
            r2 = 735191592(0x2bd22228, float:1.4930878E-12)
            r4.markerStart(r2, r0)
            X.0Tu r2 = X.0Tu.A05
            r4 = 36312187554169837(0x8101be002f03ed, double:3.0273118544755015E-306)
            boolean r0 = X.182.A06(r2, r1, r4)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r10 = r3.A0U
            if (r10 == 0) goto L_0x00ba
            java.util.concurrent.ConcurrentHashMap r8 = X.VKs.A03
            java.lang.Object r0 = r8.get(r10)
            if (r0 == 0) goto L_0x00ba
            X.0wc r4 = X.VKs.A00
            if (r4 != 0) goto L_0x0043
            X.0wc r4 = X.AnonymousClass0kN.A02(r1)
            X.VKs.A00 = r4
        L_0x0043:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.analytics.structuredlogger.IgTypedLogger"
            X.0qQ.A0C(r4, r0)
            java.lang.String r0 = "instagram_smart_prefetch_ad_click"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r4, r0)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "product_id"
            r9.AAJ(r0, r10)
            java.util.concurrent.ConcurrentHashMap r7 = X.VKs.A05
            java.lang.Object r4 = r7.get(r10)
            java.util.Map r4 = (java.util.Map) r4
            r5 = 0
            if (r4 == 0) goto L_0x044f
            java.lang.String r0 = "ad_id"
            java.lang.String r4 = X.DbT.A11(r0, r4)
        L_0x006a:
            java.lang.String r0 = "ad_id"
            java.util.Map r4 = X.C13989Tnp.A0w(r9, r10, r0, r4, r7)
            if (r4 == 0) goto L_0x044c
            java.lang.String r0 = "ad_tracking_token"
            java.lang.String r4 = X.DbT.A11(r0, r4)
        L_0x0078:
            java.lang.String r0 = "ad_tracking_token"
            java.util.Map r4 = X.C13989Tnp.A0w(r9, r10, r0, r4, r7)
            if (r4 == 0) goto L_0x0449
            java.lang.String r0 = "prior_module"
            java.lang.String r4 = X.DbT.A11(r0, r4)
        L_0x0086:
            java.lang.String r0 = "prior_module"
            java.util.Map r4 = X.C13989Tnp.A0w(r9, r10, r0, r4, r7)
            if (r4 == 0) goto L_0x0446
            java.lang.String r0 = "prior_submodule"
            java.lang.String r4 = X.DbT.A11(r0, r4)
        L_0x0094:
            java.lang.String r0 = "prior_submodule"
            java.util.Map r7 = X.C13989Tnp.A0w(r9, r10, r0, r4, r7)
            if (r7 == 0) goto L_0x00aa
            r5 = 51
            r4 = 10
            r0 = 54
            java.lang.String r0 = X.AnonymousClass9NJ.A00(r5, r4, r0)
            java.lang.String r5 = X.DbU.A0r(r0, r7)
        L_0x00aa:
            X.C51969G9p.A1C(r9, r5)
        L_0x00ad:
            java.util.concurrent.ConcurrentHashMap r0 = X.VKs.A05
            r0.clear()
            r8.clear()
            java.util.concurrent.ConcurrentHashMap r0 = X.VKs.A02
            r0.clear()
        L_0x00ba:
            java.lang.String r4 = r3.A0N
            if (r4 == 0) goto L_0x00ce
            boolean r0 = X.00l.A0W(r4)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = r3.A0U
            if (r0 == 0) goto L_0x00ce
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x0133
        L_0x00ce:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Incomplete data detected: "
            r7.append(r0)
            java.lang.String r0 = "arguments.merchantId"
            X.W39.A07(r4, r0, r7)
            com.instagram.user.model.Product r8 = r3.A06
            if (r8 != 0) goto L_0x042a
            java.lang.String r0 = "arguments.product is null"
        L_0x00e3:
            r7.append(r0)
        L_0x00e6:
            java.lang.String r4 = r3.A0U
            java.lang.String r0 = "arguments.productId"
            X.W39.A07(r4, r0, r7)
            if (r8 != 0) goto L_0x03b7
            java.lang.String r0 = "arguments.product is null"
            r7.append(r0)
        L_0x00f4:
            java.lang.String r4 = r3.A0Q
            java.lang.String r0 = "arguments.priorModule"
            X.W39.A07(r4, r0, r7)
            java.lang.String r4 = r3.A0H
            java.lang.String r0 = "arguments.entryPoint"
            X.W39.A07(r4, r0, r7)
            java.lang.String r4 = r3.A0A
            java.lang.String r0 = "arguments.adId"
            X.W39.A07(r4, r0, r7)
            java.lang.String r4 = r3.A0C
            java.lang.String r0 = "arguments.adTrackingToken"
            X.W39.A07(r4, r0, r7)
            java.lang.String r4 = r3.A0B
            java.lang.String r0 = "arguments.adMediaId"
            X.W39.A07(r4, r0, r7)
            java.lang.String r0 = "arguments: "
            java.lang.String r8 = X.AnonymousClass7TG.A0m(r3, r0, r7)
            X.0qQ.A07(r8)
            X.0Tu r0 = X.0Tu.A06
            r4 = 36593662528325066(0x8201be000805ca, double:3.205317761540015E-306)
            long r4 = X.182.A01(r0, r1, r4)
            int r7 = (int) r4
            java.lang.String r4 = "CPDPScreenBuilder"
            X.0wb r0 = X.0wb.A01
            r0.Ew1(r4, r8, r7)
        L_0x0133:
            java.lang.String r0 = X.C228022kf.A00(r6)
            com.google.common.collect.ImmutableMap r16 = X.W39.A00(r1, r3, r0)
            java.lang.String r4 = "cpdp_product_data"
            r0 = r16
            java.lang.Object r0 = r0.get(r4)
            boolean r4 = r0 instanceof java.util.Map
            if (r4 == 0) goto L_0x0985
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0985
            r4 = 36312187553973227(0x8101be002c03eb, double:3.0273118543511646E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0161
            java.lang.String r5 = r3.A0L
            java.lang.String r4 = "BROWSE_HEAVY_PDP_LAYOUT"
            boolean r4 = r4.equals(r5)
            r10 = 1
            if (r4 != 0) goto L_0x0162
        L_0x0161:
            r10 = 0
        L_0x0162:
            r4 = 36312187552007121(0x8101be000e03d1, double:3.027311853107791E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0178
            r5 = r6
            r6 = r16
            r7 = r1
            r8 = r3
            r9 = r0
            r11 = r20
            X.W39.A02(r5, r6, r7, r8, r9, r10, r11)
        L_0x0178:
            r4 = 36312187552990172(0x8101be001d03dc, double:3.0273118537294766E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0188
            java.lang.String r4 = "com.bloks.www.async.components.CPDPAtfModuleAsyncComponentQuery"
            X.W39.A04(r1, r4, r0, r10)
        L_0x0188:
            r4 = 36312187552793562(0x8101be001a03da, double:3.0273118536051397E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0217
            r4 = 36593662528783819(0x8201be000f05cb, double:3.2053177618301326E-306)
            java.lang.Long r8 = X.AnonymousClass7TF.A0Y(r2, r1, r4)
            X.0qQ.A0A(r8)
            r4 = 37156612483055638(0x8401be001c0016, double:3.561329579729149E-306)
            double r6 = X.182.A00(r2, r1, r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r6)
            X.0qQ.A0A(r4)
            java.lang.String r4 = "product_id"
            X.0eP r21 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "merchant_id"
            X.0eP r22 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "cache_version"
            X.0eP r5 = new X.0eP
            r5.<init>(r4, r8)
            java.lang.String r4 = "shopping_session_id"
            X.0eP r24 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "prior_module"
            X.0eP r25 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "prior_submodule"
            X.0eP r26 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "ad_id"
            X.0eP r27 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "ad_tracking_token"
            X.0eP r28 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "ad_media_id"
            X.0eP r29 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "m_pk"
            X.0eP r30 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "product_pinned_media_id"
            X.0eP r31 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "affiliate_marketer_id"
            X.0eP r32 = X.C13989Tnp.A0x(r4, r0)
            java.lang.String r4 = "direct_from_ad"
            X.0eP r33 = X.C13989Tnp.A0x(r4, r0)
            r23 = r5
            X.0eP[] r4 = new X.0eP[]{r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}
            java.util.HashMap r8 = X.0Yt.A02(r4)
            if (r10 == 0) goto L_0x0211
            java.lang.String r5 = "layout_type"
            java.lang.String r4 = "BROWSE_HEAVY_PDP_LAYOUT"
            r8.put(r5, r4)
        L_0x0211:
            long r4 = (long) r6
            java.lang.String r6 = "com.bloks.www.async.components.CPDPPersonalizedLayoutQuery"
            X.W39.A03(r1, r6, r8, r4)
        L_0x0217:
            r4 = 36312187553121246(0x8101be001f03de, double:3.0273118538123684E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0227
            java.lang.String r4 = "com.bloks.www.async.components.CPDPAtfModuleOneAsyncComponentQuery"
            X.W39.A04(r1, r4, r0, r10)
        L_0x0227:
            r4 = 36312187553055709(0x8101be001e03dd, double:3.0273118537709225E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0237
            java.lang.String r4 = "com.bloks.www.async.components.CPDPAtfModuleTwoAsyncComponentQuery"
            X.W39.A04(r1, r4, r0, r10)
        L_0x0237:
            r4 = 36312187553252320(0x8101be002103e0, double:3.02731185389526E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0247
            java.lang.String r4 = "com.bloks.www.async.components.CPDPAtfModuleThreeAsyncComponentQuery"
            X.W39.A04(r1, r4, r0, r10)
        L_0x0247:
            r4 = 36312187553317857(0x8101be002203e1, double:3.027311853936706E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0257
            java.lang.String r4 = "com.bloks.www.async.components.CPDPAtfModuleFourAsyncComponentQuery"
            X.W39.A04(r1, r4, r0, r10)
        L_0x0257:
            r4 = 36312187553776616(0x8101be002903e8, double:3.027311854226827E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0267
            java.lang.String r4 = "com.bloks.www.cpdp.content.async.component.query"
            X.W39.A04(r1, r4, r0, r10)
        L_0x0267:
            r4 = 36312187553645542(0x8101be002703e6, double:3.027311854143935E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0277
            java.lang.String r4 = "com.bloks.www.cpdp.content.async.component.sub.query.one"
            X.W39.A04(r1, r4, r0, r10)
        L_0x0277:
            r4 = 36312187553711079(0x8101be002803e7, double:3.027311854185381E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0287
            java.lang.String r4 = "com.bloks.www.cpdp.content.async.component.sub.query.two"
            X.W39.A04(r1, r4, r0, r10)
        L_0x0287:
            r4 = 36312187553580005(0x8101be002603e5, double:3.0273118541024894E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x0297
            java.lang.String r4 = "com.bloks.www.cpdp.content.async.component.sub.query.three"
            X.W39.A04(r1, r4, r0, r10)
        L_0x0297:
            r4 = 36312187553448931(0x8101be002403e3, double:3.0273118540195977E-306)
            boolean r4 = X.182.A06(r2, r1, r4)
            if (r4 == 0) goto L_0x02bc
            r4 = 36593662529439181(0x8201be001905cd, double:3.205317762244586E-306)
            long r4 = X.182.A01(r2, r1, r4)
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            X.0qQ.A0A(r6)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r6 = "com.bloks.www.cpdp.content.async.component.template"
            X.W39.A03(r1, r6, r7, r4)
        L_0x02bc:
            com.instagram.bloks.hosting.IgBloksScreenConfig r8 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r8.<init>((X.0lg) r1)
            java.lang.String r19 = "instagram_shopping_pdp"
            r4 = r19
            r8.A0R = r4
            java.lang.String r3 = r3.A0P
            r32 = r3
            r8.A0U = r3
            X.FpL r3 = new X.FpL
            r3.<init>()
            r8.A02 = r3
            r3 = 36312187552203730(0x8101be001103d2, double:3.0273118532321275E-306)
            boolean r3 = X.182.A06(r2, r1, r3)
            r13 = -1
            if (r3 == 0) goto L_0x02e3
            r13 = 777060353(0x2e510001, float:4.75211E-11)
        L_0x02e3:
            r3 = 36312187552269267(0x8101be001203d3, double:3.0273118532735734E-306)
            boolean r18 = X.182.A06(r2, r1, r3)
            X.0Tu r5 = X.0Tu.A06
            r3 = 36593662529439181(0x8201be001905cd, double:3.205317762244586E-306)
            long r11 = X.182.A01(r5, r1, r3)
            r3 = 36312187553383394(0x8101be002303e2, double:3.027311853978152E-306)
            boolean r3 = X.182.A06(r2, r1, r3)
            if (r3 == 0) goto L_0x047b
            r9 = 0
            X.Vbz r3 = new X.Vbz
            r23 = r9
            r24 = r9
            r25 = r9
            r26 = r32
            r27 = r9
            r28 = r9
            r29 = r17
            r30 = r17
            r21 = r3
            r22 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.WF5 r7 = new X.WF5
            r7.<init>(r3, r9, r9, r9)
            r3 = r17
            X.6Qj r6 = X.C48721Ej6.A00(r1, r3)
            r3 = 37156612483055638(0x8401be001c0016, double:3.561329579729149E-306)
            double r4 = X.182.A00(r2, r1, r3)
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.BitSet r15 = new java.util.BitSet
            r2 = r20
            r15.<init>(r2)
            long r2 = (long) r4
            r30 = r2
            java.lang.String r2 = "merchant_id"
            A07(r2, r0, r14)
            java.lang.String r4 = "product_id"
            java.lang.Object r3 = r0.get(r4)
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L_0x0358
            if (r3 == 0) goto L_0x0358
            r14.put(r4, r3)
            r2 = r17
            r15.set(r2)
        L_0x0358:
            java.lang.String r2 = "prior_module"
            A07(r2, r0, r14)
            java.lang.String r2 = "prior_submodule"
            A07(r2, r0, r14)
            java.lang.String r2 = "ad_id"
            A07(r2, r0, r14)
            java.lang.String r2 = "ad_tracking_token"
            A07(r2, r0, r14)
            java.lang.String r2 = "ad_media_id"
            A07(r2, r0, r14)
            java.lang.String r2 = "affiliate_marketer_id"
            A07(r2, r0, r14)
            java.lang.String r2 = "shopping_session_id"
            A07(r2, r0, r14)
            java.lang.String r2 = "featured_product_permission_id"
            A07(r2, r0, r14)
            java.lang.String r2 = "m_pk"
            A07(r2, r0, r14)
            java.lang.String r2 = "product_pinned_media_id"
            A07(r2, r0, r14)
            r2 = r17
            int r3 = r15.nextClearBit(r2)
            r2 = r20
            if (r3 < r2) goto L_0x0452
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r15 = X.AnonymousClass7TF.A0s(r14)
        L_0x039d:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x045a
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r15)
            java.lang.Object r5 = r4.getKey()
            java.util.Set r3 = X.C18962WEp.A00
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x039d
            X.JTR.A1U(r2, r4)
            goto L_0x039d
        L_0x03b7:
            java.lang.String r4 = r8.A0J
            java.lang.String r0 = "arguments.product.name"
            X.W39.A07(r4, r0, r7)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r8.A01
            java.lang.String r4 = r0.A0V
            if (r4 != 0) goto L_0x03c6
            java.lang.String r4 = r0.A0T
        L_0x03c6:
            java.lang.String r0 = "arguments.product.currentPrice"
            X.W39.A07(r4, r0, r7)
            java.lang.String r4 = r8.A0G
            java.lang.String r0 = "arguments.product.fullPrice"
            X.W39.A07(r4, r0, r7)
            java.lang.String r4 = r8.A0K
            java.lang.String r0 = "arguments.product.perUnitPrice"
            X.W39.A07(r4, r0, r7)
            java.lang.String r4 = r8.A0F
            java.lang.String r0 = "arguments.product.externalURL"
            X.W39.A07(r4, r0, r7)
            com.instagram.model.mediasize.ImageInfo r4 = r8.A08
            r5 = 0
            if (r4 != 0) goto L_0x0417
            java.lang.String r0 = "arguments.product.thumbnailImageInfo is null, "
        L_0x03e7:
            r7.append(r0)
        L_0x03ea:
            java.lang.String r4 = r8.A0E
            java.lang.String r0 = "arguments.product.description"
            X.W39.A07(r4, r0, r7)
            com.instagram.model.shopping.productfeed.ProductTileMedia r9 = r3.A03
            if (r9 == 0) goto L_0x03f7
            java.lang.String r5 = r9.A02
        L_0x03f7:
            java.lang.String r0 = "arguments.heroCarouselPinnedMedia?.id"
            X.W39.A07(r5, r0, r7)
            com.instagram.common.typedurl.ImageUrlBase r8 = X.W39.A01(r1, r3)
            r4 = 2342155196765045705(0x208101be000403c9, double:4.05896158649509E-152)
            boolean r0 = X.182.A06(r2, r1, r4)
            if (r0 == 0) goto L_0x0414
            if (r9 == 0) goto L_0x0414
            java.lang.String r0 = "arguments.heroCarouselPinnedMedia?.imageInfo?.thumbnailTypedUrl"
        L_0x040f:
            X.W39.A05(r8, r0, r7)
            goto L_0x00f4
        L_0x0414:
            java.lang.String r0 = "arguments.product?.mainImageInfo?.thumbnailTypedUrl"
            goto L_0x040f
        L_0x0417:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A03(r4)
            if (r0 != 0) goto L_0x0420
            java.lang.String r0 = "arguments.product.thumbnailImageInfo.thumbnailTypedUrl is null, "
            goto L_0x03e7
        L_0x0420:
            com.instagram.model.mediasize.ExtendedImageUrl r4 = X.1iI.A03(r4)
            java.lang.String r0 = "arguments.product.thumbnailImageInfo.thumbnailTypedUrl"
            X.W39.A05(r4, r0, r7)
            goto L_0x03ea
        L_0x042a:
            com.instagram.user.model.User r5 = r8.A0B
            if (r5 != 0) goto L_0x0432
            java.lang.String r0 = "arguments.product.merchant is null"
            goto L_0x00e3
        L_0x0432:
            java.lang.String r4 = r5.getUsername()
            java.lang.String r0 = "arguments.product.merchant.username"
            X.W39.A07(r4, r0, r7)
            com.instagram.common.typedurl.ImageUrl r4 = r5.Bh3()
            java.lang.String r0 = "arguments.product.merchant.profilePicUrl"
            X.W39.A05(r4, r0, r7)
            goto L_0x00e6
        L_0x0446:
            r4 = r5
            goto L_0x0094
        L_0x0449:
            r4 = r5
            goto L_0x0086
        L_0x044c:
            r4 = r5
            goto L_0x0078
        L_0x044f:
            r4 = r5
            goto L_0x006a
        L_0x0452:
            java.lang.String r1 = "Missing required params"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x045a:
            java.util.Map r25 = X.0Yt.A0B(r14)
            r27 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r22 = "com.bloks.www.cpdp.entrypoint.tap.screen.query"
            X.ShW r3 = new X.ShW
            r26 = r2
            r28 = r30
            r30 = r20
            r21 = r3
            r23 = r19
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r30)
            r2 = 2
            X.0qQ.A0B(r6, r2)
            r2 = r20
            r3.E3a(r7, r6, r9, r2)
        L_0x047b:
            r2 = 0
            if (r10 == 0) goto L_0x0617
            X.1Kj r1 = X.C64361Kj.A00()
            android.content.Context r5 = r1.A00
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.HashMap r3 = X.DbX.A0v()
            java.lang.String r1 = "merchant_id"
            java.lang.Object r6 = r0.get(r1)
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x04a3
            if (r6 == 0) goto L_0x04a3
            java.lang.String r1 = "prop_merchant_id"
            r4.put(r1, r6)
        L_0x04a3:
            java.lang.String r1 = "merchant_profile_url"
            A05(r1, r4, r0)
            java.lang.String r1 = "merchant_profile_width"
            A03(r1, r4, r0)
            java.lang.String r1 = "merchant_profile_height"
            A03(r1, r4, r0)
            java.lang.String r1 = "is_shop_verified"
            A04(r1, r4, r0)
            java.lang.String r1 = "merchant_username"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_id"
            java.lang.Object r6 = r0.get(r1)
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x04cd
            if (r6 == 0) goto L_0x04cd
            java.lang.String r1 = "prop_product_id"
            r4.put(r1, r6)
        L_0x04cd:
            java.lang.String r1 = "product_name"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_current_price"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_full_price"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_per_unit_price"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_external_url"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_checkout_style"
            A05(r1, r4, r0)
            java.lang.String r1 = "is_item_for_preorder"
            A04(r1, r4, r0)
            java.lang.String r1 = "is_cart_enabled"
            A04(r1, r4, r0)
            java.lang.String r1 = "is_item_in_cart"
            A04(r1, r4, r0)
            java.lang.String r1 = "is_product_soldout"
            A04(r1, r4, r0)
            java.lang.String r1 = "is_soldout_status_known"
            A04(r1, r4, r0)
            java.lang.String r1 = "has_variants"
            A04(r1, r4, r0)
            java.lang.String r1 = "product_description"
            A05(r1, r4, r0)
            java.lang.String r7 = "variant_values"
            java.lang.Object r6 = r0.get(r7)
            boolean r1 = r6 instanceof java.util.List
            if (r1 == 0) goto L_0x0525
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0525
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0525
            r4.put(r7, r6)
        L_0x0525:
            java.lang.String r1 = "product_pinned_media_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_main_image_url"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_main_image_width"
            A03(r1, r4, r0)
            java.lang.String r1 = "product_main_image_height"
            A03(r1, r4, r0)
            java.lang.String r1 = "ranking_info_recommender_type"
            A05(r1, r4, r0)
            java.lang.String r1 = "ranking_info_request_uuid"
            A05(r1, r4, r0)
            java.lang.String r1 = "search_session_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "search_query_text"
            A05(r1, r4, r0)
            java.lang.String r7 = "search_filter_extras"
            java.lang.Object r6 = r0.get(r7)
            boolean r1 = r6 instanceof java.util.Map
            if (r1 == 0) goto L_0x0564
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L_0x0564
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0564
            r4.put(r7, r6)
        L_0x0564:
            java.lang.String r1 = "m_pk"
            A05(r1, r4, r0)
            java.lang.String r1 = "m_t"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_ids"
            java.lang.Object r6 = r0.get(r1)
            boolean r1 = r6 instanceof java.util.List
            if (r1 == 0) goto L_0x0587
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0587
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0587
            java.lang.String r1 = "m_product_ids"
            r4.put(r1, r6)
        L_0x0587:
            java.lang.String r1 = "parent_m_pk"
            A05(r1, r4, r0)
            java.lang.String r1 = "shopping_session_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "prior_module"
            A05(r1, r4, r0)
            java.lang.String r1 = "prior_submodule"
            A05(r1, r4, r0)
            java.lang.String r1 = "ad_id"
            java.lang.Object r6 = r0.get(r1)
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x05ac
            if (r6 == 0) goto L_0x05ac
            java.lang.String r1 = "prop_ad_id"
            r4.put(r1, r6)
        L_0x05ac:
            java.lang.String r1 = "ad_tracking_token"
            A05(r1, r4, r0)
            java.lang.String r1 = "ad_media_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "shops_first_entry_point"
            A05(r1, r4, r0)
            java.lang.String r1 = "affiliate_marketer_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "gift_recipient_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "featured_product_permission_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "direct_from_ad"
            A04(r1, r4, r0)
            java.lang.String r1 = "prop_referral_code"
            A05(r1, r4, r0)
            java.lang.String r1 = "has_launched"
            A04(r1, r4, r0)
            java.lang.String r1 = "launch_date"
            A03(r1, r4, r0)
            java.lang.String r1 = "timezone"
            A05(r1, r4, r0)
            android.util.SparseArray r10 = new android.util.SparseArray
            r10.<init>()
            r1 = 2131428751(0x7f0b058f, float:1.8479155E38)
            r0 = r16
            r10.put(r1, r0)
            java.util.HashMap r6 = X.C359608dC.A01(r9)
            java.lang.String r0 = "com.bloks.www.bloks.cxf.cpdp.browseheavy"
        L_0x05f6:
            X.DiU r1 = new X.DiU
            r1.<init>(r6, r4, r0)
            r1.A00 = r13
            r1.A05 = r2
            r6 = 0
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0971
            r1.A01 = r11
            r1.A06 = r2
            r1.A03 = r2
            r1.A02 = r10
            r1.A04 = r2
            r1.A0H(r3)
            X.3M3 r3 = r1.A0C(r5, r8)
            return r3
        L_0x0617:
            if (r18 == 0) goto L_0x07f7
            X.Vbz r3 = new X.Vbz
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r32
            r27 = r2
            r28 = r2
            r29 = r17
            r30 = r17
            r21 = r3
            r22 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.WF5 r8 = new X.WF5
            r8.<init>(r3, r2, r2, r2)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r3 = r17
            r6.<init>(r3)
            java.lang.String r3 = "merchant_id"
            java.lang.Object r5 = r0.get(r3)
            boolean r3 = r5 instanceof java.lang.String
            if (r3 == 0) goto L_0x0654
            if (r5 == 0) goto L_0x0654
            java.lang.String r3 = "prop_merchant_id"
            r4.put(r3, r5)
        L_0x0654:
            java.lang.String r3 = "merchant_profile_url"
            A07(r3, r0, r4)
            java.lang.String r3 = "merchant_profile_width"
            A08(r3, r0, r4)
            java.lang.String r3 = "merchant_profile_height"
            A08(r3, r0, r4)
            java.lang.String r3 = "is_shop_verified"
            A06(r3, r0, r4)
            java.lang.String r3 = "merchant_username"
            A07(r3, r0, r4)
            java.lang.String r3 = "product_id"
            java.lang.Object r5 = r0.get(r3)
            boolean r3 = r5 instanceof java.lang.String
            if (r3 == 0) goto L_0x067e
            if (r5 == 0) goto L_0x067e
            java.lang.String r3 = "prop_product_id"
            r4.put(r3, r5)
        L_0x067e:
            java.lang.String r3 = "product_name"
            A07(r3, r0, r4)
            java.lang.String r3 = "product_current_price"
            A07(r3, r0, r4)
            java.lang.String r3 = "product_full_price"
            A07(r3, r0, r4)
            java.lang.String r3 = "product_per_unit_price"
            A07(r3, r0, r4)
            java.lang.String r3 = "product_external_url"
            A07(r3, r0, r4)
            java.lang.String r3 = "product_checkout_style"
            A07(r3, r0, r4)
            java.lang.String r3 = "is_item_for_preorder"
            A06(r3, r0, r4)
            java.lang.String r3 = "is_cart_enabled"
            A06(r3, r0, r4)
            java.lang.String r3 = "is_item_in_cart"
            A06(r3, r0, r4)
            java.lang.String r3 = "is_product_soldout"
            A06(r3, r0, r4)
            java.lang.String r3 = "is_soldout_status_known"
            A06(r3, r0, r4)
            java.lang.String r3 = "has_variants"
            A06(r3, r0, r4)
            java.lang.String r3 = "product_description"
            A07(r3, r0, r4)
            java.lang.String r7 = "variant_values"
            java.lang.Object r5 = r0.get(r7)
            boolean r3 = r5 instanceof java.util.List
            if (r3 == 0) goto L_0x06ce
            if (r5 == 0) goto L_0x06ce
            r4.put(r7, r5)
        L_0x06ce:
            java.lang.String r3 = "product_pinned_media_id"
            A07(r3, r0, r4)
            java.lang.String r3 = "product_main_image_url"
            A07(r3, r0, r4)
            java.lang.String r3 = "product_main_image_width"
            A08(r3, r0, r4)
            java.lang.String r3 = "product_main_image_height"
            A08(r3, r0, r4)
            java.lang.String r3 = "ranking_info_recommender_type"
            A07(r3, r0, r4)
            java.lang.String r3 = "ranking_info_request_uuid"
            A07(r3, r0, r4)
            java.lang.String r3 = "search_session_id"
            A07(r3, r0, r4)
            java.lang.String r3 = "search_query_text"
            A07(r3, r0, r4)
            java.lang.String r7 = "search_filter_extras"
            java.lang.Object r5 = r0.get(r7)
            boolean r3 = r5 instanceof java.util.Map
            if (r3 == 0) goto L_0x0705
            if (r5 == 0) goto L_0x0705
            r4.put(r7, r5)
        L_0x0705:
            java.lang.String r3 = "m_pk"
            A07(r3, r0, r4)
            java.lang.String r3 = "m_t"
            A07(r3, r0, r4)
            java.lang.String r3 = "product_ids"
            java.lang.Object r5 = r0.get(r3)
            boolean r3 = r5 instanceof java.util.List
            if (r3 == 0) goto L_0x0720
            if (r5 == 0) goto L_0x0720
            java.lang.String r3 = "m_product_ids"
            r4.put(r3, r5)
        L_0x0720:
            java.lang.String r3 = "parent_m_pk"
            A07(r3, r0, r4)
            java.lang.String r3 = "shopping_session_id"
            A07(r3, r0, r4)
            java.lang.String r3 = "prior_module"
            A07(r3, r0, r4)
            java.lang.String r3 = "prior_submodule"
            A07(r3, r0, r4)
            java.lang.String r3 = "ad_id"
            java.lang.Object r5 = r0.get(r3)
            boolean r3 = r5 instanceof java.lang.String
            if (r3 == 0) goto L_0x0745
            if (r5 == 0) goto L_0x0745
            java.lang.String r3 = "prop_ad_id"
            r4.put(r3, r5)
        L_0x0745:
            java.lang.String r3 = "ad_tracking_token"
            A07(r3, r0, r4)
            java.lang.String r3 = "ad_media_id"
            A07(r3, r0, r4)
            java.lang.String r3 = "shops_first_entry_point"
            A07(r3, r0, r4)
            java.lang.String r3 = "affiliate_marketer_id"
            A07(r3, r0, r4)
            java.lang.String r3 = "gift_recipient_id"
            A07(r3, r0, r4)
            java.lang.String r3 = "featured_product_permission_id"
            A07(r3, r0, r4)
            java.lang.String r3 = "direct_from_ad"
            A06(r3, r0, r4)
            java.lang.String r3 = "prop_referral_code"
            A07(r3, r0, r4)
            java.lang.String r3 = "has_launched"
            A06(r3, r0, r4)
            java.lang.String r3 = "launch_date"
            A08(r3, r0, r4)
            java.lang.String r3 = "timezone"
            A07(r3, r0, r4)
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r3 = 2131428751(0x7f0b058f, float:1.8479155E38)
            r0 = r16
            r5.put(r3, r0)
            java.lang.String r0 = "__key_additional_object_set"
            r4.put(r0, r5)
            r0 = r17
            int r3 = r6.nextClearBit(r0)
            if (r3 < r0) goto L_0x097d
            X.0sm r26 = X.0Yt.A0E()
            java.util.Map r4 = X.0Yt.A0B(r4)
            java.lang.String r22 = "com.bloks.www.async.components.CPDPScreenQuery"
            X.ShW r21 = new X.ShW
            r25 = r4
            r27 = r13
            r28 = r11
            r30 = r20
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r30)
            X.1Kj r0 = X.C64361Kj.A00()
            android.content.Context r0 = r0.A00
            X.68u r9 = X.C11117SAw.A00(r0, r2)
            r3 = 16696(0x4138, float:2.3396E-41)
            java.util.Map r0 = r21.A01()
            java.util.LinkedHashMap r4 = X.0Yt.A04(r4, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0 = 618(0x26a, float:8.66E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r3)
            java.util.LinkedHashMap r12 = X.0Yt.A04(r4, r0)
            X.WEz r7 = new X.WEz
            r10 = r2
            r11 = r2
            r13 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.UcJ r3 = new X.UcJ
            r3.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = r1.getToken()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putString(r0, r1)
            r0 = r17
            r7.A00(r2, r0)
            r3.setArguments(r2)
            return r3
        L_0x07f7:
            X.1Kj r1 = X.C64361Kj.A00()
            android.content.Context r5 = r1.A00
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.HashMap r3 = X.DbX.A0v()
            java.lang.String r1 = "merchant_id"
            java.lang.Object r6 = r0.get(r1)
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x081c
            if (r6 == 0) goto L_0x081c
            java.lang.String r1 = "prop_merchant_id"
            r4.put(r1, r6)
        L_0x081c:
            java.lang.String r1 = "merchant_profile_url"
            A05(r1, r4, r0)
            java.lang.String r1 = "merchant_profile_width"
            A03(r1, r4, r0)
            java.lang.String r1 = "merchant_profile_height"
            A03(r1, r4, r0)
            java.lang.String r1 = "is_shop_verified"
            A04(r1, r4, r0)
            java.lang.String r1 = "merchant_username"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_id"
            java.lang.Object r6 = r0.get(r1)
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x0846
            if (r6 == 0) goto L_0x0846
            java.lang.String r1 = "prop_product_id"
            r4.put(r1, r6)
        L_0x0846:
            java.lang.String r1 = "product_name"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_current_price"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_full_price"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_per_unit_price"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_external_url"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_checkout_style"
            A05(r1, r4, r0)
            java.lang.String r1 = "is_item_for_preorder"
            A04(r1, r4, r0)
            java.lang.String r1 = "is_cart_enabled"
            A04(r1, r4, r0)
            java.lang.String r1 = "is_item_in_cart"
            A04(r1, r4, r0)
            java.lang.String r1 = "is_product_soldout"
            A04(r1, r4, r0)
            java.lang.String r1 = "is_soldout_status_known"
            A04(r1, r4, r0)
            java.lang.String r1 = "has_variants"
            A04(r1, r4, r0)
            java.lang.String r1 = "product_description"
            A05(r1, r4, r0)
            java.lang.String r7 = "variant_values"
            java.lang.Object r6 = r0.get(r7)
            boolean r1 = r6 instanceof java.util.List
            if (r1 == 0) goto L_0x089e
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x089e
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x089e
            r4.put(r7, r6)
        L_0x089e:
            java.lang.String r1 = "product_pinned_media_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_main_image_url"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_main_image_width"
            A03(r1, r4, r0)
            java.lang.String r1 = "product_main_image_height"
            A03(r1, r4, r0)
            java.lang.String r1 = "ranking_info_recommender_type"
            A05(r1, r4, r0)
            java.lang.String r1 = "ranking_info_request_uuid"
            A05(r1, r4, r0)
            java.lang.String r1 = "search_session_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "search_query_text"
            A05(r1, r4, r0)
            java.lang.String r7 = "search_filter_extras"
            java.lang.Object r6 = r0.get(r7)
            boolean r1 = r6 instanceof java.util.Map
            if (r1 == 0) goto L_0x08dd
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L_0x08dd
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x08dd
            r4.put(r7, r6)
        L_0x08dd:
            java.lang.String r1 = "m_pk"
            A05(r1, r4, r0)
            java.lang.String r1 = "m_t"
            A05(r1, r4, r0)
            java.lang.String r1 = "product_ids"
            java.lang.Object r6 = r0.get(r1)
            boolean r1 = r6 instanceof java.util.List
            if (r1 == 0) goto L_0x0900
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0900
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0900
            java.lang.String r1 = "m_product_ids"
            r4.put(r1, r6)
        L_0x0900:
            java.lang.String r1 = "parent_m_pk"
            A05(r1, r4, r0)
            java.lang.String r1 = "shopping_session_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "prior_module"
            A05(r1, r4, r0)
            java.lang.String r1 = "prior_submodule"
            A05(r1, r4, r0)
            java.lang.String r1 = "ad_id"
            java.lang.Object r6 = r0.get(r1)
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x0925
            if (r6 == 0) goto L_0x0925
            java.lang.String r1 = "prop_ad_id"
            r4.put(r1, r6)
        L_0x0925:
            java.lang.String r1 = "ad_tracking_token"
            A05(r1, r4, r0)
            java.lang.String r1 = "ad_media_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "shops_first_entry_point"
            A05(r1, r4, r0)
            java.lang.String r1 = "affiliate_marketer_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "gift_recipient_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "featured_product_permission_id"
            A05(r1, r4, r0)
            java.lang.String r1 = "direct_from_ad"
            A04(r1, r4, r0)
            java.lang.String r1 = "prop_referral_code"
            A05(r1, r4, r0)
            java.lang.String r1 = "has_launched"
            A04(r1, r4, r0)
            java.lang.String r1 = "launch_date"
            A03(r1, r4, r0)
            java.lang.String r1 = "timezone"
            A05(r1, r4, r0)
            android.util.SparseArray r10 = new android.util.SparseArray
            r10.<init>()
            r1 = 2131428751(0x7f0b058f, float:1.8479155E38)
            r0 = r16
            r10.put(r1, r0)
            java.util.HashMap r6 = X.C359608dC.A01(r9)
            java.lang.String r0 = "com.bloks.www.bloks.cxf.cpdp"
            goto L_0x05f6
        L_0x0971:
            r0 = 2133(0x855, float:2.989E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x097d:
            java.lang.String r1 = "Missing required params"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0985:
            java.lang.String r1 = "Expected a Map<String,Any?> for cpdp params"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3Y.A0A(android.os.Bundle, com.instagram.common.session.UserSession):androidx.fragment.app.Fragment");
    }

    public final Fragment A0B(V1Z v1z, V1W v1w, V1Y v1y, V1X v1x, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("shopping_session_id", str);
        bundle.putString("prior_module_name", str2);
        String str9 = str3;
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str9);
        bundle.putString("tracking_token", str5);
        bundle.putString("pinned_merchant_id", str4);
        bundle.putString("media_id", str6);
        bundle.putString(TraceFieldType.BroadcastId, str7);
        String A00 = AnonymousClass000.A00(769);
        bundle.putString(A00, str8);
        bundle.putString("analytics_referral_component", v1z.A00);
        bundle.putString("analytics_referral_experience", v1w.A00);
        bundle.putString("analytics_referral_module", v1y.A00);
        bundle.putString("analytics_referral_page", v1x.A00);
        String A002 = AnonymousClass000.A00(316);
        bundle.putBoolean(A002, z);
        if (C18692Vwq.A02(str9, (String) null)) {
            UserSession userSession2 = userSession;
            0qQ.A0B(userSession2, 1);
            String[] strArr = {"prior_module_name", ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "shopping_session_id", "checkout_session_id", A00};
            String[] strArr2 = {A002};
            HashMap A003 = C18693Vwr.A00(bundle, strArr2);
            C18693Vwr.A02(A003);
            if (182.A06(0Tu.A06, userSession2, 36310899061096809L)) {
                A003.put("_PRELOAD_ID_KEY_", "GlobalCart");
            }
            int i = 0;
            do {
                String str10 = strArr[i];
                if (A003.containsKey(str10)) {
                    i++;
                } else {
                    throw Pxg.A0e("required param (", str10, ") not found");
                }
            } while (i < 5);
            new C18785W1l(new C19372WWn(A003), userSession2, true, (String) null, (String) null, (String) A003.get("prior_module_name"), (String) A003.get(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY), (String) A003.get("shopping_session_id"), (String) A003.get("media_id")).A03();
            C46649DiU diU = new C46649DiU(A003, C18693Vwr.A01(bundle, A003, strArr2), "com.bloks.www.bloks.commerce.shoppingcart");
            diU.A00 = 0;
            return C49891FBs.A02(new IgBloksScreenConfig((0lg) userSession2), diU);
        }
        ShoppingCartFragment shoppingCartFragment = new ShoppingCartFragment();
        shoppingCartFragment.setArguments(bundle);
        return shoppingCartFragment;
    }

    public final AnonymousClass3M3 A0C(UserSession userSession, String str, String str2, String str3, HashMap hashMap) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("bloks_params", hashMap);
        return A00(bundle, (XCK) null, userSession, 37355530, str, str2, str3, R.layout.mini_shop_collection_loading_screen);
    }

    public final MerchantShoppingCartFragment A0D(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("merchant_id", str);
        bundle.putString("shopping_session_id", str2);
        bundle.putString("prior_module_name", str3);
        DbS.A1B(bundle, str4);
        bundle.putString("logging_token", str5);
        if (str6 != null) {
            bundle.putString("tracking_token", str6);
        }
        if (str7 != null) {
            bundle.putString("global_bag_entry_point", str7);
        }
        if (str8 != null) {
            bundle.putString("global_bag_prior_module", str8);
        }
        if (str10 != null) {
            bundle.putString(AnonymousClass000.A00(1707), str10);
        }
        if (l != null) {
            bundle.putLong(AnonymousClass000.A00(391), l.longValue());
        }
        bundle.putString("checkout_session_id", str9);
        bundle.putBoolean(AnonymousClass000.A00(316), z2);
        bundle.putString("media_id", str11);
        bundle.putString(TraceFieldType.BroadcastId, str12);
        bundle.putBoolean("is_modal", z);
        MerchantShoppingCartFragment merchantShoppingCartFragment = new MerchantShoppingCartFragment();
        merchantShoppingCartFragment.setArguments(bundle);
        return merchantShoppingCartFragment;
    }

    public final WishListFeedFragment A0E(Integer num, String str, String str2, String str3) {
        WishListFeedFragment wishListFeedFragment = new WishListFeedFragment();
        Bundle bundle = new Bundle();
        bundle.putString("shopping_session_id", str);
        bundle.putString("prior_module_name", str2);
        bundle.putString("prior_submodule_name", str3);
        if (num != null) {
            bundle.putInt(AnonymousClass000.A00(391), num.intValue());
        }
        wishListFeedFragment.setArguments(bundle);
        return wishListFeedFragment;
    }

    public static void A03(Object obj, AbstractMap abstractMap, Map map) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof Long) && obj2 != null) {
            abstractMap.put(obj, obj2);
        }
    }

    public static void A04(Object obj, AbstractMap abstractMap, Map map) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof Boolean) && obj2 != null) {
            abstractMap.put(obj, obj2);
        }
    }

    public static void A05(Object obj, AbstractMap abstractMap, Map map) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof String) && obj2 != null) {
            abstractMap.put(obj, obj2);
        }
    }

    public static void A06(Object obj, Map map, Map map2) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof Boolean) && obj2 != null) {
            map2.put(obj, obj2);
        }
    }

    public static void A07(Object obj, Map map, Map map2) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof String) && obj2 != null) {
            map2.put(obj, obj2);
        }
    }

    public static void A08(Object obj, Map map, Map map2) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof Long) && obj2 != null) {
            map2.put(obj, obj2);
        }
    }

    public final C15266UYg A0G(UserSession userSession, V4D v4d, User user, String str, String str2, String str3, String str4, ArrayList arrayList) {
        Bundle A09 = DbY.A09(userSession);
        if (user != null) {
            A09.putString("displayed_user_id", user.getId());
            A09.putString("displayed_username", user.getUsername());
        }
        if (arrayList != null) {
            A09.putParcelableArrayList("merchants", arrayList);
        }
        A09.putString("prior_module_name", str);
        A09.putString("prior_submodule_name", str2);
        A09.putString("media_id", str3);
        A09.putString("tracking_token", str4);
        C15266UYg uYg = new C15266UYg();
        uYg.A00 = v4d;
        uYg.setArguments(A09);
        return uYg;
    }

    public final C15337Uam A0H(UserSession userSession, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments, String str) {
        Bundle A09 = DbY.A09(userSession);
        if (shoppingTaggingFeedArguments != null) {
            A09.putParcelable(C273654mx.A00(406), shoppingTaggingFeedArguments);
        }
        A09.putString("shopping_session_id", str);
        C15337Uam uam = new C15337Uam();
        uam.setArguments(A09);
        return uam;
    }
}
