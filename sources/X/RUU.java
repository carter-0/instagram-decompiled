package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class RUU {
    public static final boolean A00(C10860RzL rzL, 1yd r7, boolean z) {
        boolean A1U = AnonymousClass7TF.A1U(0, r7, rzL);
        UserSession userSession = r7.A00;
        0Tu r3 = 0Tu.A05;
        if (!DbY.A1Z(r3, userSession, 36310430914969706L) || ((DbY.A1Z(r3, userSession, 36322860551187061L) && !z) || (DbY.A1Z(r3, userSession, 36322860551055987L) && AnonymousClass7TE.A1b((List) rzL.A0D.A00)))) {
            return false;
        }
        return A1U;
    }
}
