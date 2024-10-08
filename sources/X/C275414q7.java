package X;

import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.io.IOException;

/* renamed from: X.4q7  reason: invalid class name and case insensitive filesystem */
public abstract class C275414q7 {
    public static ProductImageContainerImpl parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ImageInfoImpl imageInfoImpl = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("image_versions2".equals(A0q)) {
                    imageInfoImpl = 1dH.parseFromJson(r7);
                } else if ("preview".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (imageInfoImpl != null || !(r7 instanceof 0c9)) {
                return new ProductImageContainerImpl(imageInfoImpl, str);
            }
            ((0c9) r7).A03.A00("image_versions2", "ProductImageContainerImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, ProductImageContainerImpl productImageContainerImpl) {
        r2.A0c();
        ImageInfo imageInfo = productImageContainerImpl.A00;
        if (imageInfo != null) {
            r2.A0q("image_versions2");
            1dH.A00(r2, imageInfo.FEa());
        }
        String str = productImageContainerImpl.A01;
        if (str != null) {
            r2.A0R("preview", str);
        }
        r2.A0Z();
    }
}
