package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.R1u  reason: case insensitive filesystem */
public final class C8703R1u extends 1KB {
    public final AtomicReferenceFieldUpdater A00;
    public final AtomicReferenceFieldUpdater A01;
    public final AtomicReferenceFieldUpdater A02;
    public final AtomicReferenceFieldUpdater A03;
    public final AtomicReferenceFieldUpdater A04;

    public final 1Km A00(1Km r2, 1K2 r3) {
        return (1Km) this.A00.getAndSet(r3, r2);
    }

    public final AnonymousClass1Kd A01(AnonymousClass1Kd r2, 1K2 r3) {
        return (AnonymousClass1Kd) this.A04.getAndSet(r3, r2);
    }

    public final void A02(AnonymousClass1Kd r2, AnonymousClass1Kd r3) {
        this.A02.lazySet(r2, r3);
    }

    public final void A03(AnonymousClass1Kd r2, Thread thread) {
        this.A03.lazySet(r2, thread);
    }

    public final boolean A04(1Km r2, 1Km r3, 1K2 r4) {
        return 1Ev.A00(r4, r2, r3, this.A00);
    }

    public final boolean A05(AnonymousClass1Kd r2, AnonymousClass1Kd r3, 1K2 r4) {
        return 1Ev.A00(r4, r2, r3, this.A04);
    }

    public final boolean A06(1K2 r2, Object obj, Object obj2) {
        return 1Ev.A00(r2, obj, obj2, this.A01);
    }

    public C8703R1u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.A03 = atomicReferenceFieldUpdater;
        this.A02 = atomicReferenceFieldUpdater2;
        this.A04 = atomicReferenceFieldUpdater3;
        this.A00 = atomicReferenceFieldUpdater4;
        this.A01 = atomicReferenceFieldUpdater5;
    }
}
