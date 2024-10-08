package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2gB  reason: invalid class name */
public class AnonymousClass2gB extends AnonymousClass2Fj {
    public Pxo A00 = new Pxo();

    public void A03() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C3253472a r1 = (C3253472a) ((Map.Entry) it.next()).getValue();
            r1.A01.A09(r1);
        }
    }

    public void A04() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C3253472a r1 = (C3253472a) ((Map.Entry) it.next()).getValue();
            r1.A01.A08(r1);
        }
    }

    public final void A0D(2Fk r3) {
        C3253472a r1 = (C3253472a) this.A00.A06(r3);
        if (r1 != null) {
            r1.A01.A08(r1);
        }
    }

    public final void A0E(2Fk r3, AnonymousClass2gO r4) {
        if (r3 != null) {
            C3253472a r1 = new C3253472a(r3, r4);
            C3253472a r0 = (C3253472a) this.A00.A07(r3, r1);
            if (r0 != null) {
                if (r0.A02 != r4) {
                    throw new IllegalArgumentException("This source was already added with the different observer");
                }
            } else if (this.A00 > 0) {
                r1.A01.A09(r1);
            }
        } else {
            throw new NullPointerException(Pxd.A00(886));
        }
    }
}
