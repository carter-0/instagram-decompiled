package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2oe  reason: invalid class name and case insensitive filesystem */
public final class C229932oe {
    public final Map A00 = new HashMap();

    public final AnonymousClass30Y A00(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass30Y r0 = (AnonymousClass30Y) this.A00.get(str);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass30Y r02 = AnonymousClass30Y.A07;
        0qQ.A08(r02);
        return r02;
    }

    public final void A01(AnonymousClass30Y r2, String str) {
        0qQ.A0B(str, 0);
        this.A00.put(str, r2);
    }
}
