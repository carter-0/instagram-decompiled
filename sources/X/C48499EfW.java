package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.EfW  reason: case insensitive filesystem */
public abstract class C48499EfW {
    public static Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        int i;
        String str;
        C276544tV r4 = (C276544tV) r11.A01();
        HashMap A0H = C308206Td.A0H((HashMap) r11.A02());
        int A0M = AnonymousClass7TE.A0M(DbU.A0j(r11));
        if (AnonymousClass7TF.A1S(r4.A04, 13647)) {
            i = 45;
        } else if (C46611Dhr.A0F(r4)) {
            i = 46;
        } else {
            throw AnonymousClass7TE.A0w("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        long max = Math.max(r4.A04(i, 0), (long) A0M);
        if (C46611Dhr.A0E(r4)) {
            str = C46611Dhr.A07(r4);
        } else {
            str = null;
        }
        Context A04 = DbT.A04();
        if (str != null) {
            C359638dF.A03(A04, new C359618dD(C308206Td.A0B(r10)), str, C46611Dhr.A05(r4), A0H, max);
        }
        return null;
    }
}
