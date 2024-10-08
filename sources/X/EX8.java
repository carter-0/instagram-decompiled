package X;

public enum EX8 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    AUDIO("AUDIO"),
    FLASH_IMAGE("FLASH_IMAGE"),
    FLASH_RECAP_VIDEO("FLASH_RECAP_VIDEO"),
    GIF("GIF"),
    IMAGE("IMAGE"),
    REEL("REEL"),
    STICKER("STICKER"),
    UPLOADED_IMAGE("UPLOADED_IMAGE");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EX8(String str) {
        this.A00 = str;
    }
}
