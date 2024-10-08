package X;

import java.io.IOException;

public abstract class CX9 {
    public static BEZ parseFromJson(16F r9) {
        String A00;
        0qQ.A0B(r9, 0);
        try {
            Integer num = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r2 = 16L.A09;
                A00 = AnonymousClass000.A00(4694);
                if (A1J == r2) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r9);
                if (A00.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if ("max_budget".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r9);
                } else {
                    num3 = C41847B3o.A13(r9, num3, A17, "min_budget");
                }
                r9.A0z();
            }
            if (num == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r9, "DailyBudgetRangeImpl");
            } else if (num2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("max_budget", r9, "DailyBudgetRangeImpl");
            } else if (num3 != null || !(r9 instanceof 0c9)) {
                return new BEZ(num.intValue(), num2.intValue(), num3.intValue());
            } else {
                AnonymousClass7TF.A1L("min_budget", r9, "DailyBudgetRangeImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
