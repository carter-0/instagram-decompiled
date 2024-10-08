package X;

import com.instagram.api.schemas.ProductWithMediaImageImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.CcL  reason: case insensitive filesystem */
public abstract class C44277CcL {
    public static ProductWithMediaImageImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "micro_product")) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (productDetailsProductItemDict != null || !(r5 instanceof 0c9)) {
                return new ProductWithMediaImageImpl(productDetailsProductItemDict);
            }
            AnonymousClass7TF.A1L("micro_product", r5, "ProductWithMediaImageImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
