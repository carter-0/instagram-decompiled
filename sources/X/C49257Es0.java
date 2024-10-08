package X;

import com.meta.foa.accountswitcher.UserAccountInfo;
import java.util.List;
import java.util.Map;

/* renamed from: X.Es0  reason: case insensitive filesystem */
public abstract class C49257Es0 {
    public static final UserAccountInfo A00(Map map) {
        0qQ.A0B(map, 0);
        Object obj = map.get("USER_ID");
        if (obj != null) {
            String str = (String) obj;
            String A0r = DbU.A0r("OBFUSCATED_ACCOUNT_ID", map);
            Object obj2 = map.get("ACCOUNT_TYPE");
            if (obj2 != null) {
                return new UserAccountInfo(str, A0r, (String) obj2, DbU.A0r("APP_ACCOUNT_STATUS", map), DbU.A0r("USERNAME", map), DbU.A0r("NAME", map), DbU.A0r("PROFILE_PICTURE_URL", map), DbU.A0r("BADGE_TEXT", map), DbU.A0r("BADGE_COUNT", map), DbU.A0r("UNPACKED_NOTIFICATIONS", map), DbT.A11(Pxd.A00(344), map), (List) null);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
