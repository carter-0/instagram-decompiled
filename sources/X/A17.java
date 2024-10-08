package X;

import com.instagram.common.session.UserSession;

public abstract class A17 {
    public static boolean A00(UserSession userSession, 1Av r10) {
        0xa r8 = r10.A01;
        0Tu r3 = 0Tu.A05;
        return ((double) r8.getFloat("reel_tray_personalization_avg_core_sessions_per_day", -1.0f)) >= 182.A00(r3, userSession, 37173298429231698L) && ((double) r8.getFloat("reel_tray_personalization_avg_core_sessions_per_day", -1.0f)) <= 182.A00(r3, userSession, 37173298429297235L);
    }
}
