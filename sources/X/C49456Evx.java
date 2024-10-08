package X;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Evx  reason: case insensitive filesystem */
public final class C49456Evx {
    public final Map A00 = new ConcurrentHashMap();
    public final Map A01 = new ConcurrentHashMap();

    public C49456Evx() {
        for (Object put : C48074EUs.A00) {
            this.A01.put(put, Collections.newSetFromMap(new ConcurrentHashMap()));
        }
        for (Object next : C48080EUy.A00) {
            for (Object A1L : EV8.A00) {
                this.A00.put(AnonymousClass7TE.A1L(next, A1L), Collections.newSetFromMap(new ConcurrentHashMap()));
            }
        }
    }
}
