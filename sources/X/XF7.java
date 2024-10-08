package X;

public enum XF7 {
    UINT8(1),
    INT8(2),
    INT32(3),
    FLOAT32(4),
    INT64(5),
    FLOAT64(6);
    
    public final int A00;

    /* access modifiers changed from: public */
    static {
        UINT8 = new XF7("UINT8", 0, 1);
        INT8 = new XF7("INT8", 1, 2);
        INT32 = new XF7("INT32", 2, 3);
        FLOAT32 = new XF7("FLOAT32", 3, 4);
        INT64 = new XF7("INT64", 4, 5);
        FLOAT64 = new XF7("FLOAT64", 5, 6);
    }

    /* access modifiers changed from: public */
    XF7(int i) {
        this.A00 = i;
    }
}
