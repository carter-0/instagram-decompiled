package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.7LX  reason: invalid class name */
public abstract class AnonymousClass7LX {
    public static final C61081JwJ A00(UserSession userSession, String str) {
        String string;
        if (!(str == null || (string = 1Au.A00(userSession).A01.getString(002.A0R("direct_thread_formatted_draft_", str), (String) null)) == null || string.length() <= 0)) {
            try {
                return C63244Ktp.parseFromJson(16P.A00(string));
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
