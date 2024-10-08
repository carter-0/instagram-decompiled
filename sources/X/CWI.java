package X;

import java.io.IOException;

public abstract class CWI {
    public static BEP parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Integer num = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("sent_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else {
                    num2 = C41847B3o.A13(r7, num2, A17, "target_number");
                }
                r7.A0z();
            }
            if (num == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sent_count", r7, "ContentAppreciationGiftProgressionInfoImpl");
            } else if (num2 != null || !(r7 instanceof 0c9)) {
                return new BEP(num.intValue(), num2.intValue());
            } else {
                AnonymousClass7TF.A1L("target_number", r7, "ContentAppreciationGiftProgressionInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
