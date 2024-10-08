package X;

import java.util.Map;

public enum EXC {
    PRIMARY("primary");
    
    public static final Map A01 = null;
    public final String A00;

    public static final EXC parseFromJson(16F r2) {
        0qQ.A0B(r2, 0);
        return (EXC) A01.get(r2.A1Q());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        EXC[] excArr;
        A02 = 0oU.A00(excArr);
        A01 = AnonymousClass7TE.A1H();
        for (EXC exc : values()) {
            A01.put(exc.A00, exc);
        }
    }

    /* access modifiers changed from: public */
    EXC(String str) {
        this.A00 = str;
    }
}
