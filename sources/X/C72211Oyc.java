package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import java.util.Set;

/* renamed from: X.Oyc  reason: case insensitive filesystem */
public final class C72211Oyc implements 0lm {
    public final AnonymousClass66d A00 = new C71737Opx(this, 10);
    public final AnonymousClass66d A01 = new C71737Opx(this, 11);
    public final Set A02 = DbS.A0y();
    public final SessionedNotificationCenter A03;

    public C72211Oyc(SessionedNotificationCenter sessionedNotificationCenter) {
        0qQ.A0B(sessionedNotificationCenter, 1);
        this.A03 = sessionedNotificationCenter;
    }

    public final void onUserSessionWillEnd(boolean z) {
        SessionedNotificationCenter sessionedNotificationCenter = this.A03;
        sessionedNotificationCenter.removeObserver(this.A01, "MEMOfflineHandlingPreviewNotification", (AnonymousClass2Lq) null);
        sessionedNotificationCenter.removeObserver(this.A00, "MEMOfflineHandlingCompletionNotification", (AnonymousClass2Lq) null);
    }
}
