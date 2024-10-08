package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

public final /* synthetic */ class OxQ implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass67N A02;
    public final /* synthetic */ C74555Pww A03;
    public final /* synthetic */ C74233PrM A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public /* synthetic */ OxQ(AnonymousClass67N r1, C74555Pww pww, C74233PrM prM, String str, String str2, String str3, String str4, int i, int i2) {
        this.A02 = r1;
        this.A04 = prM;
        this.A05 = str;
        this.A03 = pww;
        this.A06 = str2;
        this.A07 = str3;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str4;
    }

    public final void Eyr(AnonymousClass67Z r19) {
        AnonymousClass67N r6 = this.A02;
        C74233PrM prM = this.A04;
        String str = this.A05;
        C74555Pww pww = this.A03;
        String str2 = this.A06;
        String str3 = this.A07;
        int i = this.A00;
        int i2 = this.A01;
        String str4 = this.A08;
        long A002 = C66996MgU.A00(prM);
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        C71721Opf opf = new C71721Opf(r19, 6);
        AnonymousClass68L A0F = C66580MXl.A0F(r6, 0);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
        int A003 = C3030067a.A00(A0G);
        TraceInfo A0I = C66580MXl.A0I(opf, A0G, "MailboxInstagramSecureMessage", "runInstagramXmaSendStandaloneV2");
        if (!A0F.EJd(new C22241Xxw(r6, pww, A0G, valueOf, valueOf2, str, str2, str3, str4, A003, A002))) {
            A0G.cancel(false);
            C3030067a.A02(A003);
            C3030067a.A03(A0I, "MailboxInstagramSecureMessage", "runInstagramXmaSendStandaloneV2");
        }
        PlatformLogger.platformEventLog(5);
    }
}
