package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E3w  reason: case insensitive filesystem */
public final class C47472E3w extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacAuthenticatorAppSetupFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.ErN(DbV.A05(this).getString(2131975737));
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final boolean onBackPressed() {
        getParentFragmentManager().A0y(Dbb.A0X(), 0);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(157634974);
        C47472E3w.super.onCreate(bundle);
        FCE.A02(AnonymousClass7TE.A0l(this.A00), "get_code_from_auth_app");
        AnonymousClass0fD.A09(-911052219, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-109050813);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_authenticator_app_fragment, viewGroup, false);
        IgdsHeadline A0U = DbZ.A0U(inflate, R.id.two_factor_headline);
        A0U.setImageResource(R.drawable.ig_illustrations_illo_2fac_code_refresh);
        A0U.setHeadline((CharSequence) DbV.A0z(this, requireArguments().getString("arg_two_fac_app_name"), 2131975644));
        A0U.setBody(2131975643);
        C3021461u r3 = (C3021461u) inflate.requireViewById(R.id.next_bottom_button);
        DbZ.A1A(this, r3, 2131968361);
        r3.setPrimaryActionOnClickListener(new FP3((Object) this, 30));
        r3.setSecondaryAction(getText(2131975642), new FP3((Object) this, 31));
        Dbb.A1N(this);
        AnonymousClass0fD.A09(214527831, A02);
        return inflate;
    }
}
