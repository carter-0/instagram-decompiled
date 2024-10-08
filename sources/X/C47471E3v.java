package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E3v  reason: case insensitive filesystem */
public final class C47471E3v extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacAuthenticatorAppDownloadFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.ErN(getString(2131975737));
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
        int A02 = AnonymousClass0fD.A02(-186940611);
        C47471E3v.super.onCreate(bundle);
        FCE.A02(AnonymousClass7TE.A0l(this.A00), "install_auth_app");
        AnonymousClass0fD.A09(-1438090842, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1377734908);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_authenticator_app_fragment, viewGroup, false);
        IgdsHeadline A0U = DbZ.A0U(inflate, R.id.two_factor_headline);
        A0U.setImageResource(R.drawable.twofac_password);
        A0U.setHeadline(2131975641);
        A0U.setBody((CharSequence) 002.A0g(DbU.A0m(this, 2131975638), "\n\n", DbU.A0m(this, 2131975639)));
        C3021461u r3 = (C3021461u) inflate.requireViewById(R.id.next_bottom_button);
        DbZ.A1A(this, r3, 2131975640);
        r3.setPrimaryActionOnClickListener(new FP3((Object) this, 28));
        r3.setSecondaryAction(getText(2131975642), new FP3((Object) this, 29));
        Dbb.A1N(this);
        AnonymousClass0fD.A09(2139971346, A02);
        return inflate;
    }
}
