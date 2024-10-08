package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6FK  reason: invalid class name */
public final class AnonymousClass6FK extends AtomicInteger implements 1aL, C65051aA {
    public static final AnonymousClass6FL A09;
    public C65051aA A00;
    public final int A01;
    public final 1aL A02;
    public final C3032668b A03;
    public final AnonymousClass6FI A04;
    public final AtomicReference A05 = new AtomicReference();
    public volatile long A06;
    public volatile boolean A07;
    public volatile boolean A08;

    static {
        AnonymousClass6FL r0 = new AnonymousClass6FL((AnonymousClass6FK) null, 1, -1);
        A09 = r0;
        1af.A01(r0);
    }

    public final void A00() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.A05;
        Object obj = atomicReference2.get();
        AnonymousClass6FL r1 = A09;
        if (obj != r1 && (atomicReference = (AtomicReference) atomicReference2.getAndSet(r1)) != r1 && atomicReference != null) {
            1af.A01(atomicReference);
        }
    }

    public final void DUK(Object obj) {
        Object obj2;
        long j = this.A06 + 1;
        this.A06 = j;
        AtomicReference atomicReference = this.A05;
        AtomicReference atomicReference2 = (AtomicReference) atomicReference.get();
        if (atomicReference2 != null) {
            1af.A01(atomicReference2);
        }
        try {
            Object apply = this.A03.apply(obj);
            1aP.A01(apply, "The ObservableSource returned is null");
            C65071aK r5 = (C65071aK) apply;
            AnonymousClass6FL r2 = new AnonymousClass6FL(this, this.A01, j);
            do {
                obj2 = atomicReference.get();
                if (obj2 == A09) {
                    return;
                }
            } while (!1FH.A00(obj2, r2, atomicReference));
            r5.Eyt(r2);
        } catch (Throwable th) {
            C9877Riq.A00(th);
            this.A00.dispose();
            onError(th);
        }
    }

    public final void Do4(C65051aA r2) {
        if (1af.A02(this.A00, r2)) {
            this.A00 = r2;
            this.A02.Do4(this);
        }
    }

    public final void dispose() {
        if (!this.A07) {
            this.A07 = true;
            this.A00.dispose();
            A00();
        }
    }

    public final void onComplete() {
        if (!this.A08) {
            this.A08 = true;
            A01();
        }
    }

    public final void onError(Throwable th) {
        if (this.A08 || !C22013Xr3.A02(th, this.A04)) {
            C318176oW.A01(th);
            return;
        }
        A00();
        this.A08 = true;
        A01();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.atomic.AtomicReference, X.6FI] */
    public AnonymousClass6FK(1aL r2, C3032668b r3, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = i;
        this.A04 = new AtomicReference();
    }

    public final void A01() {
        AnonymousClass6FI r1;
        C3029566q r4;
        Object obj;
        boolean z;
        if (getAndIncrement() == 0) {
            1aL r8 = this.A02;
            AtomicReference atomicReference = this.A05;
            int i = 1;
            while (!this.A07) {
                if (this.A08) {
                    boolean z2 = false;
                    if (atomicReference.get() == null) {
                        z2 = true;
                    }
                    r1 = this.A04;
                    if (r1.get() != null) {
                        r8.onError(C22013Xr3.A01(r1));
                        return;
                    } else if (z2) {
                        r8.onComplete();
                        return;
                    }
                }
                AnonymousClass6FL r5 = (AnonymousClass6FL) atomicReference.get();
                if (!(r5 == null || (r4 = r5.A03) == null)) {
                    if (r5.A04) {
                        boolean isEmpty = r4.isEmpty();
                        r1 = this.A04;
                        if (r1.get() != null) {
                            r8.onError(C22013Xr3.A01(r1));
                            return;
                        } else if (isEmpty) {
                            1FH.A00(r5, (Object) null, atomicReference);
                        }
                    }
                    boolean z3 = false;
                    while (!this.A07) {
                        if (r5 == atomicReference.get()) {
                            r1 = this.A04;
                            if (r1.get() == null) {
                                boolean z4 = r5.A04;
                                try {
                                    obj = r4.poll();
                                    z = false;
                                    if (obj == null) {
                                        z = true;
                                    }
                                } catch (Throwable th) {
                                    C9877Riq.A00(th);
                                    C22013Xr3.A02(th, r1);
                                    1FH.A00(r5, (Object) null, atomicReference);
                                    A00();
                                    this.A00.dispose();
                                    this.A08 = true;
                                    obj = null;
                                    z3 = true;
                                }
                                if (z4) {
                                    if (z) {
                                        1FH.A00(r5, (Object) null, atomicReference);
                                    }
                                } else if (z) {
                                    if (z3) {
                                        continue;
                                    }
                                }
                                r8.DUK(obj);
                            } else {
                                r8.onError(C22013Xr3.A01(r1));
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
