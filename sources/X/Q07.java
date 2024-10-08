package X;

import java.util.Iterator;
import java.util.List;

public abstract class Q07 {
    public static C276544tV A00(C276544tV r5, C276544tV r6, Object obj, int i) {
        C276544tV r3 = r6;
        C276544tV r1 = r5;
        if (r5 != r6 || !Q06.A00(C276544tV.A00(r6, i), obj)) {
            if (r5 == r6) {
                int i2 = r6.A03;
                r1 = new C276544tV(r3.A01, r3, r3, r3.A09, i2);
            }
            r1.A0P(i, obj);
        }
        return r1;
    }

    public static C276544tV A01(C276544tV r5, List list, int i) {
        if (list != null) {
            if (i < list.size()) {
                C276544tV r3 = (C276544tV) list.get(i);
                if (r3.A03 == r5.A03) {
                    return r3;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C276544tV r32 = (C276544tV) it.next();
                if (r32.A03 == r5.A03) {
                    return r32;
                }
            }
        }
        return null;
    }

    public static String A02(C276544tV r4) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        String A0C = r4.A0C();
        if (A0C != null) {
            A1A.append(" id: ");
            A1A.append(A0C);
        }
        List list = r4.A09;
        if (list != null && !list.isEmpty()) {
            A1A.append(" keyPath: ");
            A1A.append(AnonymousClass7TE.A13(list));
            for (int i = 1; i < list.size(); i++) {
                A1A.append("/");
                A1A.append(list.get(i));
            }
        }
        A1A.append(" styleId: ");
        return Pxe.A0z(A1A, r4.A04);
    }
}
