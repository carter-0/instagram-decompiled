package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.VwI  reason: case insensitive filesystem */
public final class C18661VwI {
    public 1Xj A00;
    public Dc2 A01;
    public final Fragment A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C16675UzB A05;
    public final AnonymousClass323 A06;
    public final C231112qt A07;
    public final X52 A08;
    public final X56 A09;
    public final C18617VvA A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final AnonymousClass0eM A0J = C20693WxP.A00(this, 19);
    public final 2el A0K;
    public final AnonymousClass57K A0L;
    public final C17909Vi0 A0M;
    public final C231142qw A0N;
    public final Long A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final boolean A0T;
    public final boolean A0U;

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fe, code lost:
        if (r20 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015e, code lost:
        if (r12 == 27) goto L_0x0160;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.ULV r20, com.instagram.model.shopping.productfeed.ProductFeedItem r21, java.lang.Long r22, java.lang.String r23, java.lang.String r24, int r25, int r26) {
        /*
            r19 = this;
            r7 = 1
            r10 = r20
            r9 = r19
            if (r20 == 0) goto L_0x000b
            java.lang.String r0 = r10.A00
            if (r0 != 0) goto L_0x004b
        L_0x000b:
            X.UzB r2 = r9.A05
            java.lang.String r0 = r9.A0Q
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            int r0 = r2.ordinal()
            switch(r0) {
                case 1: goto L_0x0042;
                case 2: goto L_0x001a;
                case 3: goto L_0x001a;
                case 4: goto L_0x001a;
                case 5: goto L_0x001a;
                case 6: goto L_0x0049;
                case 7: goto L_0x001a;
                case 8: goto L_0x0049;
                case 9: goto L_0x0034;
                case 10: goto L_0x002e;
                case 11: goto L_0x0031;
                case 12: goto L_0x001a;
                case 13: goto L_0x001a;
                case 14: goto L_0x003a;
                case 15: goto L_0x001a;
                case 16: goto L_0x0037;
                case 17: goto L_0x002b;
                case 18: goto L_0x0028;
                case 19: goto L_0x001a;
                case 20: goto L_0x001a;
                case 21: goto L_0x001a;
                case 22: goto L_0x001a;
                case 23: goto L_0x001a;
                case 24: goto L_0x0025;
                case 25: goto L_0x0022;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.String r1 = "Entrypoint should be defined if navigating to PDP from a Product Collection"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0022:
            java.lang.String r0 = "upcoming_event_bottom_sheet"
            goto L_0x004b
        L_0x0025:
            java.lang.String r0 = "instagram_shopping_shoppable_media_viewer_product_tiles_hscroll"
            goto L_0x004b
        L_0x0028:
            java.lang.String r0 = "shop_the_look"
            goto L_0x004b
        L_0x002b:
            java.lang.String r0 = "shopping_home"
            goto L_0x004b
        L_0x002e:
            java.lang.String r0 = "products_from_saved_media_hscroll"
            goto L_0x004b
        L_0x0031:
            java.lang.String r0 = "products_from_liked_media_hscroll"
            goto L_0x004b
        L_0x0034:
            java.lang.String r0 = "products_from_followed_brands_hscroll"
            goto L_0x004b
        L_0x0037:
            java.lang.String r0 = "incentive_details"
            goto L_0x004b
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            java.lang.String r0 = "merchant_recently_viewed_products"
            goto L_0x004b
        L_0x003f:
            java.lang.String r0 = "recently_viewed_products"
            goto L_0x004b
        L_0x0042:
            r0 = 782(0x30e, float:1.096E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x004b
        L_0x0049:
            java.lang.String r0 = "product_collection_page"
        L_0x004b:
            r8 = r21
            com.instagram.model.shopping.productfeed.ProductTile r6 = r8.A02
            if (r6 == 0) goto L_0x0105
            if (r20 == 0) goto L_0x00fd
            java.lang.Object r2 = r10.A01
            X.0xF r2 = (X.0xF) r2
            if (r2 == 0) goto L_0x00fd
            java.lang.String r1 = "product_collection_id"
            java.lang.String r5 = r2.A05(r1)
        L_0x005f:
            java.lang.Object r2 = r10.A01
            X.0xF r2 = (X.0xF) r2
            if (r2 == 0) goto L_0x0102
            java.lang.String r1 = "product_collection_type"
            java.lang.String r4 = r2.A05(r1)
        L_0x006b:
            X.2qt r1 = r9.A07
            r3 = r25
            r2 = r26
            X.Vkn r13 = r1.A02(r8, r3, r2)
            if (r20 == 0) goto L_0x00fa
            java.lang.String r1 = r10.A04
        L_0x0079:
            r13.A03(r1)
            r1 = r22
            if (r22 == 0) goto L_0x0098
            r14 = 0
            long r11 = r1.longValue()
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0098
            X.1Ln r2 = r13.A03
            X.4Ny r11 = new X.4Ny
            r11.<init>(r1)
            java.lang.String r3 = "shop_linked_creator_id"
            X.0Aj r2 = r2.A00
            r2.AAE(r11, r3)
        L_0x0098:
            if (r20 == 0) goto L_0x00b2
            java.lang.Object r2 = r10.A01
            X.0xF r2 = (X.0xF) r2
            if (r2 == 0) goto L_0x00b2
            java.lang.String r11 = "content_type"
            java.lang.String r3 = r2.A05(r11)
            if (r3 == 0) goto L_0x00b2
            X.1Ln r2 = r13.A03
            r2.A0R(r11, r3)
            X.1Ln r2 = r13.A01
            r2.A0R(r11, r3)
        L_0x00b2:
            if (r5 == 0) goto L_0x00c4
            X.1Ln r2 = r13.A03
            java.lang.String r11 = "product_collection_id"
            r2.A0R(r11, r5)
            X.1Ln r3 = r13.A01
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r5)
            r3.A0Q(r11, r2)
        L_0x00c4:
            java.lang.String r3 = r9.A0P
            if (r3 == 0) goto L_0x00d5
            X.1Ln r2 = r13.A03
            X.4Ny r12 = X.C263944Ny.A00(r3)
            java.lang.String r11 = "gift_recipient_id"
            X.0Aj r2 = r2.A00
            r2.AAE(r12, r11)
        L_0x00d5:
            r13.A00()
            if (r6 == 0) goto L_0x0126
            com.instagram.api.schemas.FBProductItemDetailsDict r2 = X.C18768W0o.A01(r6)
            if (r2 == 0) goto L_0x0126
            X.3kF r4 = X.C249713kF.A00
            androidx.fragment.app.Fragment r0 = r9.A02
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r9.A03
            X.4DU r1 = r9.A04
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r6)
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = X.C45683D1i.A00(r0)
            r4.A10(r3, r2, r1, r0)
        L_0x00f9:
            return
        L_0x00fa:
            r1 = 0
            goto L_0x0079
        L_0x00fd:
            r5 = 0
            if (r20 == 0) goto L_0x0102
            goto L_0x005f
        L_0x0102:
            r4 = 0
            goto L_0x006b
        L_0x0105:
            r0 = 0
            com.instagram.common.session.UserSession r3 = r9.A03
            com.instagram.model.shopping.productfeed.ProductTileMedia r1 = r8.A01(r3)
            if (r1 == 0) goto L_0x00f9
            X.1E8 r2 = X.1E7.A00(r3)
            com.instagram.model.shopping.productfeed.ProductTileMedia r1 = r8.A01(r3)
            if (r1 == 0) goto L_0x011a
            java.lang.String r0 = r1.A02
        L_0x011a:
            r2.A02(r0)
            return
        L_0x011e:
            java.lang.String r1 = "productTile fbProduct id must not be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0126:
            X.3kF r12 = X.C249713kF.A00
            androidx.fragment.app.Fragment r2 = r9.A02
            androidx.fragment.app.FragmentActivity r13 = r2.requireActivity()
            com.instagram.user.model.Product r16 = r8.A02()
            if (r16 == 0) goto L_0x01b4
            com.instagram.common.session.UserSession r14 = r9.A03
            X.4DU r15 = r9.A04
            java.lang.String r11 = r9.A0I
            r2 = 0
            r18 = r11
            r17 = r0
            X.WNN r11 = r12.A0L(r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = r9.A0E
            r11.A0N = r0
            java.lang.String r0 = r9.A0F
            r11.A0O = r0
            if (r20 == 0) goto L_0x01b2
            java.lang.String r0 = r10.A04
        L_0x014f:
            r11.A0T = r0
            X.UzB r0 = r9.A05
            int r12 = r0.ordinal()
            r0 = 18
            if (r12 == r0) goto L_0x0160
            r10 = 27
            r0 = 0
            if (r12 != r10) goto L_0x0161
        L_0x0160:
            r0 = 1
        L_0x0161:
            r11.A0Z = r0
            r0 = r23
            r11.A0S = r0
            long r0 = X.DbY.A04(r1)
            r11.A01 = r0
            r0 = r24
            r11.A0F = r0
            r11.A0K = r3
            if (r5 == 0) goto L_0x0177
            r11.A0P = r5
        L_0x0177:
            if (r4 == 0) goto L_0x017b
            r11.A0Q = r4
        L_0x017b:
            if (r6 == 0) goto L_0x0195
            com.instagram.model.shopping.productfeed.ProductTileMedia r0 = r6.A00(r14)
            if (r0 == 0) goto L_0x0191
            com.instagram.model.shopping.productfeed.ProductTileMedia r0 = r6.A00(r14)
            r11.A05 = r0
            java.lang.String r0 = r8.getId()
            r11.A0L = r0
            r11.A0a = r7
        L_0x0191:
            com.instagram.api.schemas.RankingInfo r0 = r6.A04
            r11.A03 = r0
        L_0x0195:
            boolean r0 = r9.A0U
            if (r0 == 0) goto L_0x01a0
            X.1Xj r0 = r9.A00
            if (r0 == 0) goto L_0x01a0
            r11.A02(r0, r2)
        L_0x01a0:
            java.lang.String r3 = r9.A0H
            if (r3 != 0) goto L_0x01a5
            r3 = r2
        L_0x01a5:
            java.lang.String r1 = r9.A0G
            com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo r0 = new com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo
            r0.<init>(r3, r1, r2)
            r11.A0A = r0
            X.WNN.A01(r11)
            return
        L_0x01b2:
            r0 = r2
            goto L_0x014f
        L_0x01b4:
            java.lang.String r1 = "productFeedItem product must not be null "
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18661VwI.A02(X.ULV, com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Long, java.lang.String, java.lang.String, int, int):void");
    }

    public final void A04(ProductFeedItem productFeedItem) {
        0qQ.A0B(productFeedItem, 0);
        UnavailableProductImpl unavailableProductImpl = productFeedItem.A05;
        if (unavailableProductImpl != null) {
            C55115HcO.A00();
            String str = unavailableProductImpl.A01;
            String A0r = C13989Tnp.A0r(unavailableProductImpl.A00);
            0qQ.A0A(A0r);
            UserSession userSession = this.A03;
            AnonymousClass4DU r2 = this.A04;
            String str2 = this.A0E;
            this.A02.requireContext();
            AnonymousClass7TF.A1H(str, A0r);
            SaveApiUtil.A08(userSession, r2, str, A0r, str2);
            X56 x56 = this.A09;
            if (x56 != null) {
                x56.DZy(productFeedItem);
                return;
            }
            return;
        }
        throw new IllegalStateException(" productFeedItem unavailableProduct must not be null ");
    }

    public final void A05(Product product) {
        0qQ.A0B(product, 0);
        this.A07.A03(product, "webclick");
        FH7.A0A(this.A02.requireActivity(), this.A03, product, (String) null, this.A0I, this.A04.getModuleName());
    }

    public final void A06(Product product, int i, int i2) {
        0qQ.A0B(product, 0);
        C16675UzB uzB = this.A05;
        if (uzB == C16675UzB.RECENTLY_VIEWED || uzB == C16675UzB.SHOP_HOME) {
            C249713kF.A00.A0B(this.A03).A00(this.A02.getContext(), new C19629Wcs(this, i, i2), product);
        }
    }

    public final void A07(Product product, String str) {
        String str2;
        Product product2 = product;
        0qQ.A0B(product, 0);
        this.A07.A03(product, "add_to_bag");
        List list = product.A0O;
        if (list != null && !list.isEmpty()) {
            this.A0J.getValue();
            HashMap hashMap = new HashMap();
            if (list.isEmpty()) {
                throw DbT.A0m();
            } else if (list.isEmpty()) {
                throw DbT.A0m();
            } else {
                list.size();
                hashMap.size();
            }
        }
        AnonymousClass4DU r2 = this.A04;
        UserSession userSession = this.A03;
        String str3 = this.A0E;
        User user = product.A0B;
        String str4 = null;
        if (user != null) {
            str2 = AnonymousClass3ZA.A00(user);
        } else {
            str2 = null;
        }
        String str5 = str;
        W2s.A06(r2, userSession, (1Xj) null, (ShoppingGuideLoggingInfo) null, product2, str5, str3, "product_tile", str2, (String) null, this.A0I, (String) null);
        C323486xZ r22 = C323426xT.A00(userSession).A07;
        if (user != null) {
            str4 = AnonymousClass3ZA.A00(user);
        }
        0qQ.A0A(str4);
        r22.A0D(new C19583Wc8(this, product, str5), product, str4, this.A0C);
    }

    public final boolean A09(ProductFeedItem productFeedItem) {
        Product product;
        0qQ.A0B(productFeedItem, 0);
        Fragment fragment = this.A02;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A03;
        C46498Dg1 dg1 = new C46498Dg1(requireContext, userSession);
        ProductTile productTile = productFeedItem.A02;
        if (productTile == null) {
            return false;
        }
        dg1.A02(new WBD(70, (Object) this, (Object) productFeedItem), 2131972191);
        if (!this.A0T) {
            dg1.A02(new WB4(61, productFeedItem, productTile, this), 2131968504);
        }
        if (2R8.A00(userSession) && productTile.A05 != null) {
            dg1.A04(new WBE(0, (Object) productTile, (Object) this), 2131975357);
        }
        if (!(!2R8.A00(userSession) || (product = productTile.A07) == null || product.A0D == null)) {
            dg1.A04(new WBE(1, (Object) productTile, (Object) this), 2131969804);
        }
        new C49945FFy(dg1).A05(fragment.requireContext());
        return true;
    }

    public static final void A00(C18661VwI vwI, Product product, String str) {
        V1Y v1y;
        C249713kF r3 = C249713kF.A00;
        C18661VwI vwI2 = vwI;
        FragmentActivity requireActivity = vwI2.A02.requireActivity();
        Product product2 = product;
        String A0q = C13989Tnp.A0q(product2);
        0qQ.A0A(A0q);
        UserSession userSession = vwI2.A03;
        String str2 = vwI2.A0I;
        String moduleName = vwI2.A04.getModuleName();
        String str3 = product2.A0H;
        V1Z v1z = V1Z.VIEW_CART_BUTTON;
        V1W v1w = V1W.SHOP_HOME;
        String str4 = str;
        if (str4.equals("view_in_cart_cta")) {
            v1y = V1Y.PRODUCT_TILE;
        } else {
            v1y = V1Y.TOAST;
        }
        r3.A0m(requireActivity, v1z, v1w, v1y, V1X.CONTINUE_SHOPPING, userSession, (Long) null, A0q, str2, moduleName, str4, (String) null, (String) null, (String) null, (String) null, (String) null, str3, (String) null, (String) null, (String) null, (HashMap) null, false);
    }

    public final void A03(ULV ulv, ProductTile productTile, int i, int i2, boolean z) {
        String str;
        C18591Vui A012 = this.A0N.A01(this.A00, productTile);
        if (ulv != null) {
            str = ulv.A04;
        } else {
            str = null;
        }
        A012.A08 = str;
        A012.A07 = C320166rs.A01(i, i2);
        String str2 = this.A0S;
        AnonymousClass57K r3 = this.A0L;
        Long l = this.A0O;
        if (!(str2 == null && r3 == null && l == null)) {
            A012.A02 = new C61079JwH((Object) r3, (Object) l, str2, 25);
        }
        A012.A09 = z;
        A012.A00 = DbY.A04(this.A0B);
        A012.A03 = ulv;
        A012.A00();
    }

    public final void A08(String str, String str2, int i, int i2) {
        C17909Vi0 vi0 = this.A0M;
        String str3 = str;
        if (str != null) {
            String str4 = this.A0Q;
            vi0.A00((Long) null, str3, str4, (String) null, i, i2);
            C249713kF.A00.A16(this.A02.requireActivity(), this.A03, false, (Long) null, this.A04.getModuleName(), (String) null, this.A0I, str4, this.A0R, str2, this.A0D, (String) null, (String) null, false, false, false);
            return;
        }
        throw new IllegalStateException("submodule must not be null");
    }

    public final void A01(View view, ULV ulv, ProductFeedItem productFeedItem, String str, int i, int i2) {
        String str2;
        AnonymousClass7TG.A1N(productFeedItem, view);
        C18617VvA vvA = this.A0A;
        if (vvA != null) {
            if (ulv != null) {
                str2 = ulv.A04;
            } else {
                str2 = null;
            }
            vvA.A00.A05(view, C18617VvA.A00(new C17372VSz(i, i2), new UO3(productFeedItem, new ULC((C376699Iz) null, (FiltersLoggingInfo) null, str2, (String) null, (String) null)), vvA, str));
        }
    }

    public C18661VwI(Fragment fragment, UserSession userSession, 2el r26, 1Xj r27, AnonymousClass4DU r28, AnonymousClass57K r29, C16675UzB uzB, C231112qt r31, C231142qw r32, X52 x52, X56 x56, C18617VvA vvA, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2) {
        C231142qw r5 = r32;
        0qQ.A0B(r5, 11);
        Fragment fragment2 = fragment;
        this.A02 = fragment2;
        UserSession userSession2 = userSession;
        this.A03 = userSession2;
        AnonymousClass4DU r8 = r28;
        this.A04 = r8;
        String str12 = str;
        this.A0I = str12;
        String str13 = str2;
        this.A0E = str13;
        String str14 = str3;
        this.A0F = str14;
        this.A0S = str4;
        this.A0L = r29;
        this.A0O = l;
        this.A05 = uzB;
        this.A0N = r5;
        this.A09 = x56;
        this.A08 = x52;
        this.A0U = z;
        this.A0Q = str5;
        this.A0R = str6;
        this.A00 = r27;
        String str15 = str7;
        this.A0D = str15;
        this.A07 = r31;
        this.A0A = vvA;
        this.A0H = str8;
        this.A0G = str9;
        this.A0T = z2;
        this.A0B = l2;
        this.A0K = r26;
        this.A0C = str10;
        this.A0P = str11;
        this.A0M = new C17909Vi0(userSession2, r8, str12, str13, str14, str15);
        this.A06 = new AnonymousClass323(fragment2, userSession2, r8, (1Ux) null, (C2355630i) null, (SearchContext) null, (C249763kK) null, (Long) null, (String) null, true);
    }
}
