package X;

import java.util.Set;

/* renamed from: X.OJv  reason: case insensitive filesystem */
public final class C70749OJv {
    public final 0xa A00;

    public C70749OJv(1Am r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2.A03(1An.A16);
    }

    public final synchronized void A00(Set set) {
        0xY AR4 = this.A00.AR4();
        AR4.E5h("thread_blocks_warned_on", set);
        AR4.apply();
    }
}
