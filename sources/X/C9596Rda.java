package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Rda  reason: case insensitive filesystem */
public abstract class C9596Rda {
    public static final void A00(C13886Tj9 tj9, Exception exc, String str, Map map, long j) {
        HashMap A0r = Pxf.A0r(map, 2);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            Object value = A1J.getValue();
            if (value != null) {
                A0r.put(key, value);
            }
        }
        if (exc != null) {
            Pxh.A1Q(exc, A0r);
        }
        if (j >= 0) {
            String valueOf = String.valueOf(j);
            A0r.put("elapsed_time", valueOf);
            A0r.put("dt", valueOf);
        }
        tj9.logEvent(str, A0r);
    }
}
