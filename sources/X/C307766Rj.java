package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6Rj  reason: invalid class name and case insensitive filesystem */
public final class C307766Rj {
    public final Object A00 = new Object();
    public final Map A01 = new HashMap();

    public final int A00(C276544tV r6, C276544tV r7, String str) {
        int incrementAndGet;
        C379779Vg r4 = new C379779Vg(r7.A03, r6.A03, str);
        synchronized (this.A00) {
            Map map = this.A01;
            Integer num = (Integer) map.get(r4);
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = C276604tb.A00.incrementAndGet();
                map.put(r4, Integer.valueOf(incrementAndGet));
            }
        }
        return incrementAndGet;
    }
}
