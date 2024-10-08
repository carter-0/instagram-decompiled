package X;

import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import java.io.IOException;

/* renamed from: X.CcH  reason: case insensitive filesystem */
public abstract class C44273CcH {
    public static ProductTileProductImpl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            FBProductItemDetailsDictImpl fBProductItemDetailsDictImpl = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("fb_product".equals(AnonymousClass7TE.A17(r3))) {
                    fBProductItemDetailsDictImpl = CXV.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new ProductTileProductImpl(fBProductItemDetailsDictImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
