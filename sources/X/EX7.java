package X;

public enum EX7 {
    STATIC("static"),
    ANIMATED("animated"),
    ANIMATED_WHILE_LOADING("animated_while_loading"),
    ANIMATED_WHILE_LOADED("animated_while_loaded"),
    DISABLED("disabled");
    
    public static final EX7[] A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        EX7[] ex7Arr;
        08f A002 = 0oU.A00(ex7Arr);
        A02 = A002;
        A01 = (EX7[]) A002.toArray(new EX7[0]);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EX7(String str) {
        this.A00 = str;
    }
}
