package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OoT  reason: case insensitive filesystem */
public final class C71648OoT implements MailboxCallback {
    public final /* synthetic */ AnonymousClass66t A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C71648OoT(AnonymousClass66t r1, MailboxFutureImpl mailboxFutureImpl, String str, boolean z) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
        this.A02 = str;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(AnonymousClass66t.A00, 4);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 3);
        this.A01.setNotification(A0u, A002);
        MailboxCoreJNI.dispatchVOOOZ(56, accountSession, this.A02, A002, this.A03);
    }
}
