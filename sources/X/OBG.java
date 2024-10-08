package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

public final class OBG {
    public final UserFlowLoggerImpl A00;
    public final UserSession A01;

    public /* synthetic */ OBG(UserSession userSession) {
        UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(02m.A0p);
        this.A01 = userSession;
        this.A00 = userFlowLoggerImpl;
    }
}
