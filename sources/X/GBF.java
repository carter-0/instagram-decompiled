package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

public abstract class GBF {
    public static final boolean A00(ClipsViewerSource clipsViewerSource, UserSession userSession, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(clipsViewerSource, 1);
        if (!z) {
            return false;
        }
        if (clipsViewerSource == ClipsViewerSource.BLEND) {
            return true;
        }
        if (clipsViewerSource != ClipsViewerSource.DIRECT && clipsViewerSource != ClipsViewerSource.DIRECT_AD_FEED_OF_ADS) {
            return false;
        }
        if (z2 || C328447Ev.A04(userSession) || C328447Ev.A03(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(ClipsViewerSource clipsViewerSource, UserSession userSession, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(clipsViewerSource, 1);
        if (A00(clipsViewerSource, userSession, z, z2) || clipsViewerSource == ClipsViewerSource.SPOTLIGHT) {
            return false;
        }
        if (clipsViewerSource == ClipsViewerSource.SONG || clipsViewerSource == ClipsViewerSource.AUDIO_PAGE_IN_CREATION || clipsViewerSource == ClipsViewerSource.AR_EFFECT || clipsViewerSource == ClipsViewerSource.DIRECT || clipsViewerSource == ClipsViewerSource.DIRECT_AD_FEED_OF_ADS || clipsViewerSource == ClipsViewerSource.REEL_FEED_TIMELINE || clipsViewerSource == ClipsViewerSource.REEL_CLIPS_NETEGO || clipsViewerSource == ClipsViewerSource.THIRD_PARTY_URL || clipsViewerSource == ClipsViewerSource.REMIX_REEL_NOTIFICATION_REMINDER || clipsViewerSource == ClipsViewerSource.TRENDS_PAGE || clipsViewerSource == ClipsViewerSource.CAMERA_INSPIRATION_HUB || clipsViewerSource == ClipsViewerSource.HASHTAG || clipsViewerSource == ClipsViewerSource.MIFU_USE_AUDIO || clipsViewerSource == ClipsViewerSource.TEXT_PAGE || clipsViewerSource == ClipsViewerSource.CREATOR_INSPIRATION_HUB || z3) {
            return true;
        }
        return false;
    }
}
