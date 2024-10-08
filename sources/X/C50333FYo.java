package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FYo  reason: case insensitive filesystem */
public final class C50333FYo implements AnonymousClass0lh {
    public final Map A00 = AnonymousClass7TE.A1E();

    public static C50333FYo A00(UserSession userSession) {
        return (C50333FYo) userSession.A01(C50333FYo.class, new C51585FwZ(3));
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
