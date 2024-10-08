package X;

import com.instagram.model.shopping.ProductContainer;
import java.io.IOException;

/* renamed from: X.Cn2  reason: case insensitive filesystem */
public abstract class C44912Cn2 {
    public static ProductContainer parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ProductContainer productContainer = new ProductContainer();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("product".equals(A17)) {
                    productContainer.A00 = C275404q6.parseFromJson(r3);
                } else if ("unavailable_product".equals(A17)) {
                    productContainer.A01 = C45138Cqw.parseFromJson(r3);
                }
                r3.A0z();
            }
            return productContainer;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
