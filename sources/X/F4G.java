package X;

import com.instagram.api.schemas.FeedAfterPartyPromoteEligibilityStatusEnum;
import java.io.IOException;

public final class F4G {
    public static C47302DuV parseFromJson(16F r3) {
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
                if ("feed_after_party_eligibility_status".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    FeedAfterPartyPromoteEligibilityStatusEnum feedAfterPartyPromoteEligibilityStatusEnum = (FeedAfterPartyPromoteEligibilityStatusEnum) FeedAfterPartyPromoteEligibilityStatusEnum.A01.get(str);
                    if (feedAfterPartyPromoteEligibilityStatusEnum == null) {
                        feedAfterPartyPromoteEligibilityStatusEnum = FeedAfterPartyPromoteEligibilityStatusEnum.UNRECOGNIZED;
                    }
                    r2.A00 = feedAfterPartyPromoteEligibilityStatusEnum;
                } else {
                    1XY.A01(r3, r2, A17);
                }
                r3.A0z();
            }
            FeedAfterPartyPromoteEligibilityStatusEnum feedAfterPartyPromoteEligibilityStatusEnum2 = r2.A00;
            0qQ.A0A(feedAfterPartyPromoteEligibilityStatusEnum2);
            r2.A01 = new C47196Dsi(feedAfterPartyPromoteEligibilityStatusEnum2);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
