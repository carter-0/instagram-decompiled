package X;

import com.instagram.api.schemas.AdvantageAudienceDataImpl;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import java.io.IOException;

public abstract class V72 {
    public static AdvantageAudienceDataImpl parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus = null;
            Integer num = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("advantage_audience_status".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    xFBTargetingAutomationAdvantageAudienceStatus = (XFBTargetingAutomationAdvantageAudienceStatus) XFBTargetingAutomationAdvantageAudienceStatus.A01.get(str);
                    if (xFBTargetingAutomationAdvantageAudienceStatus == null) {
                        xFBTargetingAutomationAdvantageAudienceStatus = XFBTargetingAutomationAdvantageAudienceStatus.UNRECOGNIZED;
                    }
                } else {
                    num = C41847B3o.A13(r5, num, A17, "min_age_constraint");
                }
                r5.A0z();
            }
            return new AdvantageAudienceDataImpl(xFBTargetingAutomationAdvantageAudienceStatus, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
