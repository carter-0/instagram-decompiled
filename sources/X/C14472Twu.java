package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Twu  reason: case insensitive filesystem */
public final class C14472Twu implements 0lm {
    public final C14016ToI A00;

    public C14472Twu(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = new C14016ToI(userSession, C67420Mnb.A00, C14473Twv.A00, 100);
    }

    public final synchronized void A00(C66569MWx mWx) {
        this.A00.A04(mWx);
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            synchronized (this) {
                this.A00.A03();
            }
        }
    }
}
