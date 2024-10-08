package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.H1y  reason: case insensitive filesystem */
public final class C54178H1y extends C227812jx implements C229122ms, AnonymousClass4DU, AnonymousClass4DR, C229132mt, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BrandedContentNotificationFragment";
    public E9H A00;
    public C50572Feh A01;
    public C231002qi A02;
    public 2el A03;
    public C14190TrU A04;
    public C324356z9 A05;
    public EmptyStateView A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final int A08 = 8;
    public final 1wn A09 = new FX1(this, 0);

    public final void CgO() {
        A00(this, false);
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.setTitle(GWH.A02.A01(requireContext(), (JQI) null));
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A00();
        DbX.A1A(new FP6((Object) this, 59), A0K, r4);
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(1142);
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManagerCompat(DbT.A06(this, recyclerView, 0)));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EmptyStateView emptyStateView = (EmptyStateView) view.requireViewById(16908292);
        this.A06 = emptyStateView;
        if (emptyStateView == null) {
            str = "emptyStateView";
        } else {
            C320156rr r2 = C320156rr.ERROR;
            emptyStateView.A0R(r2, R.drawable.loadmore_icon_refresh_compound);
            C320156rr r1 = C320156rr.EMPTY;
            emptyStateView.A0R(r1, R.drawable.instagram_media_account_outline_96);
            emptyStateView.A0T(r1, 2131966710);
            emptyStateView.A0S(r1, 2131966703);
            emptyStateView.A0N(new FP6((Object) this, 60), r2);
            emptyStateView.A0H();
            RecyclerView recyclerView = getRecyclerView();
            C14190TrU trU = this.A04;
            if (trU == null) {
                str = "autoLoadMoreHelper";
            } else {
                recyclerView.A15(trU);
                getRecyclerView().setImportantForAccessibility(1);
                ((C238143As) getScrollingViewProxy()).ErF(new C57716IfJ(this));
                A00(this, true);
                C231002qi r0 = this.A02;
                if (r0 == null) {
                    str = "quickPromotionDelegate";
                } else {
                    r0.Dh3();
                    2el r3 = this.A03;
                    if (r3 == null) {
                        str = "viewpointManager";
                    } else {
                        r3.A08(getRecyclerView(), AnonymousClass3DZ.A00(this), new AnonymousClass2eo[0]);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C54178H1y h1y, boolean z) {
        C324356z9 r4 = h1y.A05;
        if (r4 == null) {
            C51965G9l.A16();
            throw AnonymousClass00P.createAndThrow();
        }
        0lg A0X = DbT.A0X(h1y.A07);
        0qQ.A0B(A0X, 0);
        1NY A0b = AnonymousClass7TG.A0b(A0X);
        A0b.A0A("business/branded_content/news/inbox/");
        C54381HAw.A00(DbU.A0S(A0b, C54075Gyz.class, C56243HvA.class), r4, h1y, 0, z);
    }

    public final void ACw() {
        C324356z9 r0 = this.A05;
        if (r0 == null) {
            C51965G9l.A16();
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A06()) {
            A00(this, false);
        }
    }

    public final boolean CJz() {
        E9H e9h = this.A00;
        if (e9h != null) {
            return !e9h.isEmpty();
        }
        0qQ.A0F("listAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        C324356z9 r0 = this.A05;
        if (r0 != null) {
            return r0.A05();
        }
        C51965G9l.A16();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CT5() {
        C324356z9 r0 = this.A05;
        if (r0 != null) {
            return C51973G9u.A1Y(r0);
        }
        C51965G9l.A16();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean isLoading() {
        C324356z9 r0 = this.A05;
        if (r0 != null) {
            return C51973G9u.A1X(r0);
        }
        C51965G9l.A16();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C54178H1y h1y, boolean z) {
        if (h1y.isLoading()) {
            EmptyStateView emptyStateView = h1y.A06;
            if (emptyStateView != null) {
                emptyStateView.A0L();
                return;
            }
        } else if (h1y.CT5()) {
            EmptyStateView emptyStateView2 = h1y.A06;
            if (emptyStateView2 != null) {
                emptyStateView2.A0J();
                return;
            }
        } else {
            EmptyStateView emptyStateView3 = h1y.A06;
            if (z) {
                if (emptyStateView3 != null) {
                    emptyStateView3.A0I();
                    return;
                }
            } else if (emptyStateView3 != null) {
                emptyStateView3.A0K();
                return;
            }
        }
        0qQ.A0F("emptyStateView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CWV() {
        if (!isLoading() || CJz()) {
            return true;
        }
        return false;
    }

    public final boolean onBackPressed() {
        if (getParentFragmentManager().A12()) {
            return true;
        }
        getParentFragmentManager().A13();
        return true;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, X.H1y, X.2jx, androidx.fragment.app.Fragment, java.lang.Object, X.2mt] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(329085572);
        super.onCreate(bundle);
        this.A03 = C51969G9p.A0k();
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r1 = this.A07;
        C324476zN.A0R(AnonymousClass7TE.A0l(r1), requireActivity, AnonymousClass000.A00(1142));
        this.A05 = C51970G9q.A0g(requireContext(), this, AnonymousClass7TE.A0l(r1));
        this.A01 = new C50572Feh(requireContext(), requireActivity(), this, this, AnonymousClass7TE.A0l(r1), this);
        1YN A002 = AnonymousClass2bO.A00();
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0B;
        AnonymousClass2bO.A00();
        this.A02 = A002.A01(this, this, A0l, 2bV.A04(new C50735Fha(this, 1), new C50736Fhb(this, 2)), quickPromotionSlot);
        Context requireContext = requireContext();
        UserSession A0l2 = AnonymousClass7TE.A0l(r1);
        C50572Feh feh = this.A01;
        if (feh == null) {
            str = "delegate";
        } else {
            C231002qi r9 = this.A02;
            if (r9 == null) {
                str = "quickPromotionDelegate";
            } else {
                this.A00 = new E9H(requireContext, this, A0l2, feh, r9);
                int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                this.A04 = new C14190TrU(AnonymousClass7TE.A0l(r1), this, AnonymousClass05K.A01, this.A08);
                E9H e9h = this.A00;
                if (e9h == null) {
                    str = "listAdapter";
                } else {
                    setAdapter(e9h);
                    DbX.A0R(r1).A01(this.A09, FW2.class);
                    AnonymousClass0fD.A09(-572184328, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(612711760);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview_with_empty_state, false);
        AnonymousClass0fD.A09(-1366946992, A022);
        return A0D;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1446968617);
        C54178H1y.super.onPause();
        DbX.A0R(this.A07).A02(this.A09, FW2.class);
        FragmentActivity requireActivity = requireActivity();
        1OP r0 = 1OP.$redex_init_class;
        AnonymousClass3K2 A042 = AnonymousClass3K2.A04(requireActivity);
        if (A042 != null) {
            A042.A0S();
        }
        AnonymousClass0fD.A09(1088747412, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(127552653);
        super.onResume();
        FragmentActivity requireActivity = requireActivity();
        1OP r0 = 1OP.$redex_init_class;
        AnonymousClass3K2 A042 = AnonymousClass3K2.A04(requireActivity);
        if (A042 != null && A042.A0Z()) {
            getRecyclerView().getViewTreeObserver().addOnGlobalLayoutListener(new WC9(this, 6));
        }
        AnonymousClass0fD.A09(1208065925, A022);
    }
}
