package X;

public enum EXI {
    ;
    
    public final String A00;

    public static EXI A00(String str, int i) {
        return new EXI(str, i, str);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EXI(String str) {
        this.A00 = str;
    }
}
