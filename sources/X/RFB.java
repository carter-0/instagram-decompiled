package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum RFB {
    FINAL("FINAL"),
    ESTIMATED("ESTIMATED");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        RFB[] rfbArr;
        A02 = 0oU.A00(rfbArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (RFB rfb : values()) {
            A0x.put(rfb.A00, rfb);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    RFB(String str) {
        this.A00 = str;
    }
}
