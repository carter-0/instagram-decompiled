package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Op5  reason: case insensitive filesystem */
public final class C71686Op5 implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            C3030067a.A04("MailboxTam", "runTamClientPollCreate", this.A01);
            OT6 ot6 = new OT6((Number) null, (Number) null);
            C71726Opk A002 = C71726Opk.A00(this, 60);
            AnonymousClass681 r0 = C68314NAb.A00;
            MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj2, (MailboxFutureImpl) this.A04, ot6, 0, 1, "MCAMailboxTam", "TamClientPollCreate", A002);
            return;
        }
        AccountSession accountSession = (AccountSession) obj2;
        String A0u = C66580MXl.A0u(NAY.A00, 55);
        NotificationScope A003 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 27);
        C66580MXl.A1N(A003, this.A04, A0u);
        MailboxInstagramMemJNI.dispatchVIIJOOOOZ(2, this.A01, 2, this.A02, accountSession, this.A06, this.A05, A003, true);
    }

    public C71686Op5(Object obj, Object obj2, Object obj3, String str, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = j;
        this.A06 = str;
        this.A05 = obj3;
    }
}
