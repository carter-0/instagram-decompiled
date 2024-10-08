package X;

import android.util.LruCache;

/* renamed from: X.Lii  reason: case insensitive filesystem */
public final class C64822Lii implements AnonymousClass0lh {
    public final LruCache A00 = new LruCache(30);

    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
