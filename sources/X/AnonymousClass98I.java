package X;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.98I  reason: invalid class name */
public final class AnonymousClass98I {
    public static final AnonymousClass98I A01 = new AnonymousClass98I();
    public final Map A00 = new HashMap();

    public final synchronized void A00(C3738897i r3, Class cls) {
        Map map = this.A00;
        C3738897i r0 = (C3738897i) map.get(cls);
        if (r0 == null || r0.equals(r3)) {
            map.put(cls, r3);
        } else {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
