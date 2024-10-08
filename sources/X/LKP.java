package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

public abstract class LKP {
    public static final void A00(AnonymousClass0iw r4, UserSession userSession, String str, String str2) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(MYP.A00(), str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "ig_cg_composer_show_new_fundraiser");
        A0e.A9H("attributes", A1E);
        A0e.AAJ("source_name", str2);
        A0e.A8M(XSG.IG_STANDALONE_FOR_CHARITY, "fundraiser_type");
        A0e.Cgf();
    }

    public static final void A01(AnonymousClass0iw r4, UserSession userSession, String str, String str2) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(MYP.A00(), str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "ig_cg_composer_tap_on_new_fundraiser");
        A0e.A9H("attributes", A1E);
        A0e.AAJ("source_name", str2);
        A0e.A8M(XSG.IG_STANDALONE_FOR_CHARITY, "fundraiser_type");
        A0e.Cgf();
    }
}
