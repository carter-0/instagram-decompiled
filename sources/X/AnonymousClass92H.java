package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.92H  reason: invalid class name */
public final class AnonymousClass92H {
    public final UserSession A00;

    public AnonymousClass92H(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final String A00(Enum enumR) {
        String name = enumR.name();
        Locale locale = Locale.ROOT;
        0qQ.A08(locale);
        String lowerCase = name.toLowerCase(locale);
        0qQ.A07(lowerCase);
        return lowerCase;
    }
}
