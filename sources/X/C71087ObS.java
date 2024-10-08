package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.ObS  reason: case insensitive filesystem */
public final class C71087ObS {
    public volatile Object A00;
    public volatile CountDownLatch A01 = new CountDownLatch(1);
    public volatile ArrayList A02 = AnonymousClass7TE.A1C();

    public static C71087ObS A00() {
        return new C71087ObS();
    }

    public static void A01(C71087ObS obS, Object obj, int i) {
        obS.A04(new C71515OmC(obj, i));
    }

    public static void A02(C71087ObS obS, Object obj, Object obj2, int i) {
        obS.A04(new C71519OmG(i, obj, obj2));
    }

    public final void A03() {
        this.A01.countDown();
        if (!this.A02.isEmpty()) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((C74290PsI) it.next()).run(this.A00);
            }
        }
    }

    public final void A04(C74290PsI psI) {
        if (this.A01.getCount() == 0) {
            psI.run(this.A00);
        } else {
            this.A02.add(psI);
        }
    }

    public final void A05(Object obj) {
        this.A00 = obj;
        A03();
    }
}
