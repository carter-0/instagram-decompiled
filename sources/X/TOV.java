package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class TOV implements Lock {
    public final void lock() {
    }

    public final void lockInterruptibly() {
    }

    public final boolean tryLock() {
        return true;
    }

    public final boolean tryLock(long j, TimeUnit timeUnit) {
        return true;
    }

    public final void unlock() {
    }

    public final Condition newCondition() {
        throw AnonymousClass7TE.A1B("Should not be called");
    }
}
