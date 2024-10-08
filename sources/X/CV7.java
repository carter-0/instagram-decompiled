package X;

import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CV7 {
    public static Map A00(BrandedContentGatingInfoIntf brandedContentGatingInfoIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Map Ari = brandedContentGatingInfoIntf.Ari();
        if (Ari != null) {
            A1H.put("country_age_data", Ari);
        }
        if (brandedContentGatingInfoIntf.Arj() != null) {
            List<BrandedContentGatingCountryMinimumAge> Arj = brandedContentGatingInfoIntf.Arj();
            ArrayList arrayList = null;
            if (Arj != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (BrandedContentGatingCountryMinimumAge brandedContentGatingCountryMinimumAge : Arj) {
                    if (brandedContentGatingCountryMinimumAge != null) {
                        arrayList.add(brandedContentGatingCountryMinimumAge.FHC());
                    }
                }
            }
            A1H.put("country_age_list", arrayList);
        }
        if (brandedContentGatingInfoIntf.Ark() != null) {
            A1H.put("country_block_data", brandedContentGatingInfoIntf.Ark());
        }
        if (brandedContentGatingInfoIntf.Avl() != null) {
            A1H.put("default_age", brandedContentGatingInfoIntf.Avl());
        }
        if (brandedContentGatingInfoIntf.Bra() != null) {
            A1H.put("selected_category", brandedContentGatingInfoIntf.Bra());
        }
        return 0Yt.A0B(A1H);
    }
}
