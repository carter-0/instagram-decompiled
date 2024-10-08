package X;

import com.instagram.user.model.ProductCollectionImpl;
import java.io.IOException;

/* renamed from: X.Cqq  reason: case insensitive filesystem */
public abstract class C45132Cqq {
    public static C42144BIz parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ProductCollectionImpl productCollectionImpl = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Long l = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("discount_metadata".equals(A17)) {
                    productCollectionImpl = C45710D2j.parseFromJson(r4);
                } else {
                    l = C41847B3o.A14(r4, l, A17, "end_time");
                }
                r4.A0z();
            }
            return new C42144BIz(productCollectionImpl, l);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
