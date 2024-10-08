package X;

import android.util.LruCache;

/* renamed from: X.6ay  reason: invalid class name and case insensitive filesystem */
public final class C310396ay implements AnonymousClass0lh {
    public final LruCache A00 = new LruCache(4);

    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
