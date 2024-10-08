package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Kvv  reason: case insensitive filesystem */
public abstract class C63374Kvv {
    public static final boolean A00(UserSession userSession, ShareType shareType, boolean z) {
        0Tu r2;
        long j;
        0qQ.A0B(shareType, 0);
        C63373Kvu kvu = C63373Kvu.$redex_init_class;
        int ordinal = shareType.ordinal();
        if (!(ordinal == 9 || ordinal == 2 || ordinal == 4)) {
            if (ordinal == 1 || ordinal == 3) {
                if (!z) {
                    return false;
                }
                r2 = 0Tu.A05;
                j = 36320876271313830L;
            } else if (!z || !0oI.A0C(C60960kU.A00) || !182.A06(0Tu.A05, userSession, 36320876271248293L)) {
                if (!0oI.A09(C60960kU.A00)) {
                    return false;
                }
                r2 = 0Tu.A05;
                j = 36328770419834448L;
            }
            if (182.A06(r2, userSession, j)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
