package X;

import java.util.HashMap;

/* renamed from: X.9E8  reason: invalid class name */
public enum AnonymousClass9E8 {
    SHA256(1, 32),
    SHA384(2, 48);
    
    public static final HashMap A02 = null;
    public final int A00;
    public final int A01;

    /* access modifiers changed from: public */
    static {
        AnonymousClass9E8[] r0;
        08f<AnonymousClass9E8> A002 = 0oU.A00(r0);
        A03 = A002;
        A02 = new HashMap();
        for (AnonymousClass9E8 r2 : A002) {
            A02.put(Integer.valueOf(r2.A01), r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass9E8(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
