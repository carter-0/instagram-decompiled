package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Vd  reason: invalid class name and case insensitive filesystem */
public enum C242603Vd {
    FEED_RECS("feed_recs"),
    OLDER_POSTS("past_posts"),
    FAVORITES("feed_favorites");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C242603Vd[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C242603Vd r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C242603Vd(String str) {
        this.A00 = str;
    }
}
