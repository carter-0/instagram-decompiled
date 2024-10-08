package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxN  reason: case insensitive filesystem */
public enum C16570UxN {
    UNKNOWN("unknown"),
    TEXT("text"),
    MUSIC("music"),
    MEDIA("media"),
    LOCATION("location");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16570UxN[] uxNArr;
        A02 = 0oU.A00(uxNArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16570UxN uxN : values()) {
            linkedHashMap.put(uxN.A00, uxN);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16570UxN(String str) {
        this.A00 = str;
    }
}
