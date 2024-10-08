package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.TuL  reason: case insensitive filesystem */
public final class C14338TuL implements C228412ld {
    public final Map A00 = new LinkedHashMap();
    public final Map A01 = new LinkedHashMap();

    public final AnonymousClass3W1 BQr(1Xj r3) {
        0qQ.A0B(r3, 0);
        Map map = this.A01;
        AnonymousClass3W1 r0 = (AnonymousClass3W1) map.get(r3);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3W1 A18 = G9t.A18(r3);
        map.put(r3, A18);
        return A18;
    }
}
