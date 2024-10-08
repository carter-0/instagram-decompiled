package X;

import java.util.Map;

/* renamed from: X.LaM  reason: case insensitive filesystem */
public final class C64344LaM implements MTJ {
    public final String Bou() {
        return "MAX_WORD_CHECK";
    }

    public final boolean Eta(Map map) {
        0qQ.A0B(map, 0);
        String A11 = DbT.A11("text", map);
        String A112 = DbT.A11("maxWords", map);
        if (A112 == null) {
            A112 = "3";
        }
        int parseInt = Integer.parseInt(A112);
        if (A11 != null) {
            if (00l.A0Q(A11, new char[]{' '}, 0).size() <= parseInt) {
                return true;
            }
        }
        return false;
    }
}
