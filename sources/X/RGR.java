package X;

public enum RGR {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    HEADER("HEADER");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RGR(String str) {
        this.A00 = str;
    }
}
