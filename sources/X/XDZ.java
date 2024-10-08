package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class XDZ extends AtomicInteger implements YAH, YCU {
    public Throwable A00;
    public YAH A01;
    public final AtomicLong A02 = new AtomicLong();
    public final AtomicReference A03 = new AtomicReference();
    public final YAl A04;
    public volatile boolean A05;
    public volatile boolean A06;

    public final void onComplete() {
        this.A06 = true;
        A00();
    }

    public final void DUK(Object obj) {
        this.A03.lazySet(obj);
        A00();
    }

    public final void Do5(YAH yah) {
        if (this.A01 != null) {
            yah.cancel();
            C318176oW.A01(new IllegalStateException("Subscription already set!"));
            return;
        }
        this.A01 = yah;
        this.A04.Do5(this);
        yah.EHJ(Long.MAX_VALUE);
    }

    public final void EHJ(long j) {
        if (j <= 0) {
            C318176oW.A01(Pxg.A0b("n > 0 required but it was ", j));
            return;
        }
        C21065XDd.A00(this.A02, j);
        A00();
    }

    public final void cancel() {
        if (!this.A05) {
            this.A05 = true;
            this.A01.cancel();
            if (getAndIncrement() == 0) {
                this.A03.lazySet((Object) null);
            }
        }
    }

    public final void onError(Throwable th) {
        this.A00 = th;
        this.A06 = true;
        A00();
    }

    public XDZ(YAl yAl) {
        this.A04 = yAl;
    }

    public final void A00() {
        boolean z;
        Throwable th;
        long j;
        long j2;
        if (getAndIncrement() == 0) {
            YAl yAl = this.A04;
            AtomicLong atomicLong = this.A02;
            AtomicReference atomicReference = this.A03;
            int i = 1;
            loop0:
            do {
                long j3 = 0;
                while (true) {
                    z = false;
                    if (j3 == atomicLong.get()) {
                        break;
                    }
                    boolean z2 = this.A06;
                    Object andSet = atomicReference.getAndSet((Object) null);
                    boolean z3 = false;
                    if (andSet == null) {
                        z3 = true;
                    }
                    if (this.A05) {
                        atomicReference.lazySet((Object) null);
                        return;
                    }
                    if (z2) {
                        th = this.A00;
                        if (th != null) {
                            atomicReference.lazySet((Object) null);
                            break loop0;
                        } else if (z3) {
                            break loop0;
                        }
                    } else if (z3) {
                        break;
                    }
                    yAl.DUK(andSet);
                    j3++;
                }
                if (j3 == atomicLong.get()) {
                    boolean z4 = this.A06;
                    if (atomicReference.get() == null) {
                        z = true;
                    }
                    if (this.A05) {
                        atomicReference.lazySet((Object) null);
                        return;
                    } else if (z4) {
                        th = this.A00;
                        if (th != null) {
                            atomicReference.lazySet((Object) null);
                            yAl.onError(th);
                            return;
                        } else if (z) {
                            yAl.onComplete();
                            return;
                        }
                    }
                }
                if (j3 != 0) {
                    do {
                        j = atomicLong.get();
                        if (j == Long.MAX_VALUE) {
                            break;
                        }
                        j2 = j - j3;
                        if (j2 < 0) {
                            C318176oW.A01(new IllegalStateException(002.A0Q("More produced than requested: ", j2)));
                            j2 = 0;
                        }
                    } while (!atomicLong.compareAndSet(j, j2));
                }
                i = addAndGet(-i);
            } while (i != 0);
        }
    }
}
