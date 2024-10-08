package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Rei  reason: case insensitive filesystem */
public abstract class C9664Rei {
    public static ArrayList A00(Map map) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        List list = (List) map.get("DYNAMIC_AUTH_AUTH_TYPES");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Enum A00 = RV4.A00(RIj.class, AnonymousClass7TE.A18(it));
                if (A00 != null) {
                    A1C.add(A00);
                }
            }
        }
        return A1C;
    }
}
