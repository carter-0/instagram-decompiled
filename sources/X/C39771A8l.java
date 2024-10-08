package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.A8l  reason: case insensitive filesystem */
public final class C39771A8l {
    public final 1Av A00;
    public final C61410nE A01;

    public final boolean A00(C19475WaN waN) {
        if (waN == null) {
            return false;
        }
        HashSet A1F = AnonymousClass7TE.A1F();
        0xa r7 = this.A00.A01;
        String A002 = AnonymousClass000.A00(3767);
        Iterator it = 00k.A0X(r7.C1t(A002)).iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            Long A10 = AnonymousClass7TE.A10(new 11S("^.*:").A00(A18, ""));
            if (A10 != null && A10.longValue() + 86400000 > System.currentTimeMillis()) {
                A1F.add(A18);
            }
        }
        0xY AR4 = r7.AR4();
        AR4.ED3(A002);
        AR4.apply();
        0xY AR42 = r7.AR4();
        AR42.E5h(A002, A1F);
        AR42.apply();
        AnonymousClass8YF r5 = waN.A00;
        String str = r5.A08;
        Iterator it2 = 00k.A0X(r7.C1t(A002)).iterator();
        while (it2.hasNext()) {
            if (0qQ.A0K(new 11S(":.*$").A00(AnonymousClass7TE.A18(it2), ""), str)) {
                return true;
            }
        }
        Boolean BCQ = r5.A01.BCQ();
        if (BCQ != null) {
            return BCQ.booleanValue();
        }
        return false;
    }

    public C39771A8l(C61410nE r1, 1Av r2) {
        AnonymousClass7TG.A1O(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
