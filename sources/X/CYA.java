package X;

import com.instagram.api.schemas.GoalsToastInfo;
import com.instagram.api.schemas.GoalsToastType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CYA {
    public static Map A00(GoalsToastInfo goalsToastInfo) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (goalsToastInfo.Air() != null) {
            A1H.put("button_text", goalsToastInfo.Air());
        }
        if (goalsToastInfo.Avk() != null) {
            A1H.put("deeplink_url", goalsToastInfo.Avk());
        }
        if (goalsToastInfo.B9c() != null) {
            A1H.put("goal_id", goalsToastInfo.B9c());
        }
        if (goalsToastInfo.C7x() != null) {
            A1H.put("title_text", goalsToastInfo.C7x());
        }
        if (goalsToastInfo.C81() != null) {
            GoalsToastType C81 = goalsToastInfo.C81();
            if (C81 != null) {
                str = C81.A00;
            } else {
                str = null;
            }
            A1H.put("toast_type", str);
        }
        return 0Yt.A0B(A1H);
    }
}
