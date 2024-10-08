package X;

import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import java.io.IOException;

/* renamed from: X.CnH  reason: case insensitive filesystem */
public abstract class C44924CnH {
    public static ProductCollectionCoverImpl parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ProductImageContainerImpl productImageContainerImpl = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            IgShowreelNativeAnimation igShowreelNativeAnimation = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("image".equals(A17)) {
                    productImageContainerImpl = C275414q7.parseFromJson(r4);
                } else if ("showreel_native_animation".equals(A17)) {
                    igShowreelNativeAnimation = AnonymousClass5HA.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new ProductCollectionCoverImpl(productImageContainerImpl, igShowreelNativeAnimation);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
