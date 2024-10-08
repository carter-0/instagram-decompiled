package X;

import com.instagram.model.payments.DeliveryWindowInfoImpl;
import java.io.IOException;

/* renamed from: X.CmJ  reason: case insensitive filesystem */
public abstract class C44867CmJ {
    public static DeliveryWindowInfoImpl parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Long l = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Long l2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("maximum_date".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r7);
                } else {
                    l2 = C41847B3o.A14(r7, l2, A17, "minimum_date");
                }
                r7.A0z();
            }
            if (l == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("maximum_date", r7, "DeliveryWindowInfoImpl");
            } else if (l2 != null || !(r7 instanceof 0c9)) {
                return new DeliveryWindowInfoImpl(l.longValue(), l2.longValue());
            } else {
                AnonymousClass7TF.A1L("minimum_date", r7, "DeliveryWindowInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
