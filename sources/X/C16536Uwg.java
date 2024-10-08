package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Uwg  reason: case insensitive filesystem */
public enum C16536Uwg {
    FIXED_AMOUNT("fixed_amount"),
    UPDATE_CHECKOUT_API("update_checkout_api");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C16536Uwg uwg : values()) {
            A01.put(uwg.A00, uwg);
        }
    }

    /* access modifiers changed from: public */
    C16536Uwg(String str) {
        this.A00 = str;
    }
}
