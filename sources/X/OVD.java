package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class OVD {
    public C68143N2j A00;
    public boolean A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();

    public static final void A00(OVD ovd, List list) {
        C68143N2j n2j = ovd.A00;
        if (n2j != null) {
            list.add(n2j);
            return;
        }
        Iterator A0s = AnonymousClass7TF.A0s(ovd.A02);
        while (A0s.hasNext()) {
            A00((OVD) C51971G9r.A0p(A0s), list);
        }
    }

    public final void A01(C70550OAy oAy) {
        C68143N2j n2j;
        C68143N2j n2j2 = this.A00;
        if (n2j2 != null && ((n2j = oAy.A00) == null || oAy.A01.compare(n2j2, n2j) > 0)) {
            oAy.A00 = n2j2;
        }
        Iterator A0s = AnonymousClass7TF.A0s(this.A02);
        while (A0s.hasNext()) {
            ((OVD) C51971G9r.A0p(A0s)).A01(oAy);
        }
    }

    public OVD(boolean z) {
        this.A01 = z;
    }
}
