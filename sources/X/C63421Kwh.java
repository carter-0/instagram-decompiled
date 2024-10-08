package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.sharelater.ShareLaterMedia;

/* renamed from: X.Kwh  reason: case insensitive filesystem */
public abstract class C63421Kwh {
    public static final 1OC A00(UserSession userSession, ShareLaterMedia shareLaterMedia, Integer num, String str, String str2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        String str3 = shareLaterMedia.A05;
        0qQ.A07(str3);
        return C63420Kwg.A00(userSession2, num, str3, shareLaterMedia.A04, str, str2).A0M();
    }
}
