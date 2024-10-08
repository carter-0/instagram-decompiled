package X;

public enum RH5 {
    ;
    
    public final String A00;

    public static RH5 A00(String str, int i) {
        return new RH5(str, i, str);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RH5(String str) {
        this.A00 = str;
    }
}
