package X;

public enum RGX {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    SUCCESS("SUCCESS");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RGX(String str) {
        this.A00 = str;
    }
}
