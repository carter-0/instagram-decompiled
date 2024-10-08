package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7L {
    public static Map A00(XAV xav) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xav.Aed() != null) {
            linkedHashMap.put("avg_rating", AnonymousClass7TH.A0D(xav.Aed()));
        }
        if (xav.BoI() != null) {
            linkedHashMap.put("review_count", xav.BoI());
        }
        if (xav.BpJ() != null) {
            linkedHashMap.put("satisfaction_score", AnonymousClass7TH.A0D(xav.BpJ()));
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
