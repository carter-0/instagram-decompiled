package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Yw  reason: invalid class name and case insensitive filesystem */
public final class C243463Yw extends 0vM {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final /* synthetic */ C243453Yv A01;
    public final /* synthetic */ C62320sa A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C243463Yw(C243453Yv r3, C62320sa r4) {
        super("fetchExploreGridQuickPromotion", 1103551465);
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void loggedRun() {
        if (this.A00.compareAndSet(false, true)) {
            C243453Yv r0 = this.A01;
            C62320sa r1 = this.A02;
            C3722790e.A00(r0.A00);
            if (r1 != null) {
                r1.invoke();
            }
        }
    }
}
