package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Ooh  reason: case insensitive filesystem */
public final class C71662Ooh implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj2;
                C3030067a.A04("MailboxInstagramReverb", "expireMessages", this.A01);
                String A0u = C66580MXl.A0u(NAZ.A00, 5);
                NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 37);
                C66580MXl.A1N(A002, this.A04, A0u);
                MailboxInstagramReverbJNI.dispatchVOOO(4, accountSession, this.A03, A002);
                return;
            case 1:
                C3030067a.A04("MailboxInstagramSecureMessage", "loadInstagramUserCutoverStatusArray", this.A01);
                MailboxNullable A0K = C66581MXm.A0K();
                C71726Opk A003 = C71726Opk.A00(this, 42);
                AnonymousClass681 r0 = AnonymousClass67N.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj2, (MailboxFutureImpl) this.A03, A0K, 0, 0, "MCAMailboxInstagramSecureMessage", "InstagramUserCutoverStatusArray", A003);
                return;
            default:
                C3030067a.A04("MailboxTam", "runTamClientSpamMessageFetch", this.A01);
                C71725Opj opj = new C71725Opj(this, 2);
                AnonymousClass681 r02 = C68314NAb.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj2, (MailboxFutureImpl) this.A03, new MailboxNullable((Object) null), 0, 1, (NotificationScope) null, (PrivacyContext) this.A04, "MCAMailboxTam", "TamClientSpamMessageFetch", opj);
                return;
        }
    }

    public C71662Ooh(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A04 = obj2;
        this.A03 = obj3;
    }
}
