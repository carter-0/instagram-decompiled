package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Yr  reason: invalid class name and case insensitive filesystem */
public abstract class C243413Yr {
    public static final String A01(List list) {
        int ordinal;
        String str;
        if (list.isEmpty()) {
            return "None";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3PG r1 = (AnonymousClass3PG) it.next();
            if (!(r1 == null || (ordinal = r1.ordinal()) == -1)) {
                if (ordinal == 2) {
                    str = "Local";
                } else if (ordinal == 0) {
                    str = AnonymousClass000.A00(2382);
                } else if (ordinal == 1) {
                    str = "Cached";
                } else {
                    throw new RuntimeException();
                }
                arrayList.add(str);
            }
        }
        return 00k.A0P(", ", "", "", arrayList, (0sP) null);
    }

    public static final String A00(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return 00k.A0P(",", "", "", 00k.A0X(new ArrayList(list)), (0sP) null);
    }
}
