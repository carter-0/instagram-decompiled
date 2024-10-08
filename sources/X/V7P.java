package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7P {
    public static Map A00(C21022XAb xAb) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAb.AhM() != null) {
            linkedHashMap.put("bottom_right_x_pct", xAb.AhM());
        }
        if (xAb.AhN() != null) {
            linkedHashMap.put("bottom_right_y_pct", xAb.AhN());
        }
        if (xAb.C8Q() != null) {
            linkedHashMap.put("top_left_x_pct", xAb.C8Q());
        }
        if (xAb.C8R() != null) {
            linkedHashMap.put("top_left_y_pct", xAb.C8R());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
