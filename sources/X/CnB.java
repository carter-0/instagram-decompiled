package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

public abstract class CnB {
    public static C42130BIj parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C68282N8v n8v = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("permission".equals(A17)) {
                    n8v = O1I.parseFromJson(r4);
                } else if ("product".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C42130BIj(n8v, productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
