package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Xxr  reason: case insensitive filesystem */
public final class C22236Xxr implements MailboxCallback {
    public final /* synthetic */ AnonymousClass65N A00;
    public final /* synthetic */ MailboxFutureImpl A01;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, C66581MXm.A0K(), 0, 1, "MCAMailboxClientNotifications", "RemoveClientNotifications", new C22251Xy7(this, 2));
    }

    public C22236Xxr(AnonymousClass65N r1, MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
    }
}
