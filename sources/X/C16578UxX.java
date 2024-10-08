package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxX  reason: case insensitive filesystem */
public enum C16578UxX {
    CRUNCHY("crunchy"),
    DREAMY("dreamy"),
    RADIO("radio"),
    SLOWED("slowed"),
    SPED_UP("sped_up"),
    VINYL("vinyl"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16578UxX[] uxXArr;
        A02 = 0oU.A00(uxXArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16578UxX uxX : values()) {
            linkedHashMap.put(uxX.A00, uxX);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16578UxX(String str) {
        this.A00 = str;
    }
}
