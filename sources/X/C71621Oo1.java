package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.util.NotificationScope;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.Oo1  reason: case insensitive filesystem */
public final class C71621Oo1 implements AnonymousClass68L {
    public final AnonymousClass68L A00;
    public final AnonymousClass66a A01;

    public C71621Oo1(AnonymousClass68L r2, AnonymousClass66a r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final boolean EJd(MailboxCallback mailboxCallback) {
        0qQ.A0B(mailboxCallback, 0);
        SettableFuture settableFuture = this.A01.A02;
        C255183ti.A04(new C71820OrN(2, mailboxCallback, this), settableFuture, 1Lf.A01);
        return !settableFuture.isCancelled();
    }

    public final void execute(Runnable runnable) {
        C255183ti.A04(new C71820OrN(1, runnable, this), this.A01.A02, 1Lf.A01);
    }

    public final void AGQ(NotificationScope notificationScope, String str) {
        AnonymousClass7TG.A1N(str, notificationScope);
        this.A00.AGQ(notificationScope, str);
    }
}
