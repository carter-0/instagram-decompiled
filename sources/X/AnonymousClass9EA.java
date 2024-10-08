package X;

import java.util.HashMap;

/* renamed from: X.9EA  reason: invalid class name */
public enum AnonymousClass9EA {
    AES128GCM(1, 16),
    AES256GCM(2, 32);
    
    public static final HashMap A03 = null;
    public final int A00;
    public final int A01;
    public final int A02;

    /* access modifiers changed from: public */
    static {
        AnonymousClass9EA[] r0;
        08f<AnonymousClass9EA> A002 = 0oU.A00(r0);
        A04 = A002;
        A03 = new HashMap();
        for (AnonymousClass9EA r2 : A002) {
            A03.put(Integer.valueOf(r2.A02), r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass9EA(int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = 12;
    }
}
