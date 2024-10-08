package X;

import java.util.Map;

/* renamed from: X.Rf6  reason: case insensitive filesystem */
public abstract class C9688Rf6 {
    public static C8310Qnq A00(C11011S5i s5i, Integer num, Long l, Long l2, String str, Map map) {
        String str2 = "";
        if (l == null) {
            str2 = 002.A0R(str2, " eventMillis");
        }
        if (l2 == null) {
            str2 = 002.A0R(str2, " uptimeMillis");
        }
        if (str2.isEmpty()) {
            return new C8310Qnq(s5i, num, str, map, l.longValue(), l2.longValue());
        }
        throw DbW.A0c("Missing required properties:", str2);
    }
}
