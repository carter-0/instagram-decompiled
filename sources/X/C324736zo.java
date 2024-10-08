package X;

import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6zo  reason: invalid class name and case insensitive filesystem */
public final class C324736zo {
    public final UserSession A00;

    public final IGAdProfileProductTabDict A00(String str) {
        C250513lZ injected;
        1Xj A02 = 1E7.A00(this.A00).A02(str);
        if (A02 == null || (injected = A02.A0C.getInjected()) == null) {
            return null;
        }
        return injected.BhC();
    }

    public final boolean A01(String str, String str2) {
        IGAdProfileProductTabDict A002;
        List Bga;
        1Xj A02;
        UserSession userSession = this.A00;
        if (!182.A06(0Tu.A05, userSession, 36329075362643731L) || (A002 = A00(str)) == null || (Bga = A002.Bga()) == null) {
            return false;
        }
        User user = null;
        if (!(str == null || (A02 = 1E7.A00(userSession).A02(str)) == null)) {
            user = A02.A2A(userSession);
        }
        if (str2 == null || !0qQ.A0K(AnonymousClass3ZA.A00(user), str2)) {
            return false;
        }
        if ((!Bga.isEmpty()) || 0qQ.A0K(A002.BUE(), true)) {
            return true;
        }
        return false;
    }

    public C324736zo(UserSession userSession) {
        this.A00 = userSession;
    }
}
