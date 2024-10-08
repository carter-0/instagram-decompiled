package X;

import com.facebook.location.platform.api.Location;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7q  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16835V7q {
    public static Map A00(XAQ xaq) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xaq.ByA() != null) {
            linkedHashMap.put(Location.SPEED, xaq.ByA());
        }
        if (xaq.Byh() != null) {
            linkedHashMap.put("startLagMs", xaq.Byh());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
