package X;

import android.util.SparseArray;

/* renamed from: X.Tql  reason: case insensitive filesystem */
public enum C14149Tql {
    NORTH(0),
    SOUTH(1);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new SparseArray();
        for (C14149Tql tql : values()) {
            A01.put(tql.A00, tql);
        }
    }

    /* access modifiers changed from: public */
    C14149Tql(int i) {
        this.A00 = i;
    }
}
