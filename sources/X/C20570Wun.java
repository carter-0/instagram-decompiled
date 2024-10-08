package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Wun  reason: case insensitive filesystem */
public final class C20570Wun extends PhantomReference {
    public static final ReferenceQueue A03 = new ReferenceQueue();
    public static final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final AtomicLong A01 = new AtomicLong(0);
    public final 0sP A02;

    public C20570Wun(Object obj, 0sP r7, long j) {
        super(obj, A03);
        this.A02 = r7;
        DbU.A1Y(this, A04, true);
        if (this.A00.compareAndSet(false, true)) {
            this.A01.set(j);
        } else if (this.A01.get() == 0) {
            throw new IllegalStateException("Native instance has been released and must not be used anymore");
        } else {
            throw new IllegalStateException("Native instance is already initialized");
        }
    }

    public final long A00() {
        long j = this.A01.get();
        if (!this.A00.get()) {
            throw new IllegalStateException("Native instance has not been initialized");
        } else if (j != 0) {
            return j;
        } else {
            throw new IllegalStateException("Native instance has been released and must not be used anymore");
        }
    }
}
