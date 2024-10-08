package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8nC  reason: invalid class name and case insensitive filesystem */
public final class C365488nC {
    public static final AtomicInteger A03 = new AtomicInteger();
    public final int A00 = A03.getAndIncrement();
    public final Integer A01;
    public final Set A02;

    public C365488nC(Integer num, Set set) {
        this.A01 = num;
        this.A02 = set;
    }
}
