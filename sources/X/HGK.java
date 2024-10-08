package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class HGK extends C243843aC {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C262794Ga A01;
    public final /* synthetic */ 1Xj A02;

    public HGK(UserSession userSession, C262794Ga r2, 1Xj r3) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        LRh lRh = new LRh(this.A00, AnonymousClass7TE.A0S(AnonymousClass7TE.A0c(this.A01.A0F)));
        String A2n = this.A02.A2n();
        UserSession userSession = lRh.A07;
        AnonymousClass0iw r2 = lRh.A05;
        0Aj A0S = C51975G9x.A0S(r2, userSession);
        if (A0S.isSampled()) {
            C51965G9l.A1C(C54689HOu.FOLLOW_BUTTON, A0S);
            DbW.A16(A0S, r2);
            C51965G9l.A1K(A0S, lRh.A08);
            C51965G9l.A1E(A0S, LRh.A00(A2n));
            A0S.Cgf();
        }
    }
}
