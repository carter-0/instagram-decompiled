package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class I5M {
    public static final I5M A00 = new Object();

    public static final 1OC A01(UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        return A00(userSession, (Integer) null, C51971G9r.A0m(), str, str2, str3, str4, str5, (String) null, (String) null);
    }

    public static final 1OC A00(UserSession userSession, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0E = str;
        C51965G9l.A1S(A0a, str5);
        A0a.A0G("session_info", str3);
        C51968G9o.A1M(A0a, "seen_reels", str4, str2);
        A0a.A0G("chaining_media_id", str6);
        A0a.A0G("media_note_author_id", str7);
        A0a.A09(num, AnonymousClass000.A00(1182));
        A0a.A0Q(C298815u5.class, AnonymousClass93W.class);
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 0) {
                A0a.A03();
                String str8 = "";
                if (str2 == null) {
                    str2 = str8;
                }
                if (str6 == null) {
                    str6 = str8;
                }
                if (str7 != null) {
                    str8 = str7;
                }
                A0a.A0A = 002.A0u(str, str2, str6, str8);
                A0a.A01 = TimeUnit.DAYS.toMillis(1);
                A0a.A00 = longValue;
            }
        }
        return A0a.A0M();
    }
}
