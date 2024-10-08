package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GCk  reason: case insensitive filesystem */
public final class C52038GCk {
    public final C58840Ae A00;

    public final void A00(Integer num) {
        String str;
        0Aj A0d = C51969G9p.A0d(this.A00, "ig_sundial_gesture_system_events");
        if (A0d.isSampled()) {
            C51973G9u.A14(A0d, "action", "fullscreen_view_dismiss");
            switch (num.intValue()) {
                case 2:
                    str = "LONG_PRESS";
                    break;
                case 3:
                    str = "FANOUT_MENU";
                    break;
                case 4:
                    str = "EXIT_BUTTON";
                    break;
                default:
                    str = "REELS_VIEWER_SWIPE_OR_EXIT";
                    break;
            }
            C51974G9v.A0r(A0d, str);
        }
    }

    public final void A01(Integer num) {
        String str;
        0Aj A0d = C51969G9p.A0d(this.A00, "ig_sundial_gesture_system_events");
        if (A0d.isSampled()) {
            C51973G9u.A14(A0d, "action", "fullscreen_view_start");
            switch (num.intValue()) {
                case 2:
                    str = "LONG_PRESS";
                    break;
                case 3:
                    str = "FANOUT_MENU";
                    break;
                case 4:
                    str = "EXIT_BUTTON";
                    break;
                case 5:
                    str = "REELS_VIEWER_SWIPE_OR_EXIT";
                    break;
                case 6:
                    str = "OVERFLOW_MENU";
                    break;
                default:
                    str = "PINCH";
                    break;
            }
            C51974G9v.A0r(A0d, str);
        }
    }

    public C52038GCk(UserSession userSession) {
        this.A00 = AnonymousClass0kN.A02(userSession);
    }
}
