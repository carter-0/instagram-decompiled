package X;

public enum HNG {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CUTOUT_STICKER("CUTOUT_STICKER");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    HNG(String str) {
        this.A00 = str;
    }
}
