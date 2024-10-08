package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nus  reason: case insensitive filesystem */
public abstract class C69952Nus {
    public static final boolean A00(UserSession userSession, Capabilities capabilities, N4P n4p, C68303N9q n9q) {
        C67256Mkq mkq;
        AnonymousClass7TG.A1T(userSession, n4p, n9q);
        boolean z = n4p.A0v;
        boolean A05 = N4P.A05(n4p);
        boolean A0C = n4p.A0C();
        int i = n4p.A09;
        boolean A1S = AnonymousClass7TF.A1S(i, 1012);
        boolean A1S2 = AnonymousClass7TF.A1S(i, 1013);
        String str = n4p.A0N;
        if (str == null || str.length() == 0 || (mkq = C67256Mkq.valueOf(DbY.A0k(str))) == null) {
            mkq = C67256Mkq.INBOX;
        }
        2EN A01 = C67238MkY.A01(mkq);
        int i2 = n4p.A08;
        User user = n9q.A00;
        List A15 = JTO.A15(n4p.A0c);
        ArrayList A0r = AnonymousClass7TG.A0r(A15);
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            C68303N9q.A00(A0r, it);
        }
        AnonymousClass7TF.A1F(A01, 6, user);
        if (!z || !capabilities.A00(C376179Gx.THREAD_DETAILS_SHOW_RESTRICT_SETTINGS) || A01 == 2EN.A04) {
            return false;
        }
        if ((C66640Ma9.A04(A0r, i2, A0C, A05) || !A05) && user.BIW() == 0 && !user.CXO() && !A1S && !A1S2 && 1YZ.A02 != null) {
            return true;
        }
        return false;
    }
}
