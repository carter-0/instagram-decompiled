package com.instagram.wellbeing.reporting.common.impersonation;

import X.0wb;
import X.28D;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass2t9;
import X.AnonymousClass2tC;
import X.AnonymousClass4DH;
import X.AnonymousClass4DJ;
import X.C249383je;
import X.C273434mZ;
import X.C294875nB;
import X.C48058EUc;
import X.C49238Erh;
import X.C66579MXk;
import X.C67058MhZ;
import X.C70598OCv;
import X.C72208OyY;
import X.C72982PRp;
import X.DbU;
import X.DbX;
import X.Dbc;
import X.EG8;
import X.EGN;
import X.FV9;
import X.G6V;
import X.NHU;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.user.model.User;
import java.util.List;

public class ConsolidatedProfileSearchBottomSheetFragment extends AnonymousClass4DH implements C294875nB, C273434mZ {
    public int A00;
    public int A01;
    public UserSession A02;
    public User A03;
    public FV9 A04;
    public C72982PRp A05;
    public NHU A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public TouchInterceptorFrameLayout mTouchInterceptorFrameLayout;

    public final AnonymousClass4DJ B7u() {
        return this;
    }

    public final /* synthetic */ void Cj6(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    public final /* synthetic */ void Cj7(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    public final void D8N(DirectShareTarget directShareTarget) {
    }

    public final /* synthetic */ void D9P(DirectShareTarget directShareTarget) {
    }

    public final void Dk7(RectF rectF, View view, C67058MhZ mhZ, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    public final void DpB(View view, C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
    }

    public final void DpC(RectF rectF, 28D r2, DirectShareTarget directShareTarget) {
    }

    public final void DpD(View view) {
    }

    public final void EIL() {
    }

    public final String getModuleName() {
        return "CONSOLIDATED_PROFILE_SEARCH_BOTTOM_SHEET_FRAGMENT";
    }

    public final TouchInterceptorFrameLayout C8v() {
        return this.mTouchInterceptorFrameLayout;
    }

    public final void Dk6(C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5) {
        SearchController searchController = this.A04.A01;
        if (searchController != null) {
            searchController.A00();
        }
        NHU nhu = this.A06;
        C72982PRp pRp = this.A05;
        if (pRp != null && nhu != null && (directSearchResult instanceof DirectShareTarget)) {
            boolean z = this.A09;
            ((C48058EUc) pRp).A00.A01((DirectShareTarget) directSearchResult, nhu, z, false);
        }
    }

    public final void Dnr(C67058MhZ mhZ, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        0wb.A01.Ew0("ConsolidatedProfileSearchBottomSheetFragment", C66579MXk.A00(101));
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final void afterOnResume() {
        super.afterOnResume();
        if (this.A0A) {
            FV9 fv9 = this.A04;
            fv9.A02 = true;
            SearchController searchController = fv9.A01;
            if (searchController != null) {
                searchController.A02(false, 0.0f);
            }
            this.A0A = false;
        }
        Dbc.A0P(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1039955695);
        ConsolidatedProfileSearchBottomSheetFragment.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A06.getClass();
        UserSession A0U = DbX.A0U(this);
        this.A02 = A0U;
        A0U.getClass();
        this.A07 = DbU.A0l(bundle2, "ReportingConstants.ARG_CONTENT_ID");
        this.A09 = bundle2.getBoolean(C66579MXk.A00(54));
        this.A01 = bundle2.getInt(C66579MXk.A00(51), 0);
        this.A00 = bundle2.getInt("DirectSearchUserFragment.DIRECT_SEARCH_SECTION_LIMIT", 5);
        this.A04 = new FV9(requireContext(), this.A02, this, this, DbX.A0r(this.A03), this.A01, this.A00);
        String str = this.A08;
        String str2 = this.A07;
        if (!(!this.A09 || str2 == null || str == null)) {
            C49238Erh.A00(this.A02, bundle2.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD")).A00(this, this.A03, str, str2);
        }
        AnonymousClass0fD.A09(876716923, A022);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.2tF, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1512744373);
        this.mTouchInterceptorFrameLayout = new TouchInterceptorFrameLayout(requireContext());
        FV9 fv9 = this.A04;
        FragmentActivity requireActivity = requireActivity();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.mTouchInterceptorFrameLayout;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(requireActivity);
        C294875nB r3 = fv9.A07;
        UserSession userSession = fv9.A06;
        A002.A01(new EGN(this, userSession, r3, "direct_user_search", false));
        A002.A01(new Object());
        A002.A01(new EG8(fv9.A05, (G6V) null));
        fv9.A00 = DbU.A0U(A002, new Object());
        SearchController searchController = new SearchController(requireActivity, touchInterceptorFrameLayout, fv9.A00, new LinearLayoutManager(requireActivity), userSession, (C72208OyY) null, (C249383je) null, (C70598OCv) null, fv9, fv9.A04, 0, false, false, false, false, false, false, false);
        fv9.A01 = searchController;
        searchController.A08 = false;
        registerLifecycleListener(searchController);
        this.A0A = true;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.mTouchInterceptorFrameLayout;
        AnonymousClass0fD.A09(1811346546, A022);
        return touchInterceptorFrameLayout2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(923471580);
        super.onDestroyView();
        this.mTouchInterceptorFrameLayout = null;
        this.A04.A02 = false;
        AnonymousClass0fD.A09(-112877424, A022);
    }
}
