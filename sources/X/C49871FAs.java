package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FAs  reason: case insensitive filesystem */
public final class C49871FAs {
    public static final C49871FAs A00 = new Object();

    public final String A00(UserSession userSession, User user) {
        String str;
        String AaU = user.A03.AaU();
        if (AaU == null) {
            return null;
        }
        if (182.A06(0Tu.A05, userSession, 36319398807411986L)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(C60960kU.A00.getApplicationContext().getText(2131952777));
            A1A.append(' ');
            str = A1A.toString();
        } else {
            str = "";
        }
        return 002.A0u(str, "https://aistudio.instagram.com/ai/", AaU, "?utm_source=ig4a");
    }
}
