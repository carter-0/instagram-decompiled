package X;

public enum HNJ {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NETWORK_ERROR("NETWORK_ERROR"),
    RATE_LIMIT_REACHED("RATE_LIMIT_REACHED"),
    UNKNOWN("UNKNOWN");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    HNJ(String str) {
        this.A00 = str;
    }
}
