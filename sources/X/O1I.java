package X;

import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.model.shopping.featuredproduct.SurfaceVisibility;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

public abstract class O1I {
    public static C68282N8v parseFromJson(16F r6) {
        String str;
        String str2;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Long l = null;
            FeaturedProductPermissionStatus featuredProductPermissionStatus = null;
            SurfaceVisibility surfaceVisibility = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                if (C41846B3n.A1Y(r6, A0q)) {
                    l = AnonymousClass7TF.A0Z(r6);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                    featuredProductPermissionStatus = (FeaturedProductPermissionStatus) FeaturedProductPermissionStatus.A01.get(str2);
                    if (featuredProductPermissionStatus == null) {
                        featuredProductPermissionStatus = FeaturedProductPermissionStatus.UNRECOGNIZED;
                    }
                } else if ("surface_visibility".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    surfaceVisibility = (SurfaceVisibility) SurfaceVisibility.A01.get(str);
                    if (surfaceVisibility == null) {
                        surfaceVisibility = SurfaceVisibility.UNRECOGNIZED;
                    }
                }
                r6.A0z();
            }
            return new C68282N8v(featuredProductPermissionStatus, surfaceVisibility, l);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
