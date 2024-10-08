package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HMm  reason: case insensitive filesystem */
public enum C54655HMm {
    BLACK("black"),
    GRADIENT_BLUE("gradient_blue"),
    HIGHLIGHT_BACKGROUND("highlight_background"),
    PRIMARY_ICON("primary_icon");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C54655HMm[] hMmArr;
        08f A002 = 0oU.A00(hMmArr);
        A02 = A002;
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(A002, 10)));
        for (Object next : A002) {
            A0x.put(((C54655HMm) next).A00, next);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C54655HMm(String str) {
        this.A00 = str;
    }
}
