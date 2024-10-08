package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6eO  reason: invalid class name and case insensitive filesystem */
public final class C312416eO {
    public final 1QP A00;

    public C312416eO(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass1QO.A00(userSession);
    }

    public final void A00(Integer num) {
        String str;
        1QP r4 = this.A00;
        switch (num.intValue()) {
            case 0:
                str = "story_progress_complete";
                break;
            case 1:
                str = "back_button_pressed";
                break;
            case 2:
                str = "swipe_to_next_author";
                break;
            case 3:
                str = "swipe_to_previous_author";
                break;
            case 4:
                str = "swipe_to_leave_story_viewer";
                break;
            case 5:
                str = "tap_to_next_story";
                break;
            default:
                str = "tap_to_previous_story";
                break;
        }
        r4.flowAnnotate(18942971, "story_item_exit_reason", str);
        r4.flowEndSuccess(18942971);
    }
}
