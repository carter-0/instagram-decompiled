package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7U {
    public static Map A00(XAN xan) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xan.B1R() != null) {
            linkedHashMap.put("end", xan.B1R());
        }
        if (xan.Byd() != null) {
            linkedHashMap.put("start", xan.Byd());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
