package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.profile.bindergroup.AccountLinkModel;
import com.instagram.user.model.User;

public final class E1V extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "EditLinksListActionFragment";
    public 1Ng A00;
    public AccountLinkModel A01;
    public AnonymousClass6ST A02;
    public User A03;
    public String A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return "edit_links_list_action_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.link_action_remove_link_textview);
        AccountLinkModel accountLinkModel = this.A01;
        if (accountLinkModel == null) {
            0qQ.A0F("account");
            throw AnonymousClass00P.createAndThrow();
        }
        if ((accountLinkModel instanceof AccountLinkModel.FacebookLinkData) || (accountLinkModel instanceof AccountLinkModel.FacebookLinkDataV2)) {
            str = "facebook";
        } else if (accountLinkModel instanceof AccountLinkModel.FacebookPageLinkData) {
            str = "facebook_page";
        } else {
            str = "external";
        }
        this.A04 = str;
        FPC.A01(findViewById, 38, this);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2100814268);
        E1V.super.onCreate(bundle);
        AnonymousClass0eM r2 = this.A05;
        this.A00 = DbX.A0R(r2);
        AnonymousClass6ST A0h = DbV.A0h(requireActivity());
        this.A02 = A0h;
        DbX.A15(requireContext(), A0h);
        AccountLinkModel accountLinkModel = (AccountLinkModel) requireArguments().getParcelable("ACCOUNT_MODEL_KEY");
        if (accountLinkModel == null) {
            C59689JTv.A0B(getActivity(), "account_is_null");
            DbT.A1J(this);
        } else {
            this.A01 = accountLinkModel;
        }
        this.A03 = DbX.A0l(AnonymousClass0t1.A01, r2);
        AnonymousClass0fD.A09(-1116375104, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-963675692);
        0qQ.A0B(layoutInflater, 0);
        View A09 = DbW.A09(layoutInflater, viewGroup, R.layout.layout_links_action_bottomsheet_dialog, false);
        AnonymousClass0fD.A09(1072135586, A022);
        return A09;
    }
}
