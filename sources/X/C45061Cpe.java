package X;

import com.instagram.api.schemas.ProductTileTextColorType;
import java.io.IOException;

/* renamed from: X.Cpe  reason: case insensitive filesystem */
public abstract class C45061Cpe {
    public static C61082JwK parseFromJson(16F r8) {
        String A00;
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ProductTileTextColorType productTileTextColorType = null;
            Boolean bool = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r4 = 16L.A09;
                A00 = AnonymousClass000.A00(4063);
                if (A1J == r4) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if ("color".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    productTileTextColorType = (ProductTileTextColorType) ProductTileTextColorType.A01.get(str);
                    if (productTileTextColorType == null) {
                        productTileTextColorType = ProductTileTextColorType.UNRECOGNIZED;
                    }
                } else {
                    bool = C41847B3o.A0z(r8, bool, A17, A00);
                }
                r8.A0z();
            }
            if (productTileTextColorType == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("color", r8, "DestinationItemLayoutContent");
            } else if (bool != null || !(r8 instanceof 0c9)) {
                return new C61082JwK(productTileTextColorType, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L(A00, r8, "DestinationItemLayoutContent");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
