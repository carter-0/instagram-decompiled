package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Wd3  reason: case insensitive filesystem */
public final class C19640Wd3 implements XC8 {
    public final UserSession A00;
    public final C17713Vci A01;
    public final C18661VwI A02;

    public final void D1a(String str, String str2, String str3, int i, int i2) {
    }

    public final /* synthetic */ void DZd(Product product, String str, String str2, int i, int i2) {
    }

    public final boolean DZe(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final /* synthetic */ void DZf(String str, int i) {
    }

    public final void DZg(Product product, int i, int i2) {
    }

    public final boolean DZk(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final void DZl(Product product) {
        0qQ.A0B(product, 0);
        C18661VwI.A00(this.A02, product, "view_in_cart_cta");
    }

    public final void DZm(Product product) {
    }

    public final /* synthetic */ void DZn(String str) {
    }

    public final /* synthetic */ void DZo(Product product) {
    }

    public final void DuP(UnavailableProduct unavailableProduct, int i, int i2) {
        0qQ.A0B(unavailableProduct, 0);
        C17713Vci vci = this.A01;
        AnonymousClass4DU r8 = vci.A04;
        UserSession userSession = vci.A03;
        String productId = unavailableProduct.getProductId();
        String A012 = C320166rs.A01(i, i2);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), AnonymousClass000.A00(1480));
        C54665HMw hMw = C54665HMw.PRODUCT_AUTO_COLLECTION;
        A0e.AAJ("collection_id", hMw.A01);
        A0e.AAJ("collection_name", hMw.A00);
        A0e.AAJ(AnonymousClass000.A00(315), "0");
        A0e.AAJ("product_id", productId);
        A0e.AAJ("position", A012);
        A0e.Cgf();
        FragmentActivity activity = vci.A02.getActivity();
        String str = vci.A0C;
        String str2 = vci.A0B;
        0qQ.A0B(activity, 1);
        VH3.A00(activity, userSession, r8, unavailableProduct, str, str2);
    }

    public final void DuQ(ProductFeedItem productFeedItem) {
        0qQ.A0B(productFeedItem, 0);
        C17713Vci vci = this.A01;
        UnavailableProductImpl unavailableProductImpl = productFeedItem.A05;
        unavailableProductImpl.getClass();
        C55115HcO.A00();
        String productId = unavailableProductImpl.getProductId();
        String A002 = AnonymousClass3ZA.A00(unavailableProductImpl.BRo());
        UserSession userSession = vci.A03;
        AnonymousClass4DU r3 = vci.A04;
        String str = vci.A0B;
        Context context = vci.A02.getContext();
        AnonymousClass7TF.A1H(productId, A002);
        0qQ.A0B(context, 5);
        SaveApiUtil.A08(userSession, r3, productId, A002, str);
        vci.A08.DZy(productFeedItem);
    }

    public final void DZY(ULV ulv, Product product) {
        C17713Vci vci = this.A01;
        Product product2 = product;
        List list = product2.A0O;
        if (list != null && !list.isEmpty()) {
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
        AnonymousClass4DU r3 = vci.A04;
        UserSession userSession = vci.A03;
        String str = vci.A0B;
        User user = product2.A0B;
        W2s.A06(r3, userSession, (1Xj) null, (ShoppingGuideLoggingInfo) null, product2, "wish_list_feed", str, "wishlist_feed", AnonymousClass3ZA.A00(user), (String) null, vci.A0C, (String) null);
        C323426xT.A00(userSession).A07.A0D(new C19582Wc7(vci, product2), product2, AnonymousClass3ZA.A00(user), (String) null);
    }

    public final void DZZ(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        String str;
        C17713Vci vci = this.A01;
        if (ulv != null) {
            str = ulv.A04;
        } else {
            str = null;
        }
        C18617VvA vvA = vci.A09;
        ULC ulc = new ULC((C376699Iz) null, (FiltersLoggingInfo) null, str, (String) null, (String) null);
        boolean A1X = DbW.A1X(productFeedItem);
        UO3 uo3 = new UO3(productFeedItem, ulc);
        C17372VSz vSz = new C17372VSz(i, i2);
        0qQ.A0B(view, A1X ? 1 : 0);
        2el r2 = vvA.A00;
        C2354830a A002 = AnonymousClass30Y.A00(uo3, vSz, uo3.A04);
        A002.A00(vvA.A01);
        C51967G9n.A0z(view, A002, r2);
        VP0 vp0 = (VP0) this.A00.A01(VP0.class, C20658Wwq.A00);
        synchronized (vp0) {
            C13992Tns.A1C(vp0.A00, 37357157);
        }
    }

    public final void DZa(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        FBProductItemDetailsDict A012;
        C17713Vci vci = this.A01;
        String str = null;
        if (ulv != null) {
            str = ulv.A04;
        }
        int i3 = i;
        int i4 = i2;
        C18061Vkn A022 = vci.A05.A02(productFeedItem, i3, i4);
        A022.A03(str);
        A022.A00();
        vci.A01 = vci.A07.A01();
        ProductTile productTile = productFeedItem.A02;
        if (productTile == null || (A012 = C18768W0o.A01(productTile)) == null) {
            Product A023 = productFeedItem.A02();
            A023.getClass();
            AnonymousClass4DU r8 = vci.A04;
            UserSession userSession = vci.A03;
            String str2 = A023.A0H;
            String A013 = C320166rs.A01(i3, i4);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), AnonymousClass000.A00(1480));
            C54665HMw hMw = C54665HMw.PRODUCT_AUTO_COLLECTION;
            A0e.AAJ("collection_id", hMw.A01);
            A0e.AAJ("collection_name", hMw.A00);
            A0e.AAJ(AnonymousClass000.A00(315), RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A0e.AAJ("product_id", str2);
            A0e.AAJ("position", A013);
            A0e.Cgf();
            C249713kF r5 = C249713kF.A00;
            FragmentActivity activity = vci.A02.getActivity();
            activity.getClass();
            WNN A0L = r5.A0L(activity, userSession, r8, A023, "shopping_product_collection", vci.A0C);
            A0L.A0N = vci.A0B;
            A0L.A0Y = vci.A01;
            WNN.A01(A0L);
            return;
        }
        C249713kF r52 = C249713kF.A00;
        FragmentActivity activity2 = vci.A02.getActivity();
        activity2.getClass();
        r52.A10(activity2, vci.A03, vci.A04, C45683D1i.A00(A012));
    }

    public final void DZi(ULV ulv, ProductTile productTile, int i, int i2) {
        C17713Vci vci = this.A01;
        C231142qw r1 = vci.A06;
        vci.A07.A01();
        r1.A01((1Xj) null, productTile).A00();
    }

    public C19640Wd3(UserSession userSession, C17713Vci vci, C18661VwI vwI) {
        this.A00 = userSession;
        this.A01 = vci;
        this.A02 = vwI;
    }
}
