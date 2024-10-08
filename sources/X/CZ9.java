package X;

import com.instagram.api.schemas.EventVisibilityType;
import com.instagram.api.schemas.IGLocalEventDict;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CZ9 {
    public static Map A00(IGLocalEventDict iGLocalEventDict) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (iGLocalEventDict.BF1() != null) {
            A1H.put("ig_event_time_string", iGLocalEventDict.BF1());
        }
        if (iGLocalEventDict.BF2() != null) {
            EventVisibilityType BF2 = iGLocalEventDict.BF2();
            if (BF2 != null) {
                str = BF2.A00;
            } else {
                str = null;
            }
            A1H.put("ig_event_visibility", str);
        }
        return 0Yt.A0B(A1H);
    }
}
