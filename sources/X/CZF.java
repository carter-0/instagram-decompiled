package X;

import com.instagram.api.schemas.IGProjectPortalInfoDict;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CZF {
    public static Map A00(IGProjectPortalInfoDict iGProjectPortalInfoDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (iGProjectPortalInfoDict.AhG() != null) {
            A1H.put("bottomColor", iGProjectPortalInfoDict.AhG());
        }
        if (iGProjectPortalInfoDict.AlO() != null) {
            A1H.put("captionBackgroundColor", iGProjectPortalInfoDict.AlO());
        }
        if (iGProjectPortalInfoDict.AlP() != null) {
            A1H.put("captionBackgroundColorAlpha", iGProjectPortalInfoDict.AlP());
        }
        if (iGProjectPortalInfoDict.AlT() != null) {
            A1H.put("captionColor", iGProjectPortalInfoDict.AlT());
        }
        if (iGProjectPortalInfoDict.C4Z() != null) {
            A1H.put("templateId", iGProjectPortalInfoDict.C4Z());
        }
        if (iGProjectPortalInfoDict.C8N() != null) {
            A1H.put("topColor", iGProjectPortalInfoDict.C8N());
        }
        return 0Yt.A0B(A1H);
    }
}
