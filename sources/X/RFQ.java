package X;

public enum RFQ {
    UNDEFINED(0),
    NORMAL(1),
    FLIP_HORIZONTAL(2),
    ROTATE_180(3),
    FLIP_VERTICAL(4),
    TRANSPOSE(5),
    ROTATE_90(6),
    TRANSVERSE(7),
    ROTATE_270(8);
    
    public final int A00;

    /* access modifiers changed from: public */
    RFQ(int i) {
        this.A00 = i;
    }
}
