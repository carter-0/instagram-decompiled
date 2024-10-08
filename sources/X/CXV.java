package X;

import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.io.IOException;

public abstract class CXV {
    public static FBProductItemDetailsDictImpl parseFromJson(16F r16) {
        16F r2 = r16;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            ProductCheckoutProperties productCheckoutProperties = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            ProductImageContainerImpl productImageContainerImpl = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            ProductImageContainerImpl productImageContainerImpl2 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("checkout_properties".equals(A17)) {
                    productCheckoutProperties = C45684D1j.parseFromJson(r2);
                } else if ("has_viewer_saved".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r2);
                } else if ("listing_price".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("listing_price_stripped".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("main_image".equals(A17)) {
                    productImageContainerImpl = C275414q7.parseFromJson(r2);
                } else if ("page_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("page_name".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("page_profile_pic".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("product_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("product_name".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("strikethrough_price".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if ("strikethrough_price_stripped".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                } else if ("thumbnail_image".equals(A17)) {
                    productImageContainerImpl2 = C275414q7.parseFromJson(r2);
                }
                r2.A0z();
            }
            return new FBProductItemDetailsDictImpl(productCheckoutProperties, productImageContainerImpl, productImageContainerImpl2, bool, str, str2, str3, str4, str5, str6, str7, str8, str9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
