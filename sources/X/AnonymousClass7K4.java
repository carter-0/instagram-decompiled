package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7K4  reason: invalid class name */
public abstract class AnonymousClass7K4 {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36315868338261616L);
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36328164829510693L);
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36328164830100525L);
    }

    public static final boolean A03(UserSession userSession, boolean z) {
        0Tu r2;
        if (z) {
            r2 = 0Tu.A06;
        } else {
            r2 = 0Tu.A05;
        }
        boolean A06 = 182.A06(r2, userSession, 36323144012671899L);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A04(String str) {
        if (0qQ.A0K(str, "user_detail_ad_cta") || 0qQ.A0K(str, "feed_ad_media_tooltip") || 0qQ.A0K(str, "story_ad_media_tooltip") || 0qQ.A0K(str, "story_ad_cta") || 0qQ.A0K(str, "reels_ad_cta") || 0qQ.A0K(str, "direct_feed_channel_join_ad_cta") || 0qQ.A0K(str, "reel_viewer_chat_sticker") || 0qQ.A0K(str, "reel_viewer_message_share_sticker_tooltip") || 0qQ.A0K(str, "reel_viewer_message_share_sticker_attribution") || 0qQ.A0K(str, "clips_viewer_chat_sticker") || 0qQ.A0K(str, "direct_feed_channel_cta")) {
            return true;
        }
        return false;
    }
}
