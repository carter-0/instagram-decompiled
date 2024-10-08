package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.56l  reason: invalid class name and case insensitive filesystem */
public abstract class C2812356l {
    public float A00;
    public long A01 = 0;
    public ArrayList A02 = null;
    public Map A03 = null;

    public final C2812356l A02(String str) {
        String A0g;
        C2812356l r0;
        Map map = this.A03;
        if (map != null && (r0 = (C2812356l) map.get(str)) != null) {
            return r0;
        }
        Map map2 = this.A03;
        if (map2 == null) {
            A0g = "[]";
        } else {
            Iterator it = map2.keySet().iterator();
            String str2 = "";
            while (it.hasNext()) {
                str2 = 002.A0u(str2, "'", (String) it.next(), "'");
                if (!it.hasNext()) {
                    str2 = 002.A0R(str2, ", ");
                }
            }
            A0g = 002.A0g("[", str2, "]");
        }
        throw new RuntimeException(002.A0u("Tried to get non-existent input '", str, "'. Node only has these inputs: ", A0g));
    }
}
