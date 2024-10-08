package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum EXF {
    ;
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        EXF[] exfArr;
        A02 = 0oU.A00(exfArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r4));
        for (EXF exf : values()) {
            A0x.put(exf.A00, exf);
        }
        A01 = A0x;
    }

    public static EXF A00(String str, String str2, int i) {
        return new EXF(str, i, str2);
    }

    /* access modifiers changed from: public */
    EXF(String str) {
        this.A00 = str;
    }
}
