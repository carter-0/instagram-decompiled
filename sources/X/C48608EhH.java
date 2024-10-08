package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EhH  reason: case insensitive filesystem */
public abstract class C48608EhH {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        C46443Df5 df5;
        Object A0g = DbW.A0g(r8, 0);
        UserSession A0Z = DbT.A0Z(r7);
        User A0j = DbT.A0j(A0Z);
        C309516Yo A0M = DbS.A0M(C308206Td.A04(r7), A0Z);
        1YF A01 = C46339Dch.A01();
        if (0qQ.A0K(A0g, "self_following")) {
            df5 = C46443Df5.FOLLOWING;
        } else if (0qQ.A0K(A0g, "self_following_simplified")) {
            df5 = C46443Df5.FOLLOWING_SIMPLIFIED;
        } else {
            df5 = C46443Df5.FOLLOWERS;
        }
        A0M.A0B((Bundle) null, A01.Cr3(A0Z, C46451DfE.A00(df5, A0j.getId(), (String) null, false)));
        A0M.A04();
        return null;
    }
}
