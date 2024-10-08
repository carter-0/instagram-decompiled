package X;

import android.util.LruCache;

/* renamed from: X.Oxw  reason: case insensitive filesystem */
public final class C72187Oxw implements AnonymousClass0lh {
    public final LruCache A00 = new LruCache(1024);

    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
