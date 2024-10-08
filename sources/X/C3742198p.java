package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.98p  reason: invalid class name and case insensitive filesystem */
public final class C3742198p {
    public Map A00 = new HashMap();
    public Map A01 = new HashMap();

    public final C3742398r A00() {
        return new C3742398r(Collections.unmodifiableMap(this.A00), Collections.unmodifiableMap(this.A01));
    }

    public final void A01(Enum enumR, Object obj) {
        this.A00.put(enumR, obj);
        this.A01.put(obj, enumR);
    }
}
