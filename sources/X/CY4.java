package X;

import com.instagram.api.schemas.GenAIPersonaBannerDict;
import com.instagram.api.schemas.GenAIPersonaBannersResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CY4 {
    public static Map A00(GenAIPersonaBannersResponse genAIPersonaBannersResponse) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (genAIPersonaBannersResponse.AfJ() != null) {
            List<GenAIPersonaBannerDict> AfJ = genAIPersonaBannersResponse.AfJ();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (GenAIPersonaBannerDict genAIPersonaBannerDict : AfJ) {
                if (genAIPersonaBannerDict != null) {
                    A1C.add(genAIPersonaBannerDict.FHC());
                }
            }
            A1H.put("banners", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
