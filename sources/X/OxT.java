package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

public final /* synthetic */ class OxT implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass67N A04;
    public final /* synthetic */ C74233PrM A05;
    public final /* synthetic */ C304566Ea A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ Long A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;

    public /* synthetic */ OxT(AnonymousClass67N r2, C74233PrM prM, C304566Ea r4, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4) {
        this.A06 = r4;
        this.A00 = i;
        this.A05 = prM;
        this.A04 = r2;
        this.A07 = l;
        this.A0E = str;
        this.A0F = str2;
        this.A0G = str3;
        this.A08 = l2;
        this.A09 = str4;
        this.A01 = i2;
        this.A0A = str5;
        this.A0B = str6;
        this.A02 = i3;
        this.A03 = i4;
        this.A0C = str7;
        this.A0D = str8;
    }

    public final void Eyr(AnonymousClass67Z r35) {
        C304566Ea r3 = this.A06;
        int i = this.A00;
        C74233PrM prM = this.A05;
        AnonymousClass67N r8 = this.A04;
        Long l = this.A07;
        String str = this.A0E;
        String str2 = this.A0F;
        String str3 = this.A0G;
        Long l2 = this.A08;
        String str4 = this.A09;
        int i2 = this.A01;
        String str5 = this.A0A;
        String str6 = this.A0B;
        int i3 = this.A02;
        int i4 = this.A03;
        String str7 = this.A0C;
        String str8 = this.A0D;
        String A042 = C304566Ea.A04(prM, r3, 70547, i);
        long A002 = C66996MgU.A00(prM);
        long longValue = l.longValue();
        C71721Opf opf = new C71721Opf(r35, 12);
        AnonymousClass68L ASa = r8.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G2 = C66580MXl.A0G(ASa);
        int A003 = C3030067a.A00(A0G2);
        TraceInfo A0I = C66580MXl.A0I(opf, A0G2, "MailboxInstagramSecureMessage", "runInstagramXmaStoryReplyClientSend");
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        String str9 = str2;
        String str10 = str5;
        String str11 = str6;
        if (!ASa.EJd(new C22244Xxz(r8, A0G2, l2, str, str9, str3, str4, str10, str11, A042, str7, str8, A003, i, i5, i6, i7, A002, longValue))) {
            A0G2.cancel(false);
            C3030067a.A02(A003);
            C3030067a.A03(A0I, "MailboxInstagramSecureMessage", "runInstagramXmaStoryReplyClientSend");
        }
        PlatformLogger.platformEventLog(5);
    }
}
