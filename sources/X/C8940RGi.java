package X;

/* renamed from: X.RGi  reason: case insensitive filesystem */
public enum C8940RGi {
    STRING(0),
    INTEGER(1),
    FLOAT(2);
    
    public final int A00;

    /* access modifiers changed from: public */
    static {
        C8940RGi[] rGiArr;
        A01 = 0oU.A00(rGiArr);
    }

    public final String toString() {
        int i = this.A00;
        if (i == 0) {
            return "String";
        }
        if (i != 1) {
            return "Float";
        }
        return "Integer";
    }

    /* access modifiers changed from: public */
    C8940RGi(int i) {
        this.A00 = i;
    }
}
