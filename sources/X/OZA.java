package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

public final class OZA {
    public static final OZA A00 = new Object();

    public static final AnonymousClass2Ep A00(UserSession userSession, DirectShareTarget directShareTarget) {
        C254783t2 A0c = DbS.A0c(directShareTarget);
        if (AnonymousClass6W3.A08(A0c)) {
            AnonymousClass3U9 C5z = 1bJ.A00(userSession).C5z(C66647MaG.A03(AnonymousClass6W3.A06(A0c)));
            if (C5z instanceof AnonymousClass2Ep) {
                return C5z;
            }
        }
        return null;
    }

    public final boolean A01(UserSession userSession, DirectShareTarget directShareTarget) {
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, directShareTarget);
        AnonymousClass2Ep A002 = A00(userSession, directShareTarget);
        if (A002 == null || A002.CVE() != A1Z) {
            return false;
        }
        return true;
    }
}
