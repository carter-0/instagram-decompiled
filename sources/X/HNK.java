package X;

public enum HNK {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ANYBODY_CREATOR_DOES_NOT_FOLLOW("ANYBODY_CREATOR_DOES_NOT_FOLLOW"),
    FOLLOWERS_CREATOR_DOES_NOT_FOLLOW("FOLLOWERS_CREATOR_DOES_NOT_FOLLOW"),
    NOBODY("NOBODY"),
    SELECTED_USERS_ONLY("SELECTED_USERS_ONLY");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    HNK(String str) {
        this.A00 = str;
    }
}
