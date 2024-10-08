package X;

import com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileLayoutContentImpl;
import com.instagram.api.schemas.ProductTilePriceLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileProductNameLabelOptionsImpl;
import java.io.IOException;

/* renamed from: X.CcD  reason: case insensitive filesystem */
public abstract class C44269CcD {
    public static ProductTileLayoutContentImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ProductTileFeaturedProductPermissionInfoLabelOptionsImpl productTileFeaturedProductPermissionInfoLabelOptionsImpl = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ProductTilePriceLabelOptionsImpl productTilePriceLabelOptionsImpl = null;
            ProductTileProductNameLabelOptionsImpl productTileProductNameLabelOptionsImpl = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("featured_product_permission_info".equals(A17)) {
                    productTileFeaturedProductPermissionInfoLabelOptionsImpl = C44267CcB.parseFromJson(r5);
                } else if ("price".equals(A17)) {
                    productTilePriceLabelOptionsImpl = C44272CcG.parseFromJson(r5);
                } else if ("product_name".equals(A17)) {
                    productTileProductNameLabelOptionsImpl = C44274CcI.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new ProductTileLayoutContentImpl(productTileFeaturedProductPermissionInfoLabelOptionsImpl, productTilePriceLabelOptionsImpl, productTileProductNameLabelOptionsImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
