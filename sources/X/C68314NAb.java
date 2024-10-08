package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.NAb  reason: case insensitive filesystem */
public final class C68314NAb extends MailboxFeature {
    public static AnonymousClass681 A00 = new C68315NAc(11);

    public final MailboxFutureImpl A00(String str, String str2) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        C66582MXn.A1E(ASa, new C71666Ool(this, A0G, str, str2, 1), A0G);
        return A0G;
    }

    public final void A01(long j) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A01 = C3030067a.A01(A0G, "MailboxTam", "runTamClientThreadMarkUnread");
        if (!ASa.EJd(new C71724Opi(A0G, this, A002, 17, j))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A01, "MailboxTam", "runTamClientThreadMarkUnread");
        }
        PlatformLogger.platformEventLog(5);
    }

    public final void A02(long j) {
        AnonymousClass68L ASa = this.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A01 = C3030067a.A01(A0G, "MailboxTam", "runTamTransportHybridThreadMuteIndefinitely");
        if (!ASa.EJd(new C71724Opi(A0G, this, A002, 19, j))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A01, "MailboxTam", "runTamTransportHybridThreadMuteIndefinitely");
        }
        PlatformLogger.platformEventLog(5);
    }
}
