package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

public final /* synthetic */ class OxV implements AnonymousClass67Q {
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

    public /* synthetic */ OxV(AnonymousClass67N r2, C74233PrM prM, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, int i3, int i4) {
        this.A04 = r2;
        this.A05 = prM;
        this.A0D = str;
        this.A02 = i;
        this.A0F = str2;
        this.A0G = str3;
        this.A0H = str4;
        this.A0I = str5;
        this.A03 = i2;
        this.A08 = str6;
        this.A09 = str7;
        this.A00 = i3;
        this.A01 = i4;
        this.A0A = str8;
        this.A0B = str9;
        this.A06 = num;
        this.A07 = num2;
        this.A0C = str10;
        this.A0E = str11;
    }

    public final void Eyr(AnonymousClass67Z r37) {
        AnonymousClass67N r12 = this.A04;
        C74233PrM prM = this.A05;
        String str = this.A0D;
        int i = this.A02;
        String str2 = this.A0F;
        String str3 = this.A0G;
        String str4 = this.A0H;
        String str5 = this.A0I;
        int i2 = this.A03;
        String str6 = this.A08;
        String str7 = this.A09;
        int i3 = this.A00;
        int i4 = this.A01;
        String str8 = this.A0A;
        String str9 = this.A0B;
        Integer num = this.A06;
        Integer num2 = this.A07;
        String str10 = this.A0C;
        String str11 = this.A0E;
        long A002 = C66996MgU.A00(prM);
        if (AnonymousClass5He.A00(str)) {
            str = null;
        }
        C71721Opf opf = new C71721Opf(r37, 2);
        AnonymousClass68L ASa = r12.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G2 = C66580MXl.A0G(ASa);
        int A003 = C3030067a.A00(A0G2);
        TraceInfo A0I2 = C66580MXl.A0I(opf, A0G2, "MailboxInstagramSecureMessage", "runInstagramXmaIgtvShareClientSend");
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        if (!ASa.EJd(new C22245Xy0(r12, A0G2, num, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, A003, i, i5, i6, i7, A002))) {
            A0G2.cancel(false);
            C3030067a.A02(A003);
            C3030067a.A03(A0I2, "MailboxInstagramSecureMessage", "runInstagramXmaIgtvShareClientSend");
        }
        PlatformLogger.platformEventLog(5);
    }
}
