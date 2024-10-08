package X;

import com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileTextStyleType;
import java.io.IOException;

/* renamed from: X.CcB  reason: case insensitive filesystem */
public abstract class C44267CcB {
    public static ProductTileFeaturedProductPermissionInfoLabelOptionsImpl parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            ProductTileTextStyleType productTileTextStyleType = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("status_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("style_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    productTileTextStyleType = (ProductTileTextStyleType) ProductTileTextStyleType.A01.get(str);
                    if (productTileTextStyleType == null) {
                        productTileTextStyleType = ProductTileTextStyleType.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (str2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("status_text", r8, "ProductTileFeaturedProductPermissionInfoLabelOptionsImpl");
            } else if (productTileTextStyleType != null || !(r8 instanceof 0c9)) {
                return new ProductTileFeaturedProductPermissionInfoLabelOptionsImpl(productTileTextStyleType, str2);
            } else {
                AnonymousClass7TF.A1L("style_type", r8, "ProductTileFeaturedProductPermissionInfoLabelOptionsImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
