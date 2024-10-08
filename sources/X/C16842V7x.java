package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7x  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16842V7x {
    public static Map A00(XAX xax) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xax.Ah8() != null) {
            linkedHashMap.put("border_color", xax.Ah8());
        }
        if (xax.Ah9() != null) {
            linkedHashMap.put("border_width", AnonymousClass7TH.A0D(xax.Ah9()));
        }
        if (xax.C75() != null) {
            linkedHashMap.put("thumbnail_url", xax.C75());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
