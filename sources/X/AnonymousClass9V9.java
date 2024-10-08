package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.9V9  reason: invalid class name */
public final class AnonymousClass9V9 implements AnonymousClass0lh {
    public ArrayList A00 = AnonymousClass7TE.A1C();
    public final UserSession A01;

    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    public AnonymousClass9V9(UserSession userSession) {
        this.A01 = userSession;
    }
}
