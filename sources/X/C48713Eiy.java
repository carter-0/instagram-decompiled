package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eiy  reason: case insensitive filesystem */
public abstract class C48713Eiy {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        String A0c = Dbb.A0c(r10);
        0qQ.A07(A0c);
        C277014uI A0N = DbW.A0N(r10);
        C277014uI A0O = DbW.A0O(r10);
        String A0h = DbY.A0h(r10, 3);
        C307896Rx r6 = r9;
        UserSession A0Y = DbT.A0Y(r9);
        EUJ euj = new EUJ(r9, A0N, A0O);
        User A0j = DbV.A0j(A0Y, A0c);
        if (A0j != null) {
            C49960FGs.A06(C308206Td.A04(r9), A0Y, FH9.A07(r9), A0j, euj, A0h);
            return null;
        }
        AnonymousClass441.A02.A02(A0Y, new C51025FnH(euj, A0O, r6, A0Y, A0h, 0), A0c);
        return null;
    }
}
