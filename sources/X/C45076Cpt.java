package X;

import com.instagram.model.shopping.productfeed.ProductTile;
import java.io.IOException;

/* renamed from: X.Cpt  reason: case insensitive filesystem */
public abstract class C45076Cpt {
    public static C61076JwE parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C61076JwE jwE = new C61076JwE(16);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("product_tile".equals(A17)) {
                    ProductTile parseFromJson = C44928CnL.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    jwE.A00 = parseFromJson;
                } else if ("deeplink".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    jwE.A01 = str;
                }
                r4.A0z();
            }
            return jwE;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
