package X;

import com.instagram.mediakit.model.MediaKitSectionType;

/* renamed from: X.Kuv  reason: case insensitive filesystem */
public abstract class C63312Kuv {
    public static final C62661KkN A00(MediaKitSectionType mediaKitSectionType) {
        if (mediaKitSectionType == null) {
            return null;
        }
        int ordinal = mediaKitSectionType.ordinal();
        if (ordinal == 3) {
            return C62661KkN.MEDIA_POSTS;
        }
        if (ordinal == 1) {
            return C62661KkN.ACCOUNTS;
        }
        if (ordinal == 2) {
            return C62661KkN.INSIGHTS;
        }
        if (ordinal == 4) {
            return C62661KkN.TEXT;
        }
        return null;
    }
}
