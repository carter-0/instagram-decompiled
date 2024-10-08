package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.78T  reason: invalid class name */
public final class AnonymousClass78T implements AnonymousClass78U {
    public final boolean CVU(UserSession userSession, AnonymousClass78R r7, String str) {
        0qQ.A0B(userSession, 2);
        if (str.length() == 0 || !O00.A00(userSession, r7.commandType, str)) {
            return false;
        }
        String substring = str.substring(1);
        0qQ.A07(substring);
        if (substring.length() == 0) {
            return true;
        }
        String str2 = r7.trigger;
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        0qQ.A07(lowerCase);
        0qQ.A0B(str2, 0);
        if (!str2.startsWith(lowerCase)) {
            return false;
        }
        return true;
    }
}
