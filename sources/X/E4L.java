package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E4L extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacAuthenticatorAppConfirmFragment";
    public boolean A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.ErN(getString(2131975632));
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public static final void A00(E4L e4l) {
        F3Y A002 = FFR.A00();
        Bundle requireArguments = e4l.requireArguments();
        Integer num = AnonymousClass05K.A01;
        Dbc.A0S(A002.A01(requireArguments, num, num, "", false), e4l.requireActivity(), e4l.A01);
    }

    public final boolean onBackPressed() {
        getParentFragmentManager().A0y(Dbb.A0X(), 0);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-346998489);
        E4L.super.onCreate(bundle);
        FCE.A02(AnonymousClass7TE.A0l(this.A01), "enter_code_from_auth_app");
        AnonymousClass0fD.A09(2031026664, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(425497743);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_authenticator_app_fragment, viewGroup, false);
        IgdsHeadline A0U = DbZ.A0U(inflate, R.id.two_factor_headline);
        A0U.setImageResource(R.drawable.ig_illustrations_illo_2fac_code_refresh);
        A0U.setHeadline(2131975634);
        A0U.setBody((CharSequence) DbV.A0z(this, requireArguments().getString("arg_two_fac_app_name"), 2131975633));
        C3021461u r3 = (C3021461u) inflate.requireViewById(R.id.next_bottom_button);
        DbZ.A1A(this, r3, 2131968361);
        r3.setPrimaryActionOnClickListener(new FP3((Object) this, 26));
        r3.setSecondaryAction(getText(2131975642), new FP3((Object) this, 27));
        Dbb.A1N(this);
        AnonymousClass0fD.A09(319297835, A02);
        return inflate;
    }

    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(-1212020503);
        E4L.super.onStart();
        String string = requireArguments().getString("arg_totp_seed", "");
        if (!this.A00 && string != null) {
            this.A00 = true;
            String username = DbX.A0l(AnonymousClass0t1.A01, this.A01).getUsername();
            String str = 0oI.A02;
            0kR.A02(DbX.A09(002.A11("otpauth://totp/Instagram:", username, "?secret=", string, "&issuer=Instagram")), this);
        }
        AnonymousClass0fD.A09(-869669048, A02);
    }
}
