package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Khn  reason: case insensitive filesystem */
public enum C62557Khn {
    ELIGIBLE("ELIGIBLE"),
    BUSINESS_ACCOUNT("BUSINESS_ACCOUNT"),
    UNLAUNCHED_COUNTRY("UNLAUNCHED_COUNTRY");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62557Khn[] khnArr;
        A02 = 0oU.A00(khnArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62557Khn khn : values()) {
            A0x.put(khn.A00, khn);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62557Khn(String str) {
        this.A00 = str;
    }
}
