package X;

import java.util.HashMap;

/* renamed from: X.NkB  reason: case insensitive filesystem */
public enum C69371NkB {
    AES128GCM(1, 16),
    AES256GCM(2, 32);
    
    public static final HashMap A04 = null;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    /* access modifiers changed from: public */
    static {
        A04 = AnonymousClass7TE.A1E();
        for (C69371NkB nkB : values()) {
            A04.put(Integer.valueOf(nkB.A03), nkB);
        }
    }

    /* access modifiers changed from: public */
    C69371NkB(int i, int i2) {
        this.A03 = i;
        this.A00 = i2;
        this.A01 = 12;
        this.A02 = 16;
    }
}
