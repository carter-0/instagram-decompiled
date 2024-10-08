package X;

public enum RGS {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    PROMO_CODE("PROMO_CODE");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RGS(String str) {
        this.A00 = str;
    }
}
