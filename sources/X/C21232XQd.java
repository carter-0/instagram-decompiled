package X;

/* renamed from: X.XQd  reason: case insensitive filesystem */
public enum C21232XQd {
    UINT8(0),
    INT8(1),
    INT32(3),
    INT64(4),
    FLOAT(6),
    DOUBLE(7);
    
    public final int A00;

    /* access modifiers changed from: public */
    static {
        UINT8 = new C21232XQd("UINT8", 0, 0);
        INT8 = new C21232XQd("INT8", 1, 1);
        A00("INT16", 2);
        INT32 = new C21232XQd("INT32", 3, 3);
        INT64 = new C21232XQd("INT64", 4, 4);
        A00("HALF", 5);
        FLOAT = new C21232XQd("FLOAT", 6, 6);
        DOUBLE = new C21232XQd("DOUBLE", 7, 7);
        A00("COMPLEX_HALF", 8);
        A00("COMPLEX_FLOAT", 9);
        A00("COMPLEX_DOUBLE", 10);
        A00("BOOL", 11);
        A00("QINT8", 12);
        A00("QUINT8", 13);
        A00("QINT32", 14);
        A00("BFLOAT16", 15);
        A00("QINT4X2", 16);
        A00("QINT2X4", 17);
        A00("BITS1X8", 18);
        A00("BITS2X4", 19);
        A00("BITS4X2", 20);
        A00("BITS8", 21);
        A00("BITS16", 22);
    }

    public static void A00(String str, int i) {
        new C21232XQd(str, i, i);
    }

    /* access modifiers changed from: public */
    C21232XQd(int i) {
        this.A00 = i;
    }
}
