package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7j  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16828V7j {
    public static Map A00(C21024XAd xAd) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAd.AbH() != null) {
            linkedHashMap.put("alpha", AnonymousClass7TH.A0D(xAd.AbH()));
        }
        if (xAd.AgU() != null) {
            linkedHashMap.put("blur_radius_px", xAd.AgU());
        }
        if (xAd.AhG() != null) {
            linkedHashMap.put("bottom_color", xAd.AhG());
        }
        if (xAd.C8N() != null) {
            linkedHashMap.put("top_color", xAd.C8N());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
