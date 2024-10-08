package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7a  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16819V7a {
    public static Map A00(XAW xaw) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xaw.Bjb() != null) {
            linkedHashMap.put("rating_text", xaw.Bjb());
        }
        if (xaw.C8Z() != null) {
            linkedHashMap.put("topic_text", xaw.C8Z());
        }
        if (xaw.C8a() != null) {
            linkedHashMap.put("topics", xaw.C8a());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
