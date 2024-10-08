package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.3Mb  reason: invalid class name */
public abstract class AnonymousClass3Mb {
    public static final int A00(UserSession userSession, AnonymousClass3BT r6) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        AnonymousClass3BQ r0 = AnonymousClass3BQ.MAIN_FEED_TRAY;
        AnonymousClass3BQ r4 = r6.A04;
        if (r0 == r4) {
            if (1NN.A00(1NM.A00(userSession)) && 182.A06(0Tu.A05, userSession, 36322044501632930L)) {
                return 11;
            }
            if (1NN.A00(1NM.A00(userSession))) {
                return 3;
            }
        }
        if (r6.A03()) {
            if (!182.A06(0Tu.A05, userSession, 36325699518280853L)) {
                return 2;
            }
            return 0;
        } else if (AnonymousClass3BQ.IN_FEED_STORIES_TRAY == r4) {
            return 4;
        } else {
            if (AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY == r4) {
                return 7;
            }
            if (AnonymousClass3BQ.ADS_HISTORY == r4) {
                return 5;
            }
            if (AnonymousClass3BJ.A00(userSession).A01()) {
                Reel reel = r6.A03;
                if (reel.A0o() || reel.getId().equals("election:rollcall_v2")) {
                    return 10;
                }
            }
            return 0;
        }
    }

    public static final String A01(UserSession userSession, AnonymousClass3BT r2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 1);
        int A00 = A00(userSession, r2);
        if (A00 == 0) {
            return "story";
        }
        switch (A00) {
            case 2:
                return "livewith";
            case 3:
                return "story_with_preview";
            case 4:
                return "stories_netego";
            case 5:
                return "ads_history_story_unit";
            case 6:
                return "stories_tray_loading_spinner";
            case 7:
                return "highlight_in_feed";
            case 8:
                return "see_all_stories_button";
            case 9:
                return "stories_tray_end_card";
            case 10:
                return "live_roll_call";
            case 11:
                return "story_top_tray_preview";
            default:
                return null;
        }
    }
}
