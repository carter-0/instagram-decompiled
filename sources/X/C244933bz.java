package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3bz  reason: invalid class name and case insensitive filesystem */
public final class C244933bz {
    public final Map A00;
    public final Map A01;

    public final Object A00(Object obj) {
        0qQ.A0B(obj, 0);
        Object obj2 = this.A01.get(obj);
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    public final void A01(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        this.A00.put(obj, obj2);
    }

    public C244933bz(0sm r2) {
        this.A00 = new HashMap();
        this.A01 = r2 == null ? 0Yt.A0E() : r2;
    }

    public C244933bz() {
        this((Map) null);
    }
}
