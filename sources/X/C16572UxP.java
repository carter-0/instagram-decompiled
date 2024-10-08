package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.UxP  reason: case insensitive filesystem */
public enum C16572UxP {
    UNSTYLED("UNSTYLED"),
    BODY("BODY"),
    PULL_QUOTE("PULL_QUOTE"),
    BLOCK_QUOTE("BLOCK_QUOTE"),
    CODE("CODE"),
    HEADER_ONE("HEADER_ONE");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16572UxP[] uxPArr;
        A02 = 0oU.A00(uxPArr);
        A01 = new HashMap();
        for (C16572UxP uxP : values()) {
            A01.put(uxP.A00, uxP);
        }
    }

    /* access modifiers changed from: public */
    C16572UxP(String str) {
        this.A00 = str;
    }
}
