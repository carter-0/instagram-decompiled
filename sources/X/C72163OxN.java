package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.OxN  reason: case insensitive filesystem */
public final class C72163OxN implements AnonymousClass67Q {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C72163OxN(Object obj, Object obj2, String str, String str2, String str3, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
    }

    public final void Eyr(AnonymousClass67Z r17) {
        String str;
        String str2;
        int A002;
        TraceInfo A0I;
        Long l;
        int i = this.A00;
        AnonymousClass67Z r0 = r17;
        AnonymousClass67N r6 = (AnonymousClass67N) this.A02;
        if (i != 0) {
            long j = this.A01;
            String str3 = this.A04;
            String str4 = this.A05;
            String str5 = this.A06;
            boolean booleanValue = ((Boolean) this.A03).booleanValue();
            if (str5 == null || str5.length() == 0) {
                l = null;
            } else {
                l = DbV.A0q(str5);
            }
            C71626Oo7 oo7 = new C71626Oo7(r0);
            AnonymousClass68L ASa = r6.mMailboxApiHandleMetaProvider.ASa(0);
            MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
            str = "MailboxInstagramSecureMessage";
            str2 = "runInstagramReactionSetOptimistic";
            A002 = C3030067a.A00(A0G);
            A0I = C66580MXl.A0I(oo7, A0G, str, str2);
            if (!ASa.EJd(new C71693OpD(r6, A0G, l, str3, str4, A002, booleanValue ? 1 : 0, j))) {
                A0G.cancel(false);
            }
            PlatformLogger.platformEventLog(5);
        }
        long j2 = this.A01;
        String str6 = this.A04;
        String str7 = this.A05;
        String str8 = this.A06;
        long A003 = C66996MgU.A00((C74233PrM) this.A03);
        if (AnonymousClass5He.A00(str6)) {
            str6 = null;
        }
        C71721Opf opf = new C71721Opf(r0, 10);
        AnonymousClass68L A0I2 = C66581MXm.A0I(r6);
        MailboxFutureImpl A0G2 = C66580MXl.A0G(A0I2);
        str = "MailboxInstagramSecureMessage";
        str2 = "forward";
        A002 = C3030067a.A00(A0G2);
        A0I = C66580MXl.A0I(opf, A0G2, str, str2);
        if (!A0I2.EJd(new C71695OpF(r6, A0G2, str6, str7, str8, A002, A003, j2))) {
            A0G2.cancel(false);
        }
        PlatformLogger.platformEventLog(5);
        C3030067a.A02(A002);
        C3030067a.A03(A0I, str, str2);
        PlatformLogger.platformEventLog(5);
    }
}
