package X;

import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Erw  reason: case insensitive filesystem */
public abstract class C49253Erw {
    public static final void A00(ScreenTimeScreenType screenTimeScreenType, UserSession userSession, long j) {
        0qQ.A0B(userSession, 0);
        2B1 r6 = 2B0.A01;
        C280084zy A08 = r6.A08(userSession, screenTimeScreenType.toString());
        if (A08 != null && A08.A01() != 0) {
            A08.A00 = j;
            A08.A03 = C280084zy.A00().getTime();
            r6.A0D(userSession, A08, screenTimeScreenType.toString());
        }
    }
}
