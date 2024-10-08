package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uwz  reason: case insensitive filesystem */
public enum C16552Uwz {
    SAVED("saved"),
    PURCHASED("purchased"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16552Uwz[] uwzArr;
        A02 = 0oU.A00(uwzArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16552Uwz uwz : values()) {
            linkedHashMap.put(uwz.A00, uwz);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16552Uwz(String str) {
        this.A00 = str;
    }
}
