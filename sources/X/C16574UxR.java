package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxR  reason: case insensitive filesystem */
public enum C16574UxR {
    CIRCLE("circle"),
    GRAYED_OUT_CIRCLE("grayed_out_circle"),
    SQUARE("square"),
    GRAYED_OUT_SQUARE("grayed_out_square"),
    GRAYED_OUT_SQUARE_WITH_LINE("grayed_out_square_with_line"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16574UxR[] uxRArr;
        A02 = 0oU.A00(uxRArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C16574UxR uxR : values()) {
            A0x.put(uxR.A00, uxR);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C16574UxR(String str) {
        this.A00 = str;
    }
}
