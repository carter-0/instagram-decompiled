package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.78e  reason: invalid class name and case insensitive filesystem */
public final class C3267978e implements AnonymousClass78U {
    public static final C3267978e A00 = new Object();

    public final boolean CVU(UserSession userSession, AnonymousClass78R r8, String str) {
        0qQ.A0B(userSession, 2);
        if (str.length() == 0 || (str.charAt(0) != r8.commandType.A00 && (str.charAt(0) != '/' || !182.A06(0Tu.A05, userSession, 36330570011198138L)))) {
            return false;
        }
        String substring = str.substring(1);
        0qQ.A07(substring);
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        0qQ.A07(lowerCase);
        if (lowerCase.length() != 0) {
            0qQ.A0B("meta", 0);
            if (!"meta".startsWith(lowerCase)) {
                0qQ.A0B("ai", 0);
                if (!"ai".startsWith(lowerCase)) {
                    0qQ.A0B("meta", 1);
                    if (!lowerCase.startsWith("meta") || !182.A06(0Tu.A05, userSession, 36331179896488899L)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
