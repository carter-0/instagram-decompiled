package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.util.LruCache;

public final class I86 implements ComponentCallbacks2 {
    public final LruCache A00 = new LruCache(10);

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        this.A00.evictAll();
    }

    public final void onTrimMemory(int i) {
        if (i >= 10) {
            onLowMemory();
        }
    }
}
