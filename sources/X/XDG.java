package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class XDG extends AtomicInteger implements Runnable, 1aL, C65051aA {
    public C65051aA A00;
    public Throwable A01;
    public boolean A02;
    public final long A03;
    public final 1aL A04;
    public final C318286oh A05;
    public final TimeUnit A06;
    public final AtomicReference A07 = new AtomicReference();
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public final void dispose() {
        this.A08 = true;
        this.A00.dispose();
        this.A05.dispose();
        if (getAndIncrement() == 0) {
            this.A07.lazySet((Object) null);
        }
    }

    public final void onComplete() {
        this.A09 = true;
        A00();
    }

    public final void run() {
        this.A0A = true;
        A00();
    }

    public final void DUK(Object obj) {
        this.A07.set(obj);
        A00();
    }

    public final void Do4(C65051aA r2) {
        if (1af.A02(this.A00, r2)) {
            this.A00 = r2;
            this.A04.Do4(this);
        }
    }

    public final void onError(Throwable th) {
        this.A01 = th;
        this.A09 = true;
        A00();
    }

    public XDG(1aL r2, C318286oh r3, TimeUnit timeUnit, long j) {
        this.A04 = r2;
        this.A03 = j;
        this.A06 = timeUnit;
        this.A05 = r3;
    }

    public final void A00() {
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.A07;
            1aL r5 = this.A04;
            int i = 1;
            while (!this.A08) {
                boolean z = this.A09;
                if (!z || this.A01 == null) {
                    boolean z2 = false;
                    if (atomicReference.get() == null) {
                        z2 = true;
                    }
                    if (z) {
                        atomicReference.getAndSet((Object) null);
                        r5.onComplete();
                    } else {
                        if (z2) {
                            if (this.A0A) {
                                this.A02 = false;
                                this.A0A = false;
                            }
                        } else if (!this.A02 || this.A0A) {
                            r5.DUK(atomicReference.getAndSet((Object) null));
                            this.A0A = false;
                            this.A02 = true;
                            this.A05.A01(this, this.A06, this.A03);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    atomicReference.lazySet((Object) null);
                    r5.onError(this.A01);
                }
                this.A05.dispose();
                return;
            }
            atomicReference.lazySet((Object) null);
        }
    }
}
