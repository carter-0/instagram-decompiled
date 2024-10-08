package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Nbt  reason: case insensitive filesystem */
public final class C68966Nbt extends C67101MiL {
    public final Context A00;
    public final 1Ng A01;
    public final UserSession A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68966Nbt(Context context, UserSession userSession) {
        super(userSession);
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = AnonymousClass1Nd.A00(userSession);
    }

    public final void A05(C254743sy r17, boolean z) {
        C254743sy r9 = r17;
        0qQ.A0B(r9, 0);
        MsysThreadId A06 = C66647MaG.A06(r9);
        C68314NAb A012 = C71031OZi.A01(this.A02);
        long j = A06.A00;
        C71663Ooi ooi = new C71663Ooi(1, this, A06, r9, z);
        AnonymousClass68L A0F = C66580MXl.A0F(A012, 0);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A0I = C66580MXl.A0I(ooi, A0G, "MailboxTam", "runTamClientThreadDelete");
        if (!A0F.EJd(new C71724Opi(A0G, A012, A002, 18, j))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A0I, "MailboxTam", "runTamClientThreadDelete");
        }
        PlatformLogger.platformEventLog(5);
    }
}
