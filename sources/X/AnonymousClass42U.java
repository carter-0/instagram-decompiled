package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.42U  reason: invalid class name */
public final class AnonymousClass42U {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass42U.class, "notCompletedCount$volatile");
    public final AnonymousClass2Q9[] A00;
    public volatile /* synthetic */ int notCompletedCount$volatile;

    public final Object A00(AnonymousClass4D7 r9) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1IW.A04;
        1IW r6 = new 1IW(1, 1Ey.A02(r9));
        r6.A0I();
        AnonymousClass2Q9[] r7 = this.A00;
        int length = r7.length;
        AnonymousClass42V[] r4 = new AnonymousClass42V[length];
        for (int i = 0; i < length; i++) {
            AnonymousClass2Q9 r0 = r7[i];
            r0.EwR();
            AnonymousClass42V r1 = new AnonymousClass42V(this, r6);
            r1.A00 = r0.CO3(r1);
            r4[i] = r1;
        }
        AnonymousClass42W r2 = new AnonymousClass42W(this, r4);
        for (int i2 = 0; i2 < length; i2++) {
            AnonymousClass42V.A03.set(r4[i2], r2);
        }
        if (!(1IW.A04.get(r6) instanceof AnonymousClass13B)) {
            r2.A06();
        } else {
            r6.CO0(r2);
        }
        return r6.A0E();
    }

    public AnonymousClass42U(AnonymousClass2Q9[] r2) {
        this.A00 = r2;
        this.notCompletedCount$volatile = r2.length;
    }
}
