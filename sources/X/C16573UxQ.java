package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxQ  reason: case insensitive filesystem */
public enum C16573UxQ {
    DIRECT_TO_PDP("direct_to_pdp"),
    SELECT("select"),
    ROUTE("route"),
    TOAST("toast"),
    MULTI_SELECT("multi_select"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16573UxQ[] uxQArr;
        A02 = 0oU.A00(uxQArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16573UxQ uxQ : values()) {
            linkedHashMap.put(uxQ.A00, uxQ);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16573UxQ(String str) {
        this.A00 = str;
    }
}
