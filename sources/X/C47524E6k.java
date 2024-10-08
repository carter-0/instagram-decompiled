package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.E6k  reason: case insensitive filesystem */
public final class C47524E6k extends C227812jx implements C21002X8z, AnonymousClass4DS, C51909G7d {
    public static final String __redex_internal_original_name = "SpamFollowRequestsFragment";
    public final AnonymousClass0eM A00 = C51792G2b.A00(this, 32);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(G25.A00);
    public final AnonymousClass0eM A02 = C51792G2b.A00(this, 33);
    public final AnonymousClass0eM A03 = C51792G2b.A00(this, 34);
    public final AnonymousClass0eM A04 = C51792G2b.A00(this, 35);
    public final AnonymousClass0eM A05 = C51792G2b.A00(this, 36);
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(G26.A00);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = C51792G2b.A00(this, 37);
    public final AnonymousClass0eM A09;

    public final void DGc() {
    }

    public final void DVq(User user, int i) {
    }

    public final void DgC(User user, int i) {
        0qQ.A0B(user, 1);
        C47539E7c.A00(this.A09).A02(user.getId(), i);
    }

    public final void DgG(User user, int i) {
        0qQ.A0B(user, 1);
        C47539E7c.A00(this.A09).A03(user.getId(), i);
    }

    public final void DpP() {
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        if (isAdded() && getContext() != null) {
            DbW.A1B(r2, 2131962574);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbsListView absListView = (AbsListView) AnonymousClass7TF.A0F(view, 16908298);
        absListView.setAdapter((C331047Ph) this.A00.getValue());
        absListView.setImportantForAccessibility(1);
        absListView.setOnScrollListener((C249383je) this.A03.getValue());
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 32), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final void Ct2(C53329GmF gmF) {
        C47539E7c.A00(this.A09).A00(gmF);
    }

    public final void DGX() {
        this.A04.getValue();
        C47539E7c.A01((C47539E7c) this.A09.getValue());
    }

    public final void DJp(User user, int i) {
        C47539E7c.A00(this.A09).A04(user.getId(), i);
    }

    public final String getModuleName() {
        return DbT.A0O(this.A01).getModuleName();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C47524E6k() {
        C51792G2b g2b = new C51792G2b(this, 41);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51792G2b(new C51792G2b(this, 38), 39));
        this.A09 = DbS.A0I(new C51792G2b(A002, 40), g2b, new MJ7(15, (Object) null, A002), DbS.A0z(C47539E7c.class));
        this.A07 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-26626996);
        super.onCreate(bundle);
        AnonymousClass0eM r3 = this.A05;
        DbY.A0v(requireContext(), (MYU) r3.getValue(), this, this.A07);
        C49284EsT.A00(r3);
        AnonymousClass0eM r32 = this.A09;
        C47539E7c e7c = (C47539E7c) r32.getValue();
        C51645Fy4.A01(e7c, C318116oQ.A00(e7c), 30);
        C47539E7c.A00(r32).A00 = new C51657FyJ(this, 6);
        AnonymousClass0fD.A09(1571502515, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(6690201);
        0qQ.A0B(layoutInflater, 0);
        registerLifecycleListener((C229402nK) this.A03.getValue());
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        AnonymousClass0fD.A09(1289211609, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1753296047);
        super.onDestroyView();
        unregisterLifecycleListener((C229402nK) this.A03.getValue());
        AnonymousClass0fD.A09(-139456666, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-202945373);
        super.onResume();
        UserSession A0l = AnonymousClass7TE.A0l(this.A07);
        0qQ.A0B(A0l, 0);
        Boolean By1 = DbX.A0m(A0l).By1();
        boolean z = requireArguments().getBoolean("ARG_SPAM_FOLLOWER_SETTING_ENABLED");
        if (By1 != null && !By1.equals(Boolean.valueOf(z))) {
            DbZ.A1B(this, "ARG_SPAM_FOLLOWER_SETTING_ENABLED", By1);
            C47539E7c e7c = (C47539E7c) this.A09.getValue();
            C51645Fy4.A01(e7c, C318116oQ.A00(e7c), 30);
        }
        AnonymousClass0fD.A09(-1754088249, A022);
    }
}
