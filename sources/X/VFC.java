package X;

import com.facebook.location.platform.api.Location;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.io.IOException;

public abstract class VFC {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.VW7] */
    public static VW7 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("longitude".equals(A17) || Location.LATITUDE.equals(A17)) {
                    r3.A0U();
                } else {
                    if ("fullAddress".equals(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    } else if ("zipCode".equals(A17)) {
                        obj.A02 = AnonymousClass7TG.A0l(r3);
                    } else if (ServerW3CShippingAddressConstants.CITY.equals(A17)) {
                        obj.A00 = AnonymousClass7TG.A0l(r3);
                    } else if (ServerW3CShippingAddressConstants.REGION.equals(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    } else if ("street".equals(A17)) {
                        obj.A01 = AnonymousClass7TG.A0l(r3);
                    }
                    r3.A1P();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
