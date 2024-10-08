package X;

/* renamed from: X.RiR  reason: case insensitive filesystem */
public abstract class C9852RiR {
    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 2) {
            return "ClipsThreadShareHandlerActivity.EXTRA_SHARE_REELS_THREAD_INTENT";
        }
        if (intValue == 0) {
            return "ClipsShareHandlerActivity.EXTRA_SHARE_REELS_INTENT";
        }
        if (intValue == 1) {
            return "ClipsMusicShareHandlerActivity.EXTRA_SHARE_REELS_MUSIC_INTENT";
        }
        if (intValue == 3) {
            return "ShareHandlerActivity.EXTRA_SHARE_INTENT";
        }
        if (intValue == 4) {
            return "ReelShareHandlerActivity.EXTRA_SHARE_REELS_INTENT";
        }
        throw AnonymousClass7TE.A1K();
    }
}
