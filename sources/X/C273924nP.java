package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4nP  reason: invalid class name and case insensitive filesystem */
public enum C273924nP {
    EMOJIS("emojis"),
    STATIC_STICKERS("static_stickers"),
    ANIMATED_STICKERS("animated_stickers"),
    TEXT("text");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C273924nP[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C273924nP r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C273924nP(String str) {
        this.A00 = str;
    }
}
