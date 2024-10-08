package X;

import java.util.Map;

public enum EXG {
    ;
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass7TE.A1E();
        for (EXG exg : values()) {
            A01.put(exg.A00, exg);
        }
    }

    public static EXG A00(String str, String str2, int i) {
        return new EXG(str, i, str2);
    }

    /* access modifiers changed from: public */
    EXG(String str) {
        this.A00 = str;
    }
}
