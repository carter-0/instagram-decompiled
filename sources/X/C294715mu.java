package X;

import android.util.LruCache;

/* renamed from: X.5mu  reason: invalid class name and case insensitive filesystem */
public final class C294715mu implements Runnable {
    public final /* synthetic */ C294665mp A00;

    public C294715mu(C294665mp r1) {
        this.A00 = r1;
    }

    public final void run() {
        C294665mp r7 = this.A00;
        C250653lq r0 = r7.A03;
        long currentTimeMillis = System.currentTimeMillis();
        LruCache lruCache = r0.A00;
        for (Object next : lruCache.snapshot().keySet()) {
            C294655mo r02 = (C294655mo) lruCache.get(next);
            if (r02 != null) {
                long j = r02.A00;
                if (j != -1 && j <= currentTimeMillis) {
                    lruCache.remove(next);
                }
            }
        }
        if (lruCache.size() > 0) {
            r7.A02.postDelayed(new C294715mu(r7), r7.A01);
        } else {
            r7.A00 = false;
        }
    }
}
