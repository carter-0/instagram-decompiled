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

/* renamed from: X.Uaz  reason: case insensitive filesystem */
public final class C15348Uaz extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DV, AnonymousClass4DR, C21000X8x, AnonymousClass4DS, AnonymousClass32J, C20931X4w {
    public static final String __redex_internal_original_name = "FeaturedProductMediaFeedGridFragment";
    public AnonymousClass3AD A00;
    public RecyclerView A01;
    public RefreshableNestedScrollingParent A02;
    public final AnonymousClass32Q A03 = AnonymousClass32Q.A00;
    public final List A04 = new ArrayList();
    public final Map A05 = new LinkedHashMap();
    public final AnonymousClass0eM A06 = C20697WxT.A00(this, 20);
    public final AnonymousClass0eM A07 = C20697WxT.A00(this, 21);
    public final AnonymousClass0eM A08 = C20697WxT.A00(this, 22);
    public final AnonymousClass0eM A09 = C20697WxT.A00(this, 23);
    public final AnonymousClass0eM A0A = C20697WxT.A00(this, 24);
    public final AnonymousClass0eM A0B = C20697WxT.A00(this, 25);
    public final AnonymousClass0eM A0C = C20697WxT.A00(this, 26);
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final AnonymousClass0eM A0E = C20697WxT.A00(this, 27);
    public final AnonymousClass0eM A0F = C20697WxT.A00(this, 28);
    public final AnonymousClass0eM A0G = C20697WxT.A00(this, 29);
    public final 1wn A0H = new C19221WQb(this, 59);

    public final void DIH(View view, 1Xj r18, int i) {
        1Xj r1 = r18;
        0qQ.A0B(r1, 0);
        C249713kF r3 = C249713kF.A00;
        FragmentActivity requireActivity = requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(this.A0D);
        AnonymousClass0eM r2 = this.A08;
        String str = ((FeaturedProductMediaFeedGridConfiguration) r2.getValue()).A06;
        String str2 = ((FeaturedProductMediaFeedGridConfiguration) r2.getValue()).A00;
        String str3 = ((FeaturedProductMediaFeedGridConfiguration) r2.getValue()).A04;
        String str4 = ((C19742Wej) this.A0E.getValue()).A01.A03.A07;
        ArrayList A0U = 00k.A0U(this.A04);
        String id = r1.getId();
        if (id != null) {
            r3.A0x(requireActivity, A0l, this, (ProductDetailsPageLoggingInfo) this.A0B.getValue(), str, str2, str3, str4, id, (String) null, DbS.A0t(this.A0F), A0U);
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
            AnonymousClass0eM r6 = this.A0D;
            this.A00 = C3253672c.A01(view, AnonymousClass7TE.A0l(r6), new C19760Wf1(this, 6));
            RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.A02;
            if (refreshableNestedScrollingParent2 != null) {
                RecyclerView A0G2 = C13990Tnq.A0G(refreshableNestedScrollingParent2);
                FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext(), 3);
                fastScrollingGridLayoutManager.A01 = new U9T(this, 5);
                A0G2.setLayoutManager(fastScrollingGridLayoutManager);
                AnonymousClass0eM r3 = this.A06;
                Dba.A17(A0G2, r3);
                JTQ.A0y(A0G2.A0D, A0G2, new WWL(this, 5), C3251771i.A0D);
                this.A01 = A0G2;
                if (getScrollingViewProxy() instanceof C238143As) {
                    boolean A1a = C13991Tnr.A1a(r6);
                    C238133Ar scrollingViewProxy = getScrollingViewProxy();
                    0qQ.A0C(scrollingViewProxy, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
                    C238143As r2 = (C238143As) scrollingViewProxy;
                    if (A1a) {
                        AnonymousClass3AD r1 = this.A00;
                        str = "pullToRefresh";
                        if (r1 != null) {
                            C18948WEb.A00(r2, (C19763Wf4) r1, r1, this, 3);
                        }
                    } else {
                        r2.ErF(new C20074WkY(this));
                    }
                }
                ((C15479UdU) r3.getValue()).A01();
                C19611Wca.A00(this.A09);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1NY Abz() {
        1NY A0b = AnonymousClass7TG.A0b(DbT.A0X(this.A0D));
        AnonymousClass0eM r1 = this.A08;
        A0b.A0A(((FeaturedProductMediaFeedGridConfiguration) r1.getValue()).A00);
        A0b.A9m("merchant_id", ((FeaturedProductMediaFeedGridConfiguration) r1.getValue()).A04);
        A0b.A0Q(1XO.class, 1XW.class);
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
        C15479UdU.A00(this);
        C13991Tnr.A0x(this);
    }

    public final void DkL() {
        C19611Wca.A00(this.A09);
        C15479UdU.A00(this);
    }

    public final /* bridge */ /* synthetic */ void DkM(AnonymousClass1XV r4, boolean z, boolean z2) {
        1XO r42 = (1XO) r4;
        0qQ.A0B(r42, 0);
        AnonymousClass3AD r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("pullToRefresh");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.setIsLoading(false);
        if (z) {
            this.A04.clear();
        }
        List list = this.A04;
        List list2 = r42.A06;
        0qQ.A07(list2);
        list.addAll(list2);
        C15479UdU udU = (C15479UdU) this.A06.getValue();
        C273674n0 r02 = udU.A00;
        r02.A04();
        r02.A0A(list);
        udU.A01();
        C19611Wca.A00(this.A09);
        C13990Tnq.A1V(this.A07);
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

    public final void FKH() {
        C15479UdU.A00(this);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(((FeaturedProductMediaFeedGridConfiguration) this.A08.getValue()).A06);
    }

    public final void onCreate(Bundle bundle) {
        C14930UFt uFt;
        int A022 = AnonymousClass0fD.A02(-1489669966);
        C15348Uaz.super.onCreate(bundle);
        List list = ((FeaturedProductMediaFeedGridConfiguration) this.A08.getValue()).A07;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                1Xj A023 = DbX.A0d(this.A0D).A02(AnonymousClass7TE.A18(it));
                if (A023 != null) {
                    this.A04.add(A023);
                }
            }
        }
        List list2 = this.A04;
        if (!list2.isEmpty()) {
            C15479UdU udU = (C15479UdU) this.A06.getValue();
            C273674n0 r0 = udU.A00;
            r0.A04();
            r0.A0A(list2);
            udU.A01();
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
        AnonymousClass0fD.A09(1479739108, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A0F2;
        View view;
        int A022 = AnonymousClass0fD.A02(-1439607530);
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
        AnonymousClass0fD.A09(221618216, A022);
        return A0F2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1901009089);
        super.onDestroy();
        C13990Tnq.A1G(this, this.A0A);
        C13990Tnq.A1F(this, this.A07);
        C13990Tnq.A1F(this, this.A0C);
        DbX.A0R(this.A0D).A02(this.A0H, C19218WPy.class);
        AnonymousClass0fD.A09(-1021409984, A022);
    }
}
