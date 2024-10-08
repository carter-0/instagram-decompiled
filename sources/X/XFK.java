package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum XFK {
    ;
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        XFK[] xfkArr;
        A02 = 0oU.A00(xfkArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (XFK xfk : values()) {
            A0x.put(xfk.A00, xfk);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    XFK(String str) {
        this.A00 = str;
    }
}
