package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class EBJ extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ Map A02;

    public EBJ(UserSession userSession, List list, Map map) {
        this.A01 = list;
        this.A00 = userSession;
        this.A02 = map;
    }

    public final void onFail(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(1781329265);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            UserSession userSession = this.A00;
            User A0j = DbV.A0j(userSession, A18);
            if (A0j != null) {
                Boolean bool = (Boolean) this.A02.get(A18);
                if (bool != null) {
                    A0j.A0y(bool.booleanValue());
                    AnonymousClass1Nd.A00(userSession).A00(new 27U(A0j));
                    A0j.A0d(userSession);
                }
                C294695ms.A00(userSession).A0E(A0j);
            }
        }
        AnonymousClass0fD.A0A(1709325004, A03);
    }
}
