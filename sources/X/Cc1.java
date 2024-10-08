package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

public abstract class Cc1 {
    public static C42069BFx parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("product".equals(AnonymousClass7TE.A17(r3))) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new C42069BFx(productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
