package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxM  reason: case insensitive filesystem */
public enum C16569UxM {
    SPARKLE("sparkle"),
    NEON("neon"),
    SHIMMER("shimmer"),
    PIXEL("pixel"),
    GLITCH("glitch");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16569UxM[] uxMArr;
        A02 = 0oU.A00(uxMArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16569UxM uxM : values()) {
            linkedHashMap.put(uxM.A00, uxM);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16569UxM(String str) {
        this.A00 = str;
    }
}
