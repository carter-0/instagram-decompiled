package X;

import android.util.SparseArray;

public enum RF4 {
    UNKNOWN_MOBILE_SUBTYPE(0),
    COMBINED(100);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        RF4 rf4;
        RF4 rf42;
        RF4 rf43;
        RF4 rf44;
        RF4 rf45;
        RF4 rf46;
        RF4 rf47;
        RF4 rf48;
        RF4 rf49;
        RF4 rf410;
        RF4 rf411;
        RF4 rf412;
        RF4 rf413;
        RF4 rf414;
        RF4 rf415;
        RF4 rf416;
        RF4 rf417;
        RF4 rf418;
        RF4 rf419;
        RF4 rf420;
        SparseArray A0L = Pxe.A0L();
        A01 = A0L;
        A0L.put(0, rf4);
        A0L.put(1, rf42);
        A0L.put(2, rf43);
        A0L.put(3, rf44);
        A0L.put(4, rf45);
        A0L.put(5, rf46);
        A0L.put(6, rf47);
        A0L.put(7, rf48);
        A0L.put(8, rf49);
        A0L.put(9, rf410);
        A0L.put(10, rf411);
        A0L.put(11, rf412);
        A0L.put(12, rf413);
        A0L.put(13, rf414);
        A0L.put(14, rf415);
        A0L.put(15, rf416);
        A0L.put(16, rf417);
        A0L.put(17, rf418);
        A0L.put(18, rf419);
        A0L.put(19, rf420);
    }

    /* access modifiers changed from: public */
    RF4(int i) {
        this.A00 = i;
    }
}
