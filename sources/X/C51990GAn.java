package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GAn  reason: case insensitive filesystem */
public final class C51990GAn {
    public static final List A01;
    public final UserSession A00;

    public C51990GAn(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A00(String str) {
        0qQ.A0B(str, 0);
        if (A01.contains(str)) {
            return true;
        }
        if (RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str) || "direct_ad_feed_of_ads".equals(str)) {
            UserSession userSession = this.A00;
            if (C328447Ev.A01(userSession) || C328447Ev.A00(userSession)) {
                return false;
            }
        }
        return !GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(str);
    }

    static {
        List<ClipsViewerSource> A1P = 0sr.A1P(new ClipsViewerSource[]{ClipsViewerSource.CLIPS_TAB, ClipsViewerSource.EXPLORE_POPULAR_MAJOR_UNIT, ClipsViewerSource.EXPLORE_POPULAR_MINOR_UNIT, ClipsViewerSource.CLIPS_NETEGO, ClipsViewerSource.FEED_TIMELINE, ClipsViewerSource.FEED_TIMELINE_POST_TAP, ClipsViewerSource.FEED_ADS_WATCH_AND_BROWSE, ClipsViewerSource.FEED_TIMELINE_SEED_AD, ClipsViewerSource.CLIPS_MULTI_ADS_SEED_AD, ClipsViewerSource.FEED_CONTEXTUAL_CHAIN_SEED_AD, ClipsViewerSource.REEL_FEED_TIMELINE, ClipsViewerSource.FEED_TIMELINE_MIXED_UNCONNECTED, ClipsViewerSource.FEED_TIMELINE_EXPLORE_STORY, ClipsViewerSource.FEED_CONTEXTUAL_CHAIN, ClipsViewerSource.REEL_CLIPS_NETEGO});
        ArrayList A0p = AnonymousClass7TF.A0p(A1P);
        for (ClipsViewerSource clipsViewerSource : A1P) {
            A0p.add(002.A0R("clips_viewer_", clipsViewerSource.A00));
        }
        A01 = A0p;
    }
}
