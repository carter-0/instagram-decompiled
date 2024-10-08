package X;

import java.util.HashMap;

/* renamed from: X.9sS  reason: invalid class name and case insensitive filesystem */
public enum C391169sS {
    SHA256(1, 32),
    SHA384(2, 48);
    
    public static final HashMap A02 = null;
    public final int A00;
    public final int A01;

    /* access modifiers changed from: public */
    static {
        A02 = AnonymousClass7TE.A1E();
        for (C391169sS r2 : values()) {
            A02.put(Integer.valueOf(r2.A01), r2);
        }
    }

    /* access modifiers changed from: public */
    C391169sS(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
