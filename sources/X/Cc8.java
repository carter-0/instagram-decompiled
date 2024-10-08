package X;

import com.instagram.api.schemas.ProductTileBannerMetadataDecorationImpl;
import com.instagram.api.schemas.ProductTileBannerType;
import java.io.IOException;

public abstract class Cc8 {
    public static ProductTileBannerMetadataDecorationImpl parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            ProductTileBannerType productTileBannerType = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("banner_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("banner_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    productTileBannerType = (ProductTileBannerType) ProductTileBannerType.A01.get(str);
                    if (productTileBannerType == null) {
                        productTileBannerType = ProductTileBannerType.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (str2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("banner_text", r8, "ProductTileBannerMetadataDecorationImpl");
            } else if (productTileBannerType != null || !(r8 instanceof 0c9)) {
                return new ProductTileBannerMetadataDecorationImpl(productTileBannerType, str2);
            } else {
                AnonymousClass7TF.A1L("banner_type", r8, "ProductTileBannerMetadataDecorationImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
