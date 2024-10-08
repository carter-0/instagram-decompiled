package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.TSr  reason: case insensitive filesystem */
public final class C13276TSr extends ReentrantLock implements AutoCloseable {
    public boolean A00;

    public final void close() {
        if (this.A00) {
            unlock();
        }
    }
}
