package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ub1  reason: case insensitive filesystem */
public final class C15350Ub1 extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DV, C21000X8x, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FeaturedProductsMediaFeedListFragment";
    public AnonymousClass3AD A00;
    public boolean A01;
    public RecyclerView A02;
    public RefreshableNestedScrollingParent A03;
    public final 2el A04 = 2el.A00();
    public final C228172ku A05 = new C228172ku();
    public final List A06 = new ArrayList();
    public final AnonymousClass0eM A07 = C20692WxO.A00(this, 7);
    public final AnonymousClass0eM A08 = C20692WxO.A00(this, 8);
    public final AnonymousClass0eM A09 = C20692WxO.A00(this, 9);
    public final AnonymousClass0eM A0A = C20692WxO.A00(this, 10);
    public final AnonymousClass0eM A0B = C20692WxO.A00(this, 11);
    public final AnonymousClass0eM A0C = C20692WxO.A00(this, 12);
    public final AnonymousClass0eM A0D = C20692WxO.A00(this, 13);
    public final AnonymousClass0eM A0E = C20692WxO.A00(this, 14);
    public final AnonymousClass0eM A0F = C20692WxO.A00(this, 15);
    public final AnonymousClass0eM A0G = C20692WxO.A00(this, 16);
    public final AnonymousClass0eM A0H = C20692WxO.A00(this, 17);
    public final AnonymousClass0eM A0I = C20692WxO.A00(this, 18);
    public final AnonymousClass0eM A0J = C20692WxO.A00(this, 19);
    public final AnonymousClass0eM A0K = C227642jf.A02(this);
    public final AnonymousClass0eM A0L = C20692WxO.A00(this, 20);
    public final AnonymousClass0eM A0M = C20692WxO.A00(this, 21);
    public final AnonymousClass0eM A0N = C20692WxO.A00(this, 22);
    public final AnonymousClass0eM A0O = C20692WxO.A00(this, 23);
    public final 1wn A0P = new C19221WQb(this, 61);

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
            AnonymousClass0eM r3 = this.A0K;
            this.A00 = C3253672c.A01(view, AnonymousClass7TE.A0l(r3), new C19760Wf1(this, 9));
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
                    C19742Wej wej = (C19742Wej) this.A0L.getValue();
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
                                C18948WEb.A00(r32, (C19763Wf4) r2, r2, this, 6);
                            } else {
                                r32.ErF(new C20077Wkb(this));
                            }
                        }
                        2el r33 = this.A04;
                        AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
                        RecyclerView recyclerView2 = this.A02;
                        if (recyclerView2 != null) {
                            r33.A08(recyclerView2, A002, new AnonymousClass2eo[0]);
                            if (!((2Rv) r7.getValue()).isEmpty() && !this.A01) {
                                AnonymousClass0eM r12 = this.A0J;
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

    private final ArrayList A00() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.A06) {
            if (next instanceof 1Xg) {
                1Xg r2 = (1Xg) next;
                int ordinal = r2.A06.ordinal();
                if (ordinal == 1) {
                    next = 1Xi.A02(r2.A05);
                    if (next == null) {
                    }
                } else if (ordinal == 33) {
                    next = r2.A05;
                    0qQ.A0C(next, AnonymousClass000.A00(37));
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public final 1NY Abz() {
        1NY A0b = AnonymousClass7TG.A0b(DbT.A0X(this.A0K));
        A0b.A0A(DbS.A0t(this.A08));
        A0b.A9m("merchant_id", DbS.A0t(this.A0E));
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
        C13991Tnr.A0x(this);
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
            this.A06.clear();
        }
        if (cgn.A05 == null) {
            DbT.A1Q(0wj.A01, "Received null FeedItem list from MediaFeedResponse payload on IG Shopping featured product media feed list Fragment", 817903268);
        }
        List list = cgn.A05;
        if (list != null) {
            this.A06.addAll(list);
        }
        ((C54230H3z) this.A07.getValue()).A01(A00());
        C13990Tnq.A1V(this.A0D);
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
        return DbS.A0T(this.A0K);
    }

    public final boolean isEmpty() {
        return ((2Rv) this.A07.getValue()).isEmpty();
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(DbS.A0t(this.A0N));
    }

    public final void onCreate(Bundle bundle) {
        C14929UFq r2;
        C14930UFt uFt;
        int A022 = AnonymousClass0fD.A02(-536550778);
        C15350Ub1.super.onCreate(bundle);
        AnonymousClass0eM r5 = this.A0K;
        DbX.A0R(r5).A01(this.A0P, AnonymousClass3DT.class);
        C13990Tnq.A1D(this, this.A0D);
        C13990Tnq.A1E(this, this.A0C);
        registerLifecycleListener((AnonymousClass332) this.A09.getValue());
        AbstractCollection abstractCollection = (AbstractCollection) this.A0B.getValue();
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                1Xj A023 = DbX.A0d(r5).A02(AnonymousClass7TE.A18(it));
                if (A023 != null) {
                    List list = this.A06;
                    list.add(A023);
                    C268344dE A002 = C268334dD.A00(AnonymousClass7TE.A0l(r5));
                    String A2n = A023.A2n();
                    if (A2n != null) {
                        Object obj = A002.A00.get(A2n);
                        if (obj != null) {
                            list.add(obj);
                        }
                    } else {
                        IllegalStateException A0y = AnonymousClass7TE.A0y();
                        AnonymousClass0fD.A09(281052791, A022);
                        throw A0y;
                    }
                }
            }
        }
        if (!this.A06.isEmpty()) {
            ((C54230H3z) this.A07.getValue()).A01(A00());
        } else {
            ((C19742Wej) this.A0L.getValue()).A01(true, false);
        }
        AnonymousClass0eM r7 = this.A0J;
        1Xj A024 = DbX.A0d(r5).A02(DbS.A0t(r7));
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A0O.getValue(), "instagram_shopping_media_contextual_feed_entry");
        0bb r22 = new 0bb();
        r22.A06("prior_module", DbS.A0t(this.A0F));
        r22.A06("prior_submodule", DbS.A0t(this.A0G));
        C13989Tnp.A1E(A0e, r22, DbS.A0t(this.A0M));
        if (A024 != null) {
            r2 = C294165ly.A00(AnonymousClass7TE.A0l(r5), A024);
        } else {
            r2 = new 0bb();
            r2.A06("m_pk", DbS.A0t(r7));
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
        AnonymousClass0fD.A09(2118339073, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A0F2;
        View view;
        int A022 = AnonymousClass0fD.A02(945092796);
        0qQ.A0B(layoutInflater, 0);
        if (C13991Tnr.A1a(this.A0K)) {
            A0F2 = layoutInflater.inflate(R.layout.layout_media_feed_swipe_refreshable, viewGroup, false);
            view = A0F2.findViewById(R.id.refreshable_container);
        } else {
            A0F2 = C13990Tnq.A0F(layoutInflater, viewGroup, R.layout.layout_media_feed_refreshable);
            view = A0F2;
        }
        this.A03 = (RefreshableNestedScrollingParent) view;
        0qQ.A0A(A0F2);
        AnonymousClass0fD.A09(-825175837, A022);
        return A0F2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1139460463);
        super.onDestroy();
        DbX.A0R(this.A0K).A02(this.A0P, AnonymousClass3DT.class);
        C13990Tnq.A1F(this, this.A0D);
        C13990Tnq.A1G(this, this.A0C);
        unregisterLifecycleListener((AnonymousClass332) this.A09.getValue());
        AnonymousClass0fD.A09(1479272504, A022);
    }
}
