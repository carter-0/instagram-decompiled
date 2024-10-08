package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EgT  reason: case insensitive filesystem */
public abstract class C48558EgT {
    public static Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        UserSession A0B = C308206Td.A0B(r8);
        if (!(A0B instanceof UserSession)) {
            return null;
        }
        UserSession userSession = A0B;
        FragmentActivity A04 = C308206Td.A04(r8);
        String obj = r9.A01().toString();
        EDV edv = new EDV(2, r8, DbW.A0N(r9));
        User A0j = DbV.A0j(userSession, obj);
        if (A0j != null) {
            FH6.A00(A04, (0xF) null, edv, userSession, (1Xj) null, (AnonymousClass3W1) null, A0j);
            return null;
        }
        AnonymousClass441.A02.A02(userSession, new C51023FnF(A04, edv, userSession), obj);
        return null;
    }
}
