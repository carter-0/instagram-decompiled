package X;

import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAgeImpl;
import java.io.IOException;

public abstract class CV6 {
    public static BrandedContentGatingCountryMinimumAgeImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (!"country_code".equals(A17)) {
                    num = C41847B3o.A13(r5, num, A17, "minimum_age");
                } else if (r5.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r5.A1P();
                }
                r5.A0z();
            }
            return new BrandedContentGatingCountryMinimumAgeImpl(str, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
