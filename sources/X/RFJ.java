package X;

import android.util.SparseArray;

public enum RFJ {
    PHOTO(0),
    VIDEO(1),
    OTHER(2),
    MIXED(3);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        RFJ[] rfjArr;
        A02 = 0oU.A00(rfjArr);
        A01 = Pxe.A0L();
        for (RFJ rfj : values()) {
            A01.put(rfj.A00, rfj);
        }
    }

    /* access modifiers changed from: public */
    RFJ(int i) {
        this.A00 = i;
    }
}
