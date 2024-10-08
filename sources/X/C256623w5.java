package X;

import android.util.LruCache;

/* renamed from: X.3w5  reason: invalid class name and case insensitive filesystem */
public final class C256623w5 {
    public static C256623w5 A01;
    public final LruCache A00;

    public final synchronized void A01() {
        this.A00.evictAll();
    }

    public static synchronized C256623w5 A00() {
        C256623w5 r0;
        synchronized (C256623w5.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = null;
            }
        }
        return r0;
    }

    public C256623w5(int i) {
        this.A00 = new LruCache(i <= 0 ? 5 : i);
    }
}
