package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.VFh  reason: case insensitive filesystem */
public abstract class C17033VFh {
    public static 1OC A00(UserSession userSession, C45360Cv2 cv2) {
        String str;
        1NY A0N = DbU.A0N(userSession);
        String str2 = cv2.A01;
        if (Boolean.TRUE.equals(cv2.A00)) {
            str = "follow_story_countdown/";
        } else {
            str = "unfollow_story_countdown/";
        }
        A0N.A0A(StringFormatUtil.formatStrLocaleSafe("media/%s/%s", str2, str));
        JTO.A1W(A0N, cv2.A02);
        return DbY.A0N(A0N, CFW.class, D28.class);
    }
}
