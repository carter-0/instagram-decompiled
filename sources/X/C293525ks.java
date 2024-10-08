package X;

import com.facebook.instagramuser.mca.MailboxInstagramUserJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.5ks  reason: invalid class name and case insensitive filesystem */
public final class C293525ks implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6AW A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ boolean A03;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) AnonymousClass6AW.A00.A00(2);
        NotificationScope EBU = accountSession.getSessionedNotificationCenterCallbackManager().EBU(new C293535kt(this, str), str, 1);
        this.A02.setNotification(str, EBU);
        MailboxInstagramUserJNI.dispatchVJOOZ(2, this.A00, accountSession, EBU, this.A03);
    }

    public C293525ks(AnonymousClass6AW r1, MailboxFutureImpl mailboxFutureImpl, long j, boolean z) {
        this.A01 = r1;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = z;
    }
}
