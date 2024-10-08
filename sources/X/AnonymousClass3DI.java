package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3DI  reason: invalid class name */
public final class AnonymousClass3DI {
    public static final AnonymousClass3DI A00 = new Object();

    public final boolean A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (A05(userSession) || A03(userSession)) {
            return true;
        }
        return false;
    }

    public final boolean A06(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        if (!A02(str) || !A05(userSession) || !182.A06(0Tu.A05, userSession, 36327752512715435L)) {
            return false;
        }
        return true;
    }

    public final boolean A07(UserSession userSession, String str) {
        0Tu r2;
        long j;
        0qQ.A0B(str, 1);
        if (A02(str)) {
            return A04(userSession);
        }
        if (0sc.A07(new String[]{"feed_contextual_self_profile", "feed_contextual_profile", "feed_contextual_group_profile"}).contains(str)) {
            r2 = 0Tu.A05;
            j = 36327752512977583L;
        } else if (!00p.A0k(str, "feed_contextual", false) || 0sc.A07(new String[]{"feed_contextual_self_profile", "feed_contextual_profile", "feed_contextual_group_profile"}).contains(str)) {
            return false;
        } else {
            r2 = 0Tu.A05;
            j = 36327752512912046L;
        }
        return 182.A06(r2, userSession, j);
    }

    public static final List A00() {
        return 0sr.A1P(new String[]{"ig_android_friendly_feed_fbid.ff_likes_enabled", "ig_android_friendly_feed_fbid.ff_comments_enabled", "ig_android_friendly_feed_fbid.is_profile_enabled", "ig_android_friendly_feed_fbid.is_explore_enabled", "ig_android_friendly_feed_fbid.disable_high_value_check", "ig_android_friendly_feed_fbid.hide_likers_row_when_bubbles_shown", "ig_android_friendly_feed_fbid.dedupe_likers_when_bubbles_shown", "ig_android_friendly_feed_fbid.hide_facepile_top_likers", "ig_android_friendly_feed_fbid.top_likers_data_migration", "ig_ios_friendly_feed_fbidv2_v2.show_nux_on_tap", "ig_ios_friendly_feed_fbidv2_v2.expand_touch_area", "ig_android_friendly_feed.is_debug_menu_enabled", "ig_android_friendly_feed.enable_comment_pop_in", "ig_android_friendly_feed.enable_social_bubbles_below_media_with_notes"});
    }

    public static final boolean A01(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36325197007106743L) || 182.A06(r2, userSession, 36327752513108657L)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(String str) {
        if (str.equals("feed_timeline") || str.equals("feed_timeline_favorites") || str.equals("feed_timeline_following") || str.equals("feed_timeline_fan_club")) {
            return true;
        }
        return false;
    }

    public final boolean A03(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36325197008089797L) || 182.A06(r2, userSession, 36325197008679629L) || 182.A06(r2, userSession, 36327752513174194L)) {
            return true;
        }
        return false;
    }

    public final boolean A05(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36325197008024260L) || 182.A06(r2, userSession, 36325197008679629L) || 182.A06(r2, userSession, 36327752513239731L)) {
            return true;
        }
        return false;
    }
}
