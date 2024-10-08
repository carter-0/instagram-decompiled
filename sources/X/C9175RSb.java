package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.RSb  reason: case insensitive filesystem */
public abstract class C9175RSb {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        int i = 0;
        String A0h = DbY.A0h(r10, 0);
        int A01 = Q0A.A01(r10.A03(1));
        List list = r9.A0D;
        if (list != null) {
            i = list.size();
        }
        if (A01 <= i) {
            C7285Q2k q2k = C7292Q2r.A00;
            0qQ.A0B(A0h, 1);
            Map A012 = C7285Q2k.A01(r9);
            Integer num = AnonymousClass05K.A01;
            Integer num2 = num;
            if (!A012.containsKey(C7285Q2k.A00(num, A0h, list, A01))) {
                num = AnonymousClass05K.A00;
                if (!Q05.A00(r9).A08.containsKey(C7285Q2k.A00(num, A0h, list, A01))) {
                    throw AnonymousClass7TE.A0w(002.A09(A01, "Missing expanded or internal variable for variable ", A0h, " at depth ", ".Please verify the variable ID is correct."));
                }
            }
            if (num.intValue() != 0) {
                String A00 = C7285Q2k.A00(num2, A0h, list, A01);
                Object obj = C7285Q2k.A01(r9).get(A00);
                AnonymousClass6SD r0 = r9.A05;
                if (r0 != null) {
                    r0.A7d(A00);
                }
                return obj;
            } else if (A01 == 0) {
                return Q05.A03(r9, A0h);
            } else {
                return q2k.A02(r9, A0h, A01);
            }
        } else {
            throw AnonymousClass7TE.A0w("Trying to read a scoped client param from an un-scoped environment.");
        }
    }
}
