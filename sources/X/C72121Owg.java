package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Owg  reason: case insensitive filesystem */
public final /* synthetic */ class C72121Owg implements AnonymousClass67Q {
    public final /* synthetic */ AnonymousClass67N A00;

    public /* synthetic */ C72121Owg(AnonymousClass67N r1) {
        this.A00 = r1;
    }

    public final void Eyr(AnonymousClass67Z r11) {
        AnonymousClass67N r9 = this.A00;
        MYb mYb = MYb.A0M;
        C71722Opg A002 = C71722Opg.A00(r11, 51);
        AnonymousClass68L ASa = r9.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        int A003 = C3030067a.A00(A0G);
        TraceInfo A0I = C66580MXl.A0I(A002, A0G, "MailboxInstagramSecureMessage", "runInstagramSecurePendingThreadCount");
        if (!ASa.EJd(new C67192Mjo(A003, 4, r9, A0G))) {
            A0G.cancel(false);
            C3030067a.A02(A003);
            C3030067a.A03(A0I, "MailboxInstagramSecureMessage", "runInstagramSecurePendingThreadCount");
        }
        PlatformLogger.platformEventLog(5);
    }
}
