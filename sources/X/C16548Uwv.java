package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uwv  reason: case insensitive filesystem */
public enum C16548Uwv {
    A05(0),
    EVERYONE(1),
    PEOPLE_YOU_FOLLOW(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16548Uwv[] uwvArr;
        A02 = 0oU.A00(uwvArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16548Uwv uwv : values()) {
            C51967G9n.A1O(uwv, linkedHashMap, uwv.A00);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16548Uwv(int i) {
        this.A00 = i;
    }
}
