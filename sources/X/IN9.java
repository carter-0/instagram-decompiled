package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IN9 implements AnonymousClass0iw {
    public static final IN9 A00 = new Object();
    public static final String __redex_internal_original_name = "AchievementsLoggingUtil";

    public static final List A00(List list) {
        XSM xsm;
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Achievement) it.next()).A03.A00;
            0qQ.A0B(str, 0);
            XSM[] values = XSM.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    xsm = null;
                    break;
                }
                xsm = values[i];
                if (str.equals(xsm.A00)) {
                    break;
                }
                i++;
            }
            A0r.add(xsm);
        }
        return A0r;
    }

    public final String getModuleName() {
        return "creator_logging_util";
    }

    public final void A01(UserSession userSession) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, userSession), "instagram_clips_toast_tap");
        if (A0e.isSampled()) {
            C51965G9l.A19(C52236GKd.A0T, A0e);
            C51965G9l.A1C(AnonymousClass5OC.UNLOCKED_ACHIEVEMENTS, A0e);
            C51965G9l.A1M(A0e, "creator_logging_util");
            C51965G9l.A1P(A0e, "");
            C51970G9q.A19(A0e, 0);
            C51965G9l.A1O(A0e, "");
            A0e.Cgf();
        }
    }
}
