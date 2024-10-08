package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V77 {
    public static Map A00(C257673xm r3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.AYR() != null) {
            linkedHashMap.put("actionLink", r3.AYR());
        }
        if (r3.AYS() != null) {
            linkedHashMap.put("actionLinkFallback", r3.AYS());
        }
        if (r3.B3n() != null) {
            linkedHashMap.put("fallbackCTALabel", r3.B3n());
        }
        if (r3.B3r() != null) {
            linkedHashMap.put("fallbackDestination", r3.B3r());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
