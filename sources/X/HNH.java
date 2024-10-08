package X;

public enum HNH {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    SCHOOL_REMOVAL_SUCCESS("SCHOOL_REMOVAL_SUCCESS");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    HNH(String str) {
        this.A00 = str;
    }
}
