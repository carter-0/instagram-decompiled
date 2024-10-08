package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CbP {
    public static Map A00(AnonymousClass3IZ r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Aec() != null) {
            A1H.put("avg_core_sessions_per_day", AnonymousClass7TH.A0D(r3.Aec()));
        }
        if (r3.B6l() != null) {
            A1H.put("follow_count", r3.B6l());
        }
        if (r3.CUf() != null) {
            A1H.put("is_high_me_user", r3.CUf());
        }
        if (r3.CUh() != null) {
            A1H.put("is_high_usage_likelihood", r3.CUh());
        }
        if (r3.Cd5() != null) {
            A1H.put("is_teen", r3.Cd5());
        }
        if (r3.BNT() != null) {
            A1H.put("lness28_score", r3.BNT());
        }
        if (r3.C01() != null) {
            A1H.put("stories_imp_bucket", r3.C01());
        }
        if (r3.CFF() != null) {
            A1H.put("viewer_swipe_preload_count", r3.CFF());
        }
        if (r3.CFG() != null) {
            A1H.put("viewer_tap_preload_count", r3.CFG());
        }
        if (r3.CG6() != null) {
            A1H.put("warm_start_refresh_timer_in_seconds", r3.CG6());
        }
        return 0Yt.A0B(A1H);
    }
}
