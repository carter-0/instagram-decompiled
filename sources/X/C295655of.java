package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.5of  reason: invalid class name and case insensitive filesystem */
public final class C295655of implements MailboxCallback {
    public final /* synthetic */ AnonymousClass5oe A00;
    public final /* synthetic */ MailboxFutureImpl A01;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, new MailboxNullable((Object) null), 0, 0, "MCAMailboxFXCAL", "FetchLinkedAccounts", new C295665og(this));
    }

    public C295655of(AnonymousClass5oe r1, MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
    }
}
