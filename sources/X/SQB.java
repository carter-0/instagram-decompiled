package X;

import java.util.List;

public abstract class SQB {
    public static final AnonymousClass2gB A00(List list) {
        0qQ.A0B(list, 0);
        AnonymousClass2gB A0M = Pxh.A0M();
        if (list.isEmpty()) {
            SR4.A01(A0M, AnonymousClass7TE.A0v());
        } else {
            Object obj = new Object();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A02((2Fk) list.get(i), A0M, new C11650Sds(13, (Object) A0M, obj, (Object) list));
            }
        }
        return A0M;
    }

    public static final void A03(2Fk r2, AnonymousClass2gO r3) {
        0qQ.A0B(r2, 0);
        r2.A09(new C11648Sdq(r2, r3, 30));
    }

    public static final void A01(AnonymousClass07Z r2, 2Fk r3, AnonymousClass2gO r4) {
        DbY.A1S(r3, r4);
        C11648Sdq sdq = new C11648Sdq(r3, r4, 31);
        if (r2 == null) {
            r3.A09(sdq);
        } else {
            r3.A06(r2, sdq);
        }
    }

    public static final void A02(2Fk r2, AnonymousClass2gB r3, AnonymousClass2gO r4) {
        AnonymousClass7TG.A1N(r3, r2);
        Pxi.A1A(r2, r3, new C58751Iwy(44, r4, r3, r2), 33);
    }
}
