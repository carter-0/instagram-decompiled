package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;

/* renamed from: X.MYg  reason: case insensitive filesystem */
public final class C66594MYg implements 0lm {
    public static final MYc A03 = new Object();
    public final 1aU A00;
    public final MYb A01;
    public final UserSession A02;

    public final void onUserSessionWillEnd(boolean z) {
        MYb mYb = this.A01;
        UserSession userSession = this.A02;
        SessionedNotificationCenter sessionedNotificationCenter = C300345wy.A02(userSession, AnonymousClass45R.A00(userSession)).getSessionedNotificationCenter();
        sessionedNotificationCenter.removeObserver(mYb.A00, "MEMOfflineHandlingCompletionNotification", (AnonymousClass2Lq) null);
        sessionedNotificationCenter.removeObserver(mYb.A01, "MEMOfflineHandlingPreviewNotification", (AnonymousClass2Lq) null);
        sessionedNotificationCenter.removeObserver(mYb.A02, "MEMRemovedMessageIdReadyNotification", (AnonymousClass2Lq) null);
    }

    public C66594MYg(1aU r1, UserSession userSession, MYb mYb) {
        this.A02 = userSession;
        this.A01 = mYb;
        this.A00 = r1;
    }
}
