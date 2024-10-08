package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EVx  reason: case insensitive filesystem */
public enum C48105EVx {
    REACTIVE(0),
    PROACTIVE(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C48105EVx[] eVxArr;
        A02 = 0oU.A00(eVxArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C48105EVx eVx : values()) {
            A0x.put(Integer.valueOf(eVx.A00), eVx);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C48105EVx(int i) {
        this.A00 = i;
    }
}
