package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.4hI  reason: invalid class name and case insensitive filesystem */
public final class C270784hI implements AnonymousClass0lh {
    public long A00;
    public 1Xj A01;
    public final UserSession A02;
    public final HashSet A03 = new HashSet();
    public final C61410nE A04 = C61410nE.A00;

    public C270784hI(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void onSessionWillEnd() {
        this.A01 = null;
        this.A00 = 0;
        this.A03.clear();
    }
}
