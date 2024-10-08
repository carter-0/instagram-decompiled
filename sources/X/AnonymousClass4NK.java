package X;

import android.util.LruCache;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4NK  reason: invalid class name */
public final class AnonymousClass4NK {
    public final AnonymousClass4NJ A00;
    public final Map A01 = new ConcurrentHashMap();
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicReference A03 = new AtomicReference("-1");
    public final LruCache A04 = new LruCache(200);
    public final 1yA A05;

    public AnonymousClass4NK(1yA r3, AnonymousClass4NJ r4) {
        0qQ.A0B(r3, 1);
        this.A05 = r3;
        this.A00 = r4;
    }

    public final AnonymousClass4OY A00(AnonymousClass4OY r3, String str) {
        if (!this.A05.A0H) {
            return r3;
        }
        Map map = this.A01;
        if (map.containsKey(str)) {
            return (AnonymousClass4OY) map.get(str);
        }
        return null;
    }

    public final void A01() {
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((String) entry.getKey()).equals(this.A03.get())) {
                AnonymousClass4OY r0 = (AnonymousClass4OY) entry.getValue();
                if (r0 != null) {
                    r0.A00();
                }
                it.remove();
            }
        }
    }

    public final boolean A02(long j, boolean z) {
        boolean z2;
        LruCache lruCache = this.A04;
        synchronized (lruCache) {
            Long valueOf = Long.valueOf(j);
            z2 = false;
            if (lruCache.get(valueOf) == null) {
                z2 = true;
                if (z) {
                    lruCache.put(valueOf, valueOf);
                }
            }
        }
        return z2;
    }
}
