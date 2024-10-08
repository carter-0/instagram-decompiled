package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7Y {
    public static Map A00(XAO xao) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xao.BjY() != null) {
            linkedHashMap.put("rating_only_text", xao.BjY());
        }
        if (xao.BoJ() != null) {
            linkedHashMap.put("review_count_text", xao.BoJ());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
