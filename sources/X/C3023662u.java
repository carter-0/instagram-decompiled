package X;

import com.facebook.msys.mci.AccountSession;

/* renamed from: X.62u  reason: invalid class name and case insensitive filesystem */
public final class C3023662u implements AnonymousClass68J {
    public final int A00;
    public final AccountSession A01;
    public final AnonymousClass68L A02 = new C3023762v(this);

    public final AnonymousClass68L ASa(int i) {
        if (i == 2) {
            return this.A02;
        }
        throw new IllegalArgumentException(002.A0c("MailboxApiHandleProviderType with type ", " is not supported by AccountSessionMailboxApiHandleMetaProvider.", i));
    }

    public C3023662u(AccountSession accountSession) {
        this.A01 = accountSession;
        this.A00 = 1;
    }

    public C3023662u(AccountSession accountSession, int i) {
        this.A01 = accountSession;
        this.A00 = 2;
    }
}
