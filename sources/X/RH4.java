package X;

public enum RH4 {
    ;
    
    public final String A00;

    public static RH4 A00(String str, int i) {
        return new RH4(str, i, str);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RH4(String str) {
        this.A00 = str;
    }
}
