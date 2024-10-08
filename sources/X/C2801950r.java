package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.50r  reason: invalid class name and case insensitive filesystem */
public enum C2801950r {
    CLIPS("clips"),
    FEED_POST("feed_post"),
    PHOTO("photos"),
    CAROUSEL("carousel");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C2801950r[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C2801950r r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C2801950r(String str) {
        this.A00 = str;
    }
}
