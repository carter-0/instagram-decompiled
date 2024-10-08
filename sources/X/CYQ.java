package X;

import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

public abstract class CYQ {
    public static C42046BEz parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            ProductImageContainerImpl productImageContainerImpl = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            String str2 = null;
            String str3 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("merchant_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("photo".equals(A17)) {
                    productImageContainerImpl = C275414q7.parseFromJson(r13);
                } else if ("product".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r13);
                } else if ("product_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("product_image_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("merchant_id", r13, "GuideProductImageContent");
            } else if (productImageContainerImpl == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("photo", r13, "GuideProductImageContent");
            } else if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("product_id", r13, "GuideProductImageContent");
            } else if (str3 != null || !(r13 instanceof 0c9)) {
                return new C42046BEz(productImageContainerImpl, productDetailsProductItemDict, str, str2, str3);
            } else {
                AnonymousClass7TF.A1L("product_image_id", r13, "GuideProductImageContent");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
