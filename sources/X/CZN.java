package X;

import com.instagram.api.schemas.IGRFSurveyContextDictImpl;
import com.instagram.api.schemas.IGRFSurveyInfoDictImpl;
import java.io.IOException;

public abstract class CZN {
    public static IGRFSurveyInfoDictImpl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            IGRFSurveyContextDictImpl iGRFSurveyContextDictImpl = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("feed_context".equals(AnonymousClass7TE.A17(r3))) {
                    iGRFSurveyContextDictImpl = CZL.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new IGRFSurveyInfoDictImpl(iGRFSurveyContextDictImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
