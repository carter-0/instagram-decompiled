package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sH  reason: invalid class name and case insensitive filesystem */
public enum C391059sH {
    LEFT("left"),
    RIGHT("right"),
    CENTER("center");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391059sH[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391059sH r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C391059sH(String str) {
        this.A00 = str;
    }
}
