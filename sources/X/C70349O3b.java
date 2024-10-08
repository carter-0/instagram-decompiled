package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.O3b  reason: case insensitive filesystem */
public abstract class C70349O3b {
    public static boolean A00(UserSession userSession, Integer num) {
        0xa r1;
        String str;
        if (C238173Av.A02(userSession, "ig_video_setting")) {
            return false;
        }
        1Av A00 = 1Au.A00(userSession);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue != 4) {
                        if (intValue != 3) {
                            return true;
                        }
                        if (!C238173Av.A02(userSession, "ig_video_nux")) {
                            return false;
                        }
                        r1 = A00.A01;
                        str = "zero_rating_direct_video_nux_count";
                    } else if (!C238173Av.A02(userSession, "ig_video_nux") && !C238173Av.A02(userSession, "ig_select_video_nux")) {
                        return false;
                    } else {
                        r1 = A00.A01;
                        str = "zero_rating_explore_video_nux_count";
                    }
                } else if (!C238173Av.A02(userSession, "ig_live_nux")) {
                    return false;
                } else {
                    r1 = A00.A01;
                    str = "zero_rating_live_nux_count";
                }
            } else if (!C238173Av.A02(userSession, "ig_story_nux")) {
                return false;
            } else {
                r1 = A00.A01;
                str = AnonymousClass000.A00(200);
            }
        } else if (!C238173Av.A02(userSession, "ig_video_nux")) {
            return false;
        } else {
            r1 = A00.A01;
            str = "zero_rating_feed_video_nux_count";
        }
        if (r1.getInt(str, 0) < 1) {
            return true;
        }
        return false;
    }
}
