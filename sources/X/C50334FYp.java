package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.FYp  reason: case insensitive filesystem */
public final class C50334FYp implements AnonymousClass0lh {
    public final UserSession A00;
    public final Set A01 = AnonymousClass7TE.A1F();

    public static C50334FYp A00(UserSession userSession) {
        return (C50334FYp) userSession.A01(C50334FYp.class, new C51586Fwa(userSession, 3));
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public C50334FYp(UserSession userSession) {
        this.A00 = userSession;
    }
}
