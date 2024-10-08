package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class OWQ {
    public final 0wc A00;

    public OWQ(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public static final void A00(OWQ owq, C255283ts r3, String str, String str2, HashMap hashMap) {
        if (r3 != null) {
            hashMap.put("source", ((C255273tr) r3).A01);
        }
        if (str2 != null) {
            hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        }
        0Aj A0e = AnonymousClass7TE.A0e(owq.A00, "direct_suggested_replies_events");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.A9H("event_data", hashMap);
            A0e.Cgf();
        }
    }

    public final void A01(C255283ts r4, String str) {
        HashMap A0x = C66582MXn.A0x(r4);
        A0x.put("source", ((C255273tr) r4).A01);
        A00(this, r4, "suggested_replies_tray_blocked", str, A0x);
    }

    public final void A02(C255283ts r5, String str, int i) {
        0qQ.A0B(str, 3);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("source", ((C255273tr) r5).A01);
        A1E.put("match_length", String.valueOf(i));
        A1E.put(C66955Mfo.A00(), str);
        A00(this, r5, "suggested_replies_sayt_match", "sayt", A1E);
    }

    public final void A03(C255283ts r4, String str, String str2, int i) {
        AnonymousClass7TF.A1C(r4, 0, str2);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("source", ((C255273tr) r4).A01);
        A1E.put(AnonymousClass000.A00(723), String.valueOf(i));
        A1E.put(C66955Mfo.A00(), str2);
        A00(this, r4, "suggested_replies_tray_impression", str, A1E);
    }
}
