package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

public final class KJR extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJR(2Lk r7) {
        super("maybePrefetchContentNotesFeedAvailability", 849665190, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        JUB jub = (JUB) userSession.A01(JUB.class, new MMC(userSession, 5));
        if (0qQ.A0K(jub.A02.getValue(), JUC.A00)) {
            MG7.A01(jub, jub.A01, 40);
        }
    }
}
