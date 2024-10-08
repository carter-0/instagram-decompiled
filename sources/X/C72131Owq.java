package X;

import android.util.Pair;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.Owq  reason: case insensitive filesystem */
public final /* synthetic */ class C72131Owq implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Pair A02;

    public /* synthetic */ C72131Owq(Pair pair, int i, long j) {
        this.A02 = pair;
        this.A01 = j;
        this.A00 = i;
    }

    public final void Eyr(AnonymousClass67Z r15) {
        Pair pair = this.A02;
        long j = this.A01;
        int i = this.A00;
        AnonymousClass67N r6 = (AnonymousClass67N) pair.second;
        long longValue = ((MessagingUser) pair.first).A02.longValue();
        C71626Oo7 oo7 = new C71626Oo7(r15);
        AnonymousClass68L ASa = r6.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A0I = C66580MXl.A0I(oo7, A0G, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantUpdateAdminStatus");
        if (!ASa.EJd(new C71673Oos(r6, A0G, A002, i, j, longValue))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A0I, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantUpdateAdminStatus");
        }
        PlatformLogger.platformEventLog(5);
    }
}
