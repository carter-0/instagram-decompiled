package X;

import android.util.LruCache;
import java.io.IOException;

public final class XG0 extends LruCache {
    public final /* synthetic */ XU3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XG0(XU3 xu3, int i) {
        super(i);
        this.A00 = xu3;
    }

    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        C21189XIj xIj = (C21189XIj) obj;
        C257113ws r5 = (C257113ws) obj2;
        if (z) {
            try {
                r5.close();
            } catch (IOException unused) {
            }
            LruCache lruCache = (LruCache) this.A00.A03.get(xIj.A00);
            if (lruCache != null) {
                lruCache.remove(xIj);
            }
        }
    }
}
