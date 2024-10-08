package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxO  reason: case insensitive filesystem */
public enum C16571UxO {
    UNKNOWN("unknown"),
    TEXT("text"),
    MUSIC("music"),
    LOCATION("location"),
    ANON("anon");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16571UxO[] uxOArr;
        A02 = 0oU.A00(uxOArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16571UxO uxO : values()) {
            linkedHashMap.put(uxO.A00, uxO);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16571UxO(String str) {
        this.A00 = str;
    }
}
