package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;
import java.io.IOException;

public abstract class CXZ {
    public static C42033BEk parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("can_acquire_new_subscribers".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if (AnonymousClass000.A00(1593).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    monetizationEligibilityDecision = C272514kr.A00(str);
                }
                r7.A0z();
            }
            if (bool != null || !(r7 instanceof 0c9)) {
                return new C42033BEk(monetizationEligibilityDecision, bool.booleanValue());
            }
            AnonymousClass7TF.A1L("can_acquire_new_subscribers", r7, "FanClubConfigImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
