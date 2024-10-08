package X;

import java.util.List;

public abstract class HZ8 {
    public static final void A00(C305006Gb r6, C59500JLy jLy, C54617HLa hLa, int i) {
        int ordinal;
        0sK r0;
        if (!(hLa == null || (ordinal = hLa.ordinal()) == -1)) {
            if (ordinal == 0) {
                r0 = C55391Hgx.A00;
            } else if (ordinal == 2) {
                r0 = C55391Hgx.A01;
            } else if (ordinal != 1) {
                throw AnonymousClass7TE.A1K();
            }
            r6.Cf4((Object) null, r0);
            return;
        }
        C51967G9n.A10(r6, new JGV(i, 3), -124400139);
        if (jLy instanceof C53530Gq0) {
            List list = ((C53530Gq0) jLy).A00;
            J2U j2u = J2U.A00;
            J2T j2t = J2T.A00;
            int size = list.size();
            C51967G9n.A12(r6, new JK0(list, 13), new C59102J6k(38, list, (0sP) j2u), new C59102J6k(39, list, (0sP) j2t), size);
        } else if (jLy instanceof C53531Gq1) {
            C51967G9n.A10(r6, JJR.A00(jLy, 4), -1473792903);
        }
    }
}
