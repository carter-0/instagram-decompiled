package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class GKC {
    public final AnonymousClass4HW A00 = C335967dq.A00(AnonymousClass4HU.A00);

    public static final boolean A00(C229352nF r9, UserSession userSession, GD6 gd6, C54575HJk hJk, C52012GBj gBj, String str) {
        GD6 gd62 = gd6;
        C54575HJk hJk2 = hJk;
        boolean A1b = C51973G9u.A1b(gd6, hJk, gBj);
        0qQ.A0B(userSession, 5);
        HashMap A002 = C52266GLh.A00(userSession).A00();
        if (!(!A002.isEmpty())) {
            return false;
        }
        for (Object next : A002.values()) {
            0qQ.A07(next);
            C53332GmI gmI = (C53332GmI) next;
            Integer A003 = GNV.A00(gmI, userSession, hJk, gBj);
            if (A003 != null) {
                GNV.A03(r9, gmI, gd62, hJk2, str, A003.intValue());
            }
        }
        return A1b;
    }
}
