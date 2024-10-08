package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import java.util.List;

/* renamed from: X.OxL  reason: case insensitive filesystem */
public final /* synthetic */ class C72161OxL implements AnonymousClass67Q {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C68314NAb A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;

    public /* synthetic */ C72161OxL(C68314NAb nAb, List list, List list2, List list3, long j, long j2) {
        this.A02 = nAb;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = list;
        this.A04 = list2;
        this.A05 = list3;
    }

    public final void Eyr(AnonymousClass67Z r17) {
        C68314NAb nAb = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        List list = this.A03;
        List list2 = this.A04;
        List list3 = this.A05;
        C71626Oo7 oo7 = new C71626Oo7(r17);
        AnonymousClass68L ASa = nAb.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A0I = C66580MXl.A0I(oo7, A0G, "MailboxTam", "runTamClientPollUpdate");
        if (!ASa.EJd(new C71696OpG(A0G, nAb, list, list2, list3, A002, j, j2))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A0I, "MailboxTam", "runTamClientPollUpdate");
        }
        PlatformLogger.platformEventLog(5);
    }
}
