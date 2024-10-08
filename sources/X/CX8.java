package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

public abstract class CX8 {
    public static UMw parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("daily_budget".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if (TraceFieldType.Duration.equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r9);
                } else if ("guidance".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (num == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("daily_budget", r9, "DailyBudgetDurationPairImpl");
            } else if (num2 != null || !(r9 instanceof 0c9)) {
                return new UMw(num.intValue(), num2.intValue(), str);
            } else {
                AnonymousClass7TF.A1L(TraceFieldType.Duration, r9, "DailyBudgetDurationPairImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
