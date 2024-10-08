package X;

import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class Ca2 {
    public static Map A00(LoyaltyToplineInfoDict loyaltyToplineInfoDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (loyaltyToplineInfoDict.Cee() != null) {
            A1H.put("is_viewer_connected", loyaltyToplineInfoDict.Cee());
        }
        if (loyaltyToplineInfoDict.BOk() != null) {
            A1H.put("loyalty_info_text", loyaltyToplineInfoDict.BOk());
        }
        return 0Yt.A0B(A1H);
    }
}
