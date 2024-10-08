package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class E23 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DiscoverInterestAccountsFragment";
    public C46848DmQ A00;
    public C49497Ewc A01;
    public C230012om A02;
    public C229352nF A03;
    public 2el A04;
    public SpinnerImageView A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final void A02(1Xj r13, String str) {
        C229352nF r5;
        AnonymousClass0eM r2 = this.A09;
        C270634h3 r3 = new C270634h3(ClipsViewerSource.IP_DISCOVER_ACCOUNTS, AnonymousClass7TE.A0l(r2));
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (this.A03 == null || this.A06 == null) {
            this.A03 = C229342nE.A00(AnonymousClass7TE.A0l(r2));
            this.A06 = AnonymousClass7TF.A0b();
        }
        A1C.add(C295375o3.A02(r13));
        String str2 = this.A06;
        if (!(str2 == null || (r5 = this.A03) == null)) {
            C298855u9 A002 = C276114sa.A00.A00(true);
            A002.A00 = null;
            r5.A03(A002.A00(), C294895nD.DEFAULT, str2, A1C, true, true);
        }
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        FragmentActivity requireActivity = requireActivity();
        r3.A1C = r13.getId();
        r3.A1B = str;
        r3.A1c = false;
        DbU.A1M(requireActivity, r3, A0l);
    }

    public final String getModuleName() {
        return "ip_discover_accounts";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        1OC A0S;
        int i;
        0qQ.A0B(view, 0);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.recycler_view);
        recyclerView.addOnLayoutChangeListener(new FPP(this, 0));
        C46848DmQ dmQ = this.A00;
        if (dmQ == null) {
            0qQ.A0F("interestAccountsAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setAdapter(dmQ);
        DbV.A1B(getActivity(), recyclerView);
        if (!this.A07) {
            if (this.A08) {
                A0S = C46396DeJ.A02(AnonymousClass7TE.A0l(this.A09), (String) null, (String) null, (String) null, true, false);
                i = 8;
            } else {
                1NY A0b = AnonymousClass7TG.A0b(AnonymousClass7TF.A0L(this.A09, 0));
                A0b.A0A("interest_nux/accounts/");
                A0S = DbU.A0S(A0b, CDX.class, D0I.class);
                i = 9;
            }
            C47691EDa.A00(this, A0S, i);
            this.A07 = true;
        }
        super.onViewCreated(view, bundle);
    }

    public static final AnonymousClass6KM A00(C47217Dt4 dt4, User user, String str, String str2, int i) {
        if (str2 == null) {
            str2 = "fullscreen";
        }
        AnonymousClass6KM r1 = new AnonymousClass6KM(str2, user.getId(), "ip_discover_accounts");
        r1.A0B = dt4.A04;
        r1.A00 = i;
        if (str != null) {
            r1.A07 = str;
        }
        String str3 = dt4.A02;
        if (str3 != null) {
            r1.A04 = str3;
        }
        return r1;
    }

    public static final void A01(E23 e23, String str) {
        AnonymousClass0eM r4 = e23.A09;
        C46474Dfc A012 = C46548Dgp.A01(AnonymousClass7TE.A0l(r4), str, "ip_discover_accounts", "ip_discover_accounts");
        C309516Yo A0P = DbZ.A0P(e23, r4);
        A0P.A0F = true;
        C46474Dfc.A03(A0P, AnonymousClass7TE.A0l(r4), C46447Df9.A02(), A012);
    }

    public final void A03(boolean z) {
        SpinnerImageView spinnerImageView = this.A05;
        if (spinnerImageView == null) {
            0qQ.A0F("loadingSpinner");
            throw AnonymousClass00P.createAndThrow();
        } else {
            spinnerImageView.setVisibility(DbW.A01(z ? 1 : 0));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(86679477);
        E23.super.onCreate(bundle);
        AnonymousClass0eM r2 = this.A09;
        this.A01 = new C49497Ewc(this, AnonymousClass7TE.A0l(r2));
        this.A02 = new C230012om(this, AnonymousClass7TE.A0l(r2));
        this.A04 = DbY.A0U();
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        2el r9 = this.A04;
        if (r9 == null) {
            0qQ.A0F("viewpointManager");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = new C46848DmQ(requireContext, this, A0l, r9, this);
        this.A08 = 182.A06(0Tu.A06, DbT.A0X(r2), 36316104561266635L);
        AnonymousClass0fD.A09(1943889416, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1787444485);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.discover_interest_accounts_fragment, viewGroup, false);
        View A0G = AnonymousClass7TF.A0G(inflate, R.id.discover_accounts_headline);
        if (this.A08) {
            A0G.setPadding(A0G.getPaddingLeft(), A0G.getPaddingTop(), A0G.getPaddingRight(), DbS.A03(DbV.A05(this), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        }
        this.A05 = DbX.A0k(inflate);
        View A0G2 = AnonymousClass7TF.A0G(inflate, R.id.progress_button);
        A0G2.setEnabled(true);
        FP0.A00(A0G2, 46, this);
        MaterialToolbar materialToolbar = (MaterialToolbar) AnonymousClass7TF.A0F(inflate, R.id.toolbar);
        materialToolbar.setTitle((CharSequence) getString(2131960846));
        ((AppBarLayout) AnonymousClass7TF.A0F(inflate, R.id.appbar_layout)).A02(new C50192FSy(AnonymousClass7TF.A0G(inflate, R.id.toolbar_background), materialToolbar, 0));
        2el r0 = this.A04;
        if (r0 == null) {
            0qQ.A0F("viewpointManager");
            throw AnonymousClass00P.createAndThrow();
        }
        Dba.A0z(inflate, r0, this);
        AnonymousClass0fD.A09(1932117898, A022);
        return inflate;
    }

    public final void onDestroy() {
        C229352nF r0;
        int A022 = AnonymousClass0fD.A02(1768776183);
        super.onDestroy();
        String str = this.A06;
        if (!(str == null || (r0 = this.A03) == null)) {
            r0.A07(str);
        }
        AnonymousClass0fD.A09(507273060, A022);
    }
}
