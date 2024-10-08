package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.71s  reason: invalid class name and case insensitive filesystem */
public final class C3252671s implements 0lm {
    public final UserSession A00;
    public final HashMap A01 = new HashMap();
    public final HashSet A02 = new HashSet();

    public C3252671s(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A02.clear();
    }
}
