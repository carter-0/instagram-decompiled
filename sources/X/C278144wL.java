package X;

import java.util.Locale;
import java.util.Map;

/* renamed from: X.4wL  reason: invalid class name and case insensitive filesystem */
public abstract class C278144wL {
    public static final C278114wI A00(String str) {
        String str2;
        Map map = C278114wI.A01;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            0qQ.A07(str2);
        } else {
            str2 = null;
        }
        C278114wI r0 = (C278114wI) map.get(str2);
        if (r0 == null) {
            return C278114wI.UNKNOWN;
        }
        return r0;
    }
}
