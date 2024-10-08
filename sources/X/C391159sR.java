package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sR  reason: invalid class name and case insensitive filesystem */
public enum C391159sR {
    CLASSIC("classic"),
    TYPEWRITER("typewriter"),
    ROTATING("rotating"),
    STRONG("strong"),
    ELEGANT("elegant"),
    STRETCH_SHRINK("stretch_shrink"),
    LITERATURE("literature"),
    BOUNCE_IN("bounce_in"),
    FLASHING("flashing"),
    TYPEWRITER_NO_CURSOR("typewriter_no_cursor"),
    TYPEWRITER_NO_CURSOR_V2("typewriter_no_cursor_v2"),
    POP("pop"),
    JUMP("jump");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391159sR[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391159sR r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C391159sR(String str) {
        this.A00 = str;
    }
}
