package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.5s8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C297665s8 implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ AnonymousClass67N A06;
    public final /* synthetic */ C74458PvD A07;
    public final /* synthetic */ MYb A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public /* synthetic */ C297665s8(AnonymousClass67N r1, C74458PvD pvD, MYb mYb, int i, int i2, int i3, int i4, int i5, long j, boolean z, boolean z2) {
        this.A08 = mYb;
        this.A07 = pvD;
        this.A06 = r1;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A05 = j;
        this.A04 = i4;
        this.A0A = z;
        this.A09 = z2;
        this.A00 = i5;
    }

    public final void Eyr(AnonymousClass67Z r31) {
        Integer num;
        MYb mYb = this.A08;
        C74458PvD pvD = this.A07;
        AnonymousClass67N r11 = this.A06;
        int i = this.A01;
        int i2 = this.A02;
        int i3 = this.A03;
        long j = this.A05;
        int i4 = this.A04;
        boolean z = this.A0A;
        boolean z2 = this.A09;
        int i5 = this.A00;
        pvD.DOQ();
        if (mYb.A0I) {
            num = Integer.valueOf(i3);
        } else {
            num = null;
        }
        C71636OoH ooH = new C71636OoH(r31, pvD);
        AnonymousClass68L ASa = r11.mMailboxApiHandleMetaProvider.ASa(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        int A002 = C3030067a.A00(mailboxFutureImpl);
        TraceInfo A012 = C3030067a.A01(mailboxFutureImpl, "MailboxInstagramSecureMessage", "loadThreadListData");
        LoggingOption loggingOption = new LoggingOption((Integer) null, A012, (Number) null, (String) null, (String) null, (PrivacyContext) null, false, (Number) null);
        mailboxFutureImpl.addResultCallback(new C71622Oo2(new LoggingOption[]{loggingOption}));
        mailboxFutureImpl.Eiu(ooH);
        int i6 = i4;
        if (!ASa.EJd(new C67022Mgv(r11, mailboxFutureImpl, loggingOption, num, A002, i, i2, i6, i5, j, z, z2))) {
            mailboxFutureImpl.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A012, "MailboxInstagramSecureMessage", "loadThreadListData");
        }
        PlatformLogger.platformEventLog(5);
    }
}
