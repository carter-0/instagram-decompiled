package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.H1v  reason: case insensitive filesystem */
public final class C54175H1v extends AnonymousClass32G implements C249763kK, C229122ms, AnonymousClass4DU, C229132mt, AbsListView.OnScrollListener, AnonymousClass4DS, AnonymousClass32J, C3251171c {
    public static final String __redex_internal_original_name = "SaveCollectionPivotsFragment";
    public UserSession A00;
    public C324356z9 A01;
    public C324266yu A02;
    public C54222H3r A03;
    public SavedCollection A04;
    public AnonymousClass36D A05;
    public AnonymousClass2uE A06;
    public EmptyStateView A07;
    public String A08;
    public final C228172ku A09 = new C228172ku();

    public static void A02(C54175H1v h1v, boolean z) {
        String str;
        C54381HAw hAw = new C54381HAw(5, h1v, z);
        C324356z9 r4 = h1v.A01;
        if (z) {
            str = null;
        } else {
            str = r4.A03.A07;
        }
        String A062 = 0mp.A06("collections/%s/related_media/", new Object[]{h1v.A04.A0F});
        1NY A0O = DbU.A0O(h1v.A00);
        A0O.A0A(A062);
        A0O.A0R(HE8.class, C56342Hwt.class);
        C3724090s.A06(A0O, str);
        r4.A03(A0O.A0M(), hAw);
    }

    public final boolean CWV() {
        return true;
    }

    public final void CgO() {
        A02(this, false);
    }

    public final void DIH(View view, 1Xj r11, int i) {
        int i2;
        UserSession userSession = this.A00;
        SavedCollection savedCollection = this.A04;
        AnonymousClass7TG.A1O(userSession, savedCollection);
        0qQ.A0B(r11, 3);
        I6U.A02(this, userSession, r11, savedCollection, C273654mx.A00(80), i / 3, i % 3);
        C309516Yo A0M = DbS.A0M(requireActivity(), this.A00);
        F3W A032 = IgFragmentFactoryImpl.A00().A03(r11.getId());
        A032.A0O = true;
        A032.A0E = "feed_contextual_collection_pivots";
        A0M.A0E(A032.A01());
        if (r11.CeS()) {
            i2 = 823;
        } else {
            i2 = 737;
        }
        A0M.A0B = AnonymousClass000.A00(i2);
        A0M.A04();
    }

