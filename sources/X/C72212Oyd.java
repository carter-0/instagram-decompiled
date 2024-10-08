package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oyd  reason: case insensitive filesystem */
public final class C72212Oyd implements 0lm {
    public final MSGNotificationEngineValueProvider A00;
    public final UserSession A01;
    public final C68310N9x A02;
    public final OFM A03;
    public MSGNotificationEngineIntegrator integrator;

    public /* synthetic */ C72212Oyd(UserSession userSession) {
        MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider = new MSGNotificationEngineValueProvider();
        C68310N9x n9x = new C68310N9x(userSession);
        OFM ofm = new OFM(userSession);
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = mSGNotificationEngineValueProvider;
        this.A02 = n9x;
        this.A03 = ofm;
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.integrator = null;
        }
    }
}
