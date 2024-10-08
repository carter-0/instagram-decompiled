package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;
import java.io.IOException;

public abstract class CYN {
    public static C59721JVf parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            UnavailableProductImpl unavailableProductImpl = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("product".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r4);
                } else if ("unavailable_product".equals(A17)) {
                    unavailableProductImpl = C45138Cqw.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C59721JVf(12, (Object) unavailableProductImpl, (Object) productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
