package X;

import java.util.Map;

public abstract class S8B {
    public static final boolean A01(String str, StringBuilder sb) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (sb.length() > 0) {
            sb.append(" ");
        }
        sb.append(str);
        return true;
    }

    public static void A00(Object obj, StringBuilder sb, Map map) {
        A01((String) map.get(obj), sb);
    }
}
