package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vin  reason: case insensitive filesystem */
public final class C17956Vin {
    public final Map A00 = new HashMap();

    public final List A00(String str) {
        0qQ.A0B(str, 0);
        if (str.length() > 0) {
            Map map = this.A00;
            String A0j = DbY.A0j(str);
            if (map.containsKey(A0j)) {
                0qQ.A07(A0j);
                List A13 = C66580MXl.A13(A0j, map);
                if (A13 != null) {
                    return A13;
                }
            }
        }
        return new ArrayList();
    }

    public final void A01(String str, List list) {
        0qQ.A0B(str, 0);
        this.A00.put(DbY.A0j(str), list);
    }
}
