package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.List;

/* renamed from: X.Ntg  reason: case insensitive filesystem */
public abstract class C69878Ntg {
    public static void A00(UserSession userSession, C51900G6u g6u, List list, boolean z) {
        1OC A04 = DirectThreadApi.A04(userSession, (Long) null, DbV.A0s(), (String) null, list, z, false);
        A04.A00 = new C47371Dwh(userSession, g6u, 0);
        1ES.A03(A04);
    }
}
