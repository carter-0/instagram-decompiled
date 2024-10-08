package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fcl  reason: case insensitive filesystem */
public final class C50499Fcl implements C66491MTu {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public final void onDismiss() {
    }

    public C50499Fcl(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void D1x(Context context) {
        UserSession userSession = this.A01;
        0xY A0N = AnonymousClass7TF.A0N(userSession);
        A0N.E5Z("ig_live_num_times_good_time_for_live_ignored_in_a_row", 0);
        A0N.apply();
        Dba.A0l(this.A00, AnonymousClass7TE.A0a(), userSession, "universal_creation_live_camera");
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C239413Gj.A08, userSession), "live_production_in_app_notification");
        A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "good_time_for_live");
        DbS.A1I(A0e, "click");
        A0e.Cgf();
    }
}
