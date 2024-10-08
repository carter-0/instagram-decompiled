package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Eic  reason: case insensitive filesystem */
public abstract class C48691Eic {
    public static Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        C276544tV r3 = (C276544tV) r10.A01();
        Map map = (Map) r10.A00();
        C307786Rm A09 = C308206Td.A09(r9);
        C46471DfZ A05 = C46628Di8.A05(A09, (C276544tV) r10.A02());
        C229382nI A06 = C308206Td.A06(r9);
        C49672F1e f1e = new C49672F1e(C308206Td.A0B(r9));
        boolean z = A06.A00;
        IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
        igBloksScreenConfig.A0c = z;
        C46611Dhr.A0C(igBloksScreenConfig, A09, r9, r3);
        C3034368u A00 = C48717Ej2.A00(r9, r3);
        if (igBloksScreenConfig.A07 == null) {
            igBloksScreenConfig.A07 = A00;
        }
        igBloksScreenConfig.A0R = C46611Dhr.A06(r3);
        f1e.A00(A05);
        if (r3 != null) {
            C46611Dhr.A0D(igBloksScreenConfig, r3);
        }
        C46649DiU diU = new C46649DiU(C308206Td.A0H(map), Collections.EMPTY_MAP, C46611Dhr.A07(r3));
        diU.A00 = C46611Dhr.A00(r3);
        diU.A03 = r3;
        diU.A0H(C46611Dhr.A0A(r9, r3));
        diU.A05 = C46611Dhr.A05(r3);
        diU.A0G(C308206Td.A04(r9), igBloksScreenConfig, (X5O) null, 32, false);
        return null;
    }
}
