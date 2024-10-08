package X;

public enum HNI {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CONTEXTUAL_ADS_EXPERIENCE("CONTEXTUAL_ADS_EXPERIENCE"),
    FREE_BA_EXPERIENCE("FREE_BA_EXPERIENCE");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    HNI(String str) {
        this.A00 = str;
    }
}
