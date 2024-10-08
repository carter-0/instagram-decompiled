package X;

import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;
import java.io.IOException;

public abstract class VH9 {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.VjN] */
    public static C17985VjN parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ProductTile productTile = null;
            UnavailableProductImpl unavailableProductImpl = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("product".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r5);
                } else if ("product_tile".equals(A17)) {
                    productTile = C44928CnL.parseFromJson(r5);
                } else if ("unavailable_product".equals(A17)) {
                    unavailableProductImpl = C45138Cqw.parseFromJson(r5);
                }
                r5.A0z();
            }
            ? obj = new Object();
            if (productDetailsProductItemDict != null) {
                obj.A01 = productDetailsProductItemDict;
            }
            if (productTile != null) {
                obj.A00 = productTile;
            }
            if (unavailableProductImpl == null) {
                return obj;
            }
            obj.A02 = unavailableProductImpl;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
