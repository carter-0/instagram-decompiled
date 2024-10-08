package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.A8w  reason: case insensitive filesystem */
public final class C39777A8w {
    public final /* synthetic */ C341717nP A00;
    public final /* synthetic */ B16 A01;
    public final /* synthetic */ C341627nG A02;
    public final /* synthetic */ AtomicInteger A03;

    public C39777A8w(C341717nP r1, B16 b16, C341627nG r3, AtomicInteger atomicInteger) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = atomicInteger;
        this.A01 = b16;
    }

    public final void A00() {
        if (this.A03.decrementAndGet() == 0) {
            C341627nG r4 = this.A02;
            C341667nK r1 = r4.A03;
            r1.A0E = true;
            r1.A08.postDelayed(r1.A0B, (long) r1.A09.Ar5(1007));
            Map map = r4.A05;
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                A0v.next();
            }
            Iterator A0v2 = AnonymousClass7TF.A0v(map);
            while (A0v2.hasNext()) {
                ((C341717nP) A0v2.next()).Ewx(new A3P(r4));
            }
        }
    }
}