    public final String getModuleName() {
        return "feed_collection_pivots";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A01(C54175H1v h1v) {
        RefreshableListView refreshableListView;
        boolean z;
        EmptyStateView emptyStateView = h1v.A07;
        if (emptyStateView != null) {
            ListView A0X = h1v.A0X();
            if (C51973G9u.A1X(h1v.A01)) {
                emptyStateView.A0L();
                if (A0X != null) {
                    refreshableListView = (RefreshableListView) A0X;
                    z = true;
                } else {
                    return;
                }
            } else {
                if (C51973G9u.A1Y(h1v.A01)) {
                    emptyStateView.A0J();
                } else {
                    emptyStateView.A0I();
                    emptyStateView.A0H();
                }
                if (A0X != null) {
                    refreshableListView = (RefreshableListView) A0X;
                    z = false;
                } else {
                    return;
                }
            }
            refreshableListView.setIsLoading(z);
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A00;
    }

    public final void ACw() {
        if (this.A01.A06()) {
            A02(this, false);
        }
    }

    public final boolean CJz() {
        boolean z = false;
        if (this.A03.A00.A02() == 0) {
            z = true;
        }
        return !z;
    }

    public final boolean CKB() {
        return this.A01.A05();
    }

    public final boolean CT5() {
        return C51973G9u.A1Y(this.A01);
    }

    public final boolean DII(MotionEvent motionEvent, View view, AnonymousClass1Xq r4, int i) {
        AnonymousClass2uE r0 = this.A06;
        if (r0 != null) {
            return r0.Dsa(motionEvent, view, r4, i);
        }
        return false;
    }

    public final void DM4(1Xj r6, int i, int i2) {
        UserSession userSession = this.A00;
        SavedCollection savedCollection = this.A04;
        0qQ.A0B(userSession, 1);
        0Aj A0N = C51972G9s.A0N(this, userSession);
        User A2A = r6.A2A(userSession);
        if (A0N.isSampled()) {
            A0N.A8M(r6.BR7().A00(), "m_t");
            C51965G9l.A1I(A0N, r6.getId());
            A0N.AAJ("algorithm", r6.A0C.getAlgorithm());
            A0N.AAJ("position", C320166rs.A01(i, i2));
            A0N.A9F(AnonymousClass000.A00(1689), DbZ.A0c(r6.A0C.Bd0()));
            if (savedCollection != null) {
                A0N.AAJ("collection_id", savedCollection.A0F);
                A0N.AAJ("collection_name", savedCollection.A0G);
            }
            if (A2A != null) {
                A0N.A9F("a_pk", C51972G9s.A0h(A2A));
            }
            G9w.A17(A0N);
        }
    }

    public final void configureActionBar(2da r4) {
        r4.Eu4(AnonymousClass7TF.A1R(this.mFragmentManager.A0M()));
        r4.setTitle(AnonymousClass7TF.A0e(DbV.A05(this), this.A04.A0G, 2131972518));
    }

    public final String getSessionId() {
        return this.A08;
    }

    public final boolean isLoading() {
        return C51973G9u.A1X(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        0hq r6;
        int A022 = AnonymousClass0fD.A02(-1788645992);
        C54175H1v.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        SavedCollection savedCollection = (SavedCollection) requireArguments.getParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION");
        this.A04 = savedCollection;
        savedCollection.A03(this.A00);
        this.A08 = requireArguments.getString(C273654mx.A00(113));
        C14190TrU trU = new C14190TrU(this.A00, this, AnonymousClass05K.A01, 6);
        C228172ku r2 = this.A09;
        r2.A01(trU);
        Context context = getContext();
        C322186vO r7 = new C322186vO(this.A00);
        C54222H3r h3r = new C54222H3r(context, this, this.A00, r7, this, 1sy.A0R, AnonymousClass32Q.A00, this);
        this.A03 = h3r;
        A0V(h3r);
        this.A02 = new C324266yu(getContext(), this, this.A00);
        AnonymousClass36D r0 = new AnonymousClass36D(this.A00, this.A03);
        this.A05 = r0;
        r0.A01();
        FragmentActivity requireActivity = requireActivity();
        Fragment fragment = this.mParentFragment;
        if (fragment == null) {
            r6 = this.mFragmentManager;
        } else {
            r6 = fragment.mFragmentManager;
        }
        this.A06 = new AnonymousClass2uE(requireActivity, this, r6, this.A00, this, this.A03, this, false);
        C227622jd r4 = new C227622jd();
        r4.A0E(this.A05);
        r4.A0E(new C234042wt(this, this.A00, this));
        r4.A0E(this.A06);
        A0b(r4);
        this.A01 = C51970G9q.A0g(getContext(), this, this.A00);
        A02(this, true);
        r2.A01(new C3251271d(this, this, this.A03, AnonymousClass7TE.A1F()));
        AnonymousClass0fD.A09(1825592753, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1504550898);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_feed);
        AnonymousClass0fD.A09(-1335011803, A022);
        return A0C;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0fD.A03(-486838614);
        this.A09.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(-1463607222, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0fD.A03(-708527343);
        this.A09.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(-1301009696, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        0S7.A00(this);
        this.A04.setOnScrollListener(this);
        0S7.A00(this);
        EmptyStateView emptyStateView = (EmptyStateView) this.A04.getEmptyView();
        emptyStateView.A0R(C320156rr.EMPTY, R.drawable.empty_state_save);
        C320156rr r1 = C320156rr.ERROR;
        emptyStateView.A0R(r1, R.drawable.loadmore_icon_refresh_compound);
        emptyStateView.A0N(C56802ICz.A00(this, 43), r1);
        emptyStateView.A0H();
        this.A07 = emptyStateView;
        A01(this);
    }
}
