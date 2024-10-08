package X;

import java.util.List;
import java.util.Map;

public abstract class RUG {
    public static Integer A00(C270254gR r10, C7580QKv qKv, Integer num, String str, Map map, boolean z) {
        Integer num2;
        String A02;
        List A13;
        String A022 = C11429STt.A02(str);
        boolean containsKey = map.containsKey(A022);
        Integer num3 = AnonymousClass05K.A00;
        if (r10.A04.A07(true)) {
            C10860RzL rzL = r10.A00;
            C61084JwM jwM = new C61084JwM(num3, num, num3, 3);
            containsKey = false;
            0qQ.A0B(rzL, 0);
            String str2 = rzL.A0P.A03;
            if (!(str2 == null || (A02 = C11429STt.A02(str2)) == null || (A13 = C66580MXl.A13(A02, (Map) rzL.A0K.A01)) == null)) {
                containsKey = A13.contains(new C59721JVf(jwM, AnonymousClass05K.A01));
            }
            z = S8I.A00(rzL, new C61084JwM(num3, num, num3, 3));
        }
        if (!containsKey || (AnonymousClass7TE.A1a(map.get(A022)) && !z)) {
            num2 = AnonymousClass05K.A01;
        } else {
            num2 = num3;
        }
        boolean A01 = S8I.A01(r10.A00, new C61084JwM(num3, num, num3, 3));
        if (qKv == null || A01 || num2 != num3) {
            return num2;
        }
        182.A01(0Tu.A05, qKv.A0d, 36591905888862260L);
        int i = qKv.A00;
        if (i <= 1) {
            return num3;
        }
        qKv.A00 = i - 1;
        return AnonymousClass05K.A01;
    }
}
