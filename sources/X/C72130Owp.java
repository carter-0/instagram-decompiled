package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Owp  reason: case insensitive filesystem */
public final /* synthetic */ class C72130Owp implements AnonymousClass67Q {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C68314NAb A02;

    public /* synthetic */ C72130Owp(C68314NAb nAb, long j, long j2) {
        this.A02 = nAb;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void Eyr(AnonymousClass67Z r15) {
        C68314NAb nAb = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        MYb mYb = MYb.A0M;
        C71722Opg A002 = C71722Opg.A00(r15, 52);
        AnonymousClass68L ASa = nAb.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        int A003 = C3030067a.A00(A0G);
        TraceInfo A0I = C66580MXl.A0I(A002, A0G, "MailboxTam", "runTamClientMessageRangeLoadMoreBefore");
        if (!ASa.EJd(new C71675Oou(A0G, nAb, A003, 1, j, j2))) {
            A0G.cancel(false);
            C3030067a.A02(A003);
            C3030067a.A03(A0I, "MailboxTam", "runTamClientMessageRangeLoadMoreBefore");
        }
        PlatformLogger.platformEventLog(5);
    }
}
