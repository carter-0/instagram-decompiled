package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

public final /* synthetic */ class OxS implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass67N A02;
    public final /* synthetic */ C74233PrM A03;
    public final /* synthetic */ C304566Ea A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;

    public /* synthetic */ OxS(AnonymousClass67N r2, C74233PrM prM, C304566Ea r4, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2) {
        this.A04 = r4;
        this.A03 = prM;
        this.A02 = r2;
        this.A0B = str;
        this.A0C = str2;
        this.A0D = str3;
        this.A0E = str4;
        this.A0F = str5;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = str6;
        this.A08 = str7;
        this.A05 = num;
        this.A06 = num2;
        this.A09 = str8;
        this.A0A = str9;
    }

    public final void Eyr(AnonymousClass67Z r32) {
        C304566Ea r2 = this.A04;
        C74233PrM prM = this.A03;
        AnonymousClass67N r11 = this.A02;
        String str = this.A0B;
        String str2 = this.A0C;
        String str3 = this.A0D;
        String str4 = this.A0E;
        String str5 = this.A0F;
        int i = this.A00;
        int i2 = this.A01;
        String str6 = this.A07;
        String str7 = this.A08;
        Integer num = this.A05;
        Integer num2 = this.A06;
        String str8 = this.A09;
        String str9 = this.A0A;
        String A042 = C304566Ea.A04(prM, r2, 70547, 1011);
        long A002 = C66996MgU.A00(prM);
        C71721Opf opf = new C71721Opf(r32, 3);
        AnonymousClass68L ASa = r11.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        int A003 = C3030067a.A00(A0G);
        TraceInfo A0I = C66580MXl.A0I(opf, A0G, "MailboxInstagramSecureMessage", "runInstagramXmaProfileShareClientSend");
        int i3 = i;
        int i4 = i2;
        String str10 = str6;
        if (!ASa.EJd(new C22243Xxy(r11, A0G, num, num2, str, str2, str3, str4, str5, str10, str7, A042, str8, str9, A003, i3, i4, A002))) {
            A0G.cancel(false);
            C3030067a.A02(A003);
            C3030067a.A03(A0I, "MailboxInstagramSecureMessage", "runInstagramXmaProfileShareClientSend");
        }
        PlatformLogger.platformEventLog(5);
    }
}
