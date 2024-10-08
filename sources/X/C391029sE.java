package X;

import java.util.HashMap;

/* renamed from: X.9sE  reason: invalid class name and case insensitive filesystem */
public enum C391029sE {
    BASE(0),
    PSK(1),
    AUTH(2);
    
    public static final HashMap A01 = null;
    public final byte A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass7TE.A1E();
        for (C391029sE r2 : values()) {
            A01.put(Byte.valueOf(r2.A00), r2);
        }
    }

    /* access modifiers changed from: public */
    C391029sE(int i) {
        this.A00 = r2;
    }
}
