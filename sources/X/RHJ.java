package X;

public enum RHJ {
    NO_ERROR(0);
    
    public final int A00;

    public static RHJ A01(String str, int i, int i2) {
        return new RHJ(str, i, i2);
    }

    /* access modifiers changed from: public */
    RHJ(int i) {
        this.A00 = i;
    }

    public static RHJ A00(int i) {
        for (RHJ rhj : values()) {
            if (rhj.A00 == i) {
                return rhj;
            }
        }
        return A0a;
    }
}
