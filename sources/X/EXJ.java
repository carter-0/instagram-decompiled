package X;

public enum EXJ {
    ;
    
    public final String A00;

    public static EXJ A00(String str, int i) {
        return new EXJ(str, i, str);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EXJ(String str) {
        this.A00 = str;
    }
}
