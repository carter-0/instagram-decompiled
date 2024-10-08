package X;

import java.io.Closeable;

/* renamed from: X.7Bc  reason: invalid class name and case insensitive filesystem */
public final class C327517Bc implements Closeable {
    public final /* synthetic */ C327507Bb A00;

    public C327517Bc(C327507Bb r1) {
        this.A00 = r1;
    }

    public final void close() {
        this.A00.A01.writeLock().unlock();
    }
}
