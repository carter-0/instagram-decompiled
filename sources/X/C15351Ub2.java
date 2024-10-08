package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ub2  reason: case insensitive filesystem */
public final class C15351Ub2 extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DV, C21000X8x, AnonymousClass4DS, XCB {
    public static final String __redex_internal_original_name = "FeaturedProductMediaFeedListFragment";
    public AnonymousClass3AD A00;
    public boolean A01;
    public RecyclerView A02;
    public RefreshableNestedScrollingParent A03;
    public final 2el A04 = 2el.A00();
    public final C228172ku A05 = new C228172ku();
    public final List A06 = new ArrayList();
    public final AnonymousClass0eM A07 = C20697WxT.A00(this, 30);
    public final AnonymousClass0eM A08 = C20697WxT.A00(this, 31);
    public final AnonymousClass0eM A09 = C20697WxT.A00(this, 32);
    public final AnonymousClass0eM A0A = C20697WxT.A00(this, 33);
    public final AnonymousClass0eM A0B = C20697WxT.A00(this, 34);
    public final AnonymousClass0eM A0C = C20697WxT.A00(this, 35);
    public final AnonymousClass0eM A0D = C20697WxT.A00(this, 36);
    public final AnonymousClass0eM A0E = C20697WxT.A00(this, 37);
    public final AnonymousClass0eM A0F = C20697WxT.A00(this, 38);
    public final AnonymousClass0eM A0G = C20697WxT.A00(this, 39);
    public final AnonymousClass0eM A0H = C20697WxT.A00(this, 40);
    public final AnonymousClass0eM A0I = C20697WxT.A00(this, 41);
    public final AnonymousClass0eM A0J = C227642jf.A02(this);
    public final AnonymousClass0eM A0K = C20697WxT.A00(this, 42);
    public final AnonymousClass0eM A0L = C20697WxT.A00(this, 43);
    public final AnonymousClass0eM A0M = C20697WxT.A00(this, 44);
    public final AnonymousClass0eM A0N = C20697WxT.A00(this, 45);
    public final AnonymousClass0eM A0O = C20697WxT.A00(this, 46);

    public final void DkL() {
    }

