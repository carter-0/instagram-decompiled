package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.shopping.fragment.similarproducts.ShoppingSimilarProductsFragment$onCreateView$1$1$1;
import com.instagram.user.model.Product;

/* renamed from: X.Ub3  reason: case insensitive filesystem */
public final class C15352Ub3 extends AnonymousClass4DH implements AnonymousClass4DU, C21003X9a, C273494mf, AnonymousClass4DS, C20982X7x {
    public static final String __redex_internal_original_name = "ShoppingSimilarProductsFragment";
    public RecyclerView A00;
    public final AnonymousClass0eM A01 = C20689WxL.A00(this, 35);
    public final AnonymousClass0eM A02 = C20689WxL.A00(this, 36);
    public final AnonymousClass0eM A03 = C20689WxL.A00(this, 37);
    public final AnonymousClass0eM A04 = C20689WxL.A00(this, 38);
    public final AnonymousClass0eM A05 = C20689WxL.A00(this, 39);
    public final AnonymousClass0eM A06 = C20689WxL.A00(this, 40);
    public final AnonymousClass0eM A07 = C20689WxL.A00(this, 41);
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = C20689WxL.A00(this, 42);
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(C20665Wwx.A00);

    public final void DZY(ULV ulv, Product product) {
    }

    public final /* synthetic */ void DZZ(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DZa(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        AnonymousClass7TG.A1N(productFeedItem, view);
        ((C18661VwI) this.A06.getValue()).A02(ulv, productFeedItem, (Long) null, (String) null, (String) null, i, i2);
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

    public final void DZi(ULV ulv, ProductTile productTile, int i, int i2) {
        0qQ.A0B(productTile, 0);
        ((C18661VwI) this.A06.getValue()).A03(ulv, productTile, i, i2, false);
    }

    public final boolean DZk(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final void DZl(Product product) {
    }

    public final void DZm(Product product) {
    }

    public final /* synthetic */ void DZn(String str) {
    }

    public final /* synthetic */ void DZo(Product product) {
    }

    public final void configureActionBar(2da r1) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "instagram_shopping_view_similar";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbV.A1F(getViewLifecycleOwner(), ((C60208JhR) this.A0A.getValue()).A00, new C20785Wyw(this, 4), 50);
    }

    public final /* bridge */ /* synthetic */ void AAl(Object obj, Object obj2) {
        UO3 uo3 = (UO3) obj;
        C17372VSz vSz = (C17372VSz) obj2;
        C18661VwI vwI = (C18661VwI) this.A06.getValue();
        String A0t = DbS.A0t(this.A03);
        C18617VvA vvA = vwI.A0A;
        if (vvA != null) {
            uo3.A00 = vwI.A0B;
            vvA.A02(vSz, uo3, A0t);
        }
    }

    public final /* bridge */ /* synthetic */ void ECF(View view, Object obj) {
        UO3 uo3 = (UO3) obj;
        0qQ.A0B(uo3, 1);
        C18617VvA vvA = ((C18661VwI) this.A06.getValue()).A0A;
        if (vvA != null) {
            vvA.A01(view, uo3);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !JTP.A1Y(recyclerView)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C15352Ub3() {
        C20689WxL wxL = new C20689WxL(this, 46);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20689WxL(new C20689WxL(this, 43), 44));
        this.A0A = new C227862kA(new C20689WxL(A002, 45), wxL, new C20613Wvu(38, A002, (Object) null), new 0Yh(C60208JhR.class));
        this.A08 = C227642jf.A02(this);
    }

    public final /* bridge */ /* synthetic */ void AAk(Object obj) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2041546340);
        C15352Ub3.super.onCreate(bundle);
        2YL r2 = (2YL) this.A0A.getValue();
        C13989Tnp.A1S(r2, C318116oQ.A00(r2), 48);
        AnonymousClass0fD.A09(1925645830, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(505002004);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        0qQ.A0C(inflate, AnonymousClass000.A00(0));
        RecyclerView A0K = DbX.A0K(inflate);
        this.A00 = A0K;
        if (A0K == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        }
        Dba.A0z(A0K, (2el) this.A0B.getValue(), this);
        A0K.setLayoutManager(new ShoppingSimilarProductsFragment$onCreateView$1$1$1(A0K.getContext()));
        AnonymousClass3AQ r0 = new AnonymousClass3AQ();
        r0.A00 = false;
        A0K.setItemAnimator(r0);
        Dba.A17(A0K, this.A01);
        AnonymousClass0fD.A09(-1316816008, A022);
        return inflate;
    }
}
