package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.instagram.common.session.UserSession;

/* renamed from: X.67s  reason: invalid class name and case insensitive filesystem */
public final class C3031867s implements C61110lV {
    public final Mailbox A00;
    public final UserSession A01;

    public C3031867s(Mailbox mailbox, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = mailbox;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(1026776615);
        Mailbox mailbox = this.A00;
        AccountSession accountSession = mailbox.getAccountSession();
        Execution.executeAsync(new NBW(mailbox, accountSession), accountSession, 1);
        AnonymousClass0fD.A0A(-469942159, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(1608465189);
        Mailbox mailbox = this.A00;
        AccountSession accountSession = mailbox.getAccountSession();
        Execution.executeAsync(new C3032067v(mailbox, accountSession), accountSession, 1);
        AnonymousClass2HN A002 = 2HM.A00(this.A01);
        if (A002.A02() && ((Boolean) A002.A01.A00()).booleanValue()) {
            C70105NxL.A00(mailbox);
        }
        AnonymousClass0fD.A0A(833322341, A03);
    }
}
