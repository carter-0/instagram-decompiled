package X;

/* renamed from: X.4jo  reason: invalid class name and case insensitive filesystem */
public abstract class C271924jo {
    public static final AnonymousClass3VL A00(AnonymousClass0iw r4) {
        if (00p.A0k(r4.getModuleName(), "feed_timeline", false)) {
            return AnonymousClass3VL.FEED;
        }
        if (00p.A0k(r4.getModuleName(), "feed_contextual_", false)) {
            return AnonymousClass3VL.EXPLORE;
        }
        if (0qQ.A0K(r4.getModuleName(), "explore_popular")) {
            return AnonymousClass3VL.EXPLORE_GRID;
        }
        if (00p.A0k(r4.getModuleName(), "clips_", false)) {
            return AnonymousClass3VL.REELS;
        }
        return null;
    }
}
