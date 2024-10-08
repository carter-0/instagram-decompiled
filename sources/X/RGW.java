package X;

public enum RGW {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    AUTO_RENEW_SUBSCRIPTION("AUTO_RENEW_SUBSCRIPTION");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RGW(String str) {
        this.A00 = str;
    }
}
