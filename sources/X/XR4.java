package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum XR4 {
    Emoji("Emoji"),
    Avatar("Avatar");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        XR4[] xr4Arr;
        A02 = 0oU.A00(xr4Arr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (XR4 xr4 : values()) {
            A0x.put(xr4.A00, xr4);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    XR4(String str) {
        this.A00 = str;
    }
}
