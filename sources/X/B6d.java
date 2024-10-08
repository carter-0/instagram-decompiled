package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B6d {
    public static Map A00(C279454yf r3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r3.getDurationInMs();
        linkedHashMap.put("duration_in_ms", Long.valueOf(r3.getDurationInMs()));
        if (r3.BoC() != null) {
            linkedHashMap.put("reusable_template_media_asset_end_time_ms", r3.BoC());
        }
        if (r3.BoD() != null) {
            linkedHashMap.put("reusable_template_media_asset_start_time_ms", r3.BoD());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
