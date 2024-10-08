package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2fY  reason: invalid class name and case insensitive filesystem */
public final class C226052fY implements 1xf {
    public final C252013oQ BDR(List list) {
        Object obj;
        C252013oQ r3 = (C252013oQ) list.get(0);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            1QU r0 = ((C252013oQ) obj).A04;
            0qQ.A06(r0);
            if (AnonymousClass1RU.A00(r0)) {
                break;
            }
        }
        C252013oQ r1 = (C252013oQ) obj;
        if (r1 != null) {
            return r1;
        }
        return r3;
    }

    public final void DK8(1QS r1, 1QU r2, boolean z) {
    }
}
