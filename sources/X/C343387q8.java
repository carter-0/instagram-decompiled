package X;

import java.util.concurrent.Callable;

/* renamed from: X.7q8  reason: invalid class name and case insensitive filesystem */
public final class C343387q8 implements Callable {
    public final /* synthetic */ C340837lu A00;
    public final /* synthetic */ C343377q7 A01;

    public C343387q8(C340837lu r1, C343377q7 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C341897nh r1;
        C343187po r0;
        C340837lu r3 = this.A00;
        C343297pz r2 = r3.A09;
        if (!(r2 == null || r3.A02 == null || (r1 = r3.A0E) == null || (r0 = r3.A08) == null)) {
            r1.setCameraSessionActivated(r2, r0);
        }
        C343377q7 r12 = this.A01;
        r12.A00.A01();
        return r12;
    }
}
