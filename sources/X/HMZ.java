package X;

import java.util.Map;

public enum HMZ {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    AUTOPLAY("AUTOPLAY");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        HMZ[] hmzArr;
        A02 = 0oU.A00(hmzArr);
        A01 = AnonymousClass7TE.A1E();
        for (HMZ hmz : values()) {
            A01.put(hmz.A00, hmz);
        }
    }

    /* access modifiers changed from: public */
    HMZ(String str) {
        this.A00 = str;
    }
}
