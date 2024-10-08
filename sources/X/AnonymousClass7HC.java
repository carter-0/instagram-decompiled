package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.7HC  reason: invalid class name */
public final class AnonymousClass7HC {
    public final 0wc A00;

    public final void A00(C69347Njm njm, C254743sy r8, String str) {
        Boolean bool;
        String str2;
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_quoted_reply_sent");
        if (A002.isSampled()) {
            Long l = null;
            if (r8 != null) {
                bool = Boolean.valueOf(C66647MaG.A0E(r8));
                str2 = C67003Mgb.A01(r8);
                l = C67003Mgb.A00(r8);
            } else {
                bool = null;
                str2 = null;
            }
            A002.AAJ("action", njm.A00);
            A002.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            A002.A7p("is_e2ee", bool);
            A002.AAJ("open_thread_id", str2);
            A002.A9F("occamadillo_thread_id", l);
            A002.Cgf();
        }
    }

    public AnonymousClass7HC(AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}
