package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.IkB  reason: case insensitive filesystem */
public final class C58018IkB implements 0sP {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A03 = AtomicIntegerFieldUpdater.newUpdater(C58018IkB.class, "_state$volatile");
    public AnonymousClass19L A00;
    public final Thread A01 = Thread.currentThread();
    public final C262204Co A02;
    public volatile /* synthetic */ int _state$volatile;

    public final void A00() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A03;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    }
                    throw DbW.A0b("Illegal state ", i);
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                AnonymousClass19L r0 = this.A00;
                if (r0 != null) {
                    r0.dispose();
                    return;
                }
                return;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A03;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i == 0) {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i, 2)) {
                    this.A01.interrupt();
                    atomicIntegerFieldUpdater.set(this, 3);
                    break;
                }
            } else if (i != 1 && i != 2 && i != 3) {
                throw DbW.A0b("Illegal state ", i);
            }
        }
        return C60340gF.A00;
    }

    public C58018IkB(C262204Co r2) {
        this.A02 = r2;
    }
}
