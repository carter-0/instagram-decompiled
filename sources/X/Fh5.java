package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class Fh5 implements AnonymousClass5IX {
    public final UserSession A00;

    public final boolean E1z(AnonymousClass5IY r9) {
        UserSession userSession = this.A00;
        long j = 1Al.A01(userSession).A04(1An.A18, getClass()).getLong("IGD_PARENTAL_ACCESS_CONTROL_EDUCATION_REMIND_ME_LATER_TIMESTAMP_KEY", 0);
        if (j == 0) {
            return false;
        }
        if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - j) >= 182.A01(0Tu.A05, userSession, 36607689891321445L)) {
            return true;
        }
        return false;
    }

    public Fh5(UserSession userSession) {
        this.A00 = userSession;
    }
}
