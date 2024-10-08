package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public abstract class FFT {
    public static boolean A02(0lg r3) {
        if (DbV.A04(r3) < 10) {
            return true;
        }
        return false;
    }

    public static ArrayList A00(UserSession userSession) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        int A04 = DbV.A04(userSession);
        int size = AnonymousClass3EO.A00(userSession).A02().size();
        AnonymousClass7TF.A1M(A1C, A04);
        AnonymousClass7TF.A1M(A1C, A04 + size);
        return A1C;
    }

    public static ArrayList A01(UserSession userSession, User user) {
        String id;
        List BO1 = AnonymousClass0BO.A00(userSession).BO1(DbT.A0j(userSession));
        HashSet A02 = AnonymousClass3EO.A00(userSession).A02();
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (user == null) {
            id = null;
        } else {
            id = user.getId();
        }
        for (int i = 0; i < BO1.size(); i++) {
            User A0g = DbS.A0g(BO1, i);
            String id2 = A0g.getId();
            if (!A02.contains(id2) && !id2.equals(id)) {
                A1C.add(A0g);
            }
        }
        return A1C;
    }

    public static boolean A03(UserSession userSession, User user) {
        if (A01(userSession, user).isEmpty() || !1AW.A06(0Tu.A05, 18297273645531846L)) {
            return false;
        }
        return true;
    }
}
