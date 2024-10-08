package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

public final class I3O {
    public static final IOI A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (IOI) userSession.A01(IOI.class, C58670Ivf.A00);
    }

    public static final boolean A01(ClipsViewerSource clipsViewerSource) {
        if (clipsViewerSource == ClipsViewerSource.FEED_TIMELINE_EXPLORE_STORY || clipsViewerSource == ClipsViewerSource.FEED_TIMELINE_MIXED_UNCONNECTED || clipsViewerSource == ClipsViewerSource.FEED_TIMELINE || clipsViewerSource == ClipsViewerSource.FEED_TIMELINE_FOLLOWING || clipsViewerSource == ClipsViewerSource.FEED_TIMELINE_FAVORITES || clipsViewerSource == ClipsViewerSource.CLIPS_NETEGO) {
            return true;
        }
        return false;
    }
}
