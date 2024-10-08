package X;

import android.util.SparseArray;

/* renamed from: X.Uww  reason: case insensitive filesystem */
public enum C16549Uww {
    NOT_SHARED(0),
    SHARING(1),
    UNSHARING(2);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16549Uww[] uwwArr;
        A02 = 0oU.A00(uwwArr);
        A01 = new SparseArray();
        for (C16549Uww uww : values()) {
            A01.put(uww.A00, uww);
        }
    }

    /* access modifiers changed from: public */
    C16549Uww(int i) {
        this.A00 = i;
    }
}
