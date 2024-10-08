package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Y5q  reason: case insensitive filesystem */
public final class C22473Y5q extends AtomicReference implements 1aL, C65051aA, C22551Y9e {
    public C65071aK A00;
    public final long A01;
    public final 1aL A02;
    public final C318286oh A03;
    public final C22475Y5s A04 = new AtomicReference();
    public final TimeUnit A05;
    public final AtomicLong A06 = new AtomicLong();
    public final AtomicReference A07 = new AtomicReference();

    public final void DUK(Object obj) {
        AtomicLong atomicLong = this.A06;
        long j = atomicLong.get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (atomicLong.compareAndSet(j, j2)) {
                C22475Y5s y5s = this.A04;
                ((C65051aA) y5s.get()).dispose();
                this.A02.DUK(obj);
                1af.A00(this.A03.A01(new C22416Y2y(this, j2), this.A05, this.A01), y5s);
            }
        }
    }

    public final void Do4(C65051aA r2) {
        1af.A03(r2, this.A07);
    }

    public final void Drk(long j) {
        if (this.A06.compareAndSet(j, Long.MAX_VALUE)) {
            1af.A01(this.A07);
            C65071aK r2 = this.A00;
            this.A00 = null;
            r2.Eyt(new Y16(this.A02, this));
            this.A03.dispose();
        }
    }

    public final void dispose() {
        1af.A01(this.A07);
        1af.A01(this);
        this.A03.dispose();
    }

    public final void onComplete() {
        if (this.A06.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            1af.A01(this.A04);
            this.A02.onComplete();
            this.A03.dispose();
        }
    }

    public final void onError(Throwable th) {
        if (this.A06.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            1af.A01(this.A04);
            this.A02.onError(th);
            this.A03.dispose();
            return;
        }
        C318176oW.A01(th);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, X.Y5s] */
    public C22473Y5q(C65071aK r2, 1aL r3, C318286oh r4, TimeUnit timeUnit, long j) {
        this.A02 = r3;
        this.A01 = j;
        this.A05 = timeUnit;
        this.A03 = r4;
        this.A00 = r2;
    }
}
