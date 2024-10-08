package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mci.Execution;

/* renamed from: X.68I  reason: invalid class name */
public abstract class AnonymousClass68I implements AnonymousClass68J {
    public final AnonymousClass68L A00 = new AnonymousClass68K(this);
    public final AnonymousClass68L A01 = new AnonymousClass68N(this);
    public final AnonymousClass68L A02 = new AnonymousClass68M(this);

    public boolean A03(MailboxCallback mailboxCallback) {
        AnonymousClass68H r2 = (AnonymousClass68H) this;
        Execution.getExecutionContext();
        r2.A05.A0P.getClass();
        if (AnonymousClass68H.A00(r2, mailboxCallback) == null) {
            return false;
        }
        return true;
    }

    public boolean A04(MailboxCallback mailboxCallback) {
        if (AnonymousClass68H.A00((AnonymousClass68H) this, mailboxCallback) == null) {
            return false;
        }
        return true;
    }

    public boolean A06(MailboxCallback mailboxCallback) {
        SlimMailbox A002 = AnonymousClass68H.A00((AnonymousClass68H) this, (MailboxCallback) null);
        if (A002 == null) {
            return false;
        }
        mailboxCallback.onCompletion(A002);
        return true;
    }

    public final AnonymousClass68L ASa(int i) {
        if (i == 0) {
            return this.A00;
        }
        if (i == 1) {
            return this.A02;
        }
        if (i == 2) {
            return this.A01;
        }
        throw new RuntimeException(002.A0c("MailboxApiHandleProviderType with type ", " is not supported.", i));
    }

    public boolean A05(MailboxCallback mailboxCallback) {
        return A06(mailboxCallback);
    }
}
