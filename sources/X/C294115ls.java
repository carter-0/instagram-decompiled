package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5ls  reason: invalid class name and case insensitive filesystem */
public abstract class C294115ls {
    public static final C294125lt A00 = new InheritableThreadLocal();

    public static final boolean A00() {
        C294125lt r2 = A00;
        AtomicInteger atomicInteger = (AtomicInteger) r2.get();
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            r2.set(atomicInteger);
        }
        if (atomicInteger.get() > 0) {
            return true;
        }
        return false;
    }
}
