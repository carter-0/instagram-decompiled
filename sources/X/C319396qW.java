package X;

import android.util.LruCache;

/* renamed from: X.6qW  reason: invalid class name and case insensitive filesystem */
public final class C319396qW implements AnonymousClass0lh {
    public final LruCache A00 = new LruCache(30);

    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
