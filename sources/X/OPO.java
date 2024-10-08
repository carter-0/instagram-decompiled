package X;

import com.instagram.common.session.UserSession;

public abstract class OPO {
    public static final boolean A00(UserSession userSession, N4P n4p) {
        int i;
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        0s0 r1 = A00.A08;
        AnonymousClass0YZ[] r3 = 1Av.A8a;
        if (!(AnonymousClass7TG.A1a(A00, r1, r3, 431) || (i = n4p.A09) == 29 || i == 26 || i == 24)) {
            1Av A002 = 1Au.A00(userSession);
            0Tu r32 = 0Tu.A05;
            if (((long) DbY.A03(A002, A002.A07, r3, 430)) >= 182.A01(r32, userSession, 36608162338051743L) || !182.A06(r32, userSession, 36326687361284013L) || !182.A06(r32, userSession, 36326687360694181L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, N4P n4p) {
        0qQ.A0B(userSession, 0);
        if ((!AnonymousClass7TE.A0q(userSession).getBoolean("bc_custom_themes_has_seen_new_icon_in_thread_details", false)) && n4p.A09 == 29 && N4P.A04(userSession, n4p)) {
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36320910629675978L) || !182.A06(r2, userSession, 36320910630069197L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
