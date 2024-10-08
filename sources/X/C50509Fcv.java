package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fcv  reason: case insensitive filesystem */
public final class C50509Fcv implements C74422Puc {
    public final /* synthetic */ UserSession A00;

    public final void D9d() {
    }

    public C50509Fcv(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void Dka() {
        UserSession userSession = this.A00;
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        AnonymousClass7TG.A1L(A0q.AR4(), A0q, "ig_live_num_times_good_time_for_live_ignored_in_a_row", 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C239413Gj.A08, userSession), "live_production_in_app_notification");
        A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "good_time_for_live");
        DbS.A1I(A0e, "impression");
        A0e.Cgf();
    }
}
