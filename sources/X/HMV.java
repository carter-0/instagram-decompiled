package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum HMV {
    POSTS("all_posts");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        HMV[] hmvArr;
        A02 = 0oU.A00(hmvArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (HMV hmv : values()) {
            A0x.put(hmv.A00, hmv);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    HMV(String str) {
        this.A00 = str;
    }
}
