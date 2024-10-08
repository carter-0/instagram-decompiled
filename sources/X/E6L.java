package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import java.util.List;

public final class E6L extends AnonymousClass4DH implements C51960G9g {
    public static final String __redex_internal_original_name = "FeaturedAccountsFragment";
    public User A00;
    public List A01;
    public ListView A02;
    public UserSession A03;
    public C47568E8g A04;

    public final void D2p(User user) {
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final void DSJ(View view, User user, boolean z) {
    }

    public final void DdL(User user) {
    }

    public final String getModuleName() {
        return "featured_accounts_fragment";
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        0fE.A00(this.A04, 693817763);
    }

    public final AnonymousClass0wW getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1878044113);
        E6L.super.onCreate(bundle);
        17k.A07(this.mArguments, "Fragment arguments cannot be null in FeaturedAccountsFragment!");
        Object value = C227642jf.A02(this).getValue();
        17k.A07(value, "Usersession cannot be null in FeaturedAccountsFragment!");
        this.A03 = (UserSession) value;
        C47568E8g e8g = new C47568E8g(requireContext(), this, this.A03, this, new C46432Det(requireArguments(), this.A03, (FollowListData) null));
        this.A04 = e8g;
        List<Object> list = this.A01;
        if (list != null) {
            List<Object> list2 = e8g.A01;
            list2.clear();
            for (Object add : list) {
                list2.add(add);
            }
            e8g.A06();
            for (Object A08 : list2) {
                e8g.A08(e8g.A00, A08);
            }
            e8g.A07();
        }
        AnonymousClass0fD.A09(-2105813686, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1646026666);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.featured_accounts_bottom_sheet_layout);
        if (this.A00 != null) {
            Resources A05 = DbV.A05(this);
            String username = this.A00.getUsername();
            DbY.A0y(A05, DbU.A0G(A0C, R.id.featured_accounts_title_textview), username, 2131962216);
            Dbb.A0m(A05, DbU.A0G(A0C, R.id.featured_accounts_subtitle_textview), username, 2131962215);
        }
        ListView listView = (ListView) A0C.requireViewById(R.id.list_view);
        this.A02 = listView;
        listView.setAdapter(this.A04);
        AnonymousClass0fD.A09(83528204, A022);
        return A0C;
    }

    public final void onUserRowClick(User user) {
        if (getActivity() != null) {
            DbX.A14(requireContext(), AnonymousClass37D.A00);
            C46474Dfc A012 = C46548Dgp.A01(this.A03, user.getId(), "featured_account_bottom_sheet_row", "featured_accounts_fragment");
            C46474Dfc.A02(DbU.A0Q(requireActivity(), this.A03), this.A03, C46447Df9.A02(), A012);
        }
    }
}
