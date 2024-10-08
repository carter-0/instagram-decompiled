package X;

import com.instagram.api.schemas.ProductTileLabelImpl;
import com.instagram.api.schemas.ProductTileLabelType;
import com.instagram.api.schemas.ProductTileLayoutContentImpl;
import java.io.IOException;

/* renamed from: X.CcC  reason: case insensitive filesystem */
public abstract class C44268CcC {
    public static ProductTileLabelImpl parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ProductTileLabelType productTileLabelType = null;
            ProductTileLayoutContentImpl productTileLayoutContentImpl = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("label_type".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    productTileLabelType = (ProductTileLabelType) ProductTileLabelType.A01.get(str);
                    if (productTileLabelType == null) {
                        productTileLabelType = ProductTileLabelType.UNRECOGNIZED;
                    }
                } else if ("layout_content".equals(A17)) {
                    productTileLayoutContentImpl = C44269CcD.parseFromJson(r7);
                }
                r7.A0z();
            }
            if (productTileLabelType != null || !(r7 instanceof 0c9)) {
                return new ProductTileLabelImpl(productTileLabelType, productTileLayoutContentImpl);
            }
            AnonymousClass7TF.A1L("label_type", r7, "ProductTileLabelImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
