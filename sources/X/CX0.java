package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CX0 {
    public static Map A00(C46276DTf dTf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTf.B49() != null) {
            A1H.put("fb_crosspost_deeplink_profile_id", dTf.B49());
        }
        if (dTf.B4A() != null) {
            A1H.put("fb_crosspost_fbid", dTf.B4A());
        }
        if (dTf.C5t() != null) {
            A1H.put("th_unified_feedback_row_tap_target_url", dTf.C5t());
        }
        if (dTf.CBS() != null) {
            A1H.put("unified_feedback_enabled", dTf.CBS());
        }
        return 0Yt.A0B(A1H);
    }
}
