package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4e  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41860B4e {
    public static Map A00(AnonymousClass41C r3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.B3u() != null) {
            linkedHashMap.put("fallback_warning_message", r3.B3u());
        }
        if (r3.B8J() != null) {
            linkedHashMap.put("fsr_quality", r3.B8J());
        }
        if (r3.BvJ() != null) {
            linkedHashMap.put("show_fallback_warning", r3.BvJ());
        }
        if (r3.CCX() != null) {
            linkedHashMap.put("use_for_flash_cache_only", r3.CCX());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
