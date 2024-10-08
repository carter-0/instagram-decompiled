package X;

import com.facebook.location.platform.api.Location;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.io.IOException;

/* renamed from: X.Cgo  reason: case insensitive filesystem */
public abstract class C44554Cgo {
    public static BBK parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Float f = null;
            String str = null;
            N4G n4g = null;
            C61081JwJ jwJ = null;
            Float f2 = null;
            Float f3 = null;
            N4G n4g2 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("address_name".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if (ServerW3CShippingAddressConstants.CITY.equals(A17)) {
                    n4g = C44551Cgl.parseFromJson(r12);
                } else if ("country".equals(A17)) {
                    jwJ = C44552Cgm.parseFromJson(r12);
                } else if (Location.LATITUDE.equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r12);
                } else if ("longitude".equals(A17)) {
                    f3 = AnonymousClass7TF.A0U(r12);
                } else if ("radius".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r12);
                } else if (ServerW3CShippingAddressConstants.REGION.equals(A17)) {
                    n4g2 = C44553Cgn.parseFromJson(r12);
                }
                r12.A0z();
            }
            if (f != null || !(r12 instanceof 0c9)) {
                return new BBK(n4g, n4g2, jwJ, f2, f3, str, f.floatValue());
            }
            AnonymousClass7TF.A1L("radius", r12, "UnifiedAudienceGeolocationUnit");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
