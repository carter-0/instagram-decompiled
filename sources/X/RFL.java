package X;

import java.util.Map;

public enum RFL {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ASPECT_FIT("ASPECT_FIT"),
    FULL_SCREEN("FULL_SCREEN"),
    ASPECT_FILL("ASPECT_FILL"),
    ASPECT_FIT_ONLY("ASPECT_FIT_ONLY");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        RFL[] rflArr;
        A02 = 0oU.A00(rflArr);
        A01 = AnonymousClass7TE.A1E();
        for (RFL rfl : values()) {
            A01.put(rfl.A00, rfl);
        }
    }

    /* access modifiers changed from: public */
    RFL(String str) {
        this.A00 = str;
    }
}
