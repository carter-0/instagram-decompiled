package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sG  reason: invalid class name and case insensitive filesystem */
public enum C391049sG {
    MUSIC_PARTNER("music_partner"),
    BARCELONA_CLIPS("barcelona_clips"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391049sG[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391049sG r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C391049sG(String str) {
        this.A00 = str;
    }
}
