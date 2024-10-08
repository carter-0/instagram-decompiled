package X;

import java.util.Map;

/* renamed from: X.Njc  reason: case insensitive filesystem */
public enum C69337Njc {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NO_LOOPING("NO_LOOPING"),
    LOOPING("LOOPING");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69337Njc[] njcArr;
        A02 = 0oU.A00(njcArr);
        A01 = AnonymousClass7TE.A1E();
        for (C69337Njc njc : values()) {
            A01.put(njc.A00, njc);
        }
    }

    /* access modifiers changed from: public */
    C69337Njc(String str) {
        this.A00 = str;
    }
}
