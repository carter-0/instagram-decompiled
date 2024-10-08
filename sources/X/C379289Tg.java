package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9Tg  reason: invalid class name and case insensitive filesystem */
public enum C379289Tg {
    STORY("STORY"),
    CLIPS("CLIPS");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C379289Tg[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C379289Tg r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C379289Tg(String str) {
        this.A00 = str;
    }
}
