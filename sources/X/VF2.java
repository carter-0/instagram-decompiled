package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;
import java.io.IOException;

public abstract class VF2 {
    public static ProductFeedItem parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            MultiProductComponent multiProductComponent = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            UnavailableProductImpl unavailableProductImpl = null;
            ProductTile productTile = null;
            1Xj r1 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("product_collection".equals(A17)) {
                    multiProductComponent = VF1.parseFromJson(r7);
                } else if ("product".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r7);
                } else if ("unavailable_product".equals(A17)) {
                    unavailableProductImpl = C45138Cqw.parseFromJson(r7);
                } else if ("product_tile".equals(A17)) {
                    productTile = C44928CnL.parseFromJson(r7);
                } else if ("media_feed_item".equals(A17)) {
                    r1 = 1Xj.A00(r7);
                }
                r7.A0z();
            }
            ProductFeedItem productFeedItem = new ProductFeedItem();
            if (multiProductComponent != null) {
                productFeedItem.A01 = multiProductComponent;
            }
            if (productDetailsProductItemDict != null) {
                productFeedItem.A04 = productDetailsProductItemDict;
            }
            if (unavailableProductImpl != null) {
                productFeedItem.A05 = unavailableProductImpl;
            }
            if (productTile != null) {
                productFeedItem.A02 = productTile;
            }
            if (r1 != null) {
                productFeedItem.A00 = r1;
            }
            productFeedItem.A04();
            return productFeedItem;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
