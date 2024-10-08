package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import java.util.List;

/* renamed from: X.Owz  reason: case insensitive filesystem */
public final class C72140Owz implements AnonymousClass67Q {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public C72140Owz(AnonymousClass67N r1, List list, int i, long j) {
        this.A00 = i;
        this.A02 = r1;
        this.A01 = j;
        this.A03 = list;
    }

    public final void Eyr(AnonymousClass67Z r21) {
        boolean z;
        AnonymousClass68L ASa;
        MailboxFutureImpl A0G;
        String str;
        String str2;
        int A002;
        TraceInfo A0I;
        C71679Ooy ooy;
        int i = this.A00;
        AnonymousClass67Z r2 = r21;
        AnonymousClass67N r7 = (AnonymousClass67N) this.A02;
        if (i != 0) {
            long j = this.A01;
            C71721Opf opf = new C71721Opf(r2, 1);
            z = false;
            ASa = r7.mMailboxApiHandleMetaProvider.ASa(0);
            A0G = C66580MXl.A0G(ASa);
            str = "MailboxInstagramSecureMessage";
            str2 = "runInstagramSecureParticipantsAdd";
            A002 = C3030067a.A00(A0G);
            A0I = C66580MXl.A0I(opf, A0G, str, str2);
            ooy = new C71679Ooy(r7, A0G, (List) this.A03, A002, 0, j);
        } else {
            long j2 = this.A01;
            C71626Oo7 oo7 = new C71626Oo7(r2);
            z = false;
            ASa = r7.mMailboxApiHandleMetaProvider.ASa(0);
            A0G = C66580MXl.A0G(ASa);
            str = "MailboxInstagramSecureMessage";
            str2 = "runInstagramSecureParticipantsRemove";
            A002 = C3030067a.A00(A0G);
            A0I = C66580MXl.A0I(oo7, A0G, str, str2);
            ooy = new C71679Ooy(r7, A0G, (List) this.A03, A002, 1, j2);
        }
        if (!ASa.EJd(ooy)) {
            A0G.cancel(z);
            C3030067a.A02(A002);
            C3030067a.A03(A0I, str, str2);
        }
        PlatformLogger.platformEventLog(5);
    }
}
