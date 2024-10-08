package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LnY  reason: case insensitive filesystem */
public final class C65110LnY implements B1S {
    public final List A00;

    public final Object Cor(C293505kq r5, AnonymousClass4D7 r6) {
        ArrayList A0n = JTS.A0n(r5.A0j);
        if (A0n.isEmpty()) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                JTT.A1U(A0n, it);
            }
        } else {
            HashMap A1E = AnonymousClass7TE.A1E();
            Iterator it2 = this.A00.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            Iterator it3 = A0n.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
            if (!A1E.isEmpty()) {
                Iterator A0s = AnonymousClass7TF.A0s(A1E);
                while (A0s.hasNext()) {
                    A0n.add(C51971G9r.A0p(A0s));
                }
            }
        }
        C59765JXe jXe = new C59765JXe();
        jXe.A01 = C59764JXc.A00(A0n);
        return jXe.A01(r5);
    }

    public C65110LnY(List list) {
        this.A00 = list;
    }
}
