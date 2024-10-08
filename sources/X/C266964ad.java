package X;

import com.instagram.api.schemas.SuggestedUsersStyle;

/* renamed from: X.4ad  reason: invalid class name and case insensitive filesystem */
public abstract class C266964ad {
    public static final SuggestedUsersStyle A00(AnonymousClass3UH r1) {
        int intValue;
        Integer num = r1.A09;
        if (!(num == null || (intValue = num.intValue()) == 0)) {
            if (intValue == 1) {
                return SuggestedUsersStyle.WITH_CONTENT_THUMBNAIL;
            }
            if (intValue == 2) {
                return SuggestedUsersStyle.EMBEDDED_WITH_CONTENT_THUMBNAIL;
            }
        }
        return SuggestedUsersStyle.NO_CONTENT_THUMBNAIL;
    }
}
