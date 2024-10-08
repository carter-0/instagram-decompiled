package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uwf  reason: case insensitive filesystem */
public enum C16535Uwf {
    GRID_TEMPLATE("grid_template");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16535Uwf[] uwfArr;
        A02 = 0oU.A00(uwfArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16535Uwf uwf : values()) {
            linkedHashMap.put(uwf.A00, uwf);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16535Uwf(String str) {
        this.A00 = str;
    }
}
