package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sL  reason: invalid class name and case insensitive filesystem */
public enum C391099sL {
    HORIZONTAL("HORIZONTAL"),
    VERTICAL("VERTICAL"),
    PICTURE_IN_PICTURE("PICTURE_IN_PICTURE"),
    GREEN_SCREEN("GREEN_SCREEN"),
    NOT_CLIPS("NOT_CLIPS");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391099sL[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391099sL r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C391099sL(String str) {
        this.A00 = str;
    }
}
