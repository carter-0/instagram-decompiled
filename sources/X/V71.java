package X;

import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V71 {
    public static Map A00(AdvantageAudienceData advantageAudienceData) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (advantageAudienceData.Aa9() != null) {
            XFBTargetingAutomationAdvantageAudienceStatus Aa9 = advantageAudienceData.Aa9();
            if (Aa9 != null) {
                str = Aa9.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("advantage_audience_status", str);
        }
        if (advantageAudienceData.BT2() != null) {
            linkedHashMap.put("min_age_constraint", advantageAudienceData.BT2());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
