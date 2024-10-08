package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Y5n  reason: case insensitive filesystem */
public final class C22470Y5n extends AtomicLong implements 1aL, C65051aA, C22551Y9e {
    public final long A00;
    public final 1aL A01;
    public final C318286oh A02;
    public final C22475Y5s A03 = new AtomicReference();
    public final TimeUnit A04;
    public final AtomicReference A05 = new AtomicReference();

    public final void Do4(C65051aA r2) {
        1af.A03(r2, this.A05);
    }

    public final void dispose() {
        1af.A01(this.A05);
        this.A02.dispose();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, X.Y5s] */
    public C22470Y5n(1aL r2, C318286oh r3, TimeUnit timeUnit, long j) {
        this.A01 = r2;
        this.A00 = j;
        this.A04 = timeUnit;
        this.A02 = r3;
    }

    public final void DUK(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                C22475Y5s y5s = this.A03;
                ((C65051aA) y5s.get()).dispose();
                this.A01.DUK(obj);
                1af.A00(this.A02.A01(new C22416Y2y(this, j2), this.A04, this.A00), y5s);
            }
        }
    }

    public final void Drk(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            1af.A01(this.A05);
            1aL r5 = this.A01;
            long j2 = this.A00;
            TimeUnit timeUnit = this.A04;
            Throwable th = C22013Xr3.A00;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("The source did not signal an event for ");
            A1A.append(j2);
            A1A.append(" ");
            A1A.append(timeUnit.toString().toLowerCase());
            r5.onError(new TimeoutException(AnonymousClass7TF.A0l(" and has been terminated.", A1A)));
            this.A02.dispose();
        }
    }

    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            1af.A01(this.A03);
            this.A01.onComplete();
            this.A02.dispose();
        }
    }

    public final void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            1af.A01(this.A03);
            this.A01.onError(th);
            this.A02.dispose();
            return;
        }
        C318176oW.A01(th);
    }
}
