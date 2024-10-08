package X;

import android.util.LruCache;
import java.util.Map;

/* renamed from: X.4CF  reason: invalid class name */
public final class AnonymousClass4CF {
    public static AnonymousClass4CF A02;
    public C58840Ae A00 = null;
    public final LruCache A01 = new LruCache(25);

    public final void A01(C18590Vuh vuh) {
        synchronized (this) {
            C58840Ae r0 = this.A00;
            if (r0 == null) {
                this.A01.put(Integer.valueOf(vuh.hashCode()), vuh);
            } else {
                A00(r0, vuh);
            }
        }
    }

    public static void A00(C58840Ae r2, C18590Vuh vuh) {
        0wc r22 = (0wc) r2;
        0Aj A002 = r22.A00(r22.A00, "stash_keystats_event");
        if (A002.isSampled()) {
            A002.AAJ("event_uuid", AnonymousClass0HM.A00().toString());
            A002.AAJ("cache_name", vuh.A0E);
            A002.A9H("process_values", vuh.A01());
            A002.A9H("metadata", vuh.A0G);
            A002.AAJ("cache_key", (String) null);
            A002.A9H("actions", (Map) null);
            A002.Cgf();
        }
    }
}
