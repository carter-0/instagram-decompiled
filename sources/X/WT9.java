package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

public final class WT9 implements 0lm {
    public final 1QP A00;

    public WT9(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass1QO.A00(userSession);
    }

    public static final void A01(VRR vrr, WT9 wt9, String str) {
        long j = vrr.A00;
        if (j != 0) {
            wt9.A00.flowMarkPoint(j, str, (String) null);
        }
    }

    public static final void A00(VRR vrr, WT9 wt9) {
        long j = vrr.A00;
        if (j != 0) {
            wt9.A00.flowEndCancel(j, CancelReason.USER_CANCELLED);
            vrr.A00 = 0;
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        A00(C15414UcQ.A00, this);
        A00(C15415UcR.A00, this);
    }
}
