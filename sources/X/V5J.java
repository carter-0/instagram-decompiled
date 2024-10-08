package X;

import java.util.List;

public abstract class V5J {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        C276544tV A0O = DbY.A0O(r8);
        String A02 = Q3L.A02(r8.A02());
        boolean A01 = Q0A.A01(r8.A00());
        Ty7 A0P = C13989Tnp.A0P(r7, A0O, r8, 3);
        if (A0P == null) {
            return null;
        }
        if (C245983dn.A03()) {
            List list = A0P.A01.A03;
            int size = list.size();
            int i = 0;
            while (i < size) {
                String A0C = ((C14538Txy) list.get(i)).A01.A0C();
                if (A0C == null || !A0C.equals(A02)) {
                    i++;
                } else if (i < 0) {
                    return null;
                } else {
                    A0P.A01(i, A01);
                    return null;
                }
            }
            return null;
        }
        throw new RuntimeException("setIndexById cannot be called from a background thread.");
    }
}
