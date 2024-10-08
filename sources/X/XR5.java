package X;

import java.util.Map;

public enum XR5 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BUTTON_OUTLINE("BUTTON_OUTLINE"),
    BUTTON_FILLED("BUTTON_FILLED"),
    FIT_TO_HEIGHT("FIT_TO_HEIGHT"),
    SHOW_INTERACTION_HINT("SHOW_INTERACTION_HINT");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        XR5[] xr5Arr;
        A02 = 0oU.A00(xr5Arr);
        A01 = AnonymousClass7TE.A1E();
        for (XR5 xr5 : values()) {
            A01.put(xr5.A00, xr5);
        }
    }

    /* access modifiers changed from: public */
    XR5(String str) {
        this.A00 = str;
    }
}
