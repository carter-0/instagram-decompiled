package X;

public enum XRN {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    FRIENDS("FRIENDS"),
    FRIENDS_EXCEPT("FRIENDS_EXCEPT"),
    FRIENDS_OF_FRIENDS("FRIENDS_OF_FRIENDS"),
    ONLY_ME("ONLY_ME"),
    PUBLIC("PUBLIC");
    
    public final String A00;

    /* access modifiers changed from: public */
    XRN(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }
}
