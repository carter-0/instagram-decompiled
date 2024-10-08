package X;

import android.util.SparseArray;

/* renamed from: X.3YP  reason: invalid class name */
public enum AnonymousClass3YP {
    NOT_SHARED(0),
    SHARING(1),
    UNSHARING(2),
    SHARED(3);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass3YP[] r0;
        A02 = 0oU.A00(r0);
        A01 = new SparseArray();
        for (AnonymousClass3YP r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass3YP(int i) {
        this.A00 = i;
    }
}
