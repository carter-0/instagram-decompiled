package X;

import com.instagram.api.schemas.ISOCountryCode;
import java.io.IOException;

/* renamed from: X.Cgm  reason: case insensitive filesystem */
public abstract class C44552Cgm {
    public static C61081JwJ parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ISOCountryCode iSOCountryCode = null;
            String str2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("country_code".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    iSOCountryCode = (ISOCountryCode) ISOCountryCode.A01.get(str);
                    if (iSOCountryCode == null) {
                        iSOCountryCode = ISOCountryCode.UNRECOGNIZED;
                    }
                } else if (AnonymousClass000.A00(4662).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (iSOCountryCode != null || !(r7 instanceof 0c9)) {
                return new C61081JwJ(iSOCountryCode, str2);
            }
            AnonymousClass7TF.A1L("country_code", r7, "UnifiedAudienceGeolocationCountryImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
