package X;

import com.instagram.api.schemas.PrivacyDisclosureInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V80 {
    public static Map A00(PrivacyDisclosureInfo privacyDisclosureInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (privacyDisclosureInfo.B43() != null) {
            linkedHashMap.put(C273654mx.A00(2350), privacyDisclosureInfo.B43());
        }
        if (privacyDisclosureInfo.Bfo() != null) {
            linkedHashMap.put("privacyString", privacyDisclosureInfo.Bfo());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
