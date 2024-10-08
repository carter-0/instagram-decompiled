package X;

import com.instagram.api.schemas.ProductTileContextImpl;
import com.instagram.api.schemas.ProductTileContextMetadataImpl;
import com.instagram.api.schemas.ProductTileContextVariant;
import java.io.IOException;

/* renamed from: X.Cc9  reason: case insensitive filesystem */
public abstract class C44265Cc9 {
    public static ProductTileContextImpl parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str2 = null;
            ProductTileContextVariant productTileContextVariant = null;
            ProductTileContextMetadataImpl productTileContextMetadataImpl = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("metadata".equals(A17)) {
                    productTileContextMetadataImpl = C44266CcA.parseFromJson(r9);
                } else if ("text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("variant".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    productTileContextVariant = (ProductTileContextVariant) ProductTileContextVariant.A01.get(str);
                    if (productTileContextVariant == null) {
                        productTileContextVariant = ProductTileContextVariant.UNRECOGNIZED;
                    }
                }
                r9.A0z();
            }
            if (str2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("text", r9, "ProductTileContextImpl");
            } else if (productTileContextVariant != null || !(r9 instanceof 0c9)) {
                return new ProductTileContextImpl(productTileContextMetadataImpl, productTileContextVariant, str2);
            } else {
                AnonymousClass7TF.A1L("variant", r9, "ProductTileContextImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
