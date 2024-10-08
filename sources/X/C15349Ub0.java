package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ub0  reason: case insensitive filesystem */
public final class C15349Ub0 extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DV, AnonymousClass4DR, C21000X8x, AnonymousClass4DS, AnonymousClass32J, C20931X4w {
    public static final String __redex_internal_original_name = "FeaturedProductsMediaFeedGridFragment";
    public AnonymousClass3AD A00;
    public RecyclerView A01;
    public RefreshableNestedScrollingParent A02;
    public final AnonymousClass32Q A03 = AnonymousClass32Q.A00;
    public final List A04 = new ArrayList();
    public final Map A05 = new LinkedHashMap();
    public final AnonymousClass0eM A06 = C20697WxT.A00(this, 47);
    public final AnonymousClass0eM A07 = C20697WxT.A00(this, 48);
    public final AnonymousClass0eM A08 = C20697WxT.A00(this, 49);
    public final AnonymousClass0eM A09 = C20692WxO.A00(this, 0);
    public final AnonymousClass0eM A0A = C20692WxO.A00(this, 1);
    public final AnonymousClass0eM A0B = C20692WxO.A00(this, 2);
    public final AnonymousClass0eM A0C = C20692WxO.A00(this, 3);
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final AnonymousClass0eM A0E = C20692WxO.A00(this, 4);
    public final AnonymousClass0eM A0F = C20692WxO.A00(this, 5);
    public final AnonymousClass0eM A0G = C20692WxO.A00(this, 6);
    public final 1wn A0H = new C19221WQb(this, 60);

