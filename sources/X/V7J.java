package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7J {
    public static Map A00(C257733xs r3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.AhS() != null) {
            linkedHashMap.put(AnonymousClass000.A00(132), AnonymousClass7TH.A0D(r3.AhS()));
        }
        if (r3.AhT() != null) {
            linkedHashMap.put(AnonymousClass000.A00(133), AnonymousClass7TH.A0D(r3.AhT()));
        }
        if (r3.AhU() != null) {
            linkedHashMap.put("bounding_box_top_left_x", AnonymousClass7TH.A0D(r3.AhU()));
        }
        if (r3.AhV() != null) {
            linkedHashMap.put("bounding_box_top_left_y", AnonymousClass7TH.A0D(r3.AhV()));
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
