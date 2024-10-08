package X;

import com.instagram.api.schemas.ContentAppreciationFeatureStatus;
import java.io.IOException;

public final class F4B {
    public static C47298DuR parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("content_appreciation_status".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    ContentAppreciationFeatureStatus contentAppreciationFeatureStatus = (ContentAppreciationFeatureStatus) ContentAppreciationFeatureStatus.A01.get(str);
                    if (contentAppreciationFeatureStatus == null) {
                        contentAppreciationFeatureStatus = ContentAppreciationFeatureStatus.UNRECOGNIZED;
                    }
                    r2.A00 = contentAppreciationFeatureStatus;
                } else {
                    1XY.A01(r3, r2, A17);
                }
                r3.A0z();
            }
            ContentAppreciationFeatureStatus contentAppreciationFeatureStatus2 = r2.A00;
            0qQ.A0A(contentAppreciationFeatureStatus2);
            r2.A01 = new C61099JxA(contentAppreciationFeatureStatus2);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
