package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ux9  reason: case insensitive filesystem */
public enum C16557Ux9 {
    UNKNOWN("UNKNOWN"),
    FEED("FEED"),
    STORY("STORY"),
    NO_LOCATION("NO_LOCATION");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16557Ux9[] ux9Arr;
        A02 = 0oU.A00(ux9Arr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16557Ux9 ux9 : values()) {
            linkedHashMap.put(ux9.A00, ux9);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16557Ux9(String str) {
        this.A00 = str;
    }
}
