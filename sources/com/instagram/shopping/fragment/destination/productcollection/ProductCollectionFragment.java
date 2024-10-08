package com.instagram.shopping.fragment.destination.productcollection;

import X.02m;
import X.0Aj;
import X.0hq;
import X.0qQ;
import X.1Ng;
import X.1XQ;
import X.1Xj;
import X.1a1;
import X.1wn;
import X.2dZ;
import X.2da;
import X.2el;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass1XV;
import X.AnonymousClass3AS;
import X.AnonymousClass3DT;
import X.AnonymousClass3DZ;
import X.AnonymousClass3M7;
import X.AnonymousClass3ZA;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass57K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C15482UdX;
import X.C15690Ugv;
import X.C16223Uqm;
import X.C16675UzB;
import X.C16735V3s;
import X.C17072VGu;
import X.C17373VTa;
import X.C17596Vao;
import X.C17701VcW;
import X.C17869VhM;
import X.C17911Vi2;
import X.C18065Vkr;
import X.C18661VwI;
import X.C18802W2p;
import X.C19221WQb;
import X.C19602WcR;
import X.C19649WdD;
import X.C19742Wej;
import X.C19764Wf5;
import X.C20929X4u;
import X.C20930X4v;
import X.C20983X7y;
import X.C20988X8e;
import X.C21000X8x;
import X.C231162qy;
import X.C231172qz;
import X.C232952ui;
import X.C244273av;
import X.C249403jg;
import X.C249763kK;
import X.C268364dG;
import X.C268654dm;
import X.C270194gL;
import X.C309516Yo;
import X.C323536xe;
import X.C3251771i;
import X.C3251871j;
import X.C358248ab;
import X.C370788x4;
import X.C46447Df9;
import X.C46474Dfc;
import X.C46548Dgp;
import X.C50004FIp;
import X.C51966G9m;
import X.C51969G9p;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.DbY;
import X.Dbc;
import X.JTP;
import X.Pxd;
import X.UB1;
import X.ULV;
import X.VH3;
import X.VPV;
import X.W4V;
import X.W5U;
import X.WQJ;
import X.XC8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.shopping.productfeed.ProductCollectionFooter;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProductCollectionFragment extends AnonymousClass4DH implements C249763kK, AnonymousClass4DU, C231172qz, C21000X8x, C20983X7y, AnonymousClass4DS, C20930X4v, AnonymousClass3M7, XC8 {
    public UserSession A00;
    public 1Xj A01;
    public AnonymousClass57K A02;
    public ProductCollectionHeader A03;
    public C16675UzB A04;
    public C15482UdX A05;
    public C17596Vao A06;
    public C18802W2p A07;
    public C20988X8e A08;
    public C18065Vkr A09;
    public C17701VcW A0A;
    public C18661VwI A0B;
    public C19742Wej A0C;
    public User A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public boolean A0K = false;
    public 2el A0L;
    public C17911Vi2 A0M;
    public C15690Ugv A0N;
    public C323536xe A0O;
    public C17869VhM A0P;
    public C19649WdD A0Q;
    public C231162qy A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public boolean A0W = false;
    public boolean A0X = false;
    public final List A0Y = new ArrayList();
    public final C249403jg A0Z = new UB1(this, 14);
    public final 1wn A0a = new C19221WQb(this, 51);
    public final 1wn A0b = new C19221WQb(this, 50);
    public final C20929X4u A0c = new C19602WcR(this);
    public IgdsBottomButtonLayout mFooterBtn;
    public View mFooterContainer;
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;

    public final void DZY(ULV ulv, Product product) {
    }

    public final /* synthetic */ void DZd(Product product, String str, String str2, int i, int i2) {
    }

    public final boolean DZe(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final /* synthetic */ void DZf(String str, int i) {
    }

    public final void DZl(Product product) {
    }

    public final void DZm(Product product) {
    }

    public final /* synthetic */ void DZn(String str) {
    }

    public final /* synthetic */ void DZo(Product product) {
    }

    public final void DkK(C268654dm r12, boolean z) {
        1XQ r0;
        C17596Vao vao = this.A06;
        synchronized (vao) {
            Set set = vao.A05;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int A0F2 = AnonymousClass7TG.A0F(it);
                02m r1 = vao.A00;
                r1.markerPoint(A0F2, "NETWORK_FAILED");
                r1.markerEnd(A0F2, 3);
            }
            set.clear();
        }
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A08.FKG();
        if (r12 == null) {
            r0 = null;
        } else {
            r0 = (1XQ) r12.A00();
        }
        if (this.A04 != C16675UzB.INCENTIVE || r0 == null || !C370788x4.A00(r0.mStatusCode)) {
            C13991Tnr.A0x(this);
            return;
        }
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = this.A00;
        String str = this.A0J;
        User user = this.A0D;
        AnonymousClass7TG.A0w(1, userSession, str, user);
        String A002 = AnonymousClass3ZA.A00(user);
        if (A002 != null) {
            C358248ab r2 = new C358248ab((Activity) requireActivity);
            r2.A09(2131973081);
            DbY.A0w(requireActivity, r2, C13988Tno.A0b(user), 2131973080);
            r2.A0E(new W5U(requireActivity, 44));
            r2.A0a(new C50004FIp(requireActivity, user, this, userSession, str, A002, 1), AnonymousClass7TE.A16(requireActivity, 2131976671));
            r2.A0B(new W4V(requireActivity, 7));
            DbT.A1V(r2);
        }
    }

    public final void DyR(1Xj r1, C270194gL r2) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public static void A00(ProductCollectionFragment productCollectionFragment, String str, String str2, String str3) {
        String str4 = productCollectionFragment.A0I;
        String str5 = str;
        String str6 = str2;
        if (str4 != null) {
            productCollectionFragment.A07.A06(productCollectionFragment.A02, str4, str5, str6, productCollectionFragment.A0F);
        }
        FragmentActivity activity = productCollectionFragment.getActivity();
        activity.getClass();
        C309516Yo A0Q2 = DbU.A0Q(activity, productCollectionFragment.A00);
        1a1 A022 = C46447Df9.A02();
        UserSession userSession = productCollectionFragment.A00;
        C46474Dfc A023 = C46548Dgp.A02(userSession, str, str2, productCollectionFragment.getModuleName());
        A023.A0G = str3;
        A023.A0L = productCollectionFragment.A0J;
        A023.A08 = productCollectionFragment.A0T;
        C46474Dfc.A02(A0Q2, userSession, A022, A023);
    }

    public final void A8A(User user) {
        this.A0Q.A8A(user);
    }

    public final void A9K(User user, int i) {
        this.A0R.A9K(user, i);
    }

    public final void A9L(VPV vpv, Integer num) {
        this.A0R.A9L(vpv, num);
    }

    public final void APZ(C268364dG r2, int i) {
        this.A0R.APZ(r2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        if (r0 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        r2.A9m("merchant_id", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        r2.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        r0 = r4.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1NY Abz() {
        /*
            r7 = this;
            com.instagram.common.session.UserSession r0 = r7.A00
            X.1NY r2 = X.DbU.A0O(r0)
            java.lang.Class<X.Uqm> r1 = X.C16223Uqm.class
            java.lang.Class<X.VoO> r0 = X.C18257VoO.class
            r2.A0R(r1, r0)
            X.VcW r4 = r7.A0A
            X.UzB r6 = r4.A02
            int r1 = r6.ordinal()
            java.lang.String r5 = "merchant_id"
            java.lang.String r3 = "ads_tracking_token"
            r0 = 0
            switch(r1) {
                case 1: goto L_0x008d;
                case 2: goto L_0x001d;
                case 3: goto L_0x001d;
                case 4: goto L_0x001d;
                case 5: goto L_0x001d;
                case 6: goto L_0x006a;
                case 7: goto L_0x001d;
                case 8: goto L_0x0052;
                case 9: goto L_0x0033;
                case 10: goto L_0x002d;
                case 11: goto L_0x0030;
                case 12: goto L_0x001d;
                case 13: goto L_0x001d;
                case 14: goto L_0x0045;
                case 15: goto L_0x001d;
                case 16: goto L_0x0036;
                default: goto L_0x001d;
            }
        L_0x001d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 521(0x209, float:7.3E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalStateException r0 = X.C66582MXn.A0k(r6, r0, r1)
            throw r0
        L_0x002d:
            java.lang.String r0 = "save/products/reconsideration/from_saved_posts_feed/"
            goto L_0x0095
        L_0x0030:
            java.lang.String r0 = "save/products/reconsideration/from_liked_posts_feed/"
            goto L_0x0095
        L_0x0033:
            java.lang.String r0 = "save/products/reconsideration/from_followed_brands_feed/"
            goto L_0x0095
        L_0x0036:
            java.lang.String r0 = r4.A04
            r0.getClass()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "commerce/incentive/%s/"
            r2.A0K(r0, r1)
            goto L_0x004a
        L_0x0045:
            java.lang.String r0 = "commerce/reconsideration/recently_viewed_products_feed/"
            r2.A0A(r0)
        L_0x004a:
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x0098
            r2.A9m(r5, r0)
            return r2
        L_0x0052:
            java.lang.String r0 = "commerce/product_collections/ads_collection_page/"
            r2.A0A(r0)
            com.instagram.common.session.UserSession r0 = r4.A01
            java.lang.String r1 = r4.A05
            java.lang.String r0 = X.C231122qu.A0I(r0, r1)
            r2.A9m(r3, r0)
            if (r1 == 0) goto L_0x0098
            java.lang.String r0 = "ig_dynamic_ad_media_id"
            r2.A9m(r0, r1)
            return r2
        L_0x006a:
            java.lang.String r0 = r4.A09
            r0.getClass()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "commerce/product_collections/collection_page/%s/"
            X.DbU.A1P(r2, r0, r1)
            java.lang.String r1 = r4.A08
            java.lang.String r0 = "prior_module"
            r2.A9m(r0, r1)
            com.instagram.common.session.UserSession r1 = r4.A01
            java.lang.String r0 = r4.A05
            java.lang.String r0 = X.C231122qu.A0I(r1, r0)
            if (r0 == 0) goto L_0x0098
            r2.A9m(r3, r0)
            return r2
        L_0x008d:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "commerce/products/checkout/"
            java.lang.String r0 = X.0mp.A06(r0, r1)
        L_0x0095:
            r2.A0A(r0)
        L_0x0098:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment.Abz():X.1NY");
    }

    public final void D1a(String str, String str2, String str3, int i, int i2) {
        this.A0B.A08(str2, str3, i, i2);
    }

    public final void D6L(User user) {
        this.A0Q.D6L(user);
    }

    public final void DRO(ShoppingBrandWithProducts shoppingBrandWithProducts, String str, int i) {
        this.A0R.DRO(shoppingBrandWithProducts, str, i);
    }

    public final void DZZ(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        this.A0B.A01(view, ulv, productFeedItem, AnonymousClass3ZA.A00(this.A0D), i, i2);
    }

    public final void DZa(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        AnonymousClass7TG.A1N(productFeedItem, view);
        this.A0B.A02(ulv, productFeedItem, (Long) null, (String) null, (String) null, i, i2);
    }

    public final void DZg(Product product, int i, int i2) {
        this.A0B.A06(product, i, i2);
    }

    public final void DZi(ULV ulv, ProductTile productTile, int i, int i2) {
        0qQ.A0B(productTile, 0);
        this.A0B.A03(ulv, productTile, i, i2, true);
    }

    public final boolean DZk(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        C15690Ugv ugv = this.A0N;
        ProductTile productTile = productFeedItem.A02;
        0qQ.A0B(motionEvent, 1);
        ugv.A07 = productTile;
        ugv.A01 = i;
        ugv.A00 = i2;
        ugv.A0B = str;
        ugv.A0E = true;
        if (!ugv.A0D || motionEvent.getActionMasked() != 3) {
            ((C232952ui) ugv.A0S.getValue()).onTouch(view, motionEvent);
            return true;
        }
        ugv.A0D = false;
        return true;
    }

    public final void DkL() {
        C17596Vao vao = this.A06;
        synchronized (vao) {
            Iterator it = vao.A05.iterator();
            while (it.hasNext()) {
                vao.A00.markerPoint(AnonymousClass7TG.A0F(it), "SERVER_FETCH");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DkM(AnonymousClass1XV r14, boolean z, boolean z2) {
        C16223Uqm uqm = (C16223Uqm) r14;
        C17596Vao vao = this.A06;
        synchronized (vao) {
            Iterator it = vao.A05.iterator();
            while (it.hasNext()) {
                vao.A00.markerPoint(AnonymousClass7TG.A0F(it), "SUCCESS_NETWORK");
            }
        }
        String str = this.A0I;
        if (z && str != null) {
            C18802W2p w2p = this.A07;
            AnonymousClass57K r4 = this.A02;
            String str2 = this.A0F;
            0qQ.A0B(r4, 1);
            0Aj A0e = AnonymousClass7TE.A0e(w2p.A02, "shops_product_collection_page_load_success");
            if (A0e.isSampled()) {
                C51969G9p.A1A(A0e, w2p.A01);
                C13988Tno.A17(A0e, C18802W2p.A02(w2p, (String) null));
                A0e.AAE(C18802W2p.A03(A0e, r4, w2p, str, str2), "merchant_igid");
                A0e.AAK(C18802W2p.A01(w2p), "feed_item_info");
                A0e.Cgf();
            }
        }
        C15482UdX udX = this.A05;
        0qQ.A0B(uqm, 0);
        ProductFeedResponse productFeedResponse = uqm.A02;
        0qQ.A07(productFeedResponse);
        ProductCollectionHeader productCollectionHeader = uqm.A01;
        C17373VTa vTa = uqm.A02;
        ProductCollectionFooter productCollectionFooter = uqm.A00;
        C16735V3s v3s = uqm.A01;
        if (z) {
            udX.A0I.A04();
            udX.A02 = null;
            udX.A01 = null;
            udX.A03 = null;
            udX.A00 = null;
            udX.notifyDataSetChanged();
        }
        udX.A02 = v3s;
        if (productCollectionHeader != null) {
            udX.A01 = productCollectionHeader;
        }
        if (vTa != null) {
            udX.A03 = vTa;
        }
        if (productCollectionFooter != null) {
            udX.A00 = productCollectionFooter;
        }
        udX.A01(C51966G9m.A1J(productFeedResponse.A03));
        udX.A00();
        C16675UzB uzB = this.A04;
        FragmentActivity activity = getActivity();
        Context context = getContext();
        String moduleName = getModuleName();
        1Xj r7 = this.A01;
        UserSession userSession = this.A00;
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        C17072VGu.A00(context, this.mFooterContainer, this.mRecyclerView, activity, userSession, r7, this.mFooterBtn, this.A05.A00, uzB, refreshableNestedScrollingParent, moduleName);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent2 != null) {
            refreshableNestedScrollingParent2.setRefreshing(false);
        }
        this.A08.FKG();
        C16735V3s v3s2 = uqm.A01;
        if (!(v3s2 == null || v3s2.A03 == null)) {
            BaseFragmentActivity activity2 = getActivity();
            activity2.getClass();
            2dZ AYJ = activity2.AYJ();
            if (AYJ != null) {
                AYJ.A0T();
            }
        }
        if (!this.A0K) {
            this.A0K = true;
        }
        this.A03 = uqm.A01;
        A01(Collections.unmodifiableList(uqm.A02.A03));
    }

    public final void DuP(UnavailableProduct unavailableProduct, int i, int i2) {
        C18661VwI vwI = this.A0B;
        0qQ.A0B(unavailableProduct, 0);
        VH3.A00(vwI.A02.requireActivity(), vwI.A03, vwI.A04, unavailableProduct, vwI.A0I, vwI.A0E);
    }

    public final void DuQ(ProductFeedItem productFeedItem) {
        this.A0B.A04(productFeedItem);
    }

    public final void EBX(View view) {
        this.A0Q.EBX(view);
    }

    public final void EBo(View view, User user) {
        this.A0R.EBo(view, user);
    }

    public final void EBp(View view, String str) {
        this.A0R.EBp(view, str);
    }

    public final void FJ0(View view) {
        this.A0R.FJ0(view);
    }

    public final void configureActionBar(2da r6) {
        String str;
        C16675UzB uzB;
        String str2;
        User A0j;
        if (this.mFragmentManager != null) {
            r6.Eu4(true);
            if (this.A0W) {
                Dbc.A0k(r6);
            }
            C17701VcW vcW = this.A0A;
            String str3 = vcW.A03;
            if (str3 != null || (!((uzB = vcW.A02) == C16675UzB.PRODUCT_COLLECTION || uzB == C16675UzB.PRODUCT_INSTANT_COLLECTION) || (str2 = vcW.A07) == null)) {
                C16675UzB uzB2 = vcW.A02;
                if (!(uzB2 == C16675UzB.SAVED || uzB2 == C16675UzB.RECENTLY_VIEWED) || (str = vcW.A07) == null) {
                    if (uzB2 == C16675UzB.PRODUCTS_FROM_FOLLOWED_BRANDS || uzB2 == C16675UzB.PRODUCTS_FROM_LIKED_MEDIA || uzB2 == C16675UzB.PRODUCTS_FROM_SAVED_MEDIA) {
                        str = vcW.A0A;
                    } else {
                        if (str3 == null) {
                            str3 = vcW.A00.getString(2131969797);
                        }
                        r6.setTitle(str3);
                    }
                }
                r6.EfN(str, str3);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                String str4 = vcW.A06;
                if (!(str4 == null || (A0j = DbV.A0j(vcW.A01, str4)) == null || !A0j.isVerified())) {
                    C244273av.A08(vcW.A00, spannableStringBuilder, true);
                }
                r6.Eon(spannableStringBuilder);
            }
            C17911Vi2 vi2 = this.A0M;
            if (vi2 != null) {
                vi2.A00(r6);
            }
            C323536xe r0 = this.A0O;
            if (r0 != null) {
                r0.A01(r6);
            }
        }
    }

    public final String getModuleName() {
        C16675UzB uzB = this.A0A.A02;
        switch (uzB.ordinal()) {
            case 1:
                return "instagram_shopping_home_checkout_product_feed";
            case 9:
            case 10:
            case 11:
                return uzB.toString();
            case 14:
                return "recently_viewed_products";
            case 16:
                return "instagram_shopping_incentive_collection";
            default:
                return Pxd.A00(19);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final String getSessionId() {
        return this.A0J;
    }

    public final boolean isEmpty() {
        return this.A05.isEmpty();
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || !JTP.A1Y(recyclerView)) {
            return true;
        }
        return false;
    }

    private void A01(List list) {
        ProductImageContainer productImageContainer;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductFeedItem productFeedItem = (ProductFeedItem) it.next();
            Product A022 = productFeedItem.A02();
            if (!(A022 == null || (productImageContainer = A022.A0A) == null || productImageContainer.BGO().Al9() == null)) {
                this.A0Y.add(AnonymousClass7TE.A13(productFeedItem.A02().A0A.BGO().Al9()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: X.X8x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment} */
    /* JADX WARNING: type inference failed for: r29v3, types: [X.UlT, X.2rW] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r36) {
        /*
            r35 = this;
            r0 = 441683205(0x1a538d05, float:4.3747692E-23)
            int r17 = X.AnonymousClass0fD.A02(r0)
            r0 = r35
            r1 = r36
            com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment.super.onCreate(r1)
            android.os.Bundle r3 = r0.requireArguments()
            com.instagram.common.session.UserSession r1 = X.DbX.A0U(r0)
            r0.A00 = r1
            java.lang.String r1 = X.C228022kf.A00(r3)
            r0.A0J = r1
            java.lang.String r2 = "prior_module_name"
            java.lang.String r1 = r3.getString(r2)
            if (r1 != 0) goto L_0x03ef
            java.lang.String r1 = ""
        L_0x0028:
            r0.A0G = r1
            java.lang.String r1 = "merchant"
            android.os.Parcelable r1 = r3.getParcelable(r1)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r4 = 0
            if (r1 != 0) goto L_0x0047
            java.lang.String r1 = "merchant_id"
            java.lang.String r5 = r3.getString(r1)
            java.lang.String r1 = "merchant_username"
            java.lang.String r2 = r3.getString(r1)
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.User r1 = X.1aC.A05(r5, r2)
        L_0x0047:
            r0.A0D = r1
            java.lang.String r1 = "prior_submodule_name"
            java.lang.String r1 = r3.getString(r1)
            r0.A0H = r1
            java.lang.String r1 = "product_feed_type"
            java.lang.String r2 = r3.getString(r1)
            java.util.Map r1 = X.C16675UzB.A01
            java.lang.Object r1 = r1.get(r2)
            X.UzB r1 = (X.C16675UzB) r1
            if (r1 == 0) goto L_0x0450
            r0.A04 = r1
            java.lang.String r1 = "product_feed_label"
            java.lang.String r24 = r3.getString(r1)
            java.lang.String r1 = "product_feed_subtitle"
            java.lang.String r25 = r3.getString(r1)
            java.lang.String r1 = "product_feed_index"
            java.lang.Integer r1 = X.DbV.A0o(r3, r1)
            r0.A0E = r1
            java.lang.String r6 = "product_collection_id"
            java.lang.String r1 = r3.getString(r6)
            r0.A0I = r1
            java.lang.String r1 = "product_collection_type"
            java.lang.String r1 = r3.getString(r1)
            X.57K r1 = X.C17025VEz.A00(r1)
            r0.A02 = r1
            java.lang.String r1 = "incentive_id"
            java.lang.String r1 = r3.getString(r1)
            r0.A0F = r1
            r1 = 166(0xa6, float:2.33E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r3.getBoolean(r1, r4)
            r0.A0X = r1
            java.lang.String r1 = "is_modal"
            boolean r1 = r3.getBoolean(r1)
            r0.A0W = r1
            java.lang.String r1 = "media_id"
            java.lang.String r1 = r3.getString(r1)
            r0.A0T = r1
            java.lang.String r1 = "product_collection_header"
            android.os.Parcelable r1 = r3.getParcelable(r1)
            com.instagram.model.shopping.productfeed.ProductCollectionHeader r1 = (com.instagram.model.shopping.productfeed.ProductCollectionHeader) r1
            r0.A03 = r1
            java.lang.String r1 = "query_text"
            java.lang.String r1 = r3.getString(r1)
            r0.A0U = r1
            java.lang.String r1 = "search_session_id"
            java.lang.String r1 = r3.getString(r1)
            r0.A0V = r1
            java.lang.String r1 = "gift_recipient_id"
            java.lang.String r1 = r3.getString(r1)
            r0.A0S = r1
            android.content.Context r19 = r0.requireContext()
            com.instagram.common.session.UserSession r10 = r0.A00
            java.lang.String r9 = r0.A0G
            X.UzB r8 = r0.A04
            java.lang.String r7 = r0.A0I
            com.instagram.user.model.User r1 = r0.A0D
            java.lang.String r26 = X.AnonymousClass3ZA.A00(r1)
            com.instagram.user.model.User r1 = r0.A0D
            java.lang.String r27 = X.C13988Tno.A0b(r1)
            java.lang.String r5 = r0.A0F
            java.lang.String r2 = r0.A0T
            X.VcW r1 = new X.VcW
            r21 = r8
            r22 = r9
            r23 = r7
            r28 = r5
            r29 = r2
            r20 = r10
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0.A0A = r1
            com.instagram.common.session.UserSession r11 = r0.A00
            java.lang.String r10 = r0.A0J
            java.lang.String r9 = r0.A0G
            java.lang.String r8 = r0.A0H
            com.instagram.user.model.User r1 = r0.A0D
            java.lang.String r24 = X.AnonymousClass3ZA.A00(r1)
            java.lang.String r5 = r0.A0T
            r16 = 0
            java.lang.String r2 = r0.A0U
            java.lang.String r1 = r0.A0V
            X.W2p r7 = new X.W2p
            r18 = r7
            r19 = r0
            r20 = r11
            r21 = r10
            r22 = r9
            r23 = r8
            r25 = r5
            r26 = r16
            r27 = r2
            r28 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.A07 = r7
            java.lang.String r5 = r0.A0I
            if (r5 == 0) goto L_0x013e
            X.57K r2 = r0.A02
            java.lang.String r1 = r0.A0F
            r7.A05(r2, r5, r1)
        L_0x013e:
            java.lang.String r2 = r0.A0T
            if (r2 == 0) goto L_0x015a
            com.instagram.common.session.UserSession r1 = r0.A00
            X.1Xj r1 = X.DbV.A0U(r1, r2)
            r0.A01 = r1
            if (r1 != 0) goto L_0x015a
            com.instagram.common.session.UserSession r1 = r0.A00
            X.1OC r2 = X.C3724090s.A04(r1, r2)
            r1 = 12
            X.C15622Ufo.A00(r2, r0, r1)
            r0.schedule(r2)
        L_0x015a:
            X.UzB r8 = r0.A04
            java.lang.String r7 = r0.A0I
            com.instagram.user.model.User r1 = r0.A0D
            java.lang.String r5 = X.AnonymousClass3ZA.A00(r1)
            X.1Xj r2 = r0.A01
            if (r2 == 0) goto L_0x03ec
            com.instagram.common.session.UserSession r1 = r0.A00
            java.lang.String r2 = X.C231122qu.A07(r1, r2)
        L_0x016e:
            X.Vao r1 = new X.Vao
            r1.<init>(r8, r7, r5, r2)
            r0.A06 = r1
            X.VcW r1 = r0.A0A
            X.UzB r1 = r1.A02
            int r2 = r1.ordinal()
            r1 = 16
            if (r2 == r1) goto L_0x03e8
            java.lang.String r1 = "product_feed"
            android.os.Parcelable r3 = r3.getParcelable(r1)
            com.instagram.model.shopping.productfeed.ProductFeedResponse r3 = (com.instagram.model.shopping.productfeed.ProductFeedResponse) r3
            if (r3 == 0) goto L_0x03e5
            java.lang.String r5 = r3.A01
        L_0x018d:
            android.content.Context r19 = r0.requireContext()
            X.0gy r20 = X.AnonymousClass07i.A00(r0)
            com.instagram.common.session.UserSession r1 = r0.A00
            r10 = 3
            X.0qQ.A0B(r1, r10)
            X.Wej r2 = new X.Wej
            r18 = r2
            r21 = r1
            r22 = r0
            r23 = r5
            r18.<init>(r19, r20, r21, r22, r23)
            r0.A0C = r2
            X.WcW r1 = new X.WcW
            r1.<init>(r0, r2)
            r0.A08 = r1
            X.2el r1 = X.2el.A00()
            r0.A0L = r1
            X.Wd7 r12 = new X.Wd7
            r12.<init>(r0)
            X.Wcr r11 = new X.Wcr
            r11.<init>(r0, r4)
            com.instagram.common.session.UserSession r2 = r0.A00
            X.Uxa r1 = X.C16580Uxa.ProductCollectionFragment
            X.VhM r1 = X.C18265Vof.A00(r2, r1)
            r0.A0P = r1
            com.instagram.common.session.UserSession r13 = r0.A00
            java.lang.String r9 = r0.A0J
            java.lang.String r8 = r0.A0G
            java.lang.String r7 = r0.A0H
            X.UzB r1 = r0.A04
            X.VvJ r2 = new X.VvJ
            r18 = r2
            r19 = r0
            r20 = r13
            r21 = r0
            r22 = r1
            r23 = r9
            r24 = r8
            r25 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r7 = r0.A0I
            X.57K r1 = r0.A02
            r2.A0D = r7
            r2.A02 = r1
            r1 = r16
            r2.A06 = r1
            r2.A05 = r12
            r2.A04 = r11
            boolean r1 = r0.A0X
            r2.A0I = r1
            X.1Xj r1 = r0.A01
            r2.A01 = r1
            X.2el r1 = r0.A0L
            r2.A00 = r1
            com.instagram.user.model.User r1 = r0.A0D
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r1)
            r2.A0B = r1
            java.lang.String r1 = r0.A0T
            r2.A0A = r1
            java.lang.String r1 = r0.A0U
            r2.A0E = r1
            java.lang.String r1 = r0.A0V
            r2.A0F = r1
            java.lang.String r1 = r0.A0S
            r2.A08 = r1
            X.VwI r1 = r2.A02()
            r0.A0B = r1
            androidx.fragment.app.FragmentActivity r19 = r0.requireActivity()
            com.instagram.common.session.UserSession r14 = r0.A00
            X.2el r13 = r0.A0L
            java.lang.String r12 = r0.A0G
            java.lang.String r11 = r0.A0H
            java.lang.String r9 = r0.A0J
            java.lang.Integer r25 = X.AnonymousClass05K.A0Y
            java.lang.String r8 = r0.A0I
            X.57K r7 = r0.A02
            X.1Xj r2 = r0.A01
            X.WdD r1 = new X.WdD
            r21 = r13
            r22 = r2
            r23 = r0
            r24 = r7
            r26 = r12
            r27 = r11
            r28 = r9
            r29 = r8
            r20 = r14
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0.A0Q = r1
            com.instagram.common.session.UserSession r13 = r0.A00
            X.2el r12 = r0.A0L
            java.lang.String r11 = r0.A0G
            java.lang.String r9 = r0.A0H
            java.lang.String r8 = r0.A0J
            java.lang.Integer r24 = X.AnonymousClass05K.A0N
            java.lang.String r7 = r0.A0I
            X.57K r2 = r0.A02
            X.AnonymousClass7TF.A1D(r13, r10, r12)
            r31 = -1
            X.2qy r1 = new X.2qy
            r18 = r1
            r19 = r0
            r20 = r13
            r21 = r12
            r22 = r0
            r23 = r2
            r25 = r11
            r26 = r9
            r27 = r8
            r28 = r7
            r29 = r16
            r30 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0.A0R = r1
            java.util.List r1 = X.C15690Ugv.A0U
            androidx.fragment.app.FragmentActivity r9 = r0.requireActivity()
            android.content.Context r10 = r0.requireContext()
            com.instagram.common.session.UserSession r7 = r0.A00
            java.lang.String r2 = r0.A0J
            X.Ugv r1 = new X.Ugv
            r8 = r1
            r11 = r0
            r12 = r7
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            r0.A0N = r1
            r0.registerLifecycleListener(r1)
            com.instagram.common.session.UserSession r7 = r0.A00
            X.1Xj r1 = r0.A01
            if (r1 == 0) goto L_0x02ae
            X.C231122qu.A07(r7, r1)
        L_0x02ae:
            X.1Xj r2 = r0.A01
            if (r2 == 0) goto L_0x02b7
            com.instagram.common.session.UserSession r1 = r0.A00
            X.C231122qu.A0F(r1, r2)
        L_0x02b7:
            X.2el r1 = r0.A0L
            X.Ugo r11 = new X.Ugo
            r11.<init>(r0, r7, r1)
            r0.registerLifecycleListener(r11)
            android.content.Context r19 = r0.requireContext()
            X.Wej r1 = r0.A0C
            r20 = r1
            X.UlT r29 = new X.UlT
            r29.<init>()
            com.instagram.common.session.UserSession r1 = r0.A00
            r18 = r1
            X.57K r15 = r0.A02
            X.1Xj r14 = r0.A01
            com.instagram.user.model.User r1 = r0.A0D
            java.lang.String r32 = X.C13988Tno.A0b(r1)
            X.UzB r13 = r0.A04
            X.X8e r10 = r0.A08
            X.Vao r9 = r0.A06
            com.instagram.model.shopping.productfeed.ProductCollectionHeader r8 = r0.A03
            X.57K r2 = r0.A02
            X.57K r1 = X.AnonymousClass57K.AT_SHOP
            com.instagram.common.session.UserSession r12 = r0.A00
            X.0Tu r7 = X.0Tu.A05
            if (r2 != r1) goto L_0x03de
            r1 = 36310967780442507(0x8100a20001018b, double:3.0265404646587035E-306)
        L_0x02f3:
            boolean r34 = X.DbY.A1Y(r7, r12, r1)
            java.lang.String r2 = r0.A0I
            X.UdX r1 = new X.UdX
            r26 = r9
            r27 = r10
            r28 = r0
            r30 = r11
            r31 = r20
            r33 = r2
            r20 = r18
            r21 = r14
            r23 = r15
            r24 = r8
            r25 = r13
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0.A05 = r1
            if (r3 == 0) goto L_0x0331
            java.util.List r2 = r3.A03
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.A01(r2)
            X.UdX r1 = r0.A05
            r1.A00()
            java.util.List r1 = r3.A03
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.A01(r1)
        L_0x0331:
            X.VcW r8 = r0.A0A
            X.UzB r2 = r8.A02
            X.UzB r3 = X.C16675UzB.PRODUCT_COLLECTION
            if (r2 == r3) goto L_0x033d
            X.UzB r1 = X.C16675UzB.PRODUCT_INSTANT_COLLECTION
            if (r2 != r1) goto L_0x038f
        L_0x033d:
            com.instagram.common.session.UserSession r8 = r8.A01
            r1 = 36311835363771167(0x81016c0000031f, double:3.027089127849226E-306)
            boolean r1 = X.182.A06(r7, r8, r1)
            if (r1 == 0) goto L_0x038f
            X.3kF r18 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r19 = r0.getActivity()
            r19.getClass()
            com.instagram.common.session.UserSession r8 = r0.A00
            java.lang.String r7 = r0.A0J
            java.lang.String r24 = r0.getModuleName()
            X.VcW r1 = r0.A0A
            X.UzB r1 = r1.A02
            int r2 = r1.ordinal()
            r1 = 6
            if (r2 == r1) goto L_0x03db
            r1 = 8
            if (r2 == r1) goto L_0x03db
            r25 = 0
        L_0x036c:
            r25.getClass()
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.String r1 = r0.A0T
            java.lang.String r26 = X.C231122qu.A0I(r2, r1)
            java.lang.String r2 = r0.A0T
            X.VhM r1 = r0.A0P
            r20 = r8
            r21 = r16
            r22 = r1
            r23 = r7
            r27 = r2
            r28 = r16
            r29 = r16
            X.6xe r1 = r18.A0Q(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0.A0O = r1
        L_0x038f:
            android.os.Bundle r2 = r0.requireArguments()
            java.lang.String r1 = "show_wishlist_icon"
            boolean r1 = r2.getBoolean(r1)
            if (r1 == 0) goto L_0x03b6
            com.instagram.common.session.UserSession r2 = r0.A00
            androidx.fragment.app.FragmentActivity r9 = r0.requireActivity()
            java.lang.String r12 = r0.getModuleName()
            android.content.Context r8 = r0.requireContext()
            java.lang.String r1 = r0.A0J
            X.Vi2 r7 = new X.Vi2
            r10 = r2
            r11 = r16
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.A0M = r7
        L_0x03b6:
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = r0.A00
            X.Vkr r1 = new X.Vkr
            r1.<init>(r7, r2, r0, r0)
            r0.A09 = r1
            com.instagram.common.session.UserSession r1 = r0.A00
            X.1Ng r7 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.3DT> r2 = X.AnonymousClass3DT.class
            X.1wn r1 = r0.A0b
            r7.A01(r1, r2)
            java.lang.Class<X.WQJ> r2 = X.WQJ.class
            X.1wn r1 = r0.A0a
            r7.A01(r1, r2)
            X.Vao r7 = r0.A06
            monitor-enter(r7)
            goto L_0x03f5
        L_0x03db:
            java.lang.String r25 = "product_collection_page"
            goto L_0x036c
        L_0x03de:
            r1 = 36310967780376970(0x8100a20000018a, double:3.0265404646172576E-306)
            goto L_0x02f3
        L_0x03e5:
            r5 = 0
            goto L_0x018d
        L_0x03e8:
            r3 = 0
            r5 = 0
            goto L_0x018d
        L_0x03ec:
            r2 = 0
            goto L_0x016e
        L_0x03ef:
            java.lang.String r1 = r3.getString(r2)
            goto L_0x0028
        L_0x03f5:
            X.UzB r2 = r7.A01     // Catch:{ all -> 0x044d }
            if (r2 == r3) goto L_0x03fe
            X.UzB r1 = X.C16675UzB.PRODUCT_INSTANT_COLLECTION     // Catch:{ all -> 0x044d }
            if (r2 == r1) goto L_0x03fe
            goto L_0x0435
        L_0x03fe:
            java.util.Set r9 = r7.A05     // Catch:{ all -> 0x044d }
            r8 = 37355530(0x23a000a, float:1.3665133E-37)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x044d }
            boolean r1 = r9.contains(r3)     // Catch:{ all -> 0x044d }
            if (r1 == 0) goto L_0x0414
            X.02m r2 = r7.A00     // Catch:{ all -> 0x044d }
            r1 = 111(0x6f, float:1.56E-43)
            r2.markerEnd(r8, r1)     // Catch:{ all -> 0x044d }
        L_0x0414:
            r9.add(r3)     // Catch:{ all -> 0x044d }
            X.02m r3 = r7.A00     // Catch:{ all -> 0x044d }
            r3.markerStart(r8)     // Catch:{ all -> 0x044d }
            java.lang.String r1 = r7.A04     // Catch:{ all -> 0x044d }
            if (r1 == 0) goto L_0x0423
            r3.markerAnnotate(r8, r6, r1)     // Catch:{ all -> 0x044d }
        L_0x0423:
            java.lang.String r2 = r7.A02     // Catch:{ all -> 0x044d }
            if (r2 == 0) goto L_0x042c
            java.lang.String r1 = "ad_id"
            r3.markerAnnotate(r8, r1, r2)     // Catch:{ all -> 0x044d }
        L_0x042c:
            java.lang.String r2 = r7.A03     // Catch:{ all -> 0x044d }
            if (r2 == 0) goto L_0x0435
            java.lang.String r1 = "merchant_id"
            r3.markerAnnotate(r8, r1, r2)     // Catch:{ all -> 0x044d }
        L_0x0435:
            monitor-exit(r7)
            X.Wej r2 = r0.A0C
            boolean r1 = X.DbW.A1a(r5)
            r2.A01(r1, r4)
            X.X8e r0 = r0.A08
            r0.FKG()
            r1 = -150377185(0xfffffffff7096d1f, float:-2.7873356E33)
            r0 = r17
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x044d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0450:
            java.lang.String r0 = "Cannot parse product feed type = "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1632998409);
        this.mRefreshableContainer = (RefreshableNestedScrollingParent) layoutInflater.inflate(R.layout.layout_refreshable_recyclerview, viewGroup, false);
        if (viewGroup != null && this.A04 == C16675UzB.PRODUCT_INSTANT_COLLECTION) {
            View inflate = DbV.A0D(viewGroup).inflate(R.layout.layout_sticky_footer, viewGroup, false);
            this.mFooterContainer = inflate;
            this.mFooterBtn = (IgdsBottomButtonLayout) inflate.findViewById(R.id.product_collection_footer_cta_btn);
        }
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        refreshableNestedScrollingParent.A07 = new C19764Wf5(this, 1);
        C13990Tnq.A1O(refreshableNestedScrollingParent);
        this.mRecyclerView = DbX.A0K(this.mRefreshableContainer);
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(requireContext());
        fastScrollingLinearLayoutManager.A0v(true);
        this.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.A05);
        this.mRecyclerView.setItemAnimator((AnonymousClass3AS) null);
        this.mRecyclerView.A15(new C3251871j(fastScrollingLinearLayoutManager, this.A0C, C3251771i.A0B));
        this.mRecyclerView.A15(this.A0Z);
        this.mRecyclerView.setClipToPadding(false);
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.getClass();
        Integer num = this.A0E;
        if (num != null) {
            recyclerView.A0o(num.intValue() / 2);
            this.A0E = null;
        }
        this.A0P.A00();
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        AnonymousClass0fD.A09(-208486726, A022);
        return refreshableNestedScrollingParent2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-219948154);
        super.onDestroy();
        AnonymousClass57K r7 = this.A02;
        String str = this.A0I;
        if (!(str == null || r7 == null)) {
            C18802W2p w2p = this.A07;
            String str2 = this.A0F;
            0Aj A0e = AnonymousClass7TE.A0e(w2p.A02, "instagram_shopping_product_collection_page_exit");
            if (A0e.isSampled()) {
                C13988Tno.A17(A0e, C18802W2p.A02(w2p, (String) null));
                C18802W2p.A04(C18802W2p.A03(A0e, r7, w2p, str, str2), A0e, w2p);
            }
        }
        1Ng A002 = AnonymousClass1Nd.A00(this.A00);
        A002.A02(this.A0b, AnonymousClass3DT.class);
        A002.A02(this.A0a, WQJ.class);
        AnonymousClass0fD.A09(-593255141, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-8683268);
        super.onDestroyView();
        ProductCollectionFragmentLifecycleUtil.cleanupReferences(this);
        C17869VhM vhM = this.A0P;
        vhM.A01.flowEndSuccess(vhM.A00);
        AnonymousClass0fD.A09(2000921421, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1377056836);
        ProductCollectionFragment.super.onPause();
        this.A09.A02("fragment_paused");
        C17596Vao vao = this.A06;
        synchronized (vao) {
            Set set = vao.A05;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                vao.A00.markerEnd(AnonymousClass7TG.A0F(it), 22);
            }
            set.clear();
        }
        AnonymousClass0fD.A09(369709597, A022);
    }

    public final void onResume() {
        0hq r0;
        int A022 = AnonymousClass0fD.A02(-1690166350);
        super.onResume();
        if (this.A0K && this.A05.isEmpty() && (r0 = this.mFragmentManager) != null) {
            r0.A0c();
        }
        C16675UzB uzB = this.A04;
        FragmentActivity activity = getActivity();
        Context context = getContext();
        String moduleName = getModuleName();
        1Xj r7 = this.A01;
        UserSession userSession = this.A00;
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        C17072VGu.A00(context, this.mFooterContainer, this.mRecyclerView, activity, userSession, r7, this.mFooterBtn, this.A05.A00, uzB, refreshableNestedScrollingParent, moduleName);
        AnonymousClass0fD.A09(-1188672351, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        2el r2 = this.A0L;
        if (r2 != null) {
            r2.A06(this.mRecyclerView, AnonymousClass3DZ.A00(this));
        }
    }
}
