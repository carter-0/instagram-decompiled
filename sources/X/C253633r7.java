package X;

import com.instagram.api.schemas.IGUserHighlightsTrayType;

/* renamed from: X.3r7  reason: invalid class name and case insensitive filesystem */
public abstract class C253633r7 {
    public static final IGUserHighlightsTrayType A00(String str) {
        IGUserHighlightsTrayType iGUserHighlightsTrayType = (IGUserHighlightsTrayType) IGUserHighlightsTrayType.A01.get(str);
        if (iGUserHighlightsTrayType == null) {
            return IGUserHighlightsTrayType.UNRECOGNIZED;
        }
        return iGUserHighlightsTrayType;
    }
}
