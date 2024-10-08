package X;

/* renamed from: X.QEu  reason: case insensitive filesystem */
public abstract class C7465QEu extends C249703kE {
    public final void A00() {
        S4V s4v;
        if (this instanceof C8110Qh2) {
            C8110Qh2 qh2 = (C8110Qh2) this;
            S4V s4v2 = qh2.A00;
            if (s4v2 != null) {
                s4v2.A01();
            }
            S4V s4v3 = qh2.A01;
            if (s4v3 != null) {
                s4v3.A01();
            }
            s4v = qh2.A02;
        } else if (this instanceof C8108Qh0) {
            for (C7465QEu A00 : ((C8108Qh0) this).A02) {
                A00.A00();
            }
            return;
        } else if (this instanceof C8109Qh1) {
            C8109Qh1 qh1 = (C8109Qh1) this;
            S4V s4v4 = qh1.A01;
            if (s4v4 != null) {
                s4v4.A01();
            }
            s4v = qh1.A00;
        } else {
            return;
        }
        if (s4v != null) {
            s4v.A01();
        }
    }
}
