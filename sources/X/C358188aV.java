package X;

import com.instagram.api.schemas.MediaPromptPrefType;

/* renamed from: X.8aV  reason: invalid class name and case insensitive filesystem */
public abstract class C358188aV {
    public static final MediaPromptPrefType A00(MediaPromptPrefType mediaPromptPrefType) {
        0qQ.A0B(mediaPromptPrefType, 0);
        int ordinal = mediaPromptPrefType.ordinal();
        if (ordinal == 3) {
            return MediaPromptPrefType.OFF;
        }
        if (ordinal == 2) {
            return MediaPromptPrefType.ON;
        }
        if (ordinal == 1) {
            return MediaPromptPrefType.NOT_APPLICABLE;
        }
        if (ordinal == 0) {
            return MediaPromptPrefType.UNRECOGNIZED;
        }
        throw new RuntimeException();
    }

    public static final String A01(String str) {
        if (str == null) {
            return "UNKNOWN";
        }
        if (str.equals("")) {
            return "ADD_YOURS";
        }
        return str.equals(C273654mx.A00(252)) ? "CREATOR_INVITE" : "UNKNOWN";
    }
}
