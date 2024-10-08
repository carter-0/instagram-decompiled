package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.2vN  reason: invalid class name and case insensitive filesystem */
public final class C233242vN {
    public static final C233242vN A00 = new Object();

    public final C233262vP A00(UserSession userSession) {
        0Tu r7 = 0Tu.A05;
        if (!182.A06(r7, userSession, 36317478950933676L)) {
            return new C233252vO();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C54614HKx[] values = C54614HKx.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            C54614HKx hKx = values[i];
            if (hKx.ordinal() == 0) {
                linkedHashMap.put(hKx, Boolean.valueOf(182.A06(r7, userSession, 36317478950802603L)));
                i++;
            } else {
                throw new RuntimeException();
            }
        }
        return new C57338IXv(linkedHashMap);
    }
}
