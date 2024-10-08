package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ej0  reason: case insensitive filesystem */
public abstract class C48715Ej0 {
    public static Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        AnonymousClass6Tm r2 = r16;
        String obj = r2.A01().toString();
        C277014uI A0N = DbW.A0N(r2);
        C277014uI A0O = DbW.A0O(r2);
        String A0i = DbW.A0i(r2, 3);
        C307896Rx r22 = r15;
        if (A0i == null) {
            A0i = C308206Td.A08(r15).getModuleName();
        }
        UserSession A0Y = DbT.A0Y(r15);
        User A0j = DbV.A0j(A0Y, obj);
        if (A0j != null) {
            C49960FGs.A05(C308206Td.A04(r15), r22, A0N, A0O, A0Y, FH9.A07(r15), A0j, C48088EVg.DIRECT_PROFILE, A0i);
            return null;
        }
        AnonymousClass441.A02.A02(A0Y, new C51025FnH(r15, A0N, A0O, A0Y, A0i, 1), obj);
        return null;
    }
}
