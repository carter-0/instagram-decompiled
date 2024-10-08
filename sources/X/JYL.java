package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum JYL {
    PHOTO(1),
    VIDEO(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        JYL[] jylArr;
        A02 = 0oU.A00(jylArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (JYL jyl : values()) {
            A0x.put(Integer.valueOf(jyl.A00), jyl);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    JYL(int i) {
        this.A00 = i;
    }
}
