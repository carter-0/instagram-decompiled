package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.68N  reason: invalid class name */
public final class AnonymousClass68N implements AnonymousClass68L {
    public final /* synthetic */ AnonymousClass68I A00;

    public AnonymousClass68N(AnonymousClass68I r1) {
        this.A00 = r1;
    }

    public final void AGQ(NotificationScope notificationScope, String str) {
        this.A00.A06(new C71634OoF(notificationScope, str));
    }

    public final boolean EJd(MailboxCallback mailboxCallback) {
        this.A00.A03(new AnonymousClass66w(mailboxCallback));
        return true;
    }

    public final void execute(Runnable runnable) {
        this.A00.A05(new C301045yN(runnable));
    }
}
