package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxK  reason: case insensitive filesystem */
public enum C16567UxK {
    BIAS(0),
    NORMALIZED_CENTER(1),
    GRAVITY(2),
    ABSOLUTE(3),
    NO_OVERLAP(4);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16567UxK[] uxKArr;
        A02 = 0oU.A00(uxKArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16567UxK uxK : values()) {
            C51967G9n.A1O(uxK, linkedHashMap, uxK.A00);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16567UxK(int i) {
        this.A00 = i;
    }
}
