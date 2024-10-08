package X;

import java.util.regex.Pattern;

/* renamed from: X.RFo  reason: case insensitive filesystem */
public enum C8921RFo {
    UNKNOWN(r3, 0, 16),
    AMEX(r3, 1, 15),
    DISCOVER(r3, 2, 16),
    JCB(r3, 3, 16),
    MASTER_CARD(r3, 4, 16),
    RUPAY(r3, 5, 16),
    VISA(r9, 6, 16);
    
    public final int A00;
    public final String A01;
    public final Pattern A02;

    /* access modifiers changed from: public */
    static {
        C8921RFo[] rFoArr;
        A03 = 0oU.A00(rFoArr);
    }

    /* access modifiers changed from: public */
    C8921RFo(Pattern pattern, int i, int i2) {
        this.A02 = pattern;
        this.A00 = i2;
        this.A01 = r2;
    }
}
