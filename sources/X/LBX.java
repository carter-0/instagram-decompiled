package X;

import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.common.session.UserSession;

public final class LBX {
    public final KUZ A00(UserSession userSession, String str, String str2, String str3, boolean z) {
        0qQ.A0B(userSession, 0);
        if (str3 == null) {
            str3 = C2818159r.A01();
        }
        if ("SETTINGS".equals(str)) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), "user_click_appreciationonboarding_atomic");
            if (A0e.isSampled()) {
                JTU.A0y(A0e, str3);
                0bb r2 = new 0bb();
                r2.A06("view_name", AnonymousClass000.A00(2956));
                r2.A06("target_name", "gifts_on_reels");
                A0e.AAK(r2, "event_payload");
                JTT.A1A(A0e, 0Yt.A0E());
            }
        }
        KUZ kuz = new KUZ();
        DbT.A1N(kuz, AnonymousClass7TH.A0h(AnonymousClass000.A00(203), str2, AnonymousClass7TE.A1L("appreciation_logging_data", new LoggingData(str3, AnonymousClass7TF.A0j(str))), AnonymousClass7TE.A1L("arg_start_onboarding", Boolean.valueOf(z)), AnonymousClass7TE.A1L(C273654mx.A00(102), str)));
        return kuz;
    }
}
