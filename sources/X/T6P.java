package X;

import java.util.concurrent.atomic.AtomicBoolean;

public final class T6P implements AnonymousClass1T9 {
    public final /* synthetic */ AnonymousClass1Cx A00;
    public final /* synthetic */ AnonymousClass1QX A01;
    public final /* synthetic */ 1QS A02;
    public final /* synthetic */ AtomicBoolean A03;

    public final void FJj(1Fe r1) {
    }

    public T6P(AnonymousClass1Cx r1, AnonymousClass1QX r2, 1QS r3, AtomicBoolean atomicBoolean) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = atomicBoolean;
        this.A01 = r2;
    }

    public final void cancel() {
        this.A03.set(true);
        this.A01.A00();
    }

    public final int getRequestId() {
        return this.A02.A04;
    }
}
