package X;

public enum XRP {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ANIMATE_FOR_AUTHENTIC_IMAGES_NOT_SUPPORTED("ANIMATE_FOR_AUTHENTIC_IMAGES_NOT_SUPPORTED"),
    ANIMATE_GATED("ANIMATE_GATED"),
    ANIMATE_NOT_SUPPORTED_ON_VOICE("ANIMATE_NOT_SUPPORTED_ON_VOICE"),
    EMPTY_PROMPT("EMPTY_PROMPT"),
    EMPTY_RESULTS("EMPTY_RESULTS"),
    ENGLISH_FILTER_BLOCKED("ENGLISH_FILTER_BLOCKED"),
    FEATURE_GATED("FEATURE_GATED"),
    INFO("INFO"),
    INPUT_INTEGRITY_REFUSAL("INPUT_INTEGRITY_REFUSAL"),
    INVALID_INTENT("INVALID_INTENT"),
    MEMU_ANIMATE_DISABLE("MEMU_ANIMATE_DISABLE"),
    MEMU_EDIT_DISABLE("MEMU_EDIT_DISABLE"),
    MEMU_EMPTY_PROFILE_IMAGE_HANDLE("MEMU_EMPTY_PROFILE_IMAGE_HANDLE"),
    MEMU_NO_MULTIPLAYER_PROFILE("MEMU_NO_MULTIPLAYER_PROFILE"),
    MEMU_NO_PROFILE("MEMU_NO_PROFILE"),
    MEMU_REIMAGINE_DISABLED("MEMU_REIMAGINE_DISABLED"),
    NOT_FLASH_TYPEAHEAD_CASE("NOT_FLASH_TYPEAHEAD_CASE"),
    NO_IMAGE_HANDLE("NO_IMAGE_HANDLE"),
    NO_WATERMARKED_MEDIA("NO_WATERMARKED_MEDIA"),
    OUTPUT_INTEGRITY_REFUSAL("OUTPUT_INTEGRITY_REFUSAL"),
    PIG_GATED("PIG_GATED"),
    REELS_INTERMEDIATE_IMAGES_REFUSAL("REELS_INTERMEDIATE_IMAGES_REFUSAL"),
    SOURCE_IMAGE_NOT_OWNED_BY_VIEWER("SOURCE_IMAGE_NOT_OWNED_BY_VIEWER"),
    TOO_MANY_RESULTS("TOO_MANY_RESULTS"),
    UNKNOWN("UNKNOWN"),
    USER_UPLOAD_EDIT_DISABLED_FNF("USER_UPLOAD_EDIT_DISABLED_FNF"),
    USER_UPLOAD_EDIT_DISABLED_NON_FNF("USER_UPLOAD_EDIT_DISABLED_NON_FNF");
    
    public final String A00;

    /* access modifiers changed from: public */
    XRP(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }
}
