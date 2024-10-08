package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public abstract class VFZ {
    public static final void A00(UserSession userSession, AnonymousClass4DU r8, C250973mM r9, String str, String str2) {
        long size;
        C263944Ny r1;
        0qQ.A0B(userSession, 0);
        boolean A1Y = DbW.A1Y(r8);
        0wc A01 = AnonymousClass0kN.A01(r8, userSession);
        Reel reel = r9.A0H;
        if (reel.A0o()) {
            size = 0;
        } else {
            size = (long) C250973mM.A00(userSession, r9).size();
        }
        0Aj A0e = AnonymousClass7TE.A0e(A01, "ig_story_locked_impression");
        A0e.A7p("first_view", Boolean.valueOf(A1Y));
        A0e.AAJ("reel_id", JTP.A0r(reel));
        A0e.AAJ("reel_id_type", reel.A0H(userSession));
        A0e.A9F("reel_size", Long.valueOf(size));
        if (str != null) {
            r1 = C263944Ny.A00(str);
        } else {
            r1 = null;
        }
        A0e.AAE(r1, "a_pk");
        C51965G9l.A1I(A0e, str2);
        A0e.Cgf();
    }
}
