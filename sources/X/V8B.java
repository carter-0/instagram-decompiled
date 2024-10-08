package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8B {
    public static Map A00(C21040XAt xAt) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAt.Aej() != null) {
            linkedHashMap.put("background_color_hex", xAt.Aej());
        }
        if (xAt.Aim() != null) {
            linkedHashMap.put("button_height_pct", AnonymousClass7TH.A0D(xAt.Aim()));
        }
        if (xAt.Aiz() != null) {
            linkedHashMap.put("button_x", AnonymousClass7TH.A0D(xAt.Aiz()));
        }
        if (xAt.Aj0() != null) {
            linkedHashMap.put("button_y", AnonymousClass7TH.A0D(xAt.Aj0()));
        }
        if (xAt.CR9() != null) {
            linkedHashMap.put("is_dark_mode", xAt.CR9());
        }
        if (xAt.BKM() != null) {
            linkedHashMap.put("label_height_pct", AnonymousClass7TH.A0D(xAt.BKM()));
        }
        if (xAt.BKQ() != null) {
            linkedHashMap.put("label_width_pct", AnonymousClass7TH.A0D(xAt.BKQ()));
        }
        if (xAt.BaA() != null) {
            linkedHashMap.put("padding_pct", AnonymousClass7TH.A0D(xAt.BaA()));
        }
        if (xAt.C54() != null) {
            linkedHashMap.put("text_color_hex", xAt.C54());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
