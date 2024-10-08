package X;

public enum RGZ {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    PARTIAL("PARTIAL"),
    SUCCESS("SUCCESS");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RGZ(String str) {
        this.A00 = str;
    }
}
