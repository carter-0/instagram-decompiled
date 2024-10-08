package X;

import android.util.SparseArray;

/* renamed from: X.6nK  reason: invalid class name and case insensitive filesystem */
public enum C317476nK {
    STICKER(0),
    EMOJI(1),
    PLUS_BUTTON(2);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C317476nK[] r0;
        A02 = 0oU.A00(r0);
        A01 = new SparseArray();
        for (C317476nK r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C317476nK(int i) {
        this.A00 = i;
    }
}
