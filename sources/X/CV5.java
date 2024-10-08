package X;

import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CV5 {
    public static Map A00(BrandedContentGatingCountryMinimumAge brandedContentGatingCountryMinimumAge) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (brandedContentGatingCountryMinimumAge.Arl() != null) {
            A1H.put("country_code", brandedContentGatingCountryMinimumAge.Arl());
        }
        if (brandedContentGatingCountryMinimumAge.BTM() != null) {
            A1H.put("minimum_age", brandedContentGatingCountryMinimumAge.BTM());
        }
        return 0Yt.A0B(A1H);
    }
}
