package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.PaK  reason: case insensitive filesystem */
public final class C73299PaK implements Runnable {
    public final /* synthetic */ AnonymousClass9H7 A00;
    public final /* synthetic */ MsysThreadId A01;
    public final /* synthetic */ boolean A02;

    public C73299PaK(AnonymousClass9H7 r1, MsysThreadId msysThreadId, boolean z) {
        this.A00 = r1;
        this.A01 = msysThreadId;
        this.A02 = z;
    }

    public final void run() {
        String str;
        int A002;
        TraceInfo A012;
        int i;
        UserSession userSession = this.A00.A10;
        long j = this.A01.A00;
        boolean z = this.A02;
        C68314NAb A013 = C71031OZi.A01(userSession);
        AnonymousClass68L A0F = C66580MXl.A0F(A013, 0);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
        if (z) {
            str = "runTamClientTypingIndicatorStart";
            A002 = C3030067a.A00(A0G);
            A012 = C3030067a.A01(A0G, "MailboxTam", str);
            i = 9;
        } else {
            str = "runTamClientTypingIndicatorStop";
            A002 = C3030067a.A00(A0G);
            A012 = C3030067a.A01(A0G, "MailboxTam", str);
            i = 10;
        }
        if (!A0F.EJd(new C71724Opi(A0G, A013, A002, i, j))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A012, "MailboxTam", str);
        }
        PlatformLogger.platformEventLog(5);
    }
}
