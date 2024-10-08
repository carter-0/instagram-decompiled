package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uwo  reason: case insensitive filesystem */
public enum C16543Uwo {
    USER_ADDED("user_added"),
    AUTOMATICALLY_ADDED("automatically_added");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16543Uwo[] uwoArr;
        A02 = 0oU.A00(uwoArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16543Uwo uwo : values()) {
            linkedHashMap.put(uwo.A00, uwo);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16543Uwo(String str) {
        this.A00 = str;
    }
}
