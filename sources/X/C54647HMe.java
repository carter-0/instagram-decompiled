package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HMe  reason: case insensitive filesystem */
public enum C54647HMe {
    A05("interested"),
    A04("blocked");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C54647HMe[] hMeArr;
        A02 = 0oU.A00(hMeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C54647HMe hMe : values()) {
            A0x.put(hMe.A00, hMe);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C54647HMe(String str) {
        this.A00 = str;
    }
}
