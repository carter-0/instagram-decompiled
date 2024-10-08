package X;

import com.instagram.api.schemas.NativeInfoCardTextAlignment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7v  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16840V7v {
    public static Map A00(C21031XAk xAk) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAk.Aaj() != null) {
            NativeInfoCardTextAlignment Aaj = xAk.Aaj();
            if (Aaj != null) {
                str = Aaj.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("alignment", str);
        }
        if (xAk.B79() != null) {
            linkedHashMap.put("font_size", AnonymousClass7TH.A0D(xAk.B79()));
        }
        if (xAk.BPG() != null) {
            linkedHashMap.put("max_number_of_lines", xAk.BPG());
        }
        if (xAk.getText() != null) {
            linkedHashMap.put("text", xAk.getText());
        }
        if (xAk.getTextColor() != null) {
            linkedHashMap.put("text_color", xAk.getTextColor());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
