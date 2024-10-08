package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Xy5  reason: case insensitive filesystem */
public final class C22249Xy5 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ AnonymousClass67N A08;
    public final /* synthetic */ MailboxFutureImpl A09;
    public final /* synthetic */ Number A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;
    public final /* synthetic */ String A0L;
    public final /* synthetic */ String A0M;
    public final /* synthetic */ String A0N;
    public final /* synthetic */ boolean A0O;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", C66579MXk.A00(1088), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A09;
        Xn7 xn7 = new Xn7();
        C22251Xy7 xy7 = new C22251Xy7(this, 9);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, xn7, 0, 1, "MCAMailboxInstagramSecureMessage", "InstagramXmaStoryMentionClientSend", xy7);
    }

    public C22249Xy5(AnonymousClass67N r3, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, boolean z) {
        this.A08 = r3;
        this.A01 = i;
        this.A09 = mailboxFutureImpl;
        this.A06 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i5;
        this.A04 = i6;
        this.A05 = i7;
        this.A07 = j;
        this.A0N = str;
        this.A0M = str2;
        this.A0J = str3;
        this.A0A = number;
        this.A0K = str4;
        this.A0E = str5;
        this.A0D = str6;
        this.A0C = str7;
        this.A0B = str8;
        this.A0H = str9;
        this.A0I = str10;
        this.A0L = str11;
        this.A0G = str12;
        this.A0F = str13;
        this.A0O = z;
    }
}
