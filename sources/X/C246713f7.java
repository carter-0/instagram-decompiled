package X;

import java.util.Map;

/* renamed from: X.3f7  reason: invalid class name and case insensitive filesystem */
public final class C246713f7 {
    public final Map A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Map map = this.A00;
            Map map2 = ((C246713f7) obj).A00;
            return map == map2 || (map != null && map.equals(map2));
        }
    }

    public final int hashCode() {
        Map map = this.A00;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public C246713f7(Map map) {
        this.A00 = map;
    }
}
