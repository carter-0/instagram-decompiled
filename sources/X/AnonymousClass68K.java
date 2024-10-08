package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.68K  reason: invalid class name */
public final class AnonymousClass68K implements AnonymousClass68L {
    public final /* synthetic */ AnonymousClass68I A00;

    public AnonymousClass68K(AnonymousClass68I r1) {
        this.A00 = r1;
    }

    public final void AGQ(NotificationScope notificationScope, String str) {
        this.A00.A06(new C71641OoM(this, notificationScope, str));
    }

    public final boolean EJd(MailboxCallback mailboxCallback) {
        return this.A00.A03(mailboxCallback);
    }

    public final void execute(Runnable runnable) {
        this.A00.A05(new C294925nG(this, runnable));
    }
}
