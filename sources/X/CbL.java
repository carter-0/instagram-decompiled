package X;

import com.instagram.api.schemas.PaymentInfo;
import com.instagram.api.schemas.PaymentMethodImpl;
import java.io.IOException;

public abstract class CbL {
    public static PaymentInfo parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            String str = null;
            PaymentMethodImpl paymentMethodImpl = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("budget_limit_with_offset".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("budget_spent_with_offset".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r10);
                } else if ("footer_message".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("from_facebook".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if (Pxd.A00(834).equals(A17)) {
                    paymentMethodImpl = CbM.parseFromJson(r10);
                }
                r10.A0z();
            }
            if (bool != null || !(r10 instanceof 0c9)) {
                return new PaymentInfo(paymentMethodImpl, num, num2, str, bool.booleanValue());
            }
            AnonymousClass7TF.A1L("from_facebook", r10, "PaymentInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
