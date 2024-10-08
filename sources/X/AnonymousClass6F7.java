package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.SessionedNotificationCenter;

/* renamed from: X.6F7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6F7 implements 1aV {
    public final /* synthetic */ 1a8 A00;
    public final /* synthetic */ MYb A01;

    public /* synthetic */ AnonymousClass6F7(1a8 r1, MYb mYb) {
        this.A01 = mYb;
        this.A00 = r1;
    }

    public final void accept(Object obj) {
        MYb mYb = this.A01;
        1a8 r5 = this.A00;
        SessionedNotificationCenter sessionedNotificationCenter = ((AccountSession) obj).getSessionedNotificationCenter();
        sessionedNotificationCenter.addObserver(mYb.A00, "MEMOfflineHandlingCompletionNotification", 1, (AnonymousClass2Lq) null);
        sessionedNotificationCenter.addObserver(mYb.A01, "MEMOfflineHandlingPreviewNotification", 1, (AnonymousClass2Lq) null);
        sessionedNotificationCenter.addObserver(mYb.A02, "MEMRemovedMessageIdReadyNotification", 1, (AnonymousClass2Lq) null);
        r5.A01();
    }
}
