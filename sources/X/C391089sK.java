package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sK  reason: invalid class name and case insensitive filesystem */
public enum C391089sK {
    SIDE_BY_SIDE("side_by_side"),
    TOP_AND_BOTTOM("top_and_bottom"),
    PICTURE_IN_PICTURE("picture_in_picture"),
    GREEN_SCREEN("green_screen"),
    SEQUENTIAL("sequential");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391089sK[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391089sK r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C391089sK(String str) {
        this.A00 = str;
    }
}
