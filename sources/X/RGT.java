package X;

public enum RGT {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    MIB_TO_CIB_PAYPAL("MIB_TO_CIB_PAYPAL");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RGT(String str) {
        this.A00 = str;
    }
}
