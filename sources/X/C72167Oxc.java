package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Oxc  reason: case insensitive filesystem */
public final /* synthetic */ class C72167Oxc implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass67N A04;
    public final /* synthetic */ C68113N1b A05;
    public final /* synthetic */ C74233PrM A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ Integer A09;
    public final /* synthetic */ Long A0A;
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

    public /* synthetic */ C72167Oxc(AnonymousClass67N r2, C68113N1b n1b, C74233PrM prM, Boolean bool, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, int i3, int i4) {
        this.A04 = r2;
        this.A06 = prM;
        this.A03 = i;
        this.A0I = str;
        this.A0J = str2;
        this.A0K = str3;
        this.A0A = l;
        this.A0L = str4;
        this.A07 = bool;
        this.A0M = str5;
        this.A00 = i2;
        this.A01 = i3;
        this.A0B = str6;
        this.A0C = str7;
        this.A0D = str8;
        this.A02 = i4;
        this.A0E = str9;
        this.A0F = str10;
        this.A08 = num;
        this.A09 = num2;
        this.A0G = str11;
        this.A0H = str12;
        this.A05 = n1b;
    }

    public final void Eyr(AnonymousClass67Z r42) {
        AnonymousClass67N r8 = this.A04;
        C74233PrM prM = this.A06;
        int i = this.A03;
        String str = this.A0I;
        String str2 = this.A0J;
        String str3 = this.A0K;
        Long l = this.A0A;
        String str4 = this.A0L;
        Boolean bool = this.A07;
        String str5 = this.A0M;
        int i2 = this.A00;
        int i3 = this.A01;
        String str6 = this.A0B;
        String str7 = this.A0C;
        String str8 = this.A0D;
        int i4 = this.A02;
        String str9 = this.A0E;
        String str10 = this.A0F;
        Integer num = this.A08;
        Integer num2 = this.A09;
        String str11 = this.A0G;
        String str12 = this.A0H;
        C68113N1b n1b = this.A05;
        long A002 = C66996MgU.A00(prM);
        boolean booleanValue = bool.booleanValue();
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        String obj = n1b.A00.toString();
        C71721Opf opf = new C71721Opf(r42, 0);
        AnonymousClass68L A0F2 = C66580MXl.A0F(r8, 0);
        MailboxFutureImpl A0G2 = C66580MXl.A0G(A0F2);
        int A003 = C3030067a.A00(A0G2);
        TraceInfo A0I2 = C66580MXl.A0I(opf, A0G2, "MailboxInstagramSecureMessage", "runInstagramXmaStoryMentionClientSend");
        Long l2 = l;
        String str13 = str;
        String str14 = str6;
        if (!A0F2.EJd(new C22249Xy5(r8, A0G2, l2, str13, str2, str3, str4, str5, str14, str7, str8, str9, str10, str11, str12, obj, A003, i, i2, i3, i4, intValue, intValue2, A002, booleanValue))) {
            A0G2.cancel(false);
            C3030067a.A02(A003);
            C3030067a.A03(A0I2, "MailboxInstagramSecureMessage", "runInstagramXmaStoryMentionClientSend");
        }
        PlatformLogger.platformEventLog(5);
    }
}
