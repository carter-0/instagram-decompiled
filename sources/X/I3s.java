package X;

import java.util.ArrayList;
import java.util.List;

public abstract class I3s {
    public static final AnonymousClass0eM A00 = AnonymousClass0eN.A01(C58388Ir7.A00);

    public static final List A00(String str) {
        0qQ.A0B(str, 0);
        String A0g = 00p.A0g(str, "\n", "", false);
        AnonymousClass3T1 A09 = C242173Sx.A09(J35.A00, C242173Sx.A0E(J34.A00, C242173Sx.A0E(new 077(A0g, 1), 00l.A0S(A0g, new char[]{',', 65292, 1548, 12289}))));
        J36 j36 = J36.A00;
        0qQ.A0B(j36, 1);
        return C242173Sx.A07(new C52515GVs(j36, A09));
    }

    public static final List A01(String str) {
        List A03 = ((11S) A00.getValue()).A03(str);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A03) {
            String str2 = (String) next;
            if (str2 != null && str2.length() >= 2) {
                A1C.add(next);
            }
        }
        return A1C;
    }
}
