package X;

import com.instagram.api.schemas.ProductTileTextStyleType;
import java.io.IOException;

/* renamed from: X.Cpd  reason: case insensitive filesystem */
public abstract class C45060Cpd {
    public static C61079JwH parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str2 = null;
            ProductTileTextStyleType productTileTextStyleType = null;
            C61082JwK jwK = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("label_content".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("label_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    productTileTextStyleType = (ProductTileTextStyleType) ProductTileTextStyleType.A01.get(str);
                    if (productTileTextStyleType == null) {
                        productTileTextStyleType = ProductTileTextStyleType.UNRECOGNIZED;
                    }
                } else if ("layout_content".equals(A17)) {
                    jwK = C45061Cpe.parseFromJson(r10);
                }
                r10.A0z();
            }
            if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("label_content", r10, "DestinationItemLabel");
            } else if (productTileTextStyleType == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("label_type", r10, "DestinationItemLabel");
            } else if (jwK != null || !(r10 instanceof 0c9)) {
                return new C61079JwH(jwK, productTileTextStyleType, str2);
            } else {
                AnonymousClass7TF.A1L("layout_content", r10, "DestinationItemLabel");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
