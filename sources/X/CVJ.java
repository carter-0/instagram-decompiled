package X;

import com.instagram.api.schemas.CallAdsInfoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CVJ {
    public static Map A00(CallAdsInfoDictIntf callAdsInfoDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (callAdsInfoDictIntf.Bai() != null) {
            A1H.put(AnonymousClass000.A00(1670), callAdsInfoDictIntf.Bai());
        }
        callAdsInfoDictIntf.BuT();
        return C41845B3m.A0u(AnonymousClass000.A00(1813), Boolean.valueOf(callAdsInfoDictIntf.BuT()), A1H);
    }
}
