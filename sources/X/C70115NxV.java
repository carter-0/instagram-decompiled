package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;

/* renamed from: X.NxV  reason: case insensitive filesystem */
public abstract class C70115NxV {
    public static final C72211Oyc A00(UserSession userSession) {
        SessionedNotificationCenter sessionedNotificationCenter = C300345wy.A02(userSession, true).getSessionedNotificationCenter();
        0qQ.A07(sessionedNotificationCenter);
        return (C72211Oyc) userSession.A01(C72211Oyc.class, C73911Plm.A00(sessionedNotificationCenter, 24));
    }
}
