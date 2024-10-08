package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.5F3  reason: invalid class name */
public final class AnonymousClass5F3 {
    public final UserSession A00;

    public final boolean A01(1Xj r5) {
        UpcomingEvent A27;
        UpcomingEvent A272;
        UserSession userSession = this.A00;
        if ((!r5.A6T(userSession) || !C243213Xw.A08(r5) || !C243213Xw.A02(userSession, r5) || (A272 = r5.A27(userSession)) == null || C18810W3l.A03(A272) != AnonymousClass05K.A00 || !C243213Xw.A09(r5) || !182.A06(0Tu.A05, userSession, 36327619368598074L)) && (((A27 = r5.A27(userSession)) == null || !C18810W3l.A0C(A27) || !C243213Xw.A08(r5) || !C243213Xw.A02(userSession, r5) || !C243213Xw.A09(r5) || !182.A06(0Tu.A05, userSession, 36327619369384509L)) && !A00(userSession, r5))) {
            return false;
        }
        return true;
    }

    public AnonymousClass5F3(UserSession userSession) {
        this.A00 = userSession;
    }

    public final boolean A00(UserSession userSession, 1Xj r6) {
        UpcomingEvent A27 = r6.A27(userSession);
        if (A27 == null || !C18810W3l.A0C(A27) || !C243213Xw.A08(r6) || !C243213Xw.A02(userSession, r6) || !C243213Xw.A09(r6)) {
            return false;
        }
        boolean A06 = 182.A06(0Tu.A05, userSession, 36327619368663611L);
        0qQ.A0A(Boolean.valueOf(A06));
        if (A06) {
            return true;
        }
        return false;
    }
}
