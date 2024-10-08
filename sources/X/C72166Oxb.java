package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Oxb  reason: case insensitive filesystem */
public final /* synthetic */ class C72166Oxb implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass67N A04;
    public final /* synthetic */ C74233PrM A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
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

    public /* synthetic */ C72166Oxb(AnonymousClass67N r2, C74233PrM prM, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, int i2, int i3, int i4) {
        this.A04 = r2;
        this.A05 = prM;
        this.A0D = str;
        this.A03 = i;
        this.A0G = str2;
        this.A0H = str3;
        this.A0I = str4;
        this.A0J = str5;
        this.A0K = str6;
        this.A0L = str7;
        this.A08 = str8;
        this.A00 = i2;
        this.A09 = str9;
        this.A0A = str10;
        this.A01 = i3;
        this.A02 = i4;
        this.A0B = str11;
        this.A0C = str12;
        this.A06 = num;
        this.A07 = num2;
        this.A0E = str13;
        this.A0F = str14;
    }

    public final void Eyr(AnonymousClass67Z r43) {
        AnonymousClass67N r12 = this.A04;
        C74233PrM prM = this.A05;
        String str = this.A0D;
        int i = this.A03;
        String str2 = this.A0G;
        String str3 = this.A0H;
        String str4 = this.A0I;
        String str5 = this.A0J;
        String str6 = this.A0K;
        String str7 = this.A0L;
        String str8 = this.A08;
        int i2 = this.A00;
        String str9 = this.A09;
        String str10 = this.A0A;
        int i3 = this.A01;
        int i4 = this.A02;
        String str11 = this.A0B;
        String str12 = this.A0C;
        Integer num = this.A06;
        Integer num2 = this.A07;
        String str13 = this.A0E;
        String str14 = this.A0F;
        long A002 = C66996MgU.A00(prM);
        if (AnonymousClass5He.A00(str)) {
            str = null;
        }
        C71721Opf opf = new C71721Opf(r43, 9);
        AnonymousClass68L A0F2 = C66580MXl.A0F(r12, 0);
        MailboxFutureImpl A0G2 = C66580MXl.A0G(A0F2);
        int A003 = C3030067a.A00(A0G2);
        TraceInfo A0I2 = C66580MXl.A0I(opf, A0G2, "MailboxInstagramSecureMessage", "runInstagramXmaPostShareClientSend");
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        if (!A0F2.EJd(new C22248Xy4(r12, A0G2, num, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, A003, i, i5, i6, i7, A002))) {
            A0G2.cancel(false);
            C3030067a.A02(A003);
            C3030067a.A03(A0I2, "MailboxInstagramSecureMessage", "runInstagramXmaPostShareClientSend");
        }
        PlatformLogger.platformEventLog(5);
    }
}
