package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Uak  reason: case insensitive filesystem */
public final class C15335Uak extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS, C20982X7x, C20928X4t, XC8 {
    public static final String A0Y = C51968G9o.A16(C16580Uxa.ShoppingReconsiderationDestinationFragment);
    public static final String __redex_internal_original_name = "ShoppingReconsiderationDestinationFragment";
    public RefreshableNestedScrollingParent A00;
    public RecyclerView A01;
    public final AnonymousClass0eM A02 = C20693WxP.A00(this, 41);
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C20693WxP.A00(this, 43);
    public final AnonymousClass0eM A05 = C20693WxP.A00(this, 44);
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C20693WxP(this, 46));
    public final AnonymousClass0eM A08 = C20693WxP.A00(this, 47);
    public final AnonymousClass0eM A09 = C20693WxP.A00(this, 48);
    public final AnonymousClass0eM A0A = C20693WxP.A00(this, 49);
    public final AnonymousClass0eM A0B = C20697WxT.A00(this, 0);
    public final AnonymousClass0eM A0C = C20697WxT.A00(this, 1);
    public final AnonymousClass0eM A0D = C20697WxT.A00(this, 2);
    public final AnonymousClass0eM A0E = C20697WxT.A00(this, 3);
    public final AnonymousClass0eM A0F = C20697WxT.A00(this, 4);
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M = C20697WxT.A00(this, 9);
    public final AnonymousClass0eM A0N = C20697WxT.A00(this, 10);
    public final AnonymousClass0eM A0O = C20697WxT.A00(this, 11);
    public final AnonymousClass0eM A0P = C20697WxT.A00(this, 15);
    public final AnonymousClass0eM A0Q;
    public final AnonymousClass0eM A0R;
    public final AnonymousClass0eM A0S;
    public final 1wn A0T = new C19221WQb(this, 52);
    public final 1wn A0U;
    public final 1wn A0V = new C19221WQb(this, 54);
    public final 1wn A0W = new C19221WQb(this, 55);
    public final 1wn A0X = new C19221WQb(this, 56);

    public static C18661VwI A00(C15335Uak uak, Object obj) {
        0qQ.A0B(obj, 0);
        return (C18661VwI) uak.A0H.getValue();
    }

    public final void D1a(String str, String str2, String str3, int i, int i2) {
    }

    public final void DZZ(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        AnonymousClass7TG.A1N(productFeedItem, view);
        ((C18661VwI) this.A0H.getValue()).A01(view, ulv, productFeedItem, (String) null, i, i2);
    }

    public final /* synthetic */ void DZd(Product product, String str, String str2, int i, int i2) {
    }

    public final boolean DZe(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        0qQ.A0B(productFeedItem, 0);
        if (z) {
            return ((C18661VwI) this.A0H.getValue()).A09(productFeedItem);
        }
        return false;
    }

    public final void DZi(ULV ulv, ProductTile productTile, int i, int i2) {
        String str;
        A00(this, productTile).A03(ulv, productTile, i, i2, true);
        W26 w26 = (W26) this.A0B.getValue();
        if (ulv != null) {
            str = ulv.A04;
        } else {
            str = null;
        }
        String str2 = w26.A02;
        if (0qQ.A0K(str2, "instagram_shopping_mini_shop_storefront")) {
            V1W v1w = V1W.STOREFRONT;
            W26.A02(V1Z.SAVE_BUTTON, v1w, W26.A00(str), V1X.CONTINUE_SHOPPING, w26);
        } else if (0qQ.A0K(str2, "instagram_shopping_home")) {
            W26.A03(V1Z.SAVE_BUTTON, V1W.TAB_FEED, W26.A00(str), V1X.CONTINUE_SHOPPING, w26);
        }
    }

    public final boolean DZk(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        boolean A1b = C51973G9u.A1b(view, motionEvent, productFeedItem);
        ProductTile productTile = productFeedItem.A02;
        if (productTile == null || z) {
            return false;
        }
        C15690Ugv ugv = (C15690Ugv) this.A0G.getValue();
        ugv.A07 = productTile;
        ugv.A01 = i;
        ugv.A00 = i2;
        ugv.A0B = str;
        ugv.A0E = A1b;
        if (!ugv.A0D || motionEvent.getActionMasked() != 3) {
            ((C232952ui) ugv.A0S.getValue()).onTouch(view, motionEvent);
        } else {
            ugv.A0D = false;
        }
        return true;
    }

    public final void DZo(Product product) {
        C18661VwI A002 = A00(this, product);
        C249713kF r2 = C249713kF.A00;
        FragmentActivity requireActivity = A002.A02.requireActivity();
        AnonymousClass4DU r5 = A002.A04;
        r2.A0z(requireActivity, A002.A03, r5, product, A002.A0E, A002.A0F, A002.A0I);
        A002.A07.A03(product, "view_similar");
    }

    public final void DuP(UnavailableProduct unavailableProduct, int i, int i2) {
    }

    public final void DuQ(ProductFeedItem productFeedItem) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0eM r0 = r3.A0C
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x006b
            X.0eM r2 = r3.A0D
            java.lang.Object r0 = r2.getValue()
            if (r0 == 0) goto L_0x006b
            X.0eM r0 = r3.A0P
            java.lang.String r1 = X.DbS.A0t(r0)
            if (r1 != 0) goto L_0x002f
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0069
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0069
            r0 = 2131973814(0x7f1356b6, float:1.9584674E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x002f:
            java.lang.String r0 = X.DbS.A0t(r2)
            r4.EfN(r1, r0)
        L_0x0036:
            X.0eM r0 = r3.A0S
            java.lang.Object r0 = r0.getValue()
            X.Vi2 r0 = (X.C17911Vi2) r0
            if (r0 == 0) goto L_0x0043
            r0.A00(r4)
        L_0x0043:
            X.0eM r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            X.6xe r0 = (X.C323536xe) r0
            if (r0 == 0) goto L_0x0050
            r0.A01(r4)
        L_0x0050:
            r0 = 1
            r4.Eu4(r0)
            X.3JR r2 = new X.3JR
            r2.<init>()
            r0 = 2131237915(0x7f081c1b, float:1.8092094E38)
            r2.A01 = r0
            r1 = 58
            X.WBC r0 = new X.WBC
            r0.<init>(r3, r1)
            X.DbX.A1A(r0, r2, r4)
            return
        L_0x0069:
            r1 = 0
            goto L_0x002f
        L_0x006b:
            X.0eM r0 = r3.A0P
            java.lang.String r0 = X.DbS.A0t(r0)
            if (r0 != 0) goto L_0x007e
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131973814(0x7f1356b6, float:1.9584674E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
        L_0x007e:
            r4.setTitle(r0)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15335Uak.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "instagram_shopping_reconsideration_destination";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView A0G2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent == null || (A0G2 = C13990Tnq.A0G(refreshableNestedScrollingParent)) == null) {
            throw new IllegalStateException("Container not created in onViewCreated");
        }
        this.A01 = A0G2;
        Dba.A0z(A0G2, (2el) this.A0R.getValue(), this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A0G2.getContext(), 1, false);
        linearLayoutManager.A0v(true);
        A0G2.setLayoutManager(linearLayoutManager);
        Dba.A17(A0G2, this.A03);
        AnonymousClass3AQ r0 = new AnonymousClass3AQ();
        r0.A00 = false;
        A0G2.setItemAnimator(r0);
        JTQ.A0y(A0G2.A0D, A0G2, new WWL(this, 4), C3251771i.A06);
        A0G2.setClipToPadding(false);
        String str = A0Y;
        0qQ.A08(str);
        ((C14819UAy) this.A0J.getValue()).A00(A0G2, str);
        C60309JjA jjA = (C60309JjA) this.A0Q.getValue();
        DbV.A1F(getViewLifecycleOwner(), jjA.A02, new C20705Wxc(this, 40), 47);
        DbV.A1F(getViewLifecycleOwner(), jjA.A01, new C20705Wxc(this, 41), 47);
        ((C17869VhM) this.A07.getValue()).A00();
    }

    public final /* bridge */ /* synthetic */ void AAl(Object obj, Object obj2) {
        UO3 uo3 = (UO3) obj;
        C17372VSz vSz = (C17372VSz) obj2;
        C18661VwI vwI = (C18661VwI) this.A0H.getValue();
        AnonymousClass0eM r3 = this.A0C;
        String A0t = DbS.A0t(r3);
        C18617VvA vvA = vwI.A0A;
        if (vvA != null) {
            uo3.A00 = vwI.A0B;
            vvA.A02(vSz, uo3, A0t);
        }
        C17052VGa.A00(AnonymousClass7TE.A0l(this.A0K)).A03(DbS.A0t(r3));
    }

    public final void D7q(C3034368u r3) {
        ((C60309JjA) this.A0Q.getValue()).A00 = r3;
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null && recyclerView.getScrollY() == 0) {
            RecyclerView recyclerView2 = this.A01;
            0qQ.A0A(recyclerView2);
            recyclerView2.A0o(0);
        }
    }

    public final void DZa(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        String str;
        String str2;
        String str3;
        V1Y v1y;
        V1Y v1y2;
        ProductFeedItem productFeedItem2 = productFeedItem;
        AnonymousClass7TG.A1N(productFeedItem2, view);
        String str4 = null;
        ULV ulv2 = ulv;
        if (ulv != null) {
            str = ulv.A04;
        } else {
            str = null;
        }
        if (0qQ.A0K(str, "cart")) {
            str3 = "reconsideration_destination_cart";
        } else {
            if (ulv != null) {
                str2 = ulv.A04;
            } else {
                str2 = null;
            }
            if (0qQ.A0K(str2, "wish_list")) {
                str3 = "reconsideration_destination_wishlist";
            } else {
                if (ulv != null) {
                    str4 = ulv.A04;
                }
                if (0qQ.A0K(str4, "recently_viewed")) {
                    str3 = "reconsideration_destination_recently_viewed";
                } else {
                    str3 = "reconsideration_destination";
                }
            }
        }
        if (ulv != null) {
            ulv.A00 = str3;
        }
        AnonymousClass0eM r2 = this.A0E;
        if (0qQ.A0K(r2.getValue(), "instagram_shopping_mini_shop_storefront")) {
            W26 w26 = (W26) this.A0B.getValue();
            V1W v1w = V1W.STOREFRONT;
            V1Z v1z = V1Z.PRODUCT_ITEM;
            V1X v1x = V1X.CONTINUE_SHOPPING;
            if (str3.equals("reconsideration_destination_wishlist")) {
                v1y2 = V1Y.SAVED_ITEMS;
            } else {
                v1y2 = V1Y.CART_ITEM;
            }
            W26.A02(v1z, v1w, v1y2, v1x, w26);
        } else if (0qQ.A0K(r2.getValue(), "instagram_shopping_home")) {
            W26 w262 = (W26) this.A0B.getValue();
            V1Z v1z2 = V1Z.PRODUCT_ITEM;
            V1X v1x2 = V1X.CONTINUE_SHOPPING;
            V1W v1w2 = V1W.TAB_FEED;
            if (str3.equals("reconsideration_destination_wishlist")) {
                v1y = V1Y.SAVED_ITEMS;
            } else {
                v1y = V1Y.CART_ITEM;
            }
            W26.A03(v1z2, v1w2, v1y, v1x2, w262);
        }
        ((C18661VwI) this.A0H.getValue()).A02(ulv2, productFeedItem2, C51968G9o.A0v(C66580MXl.A0r(this.A0O)), DbS.A0t(this.A0N), DbS.A0t(this.A04), i, i2);
    }

    public final /* bridge */ /* synthetic */ void ECF(View view, Object obj) {
        UO3 uo3 = (UO3) obj;
        0qQ.A0B(uo3, 1);
        C18617VvA vvA = ((C18661VwI) this.A0H.getValue()).A0A;
        if (vvA != null) {
            vvA.A01(view, uo3);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0K);
    }

    public C15335Uak() {
        C20697WxT wxT = new C20697WxT(this, 16);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20697WxT(new C20697WxT(this, 12), 13));
        this.A0Q = new C227862kA(new C20697WxT(A002, 14), wxT, new C20613Wvu(27, A002, (Object) null), new 0Yh(C60309JjA.class));
        this.A03 = C20693WxP.A00(this, 42);
        this.A0R = AnonymousClass0eN.A01(C20660Wws.A00);
        this.A0H = C20697WxT.A00(this, 6);
        this.A0L = C20697WxT.A00(this, 8);
        this.A0J = AnonymousClass0eN.A01(C20659Wwr.A00);
        this.A06 = AnonymousClass1YB.A00(new C20693WxP(this, 45));
        this.A0S = C20697WxT.A00(this, 17);
        this.A0I = AnonymousClass1YB.A00(new C20697WxT(this, 7));
        this.A0G = AnonymousClass1YB.A00(new C20697WxT(this, 5));
        this.A0U = new C19221WQb(this, 53);
        this.A0K = C227642jf.A02(this);
    }

    public final /* bridge */ /* synthetic */ void AAk(Object obj) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DZY(ULV ulv, Product product) {
        String str;
        A00(this, product).A07(product, "reconsideration_destination_feed");
        W26 w26 = (W26) this.A0B.getValue();
        if (ulv != null) {
            str = ulv.A04;
        } else {
            str = null;
        }
        String str2 = w26.A02;
        if (0qQ.A0K(str2, "instagram_shopping_mini_shop_storefront")) {
            V1W v1w = V1W.STOREFRONT;
            W26.A02(V1Z.ADD_TO_CART_BUTTON, v1w, W26.A00(str), V1X.CONTINUE_SHOPPING, w26);
        } else if (0qQ.A0K(str2, "instagram_shopping_home")) {
            W26.A03(V1Z.ADD_TO_CART_BUTTON, V1W.TAB_FEED, W26.A00(str), V1X.CONTINUE_SHOPPING, w26);
        }
    }

    public final void DZf(String str, int i) {
        C18661VwI A002 = A00(this, str);
        1Xj A0U2 = DbV.A0U(A002.A03, str);
        if (A0U2 != null) {
            AnonymousClass323 r2 = A002.A06;
            r2.DgX(A0U2, new AnonymousClass3W1(), new C19534WbK(r2), i);
        }
    }

    public final void DZg(Product product, int i, int i2) {
        A00(this, product).A06(product, i, i2);
    }

    public final void DZl(Product product) {
        C18661VwI.A00(A00(this, product), product, "view_in_cart_cta");
    }

    public final void DZm(Product product) {
        A00(this, product).A05(product);
    }

    public final void DZn(String str) {
        C18661VwI A002 = A00(this, str);
        UserSession userSession = A002.A03;
        1Xj A0U2 = DbV.A0U(userSession, str);
        if (A0U2 != null) {
            C249713kF.A00.A0s(A002.A02.requireActivity(), userSession, A0U2, A002.A04, new AnonymousClass3W1(), (C262944Gp) null, (XCE) null, A002.A0I, A002.A0F);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        if (((X.C62085KZp) r1).A00 == null) goto L_0x0162;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = -871331838(0xffffffffcc108802, float:-3.7888008E7)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.C15335Uak.super.onCreate(r10)
            X.0eM r3 = r9.A0B
            java.lang.Object r4 = r3.getValue()
            X.W26 r4 = (X.W26) r4
            X.0wc r1 = r4.A00
            java.lang.String r0 = "instagram_shopping_reconsideration_destination_entry"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x004b
            r0 = 0
            X.327 r0 = X.W26.A01(r4, r0)
            X.C13988Tno.A17(r8, r0)
            java.lang.String r1 = r4.A04
            if (r1 == 0) goto L_0x0039
            boolean r0 = r4.A05
            X.4Ny r1 = X.C263944Ny.A00(r1)
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = "marketer_id"
        L_0x0036:
            r8.AAE(r1, r0)
        L_0x0039:
            java.lang.Long r1 = r4.A01
            if (r1 == 0) goto L_0x0048
            r6 = 0
            long r4 = r1.longValue()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            X.C13991Tnr.A14(r8, r1, r0)
        L_0x0048:
            r8.Cgf()
        L_0x004b:
            X.0eM r0 = r9.A0K
            X.1Ng r4 = X.DbX.A0R(r0)
            java.lang.Class<X.3DT> r1 = X.AnonymousClass3DT.class
            X.1wn r0 = r9.A0W
            r4.A01(r0, r1)
            java.lang.Class<X.WQH> r1 = X.WQH.class
            X.1wn r0 = r9.A0U
            r4.A01(r0, r1)
            java.lang.Class<X.WQM> r1 = X.WQM.class
            X.1wn r0 = r9.A0T
            r4.A01(r0, r1)
            java.lang.Class<X.6yO> r1 = X.C323966yO.class
            X.1wn r0 = r9.A0X
            r4.A01(r0, r1)
            java.lang.Class<X.WQP> r1 = X.WQP.class
            X.1wn r0 = r9.A0V
            r4.A01(r0, r1)
            X.0eM r0 = r9.A0Q
            java.lang.Object r4 = r0.getValue()
            X.JjA r4 = (X.C60309JjA) r4
            X.LQe r0 = r4.A08
            X.05G r0 = r0.A04
            X.JwC r5 = X.JTO.A0P(r0)
            java.lang.Object r0 = r5.A00
            X.Jw7 r0 = (X.C61069Jw7) r0
            if (r0 == 0) goto L_0x009a
            java.lang.Object r1 = r0.A01
            X.Knf r1 = (X.C62865Knf) r1
            if (r1 == 0) goto L_0x009a
            boolean r0 = r1 instanceof X.C62085KZp
            if (r0 == 0) goto L_0x009a
            X.KZp r1 = (X.C62085KZp) r1
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x0162
        L_0x009a:
            java.lang.Object r0 = r5.A03
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r1 = r0.A01
            X.Knf r1 = (X.C62865Knf) r1
            boolean r0 = r1 instanceof X.C62085KZp
            if (r0 == 0) goto L_0x00ac
            X.KZp r1 = (X.C62085KZp) r1
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x0162
        L_0x00ac:
            java.lang.Object r0 = r5.A02
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r1 = r0.A01
            X.Knf r1 = (X.C62865Knf) r1
            boolean r0 = r1 instanceof X.C62085KZp
            if (r0 == 0) goto L_0x00be
            X.KZp r1 = (X.C62085KZp) r1
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x0162
        L_0x00be:
            X.0eM r0 = r9.A0L
            java.lang.Object r0 = r0.getValue()
            X.Ugn r0 = (X.C15682Ugn) r0
            r0.A00()
            X.0eM r0 = r9.A0I
            X.C13990Tnq.A1D(r9, r0)
            X.0eM r0 = r9.A0G
            X.C13990Tnq.A1D(r9, r0)
            java.lang.Object r4 = r3.getValue()
            X.W26 r4 = (X.W26) r4
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "instagram_shopping_mini_shop_storefront"
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.String r3 = "RECONSIDERATION"
            if (r0 == 0) goto L_0x0136
            X.0wc r1 = r4.A00
            java.lang.String r0 = "commerce_storefront_surface_enter"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 132(0x84, float:1.85E-43)
            X.1Ln r5 = new X.1Ln
            r5.<init>(r1, r0)
            boolean r0 = X.DbT.A1Y(r5)
            if (r0 == 0) goto L_0x012f
            X.V1X r1 = X.V1X.CONTINUE_SHOPPING
            java.lang.String r0 = "analytics_page"
            r5.A0M(r1, r0)
            java.lang.String r6 = ""
            r0 = 800(0x320, float:1.121E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.A0R(r0, r6)
            X.V1W r1 = X.V1W.STOREFRONT
            java.lang.String r0 = "referral_surface"
            r5.A0M(r1, r0)
            java.lang.String r0 = "referral_ui_component"
            r5.A0R(r0, r6)
        L_0x0118:
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "shopping_session_id"
            r5.A0R(r0, r1)
            X.327 r0 = X.W26.A01(r4, r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "navigation_chain"
            r5.A0R(r0, r1)
            r5.Cgf()
        L_0x012f:
            r0 = -431615611(0xffffffffe6461185, float:-2.3383794E23)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0136:
            java.lang.String r0 = "instagram_shopping_home"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x012f
            X.0wc r1 = r4.A00
            java.lang.String r0 = "commerce_tab_feed_surface_enter"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 135(0x87, float:1.89E-43)
            X.1Ln r5 = new X.1Ln
            r5.<init>(r1, r0)
            boolean r0 = X.DbT.A1Y(r5)
            if (r0 == 0) goto L_0x012f
            X.V1X r1 = X.V1X.CONTINUE_SHOPPING
            java.lang.String r0 = "analytics_page"
            r5.A0M(r1, r0)
            X.V1W r1 = X.V1W.TAB_FEED
            java.lang.String r0 = "referral_surface"
            r5.A0M(r1, r0)
            goto L_0x0118
        L_0x0162:
            X.6oS r1 = X.C318116oQ.A00(r4)
            r0 = 45
            X.C13989Tnp.A1S(r4, r1, r0)
            goto L_0x00be
        L_0x016d:
            java.lang.String r0 = "merchant_id"
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15335Uak.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1581046125);
        0qQ.A0B(layoutInflater, 0);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) C13990Tnq.A0F(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview);
        refreshableNestedScrollingParent.A07 = new C19764Wf5(this, 2);
        C13990Tnq.A1O(refreshableNestedScrollingParent);
        this.A00 = refreshableNestedScrollingParent;
        AnonymousClass0fD.A09(334062078, A022);
        return refreshableNestedScrollingParent;
    }

    public final void onDestroy() {
        String str;
        int A022 = AnonymousClass0fD.A02(1834849142);
        super.onDestroy();
        1Ng A0R2 = DbX.A0R(this.A0K);
        A0R2.A02(this.A0W, AnonymousClass3DT.class);
        A0R2.A02(this.A0U, WQH.class);
        A0R2.A02(this.A0T, WQM.class);
        A0R2.A02(this.A0X, C323966yO.class);
        A0R2.A02(this.A0V, WQP.class);
        C13990Tnq.A1F(this, this.A0I);
        C13990Tnq.A1F(this, this.A0G);
        W26 w26 = (W26) this.A0B.getValue();
        0Aj A0e = AnonymousClass7TE.A0e(w26.A00, "instagram_shopping_reconsideration_destination_exit");
        if (A0e.isSampled()) {
            C13988Tno.A17(A0e, W26.A01(w26, (String) null));
            String str2 = w26.A04;
            if (str2 != null) {
                boolean z = w26.A05;
                C263944Ny A002 = C263944Ny.A00(str2);
                if (z) {
                    str = "marketer_id";
                } else {
                    str = "merchant_id";
                }
                A0e.AAE(A002, str);
            }
            Long l = w26.A01;
            if (l != null) {
                C13991Tnr.A14(A0e, l, (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1)));
            }
            A0e.Cgf();
        }
        AnonymousClass0fD.A09(-242256497, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1936261967);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        C17869VhM vhM = (C17869VhM) this.A07.getValue();
        vhM.A01.flowEndSuccess(vhM.A00);
        AnonymousClass0fD.A09(1099738521, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1116697930);
        C15335Uak.super.onPause();
        LOp A002 = C17052VGa.A00(AnonymousClass7TE.A0l(this.A0K));
        String A0t = DbS.A0t(this.A0C);
        synchronized (A002) {
            C61047Jvl A003 = LOp.A00(A002, A0t);
            Iterator it = ((Set) A003.A01).iterator();
            while (it.hasNext()) {
                int A0F2 = AnonymousClass7TG.A0F(it);
                02m.A0p.markerPoint(A0F2, "USER_NAVIGATION_CANCELLATION");
                02m.A0p.markerEnd(A0F2, 4);
                A003.A01 = 094.A03(Integer.valueOf(A0F2), (Set) A003.A01);
            }
        }
        AnonymousClass0fD.A09(1949203909, A022);
    }
}
