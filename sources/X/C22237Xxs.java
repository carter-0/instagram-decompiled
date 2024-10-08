package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.Xxs  reason: case insensitive filesystem */
public final class C22237Xxs implements MailboxCallback {
    public final /* synthetic */ AnonymousClass65N A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ List A03;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, C66581MXm.A0K(), 0, 1, "MCAMailboxClientNotifications", "NotPresentedClientNotifications", new C22251Xy7(this, 1));
    }

    public C22237Xxs(AnonymousClass65N r1, MailboxFutureImpl mailboxFutureImpl, Number number, List list) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
        this.A02 = number;
        this.A03 = list;
    }
}
