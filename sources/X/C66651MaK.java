package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.MaK  reason: case insensitive filesystem */
public abstract class C66651MaK {
    public static final boolean A00(UserSession userSession, DirectShareTarget directShareTarget) {
        0qQ.A0B(userSession, 0);
        if (directShareTarget.A05 != null || AnonymousClass48O.A02(directShareTarget.A01)) {
            return true;
        }
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
        if (creatorBroadcastThreadInfo == null || creatorBroadcastThreadInfo.A00 != 2) {
            return false;
        }
        return true;
    }

    public static final boolean A03(C242243Te r3, int i) {
        return i == 29 && r3 != null && r3.A00 == 2;
    }

    public static final boolean A01(UserSession userSession, DirectShareTarget directShareTarget) {
        AnonymousClass3U9 C60;
        AnonymousClass7TG.A1N(userSession, directShareTarget);
        String A08 = directShareTarget.A08();
        if (A08 == null || (C60 = 1bJ.A00(userSession).C60(A08)) == null || C60.BHS() != 8) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, DirectShareTarget directShareTarget) {
        Long l;
        AnonymousClass3U9 B32;
        CreatorSubscriberThreadInfo Asg;
        AnonymousClass7TG.A1N(userSession, directShareTarget);
        CreatorSubscriberThreadInfo creatorSubscriberThreadInfo = directShareTarget.A05;
        if (((creatorSubscriberThreadInfo == null || (l = creatorSubscriberThreadInfo.A01) == null) && ((B32 = 1bJ.A00(userSession).B32(directShareTarget)) == null || (Asg = B32.Asg()) == null || (l = Asg.A01) == null)) || l.longValue() >= AnonymousClass7TG.A0I()) {
            return false;
        }
        return true;
    }

    public static final boolean A04(AnonymousClass2Ep r2) {
        if (A03(((AnonymousClass3U9) r2).A01.A0s, r2.C6a()) || AnonymousClass48O.A02(r2.C6a()) || r2.CTB()) {
            return true;
        }
        return false;
    }
}
