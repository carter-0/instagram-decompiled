package X;

/* renamed from: X.7mg  reason: invalid class name and case insensitive filesystem */
public class C341317mg extends C345357tM implements C341297me {
    public static final void A00(Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls);
        sb.append(" is not available!  There may be a misconfiguration in the OneCamera camera factory.");
        0KC.A0C("BasicInputCoordinator", sb.toString());
    }

    public void A09() {
        Class cls;
        C343717qg r3 = C344327rg.A00;
        C343837qt r2 = this.A00;
        if (!r2.CQN(r3)) {
            cls = C344327rg.class;
        } else {
            C343717qg r1 = C344397rn.A00;
            if (!r2.CQN(r1)) {
                cls = C344397rn.class;
            } else {
                C343697qe Ape = r2.Ape(r3);
                0qQ.A07(Ape);
                C343697qe Ape2 = r2.Ape(r1);
                0qQ.A07(Ape2);
                C340547lR r0 = ((C344307re) ((C344327rg) Ape)).A02;
                0qQ.A07(r0);
                C341047mF C3L = ((C344397rn) Ape2).C3L();
                0qQ.A07(C3L);
                C340537lQ r22 = r0.A0R;
                boolean z = r0.A0S;
                C341807nY r02 = new C341807nY(C3L, r22, z);
                if (z) {
                    r22.A01 = r02;
                    return;
                } else {
                    r22.A02 = r02;
                    return;
                }
            }
        }
        A00(cls);
    }

    public final C345277tE BJs() {
        return C341297me.A02;
    }
}
