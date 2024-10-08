package X;

import com.facebook.graphql.enums.EnumHelper;

/* renamed from: X.Nl3  reason: case insensitive filesystem */
public enum C69421Nl3 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NOTE("NOTE"),
    STORY("STORY"),
    PROFILE("PROFILE"),
    CLIP("CLIP"),
    FEED("FEED"),
    LIVE("LIVE"),
    COMMENT("COMMENT"),
    LOCATION_SHARE("LOCATION_SHARE"),
    REELS_AUDIO("REELS_AUDIO"),
    MEDIA_NOTE("MEDIA_NOTE"),
    STORY_HIGHLIGHT("STORY_HIGHLIGHT"),
    SOCIAL_CONTEXT("SOCIAL_CONTEXT");
    
    public final String A00;

    public static C69421Nl3 A00(String str) {
        return (C69421Nl3) EnumHelper.A00(str, UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C69421Nl3(String str) {
        this.A00 = str;
    }
}
