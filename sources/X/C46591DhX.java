package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DhX  reason: case insensitive filesystem */
public final class C46591DhX {
    public static final C46591DhX A00 = new Object();

    public static final void A01(G8K g8k, Object obj, String str) {
        0qQ.A0B(obj, 2);
        if (obj instanceof Number) {
            g8k.CmE(str, AnonymousClass7TE.A0R(obj));
        } else if (obj instanceof Boolean) {
            g8k.CmG(str, AnonymousClass7TE.A1a(obj));
        } else {
            g8k.CmF(str, obj.toString());
        }
    }

    public static final void A03(Long l, String str, String str2, Map map, int i) {
        0qQ.A0B(map, 3);
        G8K A002 = A00(str, i);
        if (A002 != null) {
            if (l == null) {
                A002.CmM(str2);
            } else {
                A002.CmN(str2, l.longValue());
            }
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry entry = (Map.Entry) A0u.next();
                entry.getKey();
                entry.getValue();
                A02(A002, map);
            }
        }
    }

    public static final G8K A00(String str, int i) {
        G8K g8k;
        if (str == null) {
            return null;
        }
        int parseInt = Integer.parseInt(str);
        C276904u6 A002 = C276904u6.A05.A00();
        long j = (((long) parseInt) & 4294967295L) | ((((long) i) << 32) & -4294967296L);
        synchronized (A002) {
            g8k = (G8K) A002.A00.get(j);
        }
        return g8k;
    }

    public static final void A02(G8K g8k, Map map) {
        String str;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry entry = (Map.Entry) A0u.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (!(key instanceof Number) || key == null || (str = key.toString()) == null) {
                    str = key.toString();
                }
                A01(g8k, value, str);
            }
        }
    }
}
