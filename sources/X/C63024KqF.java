package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;
import java.io.IOException;

/* renamed from: X.KqF  reason: case insensitive filesystem */
public abstract class C63024KqF {
    public static C61110JxM parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if (AnonymousClass000.A00(1593).equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    monetizationEligibilityDecision = C272514kr.A00(str);
                } else if ("pending_approval_requests_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if ("require_approval".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                }
                r9.A0z();
            }
            if (num == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("pending_approval_requests_count", r9, "PaidPartnershipLabelConfigImpl");
            } else if (bool != null || !(r9 instanceof 0c9)) {
                return new C61110JxM(monetizationEligibilityDecision, num.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("require_approval", r9, "PaidPartnershipLabelConfigImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
