package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EcG  reason: case insensitive filesystem */
public abstract class C48297EcG {
    public static HashMap A00(Map map) {
        String valueOf;
        String valueOf2;
        String valueOf3;
        if (map == null) {
            return null;
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object value = A1J.getValue();
            Object key = A1J.getKey();
            boolean z = key instanceof Number;
            if (value == null) {
                if (z) {
                    valueOf3 = key.toString();
                } else {
                    valueOf3 = String.valueOf(key);
                }
                A1E.put(valueOf3, (Object) null);
            } else {
                if (z) {
                    valueOf = key.toString();
                } else {
                    valueOf = String.valueOf(key);
                }
                Object value2 = A1J.getValue();
                if (value2 instanceof Number) {
                    valueOf2 = value2.toString();
                } else {
                    valueOf2 = String.valueOf(value2);
                }
                A1E.put(valueOf, valueOf2);
            }
        }
        return A1E;
    }
}
