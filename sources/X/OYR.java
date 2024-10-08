package X;

import com.instagram.common.session.UserSession;

public final class OYR {
    public static boolean A00;
    public static final OYR A01 = new Object();

    public static final C69332NjX A00(UserSession userSession) {
        1Av A002 = 1Au.A00(userSession);
        0Tu A0J = DbS.A0J(userSession, 0);
        if (182.A06(A0J, userSession, 36317732353873379L)) {
            0xa r4 = A002.A01;
            if (r4.getInt("ai_sticker_nux_seen_count", 0) < DbS.A04(A0J, userSession, 36599207330975180L)) {
                JTS.A1S(r4, "ai_sticker_nux_seen_count", 0);
                return C69332NjX.NUX;
            }
        }
        if (182.A06(A0J, userSession, 36317732354528741L)) {
            return C69332NjX.PREVIEW;
        }
        return C69332NjX.A03;
    }
}
