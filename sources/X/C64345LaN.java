package X;

import java.util.Map;

/* renamed from: X.LaN  reason: case insensitive filesystem */
public final class C64345LaN implements MTJ {
    public final String Bou() {
        return "MIN_LENGTH_CHECK";
    }

    public final boolean Eta(Map map) {
        0qQ.A0B(map, 0);
        String A11 = DbT.A11("text", map);
        String A112 = DbT.A11("minLen", map);
        if (A112 == null) {
            A112 = "3";
        }
        int parseInt = Integer.parseInt(A112);
        if (A11 == null) {
            A11 = "";
        }
        return A11.length() > parseInt;
    }
}
