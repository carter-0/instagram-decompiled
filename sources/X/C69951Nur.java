package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nur  reason: case insensitive filesystem */
public abstract class C69951Nur {
    public static final boolean A00(UserSession userSession, Capabilities capabilities, N4P n4p) {
        String str;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, n4p);
        boolean z = n4p.A0v;
        boolean A05 = N4P.A05(n4p);
        int i = n4p.A09;
        boolean A1S = AnonymousClass7TF.A1S(i, 1012);
        List A15 = JTO.A15(n4p.A0c);
        ArrayList A0r = AnonymousClass7TG.A0r(A15);
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            C68303N9q.A00(A0r, it);
        }
        String A02 = N4P.A02(n4p);
        boolean A1S2 = AnonymousClass7TF.A1S(i, 1014);
        User user = (User) 00k.A0J(A0r);
        if (user != null) {
            str = user.A03.AaR();
        } else {
            str = null;
        }
        String str2 = userSession.A06;
        boolean A0K = 0qQ.A0K(str, str2);
        if (!A1S2 || A0K) {
            boolean A1S3 = AnonymousClass7TF.A1S(i, 1013);
            if ((!z || A05 || A1S || A1S3 || A0r.size() != A1Z || !capabilities.A00(C376179Gx.REPORT_USER) || !182.A06(0Tu.A05, userSession, 2342153302684205063L)) && (i != 29 || 0qQ.A0K(str2, A02))) {
                return false;
            }
        }
        return true;
    }
}
