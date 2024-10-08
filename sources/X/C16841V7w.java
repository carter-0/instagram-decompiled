package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7w  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16841V7w {
    public static Map A00(C21032XAl xAl) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAl.BEG() != null) {
            linkedHashMap.put("icon_location", xAl.BEG());
        }
        if (xAl.BEN() != null) {
            linkedHashMap.put("icon_type", xAl.BEN());
        }
        if (xAl.getText() != null) {
            linkedHashMap.put("text", xAl.getText());
        }
        if (xAl.getTextColor() != null) {
            linkedHashMap.put("text_color", xAl.getTextColor());
        }
        if (xAl.C58() != null) {
            linkedHashMap.put("text_font_size", AnonymousClass7TH.A0D(xAl.C58()));
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
