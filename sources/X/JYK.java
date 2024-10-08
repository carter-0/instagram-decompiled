package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum JYK {
    PHOTO(1),
    VIDEO(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        JYK[] jykArr;
        A02 = 0oU.A00(jykArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (JYK jyk : values()) {
            A0x.put(Integer.valueOf(jyk.A00), jyk);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    JYK(int i) {
        this.A00 = i;
    }
}
