package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.5fg  reason: invalid class name and case insensitive filesystem */
public final class C290655fg {
    public final ReentrantReadWriteLock A00 = new ReentrantReadWriteLock();
    public final boolean A01;

    public final void A00() {
        if (!this.A01 && !this.A00.writeLock().isHeldByCurrentThread()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public C290655fg(boolean z) {
        this.A01 = z;
    }
}
