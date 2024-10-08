package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductWrapper;
import java.io.IOException;

/* renamed from: X.D2k  reason: case insensitive filesystem */
public abstract class C45711D2k {
    public static ProductWrapper parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("product_details".equals(AnonymousClass7TE.A17(r3))) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new ProductWrapper(productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, ProductWrapper productWrapper) {
        r2.A0c();
        ProductDetailsProductItemDict productDetailsProductItemDict = productWrapper.A00;
        if (productDetailsProductItemDict != null) {
            r2.A0q("product_details");
            C275404q6.A00(r2, productDetailsProductItemDict);
        }
        r2.A0Z();
    }
}
