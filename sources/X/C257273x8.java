package X;

import java.util.Map;

@Deprecated
/* renamed from: X.3x8  reason: invalid class name and case insensitive filesystem */
public abstract class C257273x8 {
    public static boolean A00(Map map) {
        if (!map.containsKey("update_prefetch_priority") || Integer.parseInt((String) map.get("update_prefetch_priority")) == 0) {
            return false;
        }
        return true;
    }
}
