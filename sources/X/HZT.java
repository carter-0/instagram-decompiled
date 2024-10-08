package X;

import com.instagram.common.session.UserSession;

public abstract class HZT {
    public static final void A00(UserSession userSession, String str, String str2, String str3) {
        AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
        r0.A01 = str;
        0Aj A0e = AnonymousClass7TE.A0e(r0.A00(), "ig_creator_guidance_experiment_debug");
        if (A0e.isSampled()) {
            A0e.AAJ("condition", str2);
            A0e.AAJ("exposure_identifier", str3);
            A0e.AAJ("universe", "ig_achievements_2024");
            A0e.Cgf();
        }
    }
}
