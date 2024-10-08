package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8dV  reason: invalid class name and case insensitive filesystem */
public final class C359798dV {
    public static final AtomicInteger A03 = new AtomicInteger(1);
    public final int A00;
    public final long A01;
    public final C359928di A02;

    public C359798dV(C359928di r2, int i, long j) {
        this.A02 = r2;
        A03.getAndIncrement();
        this.A00 = i;
        this.A01 = j;
    }
}
