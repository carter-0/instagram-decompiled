package X;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* renamed from: X.4dJ  reason: invalid class name and case insensitive filesystem */
public final class C268394dJ extends AbstractOwnableSynchronizer implements Runnable {
    public final 1LO A00;

    public final void run() {
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C268394dJ(1LO r1) {
        this.A00 = r1;
    }

    public Thread getOwner() {
        return super.getExclusiveOwnerThread();
    }

    public static void A00(C268394dJ r0, Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }
}
