package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ux2  reason: case insensitive filesystem */
public enum C16555Ux2 {
    ENABLED("enabled"),
    DISABLED("disabled"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16555Ux2[] ux2Arr;
        A02 = 0oU.A00(ux2Arr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16555Ux2 ux2 : values()) {
            linkedHashMap.put(ux2.A00, ux2);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16555Ux2(String str) {
        this.A00 = str;
    }
}
