package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nkj  reason: case insensitive filesystem */
public enum C69405Nkj {
    SHH_MODE("SHH_MODE"),
    DISAPPEARING_MESSAGE("DISAPPEARING_MESSAGE"),
    UNRECOGNIZED("UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69405Nkj[] nkjArr;
        A02 = 0oU.A00(nkjArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69405Nkj nkj : values()) {
            A0x.put(nkj.A00, nkj);
        }
        A01 = A0x;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C69405Nkj(String str) {
        this.A00 = str;
    }
}
