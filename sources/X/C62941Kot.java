package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kot  reason: case insensitive filesystem */
public final class C62941Kot {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public List A06;

    public final List A00() {
        C318046oG r1;
        List list = this.A00;
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C317966o8 A0a = JTO.A0a(it);
            String str = A0a.A0a;
            A0a.A0S = str;
            C317876nz r0 = C317876nz.A1e;
            List singletonList = Collections.singletonList(A0a);
            if (A0a.A04() == AnonymousClass05K.A0N) {
                r1 = C318046oG.AVATAR_ANIMATED;
            } else {
                r1 = C318046oG.AVATAR_STATIC;
            }
            A1C.add(new C317876nz(r1, str, singletonList));
        }
        return A1C;
    }
}
