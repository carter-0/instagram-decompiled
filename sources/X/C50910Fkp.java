package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Fkp  reason: case insensitive filesystem */
public final class C50910Fkp implements C51915G7j {
    public final /* synthetic */ AtomicInteger A00;

    public C50910Fkp(AtomicInteger atomicInteger) {
        this.A00 = atomicInteger;
    }

    public final void AOE(1Ln r3, 1Q0 r4, C49886FBm fBm) {
        if (r4 == 1Q0.A1I) {
            r3.A0R("retry_strategy", C49108EpX.A00(C50144FRb.A00()));
            r3.A0Q("attempt_count", DbS.A0j(this.A00.get()));
        }
    }

    public final int Acx() {
        return this.A00.get();
    }

    public final String Bo6() {
        return C49108EpX.A00(C50144FRb.A00());
    }
}
