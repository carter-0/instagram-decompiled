package X;

import android.util.LruCache;
import java.util.HashMap;

public final class XU3 {
    public int A00;
    public int A01;
    public LruCache A02;
    public HashMap A03;

    public final synchronized C257113ws A00(C21189XIj xIj) {
        C257113ws r2;
        LruCache lruCache;
        r2 = (C257113ws) this.A02.get(xIj);
        if (!(r2 == null || (lruCache = (LruCache) this.A03.get(xIj.A00)) == null)) {
            lruCache.get(xIj);
        }
        return r2;
    }

    public final synchronized void A01(C21189XIj xIj) {
        LruCache lruCache;
        if (!(((C257113ws) this.A02.remove(xIj)) == null || (lruCache = (LruCache) this.A03.get(xIj.A00)) == null)) {
            lruCache.remove(xIj);
        }
    }

    public final synchronized void A02(C21189XIj xIj, C257113ws r6) {
        HashMap hashMap = this.A03;
        String str = xIj.A00;
        LruCache lruCache = (LruCache) hashMap.get(str);
        if (lruCache == null) {
            lruCache = new XG1(this, this.A00);
            hashMap.put(str, lruCache);
        }
        lruCache.put(xIj, r6);
        this.A02.put(xIj, r6);
    }
}
