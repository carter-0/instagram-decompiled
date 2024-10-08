package X;

public enum EX2 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    DEV_ELIGIBLE("DEV_ELIGIBLE"),
    ELIGIBLE("ELIGIBLE");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EX2(String str) {
        this.A00 = str;
    }
}
