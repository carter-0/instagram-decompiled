package X;

import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.io.IOException;

/* renamed from: X.Cfz  reason: case insensitive filesystem */
public abstract class C44503Cfz {
    public static C42109BHn parseFromJson(16F r17) {
        16F r6 = r17;
        0qQ.A0B(r6, 0);
        try {
            Long l = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Long l2 = null;
            Long l3 = null;
            ProductImageContainerImpl productImageContainerImpl = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("merchant_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r6);
                } else if ("photo".equals(A17)) {
                    productImageContainerImpl = C275414q7.parseFromJson(r6);
                } else if ("product_id".equals(A17)) {
                    l2 = AnonymousClass7TF.A0Z(r6);
                } else {
                    l3 = C41847B3o.A14(r6, l3, A17, "product_image_id");
                }
                r6.A0z();
            }
            if (l == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("merchant_id", r6, "TaggedProductImageContentImpl");
            } else if (productImageContainerImpl == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("photo", r6, "TaggedProductImageContentImpl");
            } else if (l2 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("product_id", r6, "TaggedProductImageContentImpl");
            } else if (l3 != null || !(r6 instanceof 0c9)) {
                return new C42109BHn(productImageContainerImpl, l.longValue(), l2.longValue(), l3.longValue());
            } else {
                AnonymousClass7TF.A1L("product_image_id", r6, "TaggedProductImageContentImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
