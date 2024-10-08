package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ux1  reason: case insensitive filesystem */
public enum C16554Ux1 {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16554Ux1[] ux1Arr;
        A02 = 0oU.A00(ux1Arr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16554Ux1 ux1 : values()) {
            linkedHashMap.put(ux1.A00, ux1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16554Ux1(String str) {
        this.A00 = str;
    }
}
