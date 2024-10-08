package X;

import com.facebook.location.platform.api.Location;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.business.promote.model.AudienceGeoLocation;
import java.io.IOException;

public abstract class VAL {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    public static AudienceGeoLocation parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("key".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("display_name".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("location_type".equals(A17)) {
                    AdGeoLocationType adGeoLocationType = (AdGeoLocationType) AdGeoLocationType.A01.get(AnonymousClass7TG.A0l(r4));
                    if (adGeoLocationType == null) {
                        adGeoLocationType = AdGeoLocationType.UNRECOGNIZED;
                    }
                    obj.A03 = adGeoLocationType;
                } else if (Location.LATITUDE.equals(A17)) {
                    obj.A00 = r4.A0U();
                } else if ("longitude".equals(A17)) {
                    obj.A01 = r4.A0U();
                } else if ("radius".equals(A17)) {
                    obj.A02 = r4.A1D();
                } else if ("country_code".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(3870).equals(A17)) {
                    obj.A08 = AnonymousClass7TG.A0l(r4);
                } else if ("primary_city_key".equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
