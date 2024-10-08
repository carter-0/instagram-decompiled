package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8P {
    public static Map A00(XAR xar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xar.AyC() != null) {
            linkedHashMap.put("display_text", xar.AyC());
        }
        if (xar.getUri() != null) {
            linkedHashMap.put("uri", xar.getUri());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
