package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Oxa  reason: case insensitive filesystem */
public final /* synthetic */ class C72165Oxa implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass67N A04;
    public final /* synthetic */ C74233PrM A05;
    public final /* synthetic */ C304566Ea A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ Long A09;
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

    public /* synthetic */ C72165Oxa(AnonymousClass67N r2, C74233PrM prM, C304566Ea r4, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, int i3, int i4) {
        this.A06 = r4;
        this.A00 = i;
        this.A05 = prM;
        this.A04 = r2;
        this.A0H = str;
        this.A0I = str2;
        this.A0J = str3;
        this.A09 = l;
        this.A0K = str4;
        this.A0A = str5;
        this.A01 = i2;
        this.A0B = str6;
        this.A0C = str7;
        this.A02 = i3;
        this.A03 = i4;
        this.A0D = str8;
        this.A0E = str9;
        this.A07 = num;
        this.A08 = num2;
        this.A0F = str10;
        this.A0G = str11;
    }

    public final void Eyr(AnonymousClass67Z r43) {
        C304566Ea r2 = this.A06;
        int i = this.A00;
        C74233PrM prM = this.A05;
        AnonymousClass67N r10 = this.A04;
        String str = this.A0H;
        String str2 = this.A0I;
        String str3 = this.A0J;
        Long l = this.A09;
        String str4 = this.A0K;
        String str5 = this.A0A;
        int i2 = this.A01;
        String str6 = this.A0B;
        String str7 = this.A0C;
        int i3 = this.A02;
        int i4 = this.A03;
        String str8 = this.A0D;
        String str9 = this.A0E;
        Integer num = this.A07;
        Integer num2 = this.A08;
        String str10 = this.A0F;
        String str11 = this.A0G;
        String A042 = C304566Ea.A04(prM, r2, 70547, i);
        long A002 = C66996MgU.A00(prM);
        if (AnonymousClass5He.A00(str)) {
            str = null;
        }
        C71721Opf opf = new C71721Opf(r43, 5);
        AnonymousClass68L ASa = r10.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G2 = C66580MXl.A0G(ASa);
        int A003 = C3030067a.A00(A0G2);
        TraceInfo A0I2 = C66580MXl.A0I(opf, A0G2, "MailboxInstagramSecureMessage", "runInstagramXmaStoryShareClientSend");
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        if (!ASa.EJd(new C22246Xy2(r10, A0G2, l, num, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, A042, str10, str11, A003, i, i5, i6, i7, A002))) {
            A0G2.cancel(false);
            C3030067a.A02(A003);
            C3030067a.A03(A0I2, "MailboxInstagramSecureMessage", "runInstagramXmaStoryShareClientSend");
        }
        PlatformLogger.platformEventLog(5);
    }
}
