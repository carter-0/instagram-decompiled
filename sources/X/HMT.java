package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum HMT {
    SOCIAL_CONTEXT("social_context");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        HMT[] hmtArr;
        A02 = 0oU.A00(hmtArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (HMT hmt : values()) {
            A0x.put(hmt.A00, hmt);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    HMT(String str) {
        this.A00 = str;
    }
}
