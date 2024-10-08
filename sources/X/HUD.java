package X;

public abstract class HUD {
    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return "BOTTOM_BANNER";
        }
        if (intValue == 1) {
            return "MEDIA_COVER";
        }
        if (intValue == 2) {
            return "MEDIA_COVER_WITH_BOTTOM_BANNER";
        }
        if (intValue == 3) {
            return "MEDIA_PILL_LABEL";
        }
        throw AnonymousClass7TE.A1K();
    }
}
