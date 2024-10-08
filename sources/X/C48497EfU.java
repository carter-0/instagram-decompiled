package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.EfU  reason: case insensitive filesystem */
public abstract class C48497EfU {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        String str;
        C276544tV r1 = (C276544tV) r8.A01();
        HashMap A0H = C308206Td.A0H((HashMap) r8.A02());
        if (C46611Dhr.A0E(r1)) {
            str = C46611Dhr.A07(r1);
        } else {
            str = null;
        }
        Context A04 = DbT.A04();
        if (str != null) {
            C359638dF.A01(A04, new C359618dD(C308206Td.A0B(r7)), str, C46611Dhr.A05(r1), A0H);
        }
        return null;
    }
}
