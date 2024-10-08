package X;

import android.util.LruCache;

public final class S1B {
    public final LruCache A00 = new LruCache(20);
    public final AnonymousClass0JP A01;

    public final RRR A00(String str) {
        0qQ.A0B(str, 0);
        LruCache lruCache = this.A00;
        C53394GnR gnR = (C53394GnR) lruCache.get(str);
        if (gnR == null) {
            return null;
        }
        if (gnR.A00 > this.A01.now()) {
            return (RRR) gnR.A01;
        }
        lruCache.remove(str);
        return null;
    }

    public /* synthetic */ S1B() {
        AnonymousClass0Gt r1 = AnonymousClass0Gt.A00;
        0qQ.A0B(r1, 3);
        this.A01 = r1;
    }
}
