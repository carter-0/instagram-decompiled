package X;

import java.util.LinkedList;

/* renamed from: X.4un  reason: invalid class name and case insensitive filesystem */
public final class C277284un extends 0ng {
    public final /* synthetic */ C252023oR A00;
    public final /* synthetic */ 1Fe A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C277284un(C252023oR r2, 1Fe r3) {
        super(551);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void run() {
        C252023oR r5 = this.A00;
        1Fe r4 = this.A01;
        1Iq r1 = r5.A02;
        synchronized (r1.A02) {
            C252013oQ r2 = r5.A01;
            r2.A04.A01(r4);
            LinkedList linkedList = r1.A03;
            if (linkedList.remove(r2)) {
                linkedList.addFirst(r2);
            }
            C251993oO r12 = r5.A00;
            if (r12 != null) {
                0qQ.A0B(r4, 2);
                if (r4 == 1Fe.A03) {
                    1In r0 = r12.A00;
                    synchronized (r0.A0H) {
                        r0.A03();
                    }
                }
            }
        }
    }
}
