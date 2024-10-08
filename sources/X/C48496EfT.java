package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.EfT  reason: case insensitive filesystem */
public abstract class C48496EfT {
    public static Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        String str;
        C276544tV r1 = (C276544tV) r7.A01();
        HashMap A0H = C308206Td.A0H((Map) r7.A02());
        if (C46611Dhr.A0E(r1)) {
            str = C46611Dhr.A07(r1);
        } else {
            str = null;
        }
        Context A04 = DbT.A04();
        if (str != null) {
            C359638dF.A01(A04, new C359618dD(C308206Td.A0B(r6)), str, (String) null, A0H);
        }
        return null;
    }
}
