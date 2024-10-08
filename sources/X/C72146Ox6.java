package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import java.util.List;

/* renamed from: X.Ox6  reason: case insensitive filesystem */
public final /* synthetic */ class C72146Ox6 implements AnonymousClass67Q {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C68314NAb A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ C72146Ox6(C68314NAb nAb, String str, List list, long j) {
        this.A01 = nAb;
        this.A00 = j;
        this.A02 = str;
        this.A03 = list;
    }

    public final void Eyr(AnonymousClass67Z r15) {
        C68314NAb nAb = this.A01;
        long j = this.A00;
        String str = this.A02;
        List list = this.A03;
        C71623Oo3 oo3 = new C71623Oo3(1);
        AnonymousClass68L ASa = nAb.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A0I = C66580MXl.A0I(oo3, A0G, "MailboxTam", "runTamClientPollCreate");
        if (!ASa.EJd(new C71686Op5(nAb, A0G, list, str, A002, 1, j))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A0I, "MailboxTam", "runTamClientPollCreate");
        }
        PlatformLogger.platformEventLog(5);
    }
}
