package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class FFB {
    public static final ArrayList A00(String str, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (!(str == null || str.length() == 0 || !str.equals((Object) null))) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public static final void A01(String str, StringBuilder sb, List list) {
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append(":\n\n");
            for (Object obj : list) {
                sb.append(obj.toString());
                sb.append("\n");
            }
            sb.append("\n");
        }
    }

    public static final void A02(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F2B f2b = (F2B) it.next();
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(f2b.A01);
        }
    }

    public static final void A03(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F2B f2b = (F2B) it.next();
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(f2b.A02);
        }
    }
}
