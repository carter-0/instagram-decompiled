package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public abstract class RUR {
    public static final boolean A00(C10860RzL rzL, 1yd r3) {
        Number A14;
        AnonymousClass7TG.A1N(r3, rzL);
        C61080JwI jwI = rzL.A0F;
        0qQ.A0B(jwI, 0);
        Integer A0n = Pxe.A0n();
        if (((Map) jwI.A00).containsKey(A0n) && (A14 = C51966G9m.A14(A0n, (Map) jwI.A00)) != null && A14.intValue() == 19) {
            return true;
        }
        UserSession userSession = r3.A00;
        0Tu r2 = 0Tu.A05;
        if (Pxf.A1T(r2, userSession) || !DbY.A1Z(r2, userSession, 36322860550204007L)) {
            return false;
        }
        return true;
    }
}
