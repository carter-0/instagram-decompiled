package X;

import java.util.HashMap;

/* renamed from: X.EVw  reason: case insensitive filesystem */
public enum C48104EVw {
    DEFAULT(""),
    DATE_FOLLOWED_LATEST("date_followed_latest");
    
    public static final HashMap A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C48104EVw[] eVwArr;
        A02 = 0oU.A00(eVwArr);
        A01 = AnonymousClass7TE.A1E();
        for (C48104EVw eVw : values()) {
            A01.put(eVw.A00, eVw);
        }
    }

    /* access modifiers changed from: public */
    C48104EVw(String str) {
        this.A00 = str;
    }
}
