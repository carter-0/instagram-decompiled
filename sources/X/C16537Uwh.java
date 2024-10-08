package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uwh  reason: case insensitive filesystem */
public enum C16537Uwh {
    USER_ADDED("user_added");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16537Uwh[] uwhArr;
        A02 = 0oU.A00(uwhArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16537Uwh uwh : values()) {
            linkedHashMap.put(uwh.A00, uwh);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16537Uwh(String str) {
        this.A00 = str;
    }
}
