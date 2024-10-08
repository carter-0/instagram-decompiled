package X;

import com.instagram.discovery.mediamap.model.LocationPageInformation;
import java.io.IOException;

/* renamed from: X.VBc  reason: case insensitive filesystem */
public abstract class C16925VBc {
    public static LocationPageInformation parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            LocationPageInformation locationPageInformation = new LocationPageInformation();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A19(A17)) {
                    locationPageInformation.A08 = AnonymousClass7TG.A0l(r3);
                } else if ("phone".equals(A17)) {
                    locationPageInformation.A09 = AnonymousClass7TG.A0l(r3);
                } else if ("website".equals(A17)) {
                    locationPageInformation.A0A = AnonymousClass7TG.A0l(r3);
                } else if ("category".equals(A17)) {
                    locationPageInformation.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("price_range".equals(A17)) {
                    locationPageInformation.A03 = AnonymousClass7TF.A0X(r3);
                } else if ("location_address".equals(A17)) {
                    locationPageInformation.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("location_city".equals(A17)) {
                    locationPageInformation.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("location_region".equals(A17)) {
                    locationPageInformation.A04 = AnonymousClass7TF.A0X(r3);
                } else if ("location_zip".equals(A17)) {
                    locationPageInformation.A0B = AnonymousClass7TG.A0l(r3);
                } else if ("hours".equals(A17)) {
                    locationPageInformation.A01 = VEX.parseFromJson(r3);
                } else if ("ig_business".equals(A17)) {
                    locationPageInformation.A00 = C16926VBd.parseFromJson(r3);
                } else if ("has_menu".equals(A17)) {
                    locationPageInformation.A0C = r3.A0d();
                } else if ("num_guides".equals(A17)) {
                    locationPageInformation.A02 = AnonymousClass7TF.A0X(r3);
                }
                r3.A0z();
            }
            return locationPageInformation;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
