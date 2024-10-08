package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.android.R;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.List;

public final class E4C extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AccountLinkingIGPCToACUpsellFragment";
    public AnonymousClass9BG A00;
    public F2W A01;
    public UserSession A02;
    public boolean A03;

    public final void configureActionBar(2da r3) {
        r3.Etr(true);
        r3.Eu4(true);
        r3.setTitle(requireActivity().getString(2131952063));
    }

    public final String getModuleName() {
        return "account_linking_igpc_to_ac_upsell";
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        UserSession userSession = this.A02;
        String obj = C48150EZs.A03.toString();
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, obj);
        FG9.A00(userSession, "linking_prescreen_xout_clicked", obj);
        DbT.A1I(this);
        return A1Z;
    }

    public final void afterOnResume() {
        0hq parentFragmentManager;
        String str;
        super.afterOnResume();
        F2W f2w = this.A01;
        if (f2w.A01) {
            parentFragmentManager = getParentFragmentManager();
            str = C273654mx.A00(528);
        } else if (f2w.A00) {
            boolean z = this.A03;
            parentFragmentManager = getParentFragmentManager();
            if (z) {
                str = "AccountLinkingMainGroupManagementFragment.BACK_STACK_STATE_NAME";
            } else {
                str = "AccountLinkingChildGroupManagementFragment.BACK_STACK_STATE_NAME";
            }
        } else {
            return;
        }
        parentFragmentManager.A0y(str, 0);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-138460773);
        E4C.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0U = DbX.A0U(this);
        this.A02 = A0U;
        this.A00 = AnonymousClass9BG.A01(A0U);
        this.A03 = requireArguments.getBoolean("is_parent_account");
        this.A01 = new F2W(this.A02);
        AnonymousClass0fD.A09(-2121905841, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String username;
        String username2;
        List list;
        int A022 = AnonymousClass0fD.A02(-785406218);
        View inflate = layoutInflater.inflate(R.layout.account_linking_setup_igpc_to_ac_upsell_fragment, viewGroup, false);
        IgdsHeadline A0U = DbZ.A0U(inflate, R.id.igpc_to_ac_upsell_title_textview);
        A0U.A02 = true;
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.continue_linking_button);
        User A0j = DbT.A0j(this.A02);
        User user = null;
        AccountFamily A09 = Dba.A09(AnonymousClass9BG.A01(this.A02), this.A02);
        if (A09 != null) {
            if (this.A00.A07(A0j.getId())) {
                list = A09.A03;
            } else {
                list = A09.A04;
            }
            if (!list.isEmpty()) {
                user = (User) list.get(0);
            }
        }
        user.getClass();
        if (this.A00.A07(A0j.getId())) {
            username = A0j.getUsername();
            username2 = user.getUsername();
        } else {
            username = user.getUsername();
            username2 = A0j.getUsername();
        }
        A0U.setBody((CharSequence) 0bC.A01(DbV.A05(this), new String[]{username, username2}, 2131952071));
        progressButton.setText((CharSequence) DbV.A05(this).getString(2131952075));
        A0U.setHeadline((CharSequence) DbV.A05(this).getString(2131952074));
        this.A00.A04(this.A02);
        FPE.A01(progressButton, 1, this, user);
        FP6.A00(inflate.requireViewById(R.id.not_now_button), 3, this);
        UserSession userSession = this.A02;
        String obj = C48150EZs.A03.toString();
        0qQ.A0B(userSession, 0);
        0qQ.A0B(obj, 1);
        FG9.A01(userSession, "linking_prescreen_screen_shown", obj, (String) null);
        UserSession userSession2 = this.A02;
        0qQ.A0B(userSession2, 1);
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint = XFBFXIGPCEntryPoint.LOGIN_INFO;
        try {
            1NY A0a = AnonymousClass7TG.A0a(userSession2);
            A0a.A02();
            A0a.A0A("api/v1/fxcal/igpc_update_upsell_timestamp/");
            A0a.A0O((15p) null, C47300DuT.class, F4E.class, false);
            1OC A0T = DbT.A0T(A0a, "upsell_entrypoint", xFBFXIGPCEntryPoint.A00);
            0qQ.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FXCALIGPCUpsellResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FXCALIGPCUpsellResponse>>");
            1ES.A03(A0T);
        } catch (Exception e) {
            String obj2 = xFBFXIGPCEntryPoint.toString();
            String format = String.format("Failed to update IGPC Upsell timestamp! \n%s", Arrays.copyOf(new Object[]{e.getMessage()}, 1));
            0qQ.A07(format);
            FG9.A02(userSession2, obj2, format);
        }
        AnonymousClass0fD.A09(-58505277, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1960784976);
        super.onResume();
        AnonymousClass0fD.A09(-1805290785, A022);
    }
}
