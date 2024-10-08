package X;

import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.CdV  reason: case insensitive filesystem */
public abstract class C44349CdV {
    public static BGO parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ShoppingBrandWithProductsImpl shoppingBrandWithProductsImpl = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            BG2 bg2 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("brand_tile".equals(A17)) {
                    shoppingBrandWithProductsImpl = C44344CdQ.parseFromJson(r5);
                } else if ("product".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r5);
                } else if ("product_tile".equals(A17)) {
                    bg2 = C44278CcM.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new BGO(bg2, shoppingBrandWithProductsImpl, productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