    public final void DIH(View view, 1Xj r22, int i) {
        1Xj r3 = r22;
        0qQ.A0B(r3, 0);
        AnonymousClass0eM r6 = this.A0D;
        C268344dE A002 = C268334dD.A00(AnonymousClass7TE.A0l(r6));
        List list = this.A04;
        ArrayList<1Xg> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((1Xg) next).A06 == 1UQ.A0d) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (1Xg r0 : arrayList) {
            AnonymousClass1Xn r1 = r0.A05;
            0qQ.A0C(r1, AnonymousClass000.A00(37));
            if (r1 != null) {
                arrayList2.add(r1);
            }
        }
        A002.A00(00k.A0j(arrayList2));
        C249713kF r7 = C249713kF.A00;
        FragmentActivity requireActivity = requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(r6);
        AnonymousClass0eM r12 = this.A08;
        String str = ((FeaturedProductMediaFeedGridConfiguration) r12.getValue()).A06;
        String str2 = ((FeaturedProductMediaFeedGridConfiguration) r12.getValue()).A00;
        String str3 = ((FeaturedProductMediaFeedGridConfiguration) r12.getValue()).A04;
        String str4 = ((C19742Wej) this.A0E.getValue()).A01.A03.A07;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13992Tns.A1A(arrayList3, it);
        }
        String id = r3.getId();
        if (id != null) {
            r7.A0y(requireActivity, A0l, this, (ProductDetailsPageLoggingInfo) this.A0B.getValue(), str, str2, str3, str4, id, (String) null, DbS.A0t(this.A0F), arrayList3);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String getModuleName() {
        return "instagram_shopping_media_grid";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A02;
        String str = "refreshableContainer";
        if (refreshableNestedScrollingParent != null) {
            C13990Tnq.A1O(refreshableNestedScrollingParent);
            AnonymousClass0eM r5 = this.A0D;
            this.A00 = C3253672c.A01(view, AnonymousClass7TE.A0l(r5), new C19760Wf1(this, 8));
            RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.A02;
            if (refreshableNestedScrollingParent2 != null) {
                RecyclerView A0G2 = C13990Tnq.A0G(refreshableNestedScrollingParent2);
                FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext(), 3);
                fastScrollingGridLayoutManager.A01 = new U9T(this, 6);
                A0G2.setLayoutManager(fastScrollingGridLayoutManager);
                AnonymousClass0eM r4 = this.A06;
                Dba.A17(A0G2, r4);
                JTQ.A0y(A0G2.A0D, A0G2, new WWL(this, 6), C3251771i.A0D);
                this.A01 = A0G2;
                if (getScrollingViewProxy() instanceof C238143As) {
                    boolean A1a = C13991Tnr.A1a(r5);
                    C238133Ar scrollingViewProxy = getScrollingViewProxy();
                    0qQ.A0C(scrollingViewProxy, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
                    C238143As r3 = (C238143As) scrollingViewProxy;
                    if (A1a) {
                        AnonymousClass3AD r2 = this.A00;
                        str = "pullToRefresh";
                        if (r2 != null) {
                            C18948WEb.A00(r3, (C19763Wf4) r2, r2, this, 5);
                        }
                    } else {
                        r3.ErF(new C20076Wka(this));
                    }
                }
                ((C54225H3u) r4.getValue()).A00();
                C19611Wca.A00(this.A09);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final ArrayList A00() {
        AnonymousClass1Xn A022;
        ArrayList arrayList = new ArrayList();
        for (1Xg r2 : this.A04) {
            int ordinal = r2.A06.ordinal();
            if (ordinal == 1) {
                A022 = 1Xi.A02(r2.A05);
                if (A022 == null) {
                }
            } else if (ordinal == 33) {
                A022 = r2.A05;
                0qQ.A0C(A022, AnonymousClass000.A00(37));
            }
            arrayList.add(A022);
        }
        return arrayList;
    }

    public final 1NY Abz() {
        1NY A0b = AnonymousClass7TG.A0b(DbT.A0X(this.A0D));
        AnonymousClass0eM r1 = this.A08;
        A0b.A0A(((FeaturedProductMediaFeedGridConfiguration) r1.getValue()).A00);
        A0b.A9m("merchant_id", ((FeaturedProductMediaFeedGridConfiguration) r1.getValue()).A04);
        A0b.A0Q(CGN.class, D1E.class);
        return A0b;
    }

    public final void DkK(C268654dm r3, boolean z) {
        AnonymousClass3AD r1 = this.A00;
        if (r1 == null) {
            0qQ.A0F("pullToRefresh");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.setIsLoading(false);
        C19611Wca.A00(this.A09);
        ((C54225H3u) this.A06.getValue()).A00();
        C13991Tnr.A0x(this);
    }

    public final void DkL() {
        C19611Wca.A00(this.A09);
        ((C54225H3u) this.A06.getValue()).A00();
    }

    public final /* bridge */ /* synthetic */ void DkM(AnonymousClass1XV r4, boolean z, boolean z2) {
        CGN cgn = (CGN) r4;
        0qQ.A0B(cgn, 0);
        AnonymousClass3AD r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("pullToRefresh");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.setIsLoading(false);
        if (z) {
            this.A04.clear();
        }
        if (cgn.A05 == null) {
            DbT.A1Q(0wj.A01, "Received null FeedItem list from MediaFeedResponse payload on IG Shopping featured product Grid Fragment", 817903268);
        }
        List list = cgn.A05;
        if (list != null) {
            this.A04.addAll(list);
        }
        ((C54225H3u) this.A06.getValue()).A01(A00());
        C19611Wca.A00(this.A09);
        C13990Tnq.A1V(this.A07);
    }

    public final void FKH() {
        ((C54225H3u) this.A06.getValue()).A00();
    }

    public final C238133Ar getScrollingViewProxy() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        }
        C238133Ar A002 = C238103Ao.A00(recyclerView);
        0qQ.A07(A002);
        return A002;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(this.A04.size());
    }

    public final boolean onBackPressed() {
        return ((AnonymousClass2uE) this.A0C.getValue()).onBackPressed();
    }

    public final boolean DII(MotionEvent motionEvent, View view, AnonymousClass1Xq r4, int i) {
        AnonymousClass7TG.A1T(view, motionEvent, r4);
        return ((AnonymousClass2uE) this.A0C.getValue()).Dsa(motionEvent, view, r4, i);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(((FeaturedProductMediaFeedGridConfiguration) this.A08.getValue()).A06);
    }

    public final void onCreate(Bundle bundle) {
        C14930UFt uFt;
        int A022 = AnonymousClass0fD.A02(746452643);
        C15349Ub0.super.onCreate(bundle);
        List list = ((FeaturedProductMediaFeedGridConfiguration) this.A08.getValue()).A07;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                1Xj A023 = DbX.A0d(this.A0D).A02(AnonymousClass7TE.A18(it));
                if (A023 != null) {
                    this.A04.add(1Xi.A01(A023));
                }
            }
        }
        if (!this.A04.isEmpty()) {
            ((C54225H3u) this.A06.getValue()).A01(A00());
        } else {
            ((C19742Wej) this.A0E.getValue()).A01(true, false);
        }
        C13990Tnq.A1E(this, this.A0A);
        C13990Tnq.A1D(this, this.A07);
        C13990Tnq.A1D(this, this.A0C);
        DbX.A0R(this.A0D).A01(this.A0H, C19218WPy.class);
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A0G.getValue(), "instagram_shopping_media_grid_entry");
        AnonymousClass327 A062 = C13992Tns.A06(this);
        A062.A06("prior_submodule", requireArguments().getString("prior_submodule_name"));
        C13989Tnp.A1E(A0e, A062, DbS.A0t(this.A0F));
        ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo = (ProductDetailsPageLoggingInfo) this.A0B.getValue();
        if (productDetailsPageLoggingInfo != null) {
            uFt = productDetailsPageLoggingInfo.A00();
        } else {
            uFt = null;
        }
        A0e.AAK(uFt, "pdp_logging_info");
        A0e.Cgf();
        AnonymousClass0fD.A09(293679993, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A0F2;
        View view;
        int A022 = AnonymousClass0fD.A02(-609716038);
        0qQ.A0B(layoutInflater, 0);
        if (C13991Tnr.A1a(this.A0D)) {
            A0F2 = layoutInflater.inflate(R.layout.layout_swipe_refresh_hscroll_recyclerview, viewGroup, false);
            view = A0F2.findViewById(R.id.refreshable_container);
        } else {
            A0F2 = C13990Tnq.A0F(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview);
            view = A0F2;
        }
        this.A02 = (RefreshableNestedScrollingParent) view;
        0qQ.A0A(A0F2);
        AnonymousClass0fD.A09(-351631623, A022);
        return A0F2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1380924713);
        super.onDestroy();
        C13990Tnq.A1G(this, this.A0A);
        C13990Tnq.A1F(this, this.A07);
        C13990Tnq.A1F(this, this.A0C);
        DbX.A0R(this.A0D).A02(this.A0H, C19218WPy.class);
        AnonymousClass0fD.A09(-470494485, A022);
    }
}
