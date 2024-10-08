package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.7Bb  reason: invalid class name and case insensitive filesystem */
public final class C327507Bb {
    public final C327517Bc A00 = new C327517Bc(this);
    public final ReentrantReadWriteLock A01 = new ReentrantReadWriteLock();

    public final void A00() {
        17k.A0F(this.A01.writeLock().isHeldByCurrentThread());
    }
}
