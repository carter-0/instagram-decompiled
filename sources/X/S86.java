package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class S86 {
    public static final Object A00(AnonymousClass6Tm r4) {
        if (!0KC.A01.isLoggable(5)) {
            return null;
        }
        try {
            Object A0e = DbW.A0e(r4);
            0qQ.A0C(A0e, AnonymousClass000.A00(12));
            List<Object> list = (List) A0e;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (Object A01 : list) {
                A0r.add(A01(A01));
            }
            0KC.A01(5, "BKS::debugLog", C66581MXm.A0w(", ", A0r));
            return null;
        } catch (Exception e) {
            0KC.A0F("BKS::debugLog", "Failed to log", e);
            return null;
        }
    }

    public static final String A01(Object obj) {
        ArrayList arrayList;
        String str;
        String str2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            arrayList = JTQ.A0f(map);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                arrayList.add(002.A0T(A01(A1J.getKey()), A01(A1J.getValue()), '='));
            }
            str = "{ ";
            str2 = " }";
        } else if (obj instanceof List) {
            Iterable<Object> iterable = (Iterable) obj;
            arrayList = AnonymousClass7TG.A0r(iterable);
            for (Object A01 : iterable) {
                arrayList.add(A01(A01));
            }
            str = "[ ";
            str2 = " ]";
        } else if (obj instanceof String) {
            return 002.A0E((String) obj, '\"', '\"');
        } else {
            return String.valueOf(obj);
        }
        return 00k.A0P(", ", str, str2, arrayList, (0sP) null);
    }
}
