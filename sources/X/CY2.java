package X;

import com.instagram.api.schemas.GenAIPersonaBannerDict;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CY2 {
    public static Map A00(GenAIPersonaBannerDict genAIPersonaBannerDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (genAIPersonaBannerDict.BFV() != null) {
            A1H.put("ig_messaging_data", genAIPersonaBannerDict.BFV().FHC());
        }
        if (genAIPersonaBannerDict.getName() != null) {
            C41845B3m.A0z(genAIPersonaBannerDict.getName(), A1H);
        }
        if (genAIPersonaBannerDict.Bbr() != null) {
            A1H.put("persona_id", genAIPersonaBannerDict.Bbr());
        }
        if (genAIPersonaBannerDict.Bgy() != null) {
            A1H.put("profile_image_url", genAIPersonaBannerDict.Bgy());
        }
        return 0Yt.A0B(A1H);
    }
}
