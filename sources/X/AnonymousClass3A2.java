package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3A2  reason: invalid class name */
public final class AnonymousClass3A2 extends AnonymousClass3A3 {
    public final AtomicReferenceFieldUpdater A00;
    public final AtomicReferenceFieldUpdater A01;
    public final AtomicReferenceFieldUpdater A02;
    public final AtomicReferenceFieldUpdater A03;
    public final AtomicReferenceFieldUpdater A04;

    public final void A00(AnonymousClass3A0 r2, AnonymousClass3A0 r3) {
        this.A02.lazySet(r2, r3);
    }

    public final void A01(AnonymousClass3A0 r2, Thread thread) {
        this.A03.lazySet(r2, thread);
    }

    public final boolean A02(AnonymousClass3A1 r2, AnonymousClass3A1 r3, C2379639y r4) {
        return 1Ev.A00(r4, r2, r3, this.A00);
    }

    public final boolean A03(AnonymousClass3A0 r2, AnonymousClass3A0 r3, C2379639y r4) {
        return 1Ev.A00(r4, r2, r3, this.A04);
    }

    public final boolean A04(C2379639y r2, Object obj, Object obj2) {
        return 1Ev.A00(r2, obj, obj2, this.A01);
    }

    public AnonymousClass3A2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.A03 = atomicReferenceFieldUpdater;
        this.A02 = atomicReferenceFieldUpdater2;
        this.A04 = atomicReferenceFieldUpdater3;
        this.A00 = atomicReferenceFieldUpdater4;
        this.A01 = atomicReferenceFieldUpdater5;
    }
}
