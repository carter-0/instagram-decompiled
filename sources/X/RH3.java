package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum RH3 {
    PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE_DISABLED(0, 56, "");
    
    public static final Map A03 = null;
    public final int A00;
    public final int A01;
    public final String A02;

    /* access modifiers changed from: public */
    static {
        RH3[] rh3Arr;
        A04 = 0oU.A00(rh3Arr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (RH3 rh3 : values()) {
            A0x.put(rh3.A02, rh3);
        }
        A03 = A0x;
    }

    public static RH3 A00(String str, String str2, int i, int i2, int i3) {
        return new RH3(str, i, i2, i3, str2);
    }

    /* access modifiers changed from: public */
    RH3(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
