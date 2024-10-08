package X;

import android.util.LruCache;

/* renamed from: X.GJs  reason: case insensitive filesystem */
public final class C52227GJs implements AnonymousClass0lh {
    public final LruCache A00 = new LruCache(50);

    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
