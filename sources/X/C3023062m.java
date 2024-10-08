package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.62m  reason: invalid class name and case insensitive filesystem */
public final class C3023062m implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ C3022662i A01;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A00, new MailboxNullable((Object) null), 0, 0, "MCAMailboxSecureConsentFramework", "SecureConsentFrameworkSettings", new C3023262o(this));
    }

    public C3023062m(MailboxFutureImpl mailboxFutureImpl, C3022662i r2) {
        this.A01 = r2;
        this.A00 = mailboxFutureImpl;
    }
}
