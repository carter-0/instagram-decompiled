package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.F8c  reason: case insensitive filesystem */
public abstract class C49815F8c {
    public static final void A00(AnonymousClass0iw r5, UserSession userSession, String str, String str2, String str3, String str4) {
        HashMap A0q = DbZ.A0q();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_wellbeing_self_remediation_action");
        A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "block");
        DbS.A1H(A0e, str);
        A0e.A9F("actor_ig_userid", 00y.A0n(10, str2));
        A0e.A9F("target_ig_userid", 00y.A0n(10, str3));
        A0e.AAJ("comment_id", str4);
        A0e.A9F("direct_thread_id", (Long) null);
        A0e.A9F(AnonymousClass000.A00(734), (Long) null);
        A0e.A9F(AnonymousClass000.A00(345), (Long) null);
        A0e.AAJ("entrypoint", (String) null);
        A0e.A9H("extra_values", A0q);
        A0e.Cgf();
    }

    public static final void A01(UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "mwb_igd_client_delta_received");
        if (A0e.isSampled()) {
            DbV.A1G(A0e, str);
        }
    }
}
