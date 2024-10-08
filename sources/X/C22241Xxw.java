package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Xxw  reason: case insensitive filesystem */
public final class C22241Xxw implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass67N A02;
    public final /* synthetic */ C74555Pww A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", C66579MXk.A00(1087), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        C21966Xmx xmx = new C21966Xmx();
        C22251Xy7 xy7 = new C22251Xy7(this, 12);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, xmx, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramXmaSendStandaloneV2", xy7);
    }

    public C22241Xxw(AnonymousClass67N r1, C74555Pww pww, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, String str, String str2, String str3, String str4, int i, long j) {
        this.A02 = r1;
        this.A00 = i;
        this.A04 = mailboxFutureImpl;
        this.A01 = j;
        this.A0A = str;
        this.A03 = pww;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = number;
        this.A06 = number2;
        this.A09 = str4;
    }
}
