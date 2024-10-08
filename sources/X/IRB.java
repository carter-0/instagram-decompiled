package X;

import java.util.Iterator;
import java.util.List;

public final class IRB implements AnonymousClass7QE {
    public final /* synthetic */ AnonymousClass32L A00;

    public IRB(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final void FJv(C267324bN r6) {
        Object obj;
        C296925qs r1;
        AnonymousClass32L r4 = this.A00;
        Iterator it = ((GWW) r4.A0q.getValue()).A01.A02.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!(obj instanceof C296925qs));
        if ((obj instanceof C296925qs) && (r1 = (C296925qs) obj) != null) {
            C295825oy r3 = r1.A01;
            C267324bN r12 = r3.A04;
            if (r12 != null) {
                List A02 = r3.A02();
                0u4.A00(A02).remove(C295325ny.A00(r12));
            }
            r3.A04 = r6;
            C276014sL A002 = C295325ny.A00(r6);
            if (A002 != null) {
                r3.A02().add(r3.A00, A002);
            }
            C14074TpO tpO = r4.A06;
            if (tpO == null) {
                0qQ.A0F("grid");
                throw AnonymousClass00P.createAndThrow();
            } else {
                tpO.A08(r3.A0A);
            }
        }
    }
}
