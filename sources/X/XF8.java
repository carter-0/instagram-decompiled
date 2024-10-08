package X;

public enum XF8 {
    ;
    
    public final String A00;

    public static XF8 A00(String str, int i) {
        return new XF8(str, i, str);
    }

    /* access modifiers changed from: public */
    XF8(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }
}
