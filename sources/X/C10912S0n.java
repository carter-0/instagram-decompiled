package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.S0n  reason: case insensitive filesystem */
public final class C10912S0n {
    public final UserSession A00;

    public C10912S0n(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(String str, Map map, String str2) {
        0xI A01 = 0xI.A01(str, str2);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            A01.A0C(DbT.A13(A1J), DbS.A0s(A1J));
        }
        DbU.A1R(A01, this.A00);
    }
}
