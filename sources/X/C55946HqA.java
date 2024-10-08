package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.HqA  reason: case insensitive filesystem */
public final class C55946HqA {
    public final UserSession A00;
    public final C14192TrX A01;

    public final C55537HjJ A00(1Xj r5) {
        UpcomingEvent CBy;
        UserSession userSession = this.A00;
        UpcomingEvent A27 = r5.A27(userSession);
        if (A27 != null) {
            UpcomingEvent A272 = r5.A27(userSession);
            if (A272 != null && C243213Xw.A04(userSession, r5) && C243213Xw.A09(r5) && (!new C310296al(userSession).A00(A272) || (((CBy = r5.A0C.CBy()) != null && CBy.getReminderEnabled()) || A272.getReminderEnabled()))) {
                return new C55537HjJ(this.A01);
            }
            if (!A27.getReminderEnabled()) {
                return new C55537HjJ(this.A01);
            }
        }
        return new C55537HjJ(this.A01);
    }

    public C55946HqA(UserSession userSession, C14192TrX trX) {
        this.A00 = userSession;
        this.A01 = trX;
    }
}
