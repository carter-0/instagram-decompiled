package X;

import java.util.concurrent.atomic.AtomicBoolean;

public final class RAQ extends 0ng {
    public final /* synthetic */ T8W A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ C62320sa A02;

    public final void run() {
        T8W t8w = this.A00;
        Q2G q2g = (Q2G) t8w.A08.getValue();
        AtomicBoolean atomicBoolean = t8w.A05;
        boolean z = atomicBoolean.get();
        Integer num = this.A01;
        0qQ.A0B(num, 1);
        if (q2g.A0B) {
            Q2G.A01(q2g, num, z);
        }
        t8w.A06.set(false);
        atomicBoolean.set(false);
        this.A02.invoke();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAQ(T8W t8w, Integer num, C62320sa r6) {
        super(803851324, 1, false, false);
        this.A00 = t8w;
        this.A01 = num;
        this.A02 = r6;
    }
}
