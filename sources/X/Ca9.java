package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class Ca9 {
    public static Map A00(DTH dth) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dth.BWs() != null) {
            A1H.put("num_earned_achievements", dth.BWs());
        }
        dth.getShowAchievements();
        A1H.put("show_achievements", Boolean.valueOf(dth.getShowAchievements()));
        dth.BvA();
        return C41845B3m.A0u("show_challenges_toast", Boolean.valueOf(dth.BvA()), A1H);
    }
}
