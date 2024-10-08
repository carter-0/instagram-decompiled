package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;
import java.io.IOException;

/* renamed from: X.4l6  reason: invalid class name and case insensitive filesystem */
public abstract class C272634l6 {
    public static AnonymousClass9IE parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("mes_status_for_product".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    monetizationEligibilityDecision = C272514kr.A00(str);
                }
                r4.A0z();
            }
            return new AnonymousClass9IE((Object) monetizationEligibilityDecision, 2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
