package X;

import android.util.SparseArray;

/* renamed from: X.3wz  reason: invalid class name and case insensitive filesystem */
public enum C257183wz {
    NOT_CACHED(0, "NOT_CACHED"),
    CACHED(1, "CACHED"),
    SEMI_CACHED(2, "SEMI_CACHED"),
    NOT_APPLY(-1, "NOT_APPLY");
    
    public static final SparseArray A02 = null;
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        A02 = new SparseArray();
        for (C257183wz r2 : values()) {
            A02.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C257183wz(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
