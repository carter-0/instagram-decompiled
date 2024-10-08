package X;

public enum EXH {
    ;
    
    public final String A00;

    public static EXH A00(String str, int i) {
        return new EXH(str, i, str);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EXH(String str) {
        this.A00 = str;
    }
}
