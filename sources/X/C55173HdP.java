package X;

import com.instagram.clips.intf.ClipsViewerSource;
import go.Seq;

/* renamed from: X.HdP  reason: case insensitive filesystem */
public abstract class C55173HdP {
    public static final AnonymousClass337 A00(ClipsViewerSource clipsViewerSource) {
        switch (clipsViewerSource.ordinal()) {
            case Seq.NULL_REFNUM:
                return AnonymousClass337.FEED_PAE_MULTI_ADS_WATCH_AND_BROWSE;
            case Seq.RefTracker.REF_OFFSET:
                return AnonymousClass337.FEED_SA_MULTI_ADS_WATCH_AND_BROWSE;
            case 43:
                return AnonymousClass337.CLIPS_FEED_WATCH_AND_BROWSE;
            case 44:
                return AnonymousClass337.CLIPS_FEED_WATCH_AND_BROWSE_WITH_CHAINING;
            case 45:
                return AnonymousClass337.CLIPS_FEED_TALL_VIDEO_WATCH_AND_BROWSE_WITH_CHAINING;
            case 92:
                return AnonymousClass337.CLIPS_MULTI_ADS_WATCH_AND_BROWSE;
            default:
                return null;
        }
    }
}
