package X;

import java.util.Map;

/* renamed from: X.EVz  reason: case insensitive filesystem */
public enum C48107EVz {
    POSTS("posts"),
    ACCOUNTS("accounts"),
    LOCATIONS("locations");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C48107EVz[] eVzArr;
        A02 = 0oU.A00(eVzArr);
        A01 = AnonymousClass7TE.A1E();
        for (C48107EVz eVz : values()) {
            A01.put(eVz.A00, eVz);
        }
    }

    /* access modifiers changed from: public */
    C48107EVz(String str) {
        this.A00 = str;
    }
}
