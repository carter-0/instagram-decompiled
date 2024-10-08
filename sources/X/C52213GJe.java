package X;

import com.instagram.clips.intf.ClipsViewerSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GJe  reason: case insensitive filesystem */
public abstract class C52213GJe {
    public static boolean A00;
    public static final GEE A01 = new Object();
    public static final List A02;
    public static final List A03 = 0sr.A1P(new ClipsViewerSource[]{ClipsViewerSource.NEWSFEED_YOU, ClipsViewerSource.PUSH_NOTIF});

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.GEE] */
    static {
        List<ClipsViewerSource> A1P = 0sr.A1P(new ClipsViewerSource[]{ClipsViewerSource.CLIPS_TAB, ClipsViewerSource.EXPLORE_POPULAR_DEFAULT_UNIT, ClipsViewerSource.EXPLORE_POPULAR_MAJOR_UNIT, ClipsViewerSource.EXPLORE_POPULAR_MINOR_UNIT, ClipsViewerSource.CLIPS_NETEGO, ClipsViewerSource.FEED_TIMELINE, ClipsViewerSource.SAVED_AUDIO_NOTIFICATION, ClipsViewerSource.EXPLORE_POPULAR_AGGREGATE_TREND_MINOR_UNIT, ClipsViewerSource.FEED_TIMELINE_MIXED_UNCONNECTED, ClipsViewerSource.FEED_TIMELINE_EXPLORE_STORY, ClipsViewerSource.FEED_CONTEXTUAL_CHAIN, ClipsViewerSource.REEL_CLIPS_NETEGO});
        ArrayList A0p = AnonymousClass7TF.A0p(A1P);
        for (ClipsViewerSource clipsViewerSource : A1P) {
            A0p.add(002.A0R("clips_viewer_", clipsViewerSource.A00));
        }
        A02 = A0p;
    }
}
