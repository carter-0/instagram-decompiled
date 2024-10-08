package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.Nwj  reason: case insensitive filesystem */
public abstract class C70067Nwj {
    public static C61078JwG parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("product".equals(AnonymousClass7TE.A17(r5))) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (productDetailsProductItemDict != null || !(r5 instanceof 0c9)) {
                return new C61078JwG(productDetailsProductItemDict);
            }
            AnonymousClass7TF.A1L("product", r5, "DirectProductShare");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
