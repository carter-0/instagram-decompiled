package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.DuF  reason: case insensitive filesystem */
public final class C47286DuF extends E58 {
    public static final String __redex_internal_original_name = "CreatePasswordNuxFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "create_password_nux";
    }

    public final void DUM() {
        C49881FBf.A00.A02(this.A00, "nux_create_password");
        if (this.A05) {
            UserSession userSession = this.A00;
            String A0I = 0nA.A0I(this.A03);
            1NY A0N = DbU.A0N(userSession);
            A0N.A0A("accounts/change_password/");
            A0N.A9m("enc_new_password", Dba.A0b(userSession, A0I));
            A0N.A9m("is_in_nux", "true");
            A0N.A0R(1XP.class, 1XY.class);
            C47691EDa.A00(this, DbT.A0U(A0N, true), 7);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A02(this.A00, "nux_create_password");
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1313301853);
        C47286DuF.super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        AnonymousClass0fD.A09(-1408506429, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UserSession userSession = this.A00;
        AnonymousClass7TG.A1N(userSession, "nux_create_password");
        C49938FFr.A01(userSession, "nux_create_password");
    }
}
