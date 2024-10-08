package X;

import android.util.LruCache;

/* renamed from: X.6zP  reason: invalid class name and case insensitive filesystem */
public final class C324496zP implements AnonymousClass0lh {
    public final LruCache A00 = new LruCache(30);

    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
