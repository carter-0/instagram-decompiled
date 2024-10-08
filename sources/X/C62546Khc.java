package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Khc  reason: case insensitive filesystem */
public enum C62546Khc {
    HALF_HEIGHT("half_height"),
    FULL_HEIGHT("full_height");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62546Khc[] khcArr;
        A02 = 0oU.A00(khcArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62546Khc khc : values()) {
            A0x.put(khc.A00, khc);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62546Khc(String str) {
        this.A00 = str;
    }
}