    public final String getModuleName() {
        return "instagram_shopping_media_contextual_feed";
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
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A03;
        String str = "refreshableContainer";
        if (refreshableNestedScrollingParent != null) {
            C13990Tnq.A1O(refreshableNestedScrollingParent);
            AnonymousClass0eM r3 = this.A0J;
            this.A00 = C3253672c.A01(view, AnonymousClass7TE.A0l(r3), new C19760Wf1(this, 7));
            RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.A03;
            if (refreshableNestedScrollingParent2 != null) {
                RecyclerView A0F2 = DbZ.A0F(refreshableNestedScrollingParent2, 16908298);
                this.A02 = A0F2;
                str = "recyclerView";
                if (A0F2 != null) {
                    A0F2.A15(this.A05);
                    AnonymousClass0eM r7 = this.A07;
                    Dba.A17(A0F2, r7);
                    A0F2.setItemAnimator((AnonymousClass3AS) null);
                    DbU.A15(requireContext(), A0F2, 1, false);
                    A0F2.A15((C249403jg) this.A09.getValue());
                    C19742Wej wej = (C19742Wej) this.A0K.getValue();
                    C3251771i r1 = C3251771i.A0A;
                    RecyclerView recyclerView = this.A02;
                    if (recyclerView != null) {
                        JTQ.A0y(recyclerView.A0D, A0F2, wej, r1);
                        if (getScrollingViewProxy() instanceof C238143As) {
                            boolean A1a = C13991Tnr.A1a(r3);
                            C238133Ar scrollingViewProxy = getScrollingViewProxy();
                            0qQ.A0C(scrollingViewProxy, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
                            C238143As r32 = (C238143As) scrollingViewProxy;
                            if (A1a) {
                                AnonymousClass3AD r2 = this.A00;
                                if (r2 == null) {
                                    0qQ.A0F("pullToRefresh");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                C18948WEb.A00(r32, (C19763Wf4) r2, r2, this, 4);
                            } else {
                                r32.ErF(new C20075WkZ(this));
                            }
                        }
                        2el r33 = this.A04;
                        AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
                        RecyclerView recyclerView2 = this.A02;
                        if (recyclerView2 != null) {
                            r33.A08(recyclerView2, A002, new AnonymousClass2eo[0]);
                            if (!((2Rv) r7.getValue()).isEmpty() && !this.A01) {
                                AnonymousClass0eM r12 = this.A0I;
                                if (DbS.A0t(r12).length() > 0) {
                                    this.A01 = true;
                                    C238133Ar scrollingViewProxy2 = getScrollingViewProxy();
                                    String A0t = DbS.A0t(r12);
                                    int count = ((2Rv) r7.getValue()).getCount();
                                    int i = 0;
                                    while (true) {
                                        if (i >= count) {
                                            i = 0;
                                            break;
                                        }
                                        Object item = ((2Ru) r7.getValue()).getItem(i);
                                        if (item instanceof 1Xj) {
                                            1Xj r13 = (1Xj) item;
                                            if (0qQ.A0K(r13.getId(), A0t)) {
                                                break;
                                            }
                                            String id = r13.getId();
                                            if (id == null) {
                                                throw AnonymousClass7TE.A0y();
                                            } else if (0qQ.A0K(AnonymousClass3VO.A02(id), AnonymousClass3VO.A02(A0t))) {
                                                break;
                                            }
                                        }
                                        i++;
                                    }
                                    scrollingViewProxy2.Ejm(i, 0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void AAk(Object obj) {
        0eP r2 = (0eP) obj;
        0qQ.A0B(r2, 0);
        ((C18558VuA) this.A0O.getValue()).A01(r2);
    }

    public final /* bridge */ /* synthetic */ void AAl(Object obj, Object obj2) {
        ((C18558VuA) this.A0O.getValue()).A01((0eP) obj);
    }

    public final 1NY Abz() {
        1NY A0b = AnonymousClass7TG.A0b(DbT.A0X(this.A0J));
        A0b.A0A(DbS.A0t(this.A08));
        A0b.A9m("merchant_id", DbS.A0t(this.A0E));
        A0b.A0Q(1XO.class, 1XW.class);
        return A0b;
    }

    public final void DgE(C42130BIj bIj) {
        ProductDetailsProductItemDict productDetailsProductItemDict = bIj.A01;
        if (productDetailsProductItemDict != null) {
            FragmentActivity requireActivity = requireActivity();
            Product A002 = C14502TxO.A00(productDetailsProductItemDict);
            WNN.A01(C249713kF.A00.A0L(requireActivity, AnonymousClass7TE.A0l(this.A0J), this, A002, AnonymousClass000.A00(1349), DbS.A0t(this.A0L)));
        }
    }

    public final void DkK(C268654dm r3, boolean z) {
        AnonymousClass3AD r1 = this.A00;
        if (r1 == null) {
            0qQ.A0F("pullToRefresh");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.setIsLoading(false);
        C13991Tnr.A0x(this);
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
            this.A06.clear();
        }
        List list = this.A06;
        List list2 = r42.A06;
        0qQ.A07(list2);
        list.addAll(list2);
        C15489Ude ude = (C15489Ude) this.A07.getValue();
        C273674n0 r02 = ude.A02;
        r02.A04();
        r02.A0A(list);
        ude.A00();
        C13990Tnq.A1V(this.A0D);
    }

    public final /* bridge */ /* synthetic */ void ECF(View view, Object obj) {
        0eP r6 = (0eP) obj;
        0qQ.A0B(r6, 1);
        C18558VuA vuA = (C18558VuA) this.A0O.getValue();
        View view2 = this.mView;
        JTQ.A1K(view2);
        C13988Tno.A14(view2, vuA.A00, vuA.A01, C18558VuA.A00(r6));
    }

    public final C238133Ar getScrollingViewProxy() {
        RecyclerView recyclerView = this.A02;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        }
        C238133Ar A002 = C238103Ao.A00(recyclerView);
        0qQ.A07(A002);
        return A002;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0J);
    }

    public final boolean isEmpty() {
        return ((2Rv) this.A07.getValue()).isEmpty();
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(DbS.A0t(this.A0M));
    }

    public final void onCreate(Bundle bundle) {
        C14929UFq r2;
        C14930UFt uFt;
        int A022 = AnonymousClass0fD.A02(1405739050);
        C15351Ub2.super.onCreate(bundle);
        C13990Tnq.A1D(this, this.A0D);
        C13990Tnq.A1E(this, this.A0C);
        registerLifecycleListener((AnonymousClass332) this.A09.getValue());
        AbstractCollection abstractCollection = (AbstractCollection) this.A0B.getValue();
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                1Xj A023 = DbX.A0d(this.A0J).A02(AnonymousClass7TE.A18(it));
                if (A023 != null) {
                    this.A06.add(A023);
                }
            }
        }
        List list = this.A06;
        if (!list.isEmpty()) {
            C15489Ude ude = (C15489Ude) this.A07.getValue();
            C273674n0 r0 = ude.A02;
            r0.A04();
            r0.A0A(list);
            ude.A00();
        } else {
            ((C19742Wej) this.A0K.getValue()).A01(true, false);
        }
        AnonymousClass0eM r6 = this.A0I;
        String A0t = DbS.A0t(r6);
        AnonymousClass0eM r7 = this.A0J;
        1Xj A024 = DbX.A0d(r7).A02(A0t);
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A0N.getValue(), "instagram_shopping_media_contextual_feed_entry");
        0bb r22 = new 0bb();
        r22.A06("prior_module", DbS.A0t(this.A0F));
        r22.A06("prior_submodule", DbS.A0t(this.A0G));
        C13989Tnp.A1E(A0e, r22, DbS.A0t(this.A0L));
        if (A024 != null) {
            r2 = C294165ly.A00(AnonymousClass7TE.A0l(r7), A024);
        } else {
            r2 = new 0bb();
            r2.A06("m_pk", DbS.A0t(r6));
        }
        A0e.AAK(r2, "feed_item_info");
        ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo = (ProductDetailsPageLoggingInfo) requireArguments().getParcelable(AnonymousClass000.A00(54));
        if (productDetailsPageLoggingInfo != null) {
            uFt = productDetailsPageLoggingInfo.A00();
        } else {
            uFt = null;
        }
        A0e.AAK(uFt, "pdp_logging_info");
        A0e.Cgf();
        AnonymousClass0fD.A09(702472526, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A0F2;
        View view;
        int A022 = AnonymousClass0fD.A02(817531756);
        0qQ.A0B(layoutInflater, 0);
        if (C13991Tnr.A1a(this.A0J)) {
            A0F2 = layoutInflater.inflate(R.layout.layout_media_feed_swipe_refreshable, viewGroup, false);
            view = A0F2.findViewById(R.id.refreshable_container);
        } else {
            A0F2 = C13990Tnq.A0F(layoutInflater, viewGroup, R.layout.layout_media_feed_refreshable);
            view = A0F2;
        }
        this.A03 = (RefreshableNestedScrollingParent) view;
        0qQ.A0A(A0F2);
        AnonymousClass0fD.A09(-2119341415, A022);
        return A0F2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(997483411);
        super.onDestroy();
        C13990Tnq.A1F(this, this.A0D);
        C13990Tnq.A1G(this, this.A0C);
        unregisterLifecycleListener((AnonymousClass332) this.A09.getValue());
        AnonymousClass0fD.A09(-51414683, A022);
    }
}
