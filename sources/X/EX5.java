package X;

public enum EX5 {
    SAME_SIZE("same_size"),
    TOP_ROUNDED("top_rounded");
    
    public static final EX5[] A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        EX5[] ex5Arr;
        08f A002 = 0oU.A00(ex5Arr);
        A02 = A002;
        A01 = (EX5[]) A002.toArray(new EX5[0]);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EX5(String str) {
        this.A00 = str;
    }
}
