package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6MV  reason: invalid class name */
public enum AnonymousClass6MV {
    DOMINANT_COLOR_DOMINANT_TEXT_WITH_SENTENCE_CASE(0),
    BLUE_ICON_BLACK_TEXT_WITH_SENTENCE_CASE(1),
    DOMINANT_COLOR_DOMINANT_TEXT_WITH_UPPER_CASE(2),
    DOMINANT_COLOR_BLACK_TEXT_WITH_UPPER_CASE(3),
    DOMINANT_COLOR_BLACK_TEXT_WITH_SENTENCE_CASE(4);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass6MV[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass6MV r1 : values()) {
            linkedHashMap.put(Integer.valueOf(r1.A00), r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass6MV(int i) {
        this.A00 = i;
    }
}
