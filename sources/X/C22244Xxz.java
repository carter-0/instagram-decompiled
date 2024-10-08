package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Xxz  reason: case insensitive filesystem */
public final class C22244Xxz implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ AnonymousClass67N A07;
    public final /* synthetic */ MailboxFutureImpl A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", C66579MXk.A00(1089), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A08;
        Xn8 xn8 = new Xn8();
        C22251Xy7 xy7 = new C22251Xy7(this, 5);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, xn8, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramXmaStoryReplyClientSend", xy7);
    }

    public C22244Xxz(AnonymousClass67N r3, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        this.A07 = r3;
        this.A01 = i;
        this.A08 = mailboxFutureImpl;
        this.A04 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A05 = j;
        this.A06 = j2;
        this.A0I = str;
        this.A0H = str2;
        this.A0G = str3;
        this.A09 = number;
        this.A0E = str4;
        this.A0C = str5;
        this.A0D = str6;
        this.A0A = str7;
        this.A0F = str8;
        this.A0B = str9;
    }
}
