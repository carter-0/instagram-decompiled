package X;

public enum EX6 {
    AUTO("auto"),
    ENABLED("enabled");
    
    public static final EX6[] A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        EX6[] ex6Arr;
        08f A002 = 0oU.A00(ex6Arr);
        A02 = A002;
        A01 = (EX6[]) A002.toArray(new EX6[0]);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EX6(String str) {
        this.A00 = str;
    }
}
