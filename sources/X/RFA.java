package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum RFA {
    TEST("TEST"),
    LIVE("LIVE");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        RFA[] rfaArr;
        A02 = 0oU.A00(rfaArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (RFA rfa : values()) {
            A0x.put(rfa.A00, rfa);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    RFA(String str) {
        this.A00 = str;
    }
}
