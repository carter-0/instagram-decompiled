package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.FYb  reason: case insensitive filesystem */
public final class C50321FYb implements AnonymousClass0lh {
    public List A00 = AnonymousClass7TE.A1C();
    public final UserSession A01;

    public C50321FYb(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
