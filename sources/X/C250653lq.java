package X;

import android.util.LruCache;
import com.instagram.repository.common.MemoryCache;

/* renamed from: X.3lq  reason: invalid class name and case insensitive filesystem */
public final class C250653lq extends MemoryCache {
    public final LruCache A00;
    public final AnonymousClass0eM A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.4HQ] */
    public C250653lq(int i, long j) {
        super(new Object(), j);
        this.A01 = AnonymousClass0eN.A01(new C41565AwX(j, this, 3));
        this.A00 = new LruCache(i);
    }

    public final Object A01(Object obj, Object obj2) {
        Object A012 = super.A01(obj, obj2);
        C294665mp r2 = (C294665mp) this.A01.getValue();
        r2.A02.post(new C294675mq(r2));
        return A012;
    }
}
